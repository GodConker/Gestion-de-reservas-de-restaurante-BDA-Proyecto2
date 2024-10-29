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
import entidades.Mesa.Ubicacion;
import entidades.Reserva;
import entidades.Reserva.EstadoReserva;
import entidades.Restaurante;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

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
        // Buscar el cliente por nombre y teléfono
        Cliente cliente = clienteDAO.buscarPorNombreYTelefono(nombre, telefono);

        // Si el cliente no existe, crear uno nuevo
        if (cliente == null) {
            cliente = new Cliente();
            cliente.setNombreCompleto(nombre);
            cliente.setTelefono(telefono);
            clienteDAO.agregarCliente(cliente);
        }

        // Buscar la mesa adecuada
        Mesa mesa = mesaDAO.buscarMesaPorTipoYCapacidad(tipoMesa, numPersonas, idRestaurante);
        if (mesa == null) {
            // Crear una nueva mesa y asignarla al restaurante
            mesa = new Mesa();
            mesa.setTipo(tipoMesa);
            mesa.setCapacidad(numPersonas);

            Restaurante restaurante = mesaDAO.obtenerRestaurantePorId(idRestaurante);
            mesa.setRestaurante(restaurante);

            // Asegúrate de convertir el String a Enum
            mesa.setUbicacion(Ubicacion.valueOf(ubicacion)); // Utiliza el enum para establecer la ubicación

            // Generar el código de mesa usando la ubicación seleccionada
            String codigoMesa = mesaDAO.generarCodigoMesa(ubicacion, numPersonas);
            mesa.setCodigoMesa(codigoMesa);

            mesaDAO.agregarMesa(mesa);
        }

        // Crear y configurar la reserva
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        reserva.setCosto(costoTotal);
        reserva.setFechaReserva(LocalDate.now());
        reserva.setHoraReserva(LocalTime.now());
        reserva.setNumPersonas(numPersonas);
        reserva.setEstadoReserva(EstadoReserva.Activa); // Estado inicial

        // Registrar la reserva usando el DAO
        reservaDAO.crearReserva(reserva);
    }

    public double cancelarReserva(Long idReserva, Date fechaCancelacion) throws Exception {
        // Obtener la reserva por su ID
        Reserva reserva = reservaDAO.obtenerReservaPorId(idReserva);
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
}
