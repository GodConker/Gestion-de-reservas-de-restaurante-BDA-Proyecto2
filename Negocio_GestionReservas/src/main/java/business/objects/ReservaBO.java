/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.ClienteDAO;
import daos.HistorialDAO;
import daos.MesaDAO;
import daos.ReservaDAO;
import dtos.ReservaDTO;
import entidades.Cliente;
import entidades.Mesa;
import entidades.Reserva;
import entidades.Restaurante;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author danie
 */
public class ReservaBO {

    private final ReservaDAO reservaDAO;
    private final MesaDAO mesaDAO;
    private final ClienteDAO clienteDAO;
    private HistorialDAO historialDAO; // Asegúrate de que esto esté inicializado

    public ReservaBO() {
        this.reservaDAO = new ReservaDAO();
        this.mesaDAO = new MesaDAO();
        this.clienteDAO = new ClienteDAO();
    }

    public List<Restaurante> obtenerRestaurantes() {
        return reservaDAO.obtenerRestaurantes();
    }

    public void confirmarReserva(String nombre, String telefono, String tipoMesa, double costoTotal, int numPersonas, Long idRestaurante, String ubicacion) throws Exception {
        Cliente cliente = clienteDAO.buscarPorNombreYTelefono(nombre, telefono);
        if (cliente == null) {
            cliente = new Cliente();
            cliente.setNombreCompleto(nombre);
            cliente.setTelefono(telefono);
            clienteDAO.agregarCliente(cliente);
        }

        Mesa mesa = mesaDAO.buscarMesaPorTipoYCapacidad(tipoMesa, numPersonas, idRestaurante);
        if (mesa == null) {
            mesa = new Mesa();
            mesa.setTipo(tipoMesa);
            mesa.setCapacidad(numPersonas);

            Restaurante restaurante = mesaDAO.obtenerRestaurantePorId(idRestaurante);
            mesa.setRestaurante(restaurante);
            mesa.setUbicacion(Mesa.Ubicacion.valueOf(ubicacion)); // Asegúrate de que la ubicación esté correcta
            mesaDAO.agregarMesa(mesa);
        }

        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        reserva.setCosto(costoTotal);
        reserva.setFechaReserva(LocalDate.now());
        reserva.setHoraReserva(LocalTime.now());
        reserva.setNumPersonas(numPersonas);
        reserva.setEstadoReserva(Reserva.EstadoReserva.Activa);

        reservaDAO.crearReserva(reserva); // Persistir la reserva usando el DAO
    }

    public double cancelarReserva(int idReserva, Date fechaCancelacion) throws Exception {
        // Obtener la reserva por su ID
        Reserva reserva = reservaDAO.buscarReservaPorId(idReserva);
        if (reserva == null) {
            throw new Exception("Reserva no encontrada");
        }

        // Asegúrate de que getFechaReserva() retorne LocalDate o LocalDateTime
        LocalDate fechaReservaLocalDate = reserva.getFechaReserva(); // Cambia esto según el tipo real
        if (fechaReservaLocalDate == null) {
            throw new Exception("La fecha de reserva es nula");
        }

        // Convertir LocalDate a Date
        Date fechaReserva = Date.from(reserva.getFechaReserva().atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Calcular el tiempo de antelación
        long diferenciaHoras = (fechaReserva.getTime() - fechaCancelacion.getTime()) / (1000 * 60 * 60);
        double multa;

        // Calcular la multa basada en la diferencia de horas
        if (diferenciaHoras > 48) {
            multa = 0; // Sin multa
        } else if (diferenciaHoras > 24) {
            multa = reserva.getCosto() * 0.25; // 25% de multa
        } else {
            multa = reserva.getCosto() * 0.50; // 50% de multa
        }

        // Registrar la cancelación en el historial de reservas
        historialDAO.registrarCancelacion(reserva, multa, fechaCancelacion); // Pasar la multa y la fecha de cancelación

        // Marcar la reserva como cancelada
        reserva.setEstadoReserva(Reserva.EstadoReserva.Cancelada); // Cambiar el estado de la reserva
        reservaDAO.cancelarReserva(idReserva); // Persistir el cambio en la reserva

        return multa; // Devolver el monto de la multa
    }

    public ReservaDTO buscarReservaPorId(int idReserva) {
        // Aquí deberías tener la lógica para buscar la reserva en la base de datos
        Reserva reserva = reservaDAO.buscarReservaPorId(idReserva);

        if (reserva != null) {
            // Convertir la entidad Reserva a ReservaDTO antes de devolver
            return new ReservaDTO(reserva.getIdReserva(),
                    reserva.getFechaReserva(),
                    reserva.getHoraReserva(),
                    reserva.getNumPersonas(),
                    reserva.getCosto(),
                    reserva.getEstadoReserva().name(), // Convertir el enum a String
                    reserva.getMulta(),
                    reserva.getIdCliente(),
                    reserva.getCliente().getNombreCompleto(), // Suponiendo que Cliente tiene un método getNombre()
                    reserva.getIdMesa());
        }
        return null; // Si no se encuentra, devuelve null
    }

    public List<ReservaDTO> buscarReservas(String nombre, String telefono, LocalDate fechaDesde, LocalDate fechaHasta, String area, Integer tamanoMesa) {
        List<Reserva> reservas = reservaDAO.buscarReservas(nombre, telefono, fechaDesde, fechaHasta, area, tamanoMesa);
        List<ReservaDTO> reservasDTO = new ArrayList<>();
        for (Reserva reserva : reservas) {
            reservasDTO.add(convertirADTO(reserva));
        }
        return reservasDTO;
    }

    private ReservaDTO convertirADTO(Reserva reserva) {
        ReservaDTO dto = new ReservaDTO();
        dto.setIdReserva(reserva.getIdReserva());
        dto.setFechaReserva(reserva.getFechaReserva());
        dto.setHoraReserva(reserva.getHoraReserva());
        dto.setNumPersonas(reserva.getNumPersonas());
        dto.setCosto(reserva.getCosto());
        dto.setEstadoReserva(reserva.getEstadoReserva().name());
        dto.setMulta(reserva.getMulta());
        dto.setIdCliente(reserva.getCliente().getId());
        dto.setNombreCliente(reserva.getCliente().getNombreCompleto());
        dto.setIdMesa(reserva.getMesa().getId());
        return dto;
    }

    public List<ReservaDTO> obtenerTodasLasReservasDTO() {
        List<Reserva> reservas = reservaDAO.consultarTodasLasReservas();
        return reservas.stream().map(this::convertirAReservaDTO).collect(Collectors.toList());
    }

    private ReservaDTO convertirAReservaDTO(Reserva reserva) {
        return new ReservaDTO(
                reserva.getIdReserva(),
                reserva.getFechaReserva(),
                reserva.getHoraReserva(),
                reserva.getNumPersonas(),
                reserva.getCosto(),
                reserva.getEstadoReserva().name(), // Si estado es un Enum
                reserva.getMulta(),
                reserva.getIdCliente(),
                reserva.getCliente().getNombreCompleto(), // Asegúrate de que esto sea correcto
                reserva.getIdMesa()
        );
    }

    public List<ReservaDTO> buscarReservasPorFecha(LocalDate fecha) {
        List<ReservaDTO> reservasFiltradas = new ArrayList<>();

        try {
            // Llama al DAO para obtener todas las reservas
            List<Reserva> todasLasReservas = reservaDAO.consultarTodasLasReservas();

            // Filtrar las reservas que coincidan con la fecha seleccionada
            reservasFiltradas = todasLasReservas.stream()
                    .filter(reserva -> reserva.getFechaReserva().isEqual(fecha)) // Comparar LocalDate con LocalDate
                    .map(reserva -> new ReservaDTO(
                    reserva.getIdReserva(),
                    reserva.getFechaReserva(), // Asegúrate de que este método devuelve LocalDate
                    reserva.getHoraReserva(),
                    reserva.getNumPersonas(),
                    reserva.getCosto(),
                    reserva.getEstadoReserva().name(), // Convertir el enum a String
                    reserva.getMulta(),
                    reserva.getIdCliente(),
                    reserva.getCliente().getNombreCompleto(), // Asegúrate de que Cliente tiene un método getNombreCompleto()
                    reserva.getIdMesa()
            ))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            // Manejo de excepciones en caso de errores de acceso a datos
            throw new RuntimeException("Error al buscar reservas por fecha: " + e.getMessage(), e);
        }

        return reservasFiltradas;
    }
}
