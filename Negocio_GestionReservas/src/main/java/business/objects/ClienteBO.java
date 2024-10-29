/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.ClienteDAO;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class ClienteBO {

    private final ClienteDAO clienteDAO;

    public ClienteBO() {
        clienteDAO = new ClienteDAO();
    }

    public ClienteBO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    // Lógica para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        if (cliente.getNombreCompleto() == null || cliente.getTelefono() == null) {
            throw new IllegalArgumentException("El nombre y el teléfono son obligatorios.");
        }
        clienteDAO.agregarCliente(cliente);
    }

    // Lógica para consultar un cliente por id
    public Cliente consultarCliente(Long idCliente) {
        Cliente cliente = clienteDAO.consultarCliente(idCliente);
        if (cliente == null) {
            throw new RuntimeException("Cliente no encontrado");
        }
        return cliente;
    }

    // Lógica para consultar todos los clientes
    public List<Cliente> consultarTodosLosClientes() {
        return clienteDAO.consultarTodosLosClientes();
    }

    // Lógica para actualizar un cliente
    public void actualizarCliente(Cliente cliente) {
        if (clienteDAO.consultarCliente(cliente.getId()) == null) {
            throw new RuntimeException("Cliente no encontrado");
        }
        clienteDAO.actualizarCliente(cliente);
    }

    // Lógica para eliminar un cliente
    public void eliminarCliente(Long idCliente) {
        Cliente cliente = clienteDAO.consultarCliente(idCliente);
        if (cliente == null) {
            throw new RuntimeException("Cliente no encontrado");
        }
        clienteDAO.eliminarCliente(idCliente);
    }

    public Cliente buscarClientePorNombreOTelefono(String criterio) {
    if (criterio == null || criterio.trim().isEmpty()) {
        throw new IllegalArgumentException("El criterio de búsqueda no puede estar vacío.");
    }

    try {
        List<Cliente> clientes = clienteDAO.buscarPorNombreOTelefono(criterio);
        return clientes.isEmpty() ? null : clientes.get(0); // Devuelve el primer cliente encontrado
    } catch (Exception e) {
        throw new RuntimeException("Error al buscar cliente en la capa de negocio: " + e.getMessage(), e);
    }
}

    // Cerrar conexión al finalizar
    public void close() {
        clienteDAO.close();
    }
    
    public void insercionMasivaClientes() throws Exception {
        List<Cliente> clientes = new ArrayList<>();

        // Nombres y teléfonos de ejemplo para insertar
        String[] nombres = {
            "Juan Pérez", "María López", "Carlos García", "Ana Martínez",
            "Luis Hernández", "Laura Rodríguez", "Jorge Torres", "Marta Sánchez",
            "Pedro Ramírez", "Isabel Cruz", "Diego Morales", "Sofía Gómez",
            "Andrés Ruiz", "Patricia Díaz", "Francisco Romero", "Carmen Herrera",
            "Ricardo Vargas", "Verónica Jiménez", "Alejandro Castro", "Gabriela Mendoza"
        };

        // Generar 20 clientes de ejemplo
        for (int i = 0; i < nombres.length; i++) {
            Cliente cliente = new Cliente();
            cliente.setNombreCompleto(nombres[i]);
            cliente.setTelefono("555-010" + (i < 10 ? "0" + (i + 1) : (i + 1))); // Telefono en formato "555-01001", "555-01002", etc.
            clientes.add(cliente);
        }

        // Llamar al método del DAO para la inserción masiva
        clienteDAO.insercionMasivaClientes(clientes);
    }
}
