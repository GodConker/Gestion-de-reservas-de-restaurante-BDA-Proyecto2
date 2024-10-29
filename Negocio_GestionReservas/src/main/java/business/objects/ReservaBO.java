/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.ClienteDAO;
import daos.MesaDAO;
import daos.ReservaDAO;
import entidades.Cliente;
import entidades.Mesa;
import entidades.Reserva;
import entidades.Reserva.EstadoReserva;
import entidades.Restaurante;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author danie
 */
public class ReservaBO {

    private final ReservaDAO reservaDAO;
    private final MesaDAO mesaDAO;
    private final ClienteDAO clienteDAO;

    public ReservaBO() {
        this.reservaDAO = new ReservaDAO();
        this.mesaDAO = new MesaDAO();
        this.clienteDAO = new ClienteDAO();
    }

    public List<Restaurante> obtenerRestaurantes() {
        return reservaDAO.obtenerRestaurantes();
    }

    public void confirmarReserva(String nombre, String telefono, String tipoMesa, double costoTotal, int numPersonas, Long idRestaurante) throws Exception {
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

            String codigoMesa = mesaDAO.generarCodigoMesa();
            mesa.setCodigoMesa(codigoMesa);

            mesaDAO.agregarMesa(mesa);
        }

        // Crear y configurar la reserva
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        reserva.setCosto(costoTotal);
        reserva.setFechaReserva(LocalDateTime.now());
        reserva.setHoraReserva(LocalTime.now());
        reserva.setNumPersonas(numPersonas);
        reserva.setEstadoReserva(EstadoReserva.ACTIVA); // Estado inicial

        // Registrar la reserva usando el DAO
        reservaDAO.crearReserva(reserva);
    }
}
