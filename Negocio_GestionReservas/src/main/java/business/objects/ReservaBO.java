/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.ReservaDAO;
import dtos.ClienteDTO;
import dtos.MesaDTO;
import entidades.Cliente;
import entidades.Mesa;
import entidades.Reserva;
import java.util.Date;

/**
 *
 * @author danie
 */
public class ReservaBO {

    private ReservaDAO reservaDAO;
    private ClienteBO clienteBO; // Para buscar el cliente
    private MesaBO mesaBO; // Para buscar la mesa

    public ReservaBO() {
        this.reservaDAO = new ReservaDAO();
        this.clienteBO = new ClienteBO();
        this.mesaBO = new MesaBO();
    }

    public void crearReserva(Mesa mesa, Cliente cliente, Date fechaHora, int numPersonas) {
        Reserva reserva = new Reserva();
        reserva.setMesa(mesa);
        reserva.setCliente(cliente);
        reserva.setFechaHora(fechaHora);
        reserva.setNumPersonas(numPersonas);

        reservaDAO.guardarReserva(reserva);
    }

    public void confirmarReserva(String nombre, String telefono, String tipoMesa, int costoTotal, int numPersonas) {
        // Validar la entrada
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }
        if (numPersonas <= 0) {
            throw new IllegalArgumentException("El número de personas debe ser mayor a cero.");
        }

        // Buscar el cliente por nombre y teléfono
        ClienteDTO clienteDTO = clienteBO.buscarClientePorNombreYTelefono(nombre, telefono);
        if (clienteDTO == null) {
            throw new IllegalArgumentException("El cliente no existe.");
        }

        // Buscar la mesa por tipo
        MesaDTO mesaDTO = mesaBO.buscarMesaPorTipo(tipoMesa);
        if (mesaDTO == null) {
            throw new IllegalArgumentException("No hay mesas disponibles de este tipo.");
        }

        // Crear un objeto Reserva (entidad)
        Reserva nuevaReserva = new Reserva();
        nuevaReserva.setId(clienteDTO.getIdCliente()); // Asignar el ID del cliente
        nuevaReserva.setId((long)mesaDTO.getIdMesa()); // Asignar el ID de la mesa
        nuevaReserva.setNumPersonas(numPersonas);
        nuevaReserva.setCosto(costoTotal);
        nuevaReserva.setFechaReserva(new Date()); // Asignar la fecha y hora actual

        // Guardar la nueva reserva en la base de datos usando ReservaDAO
        reservaDAO.agregarReserva(nuevaReserva);
    }
}
