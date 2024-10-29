/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.ClienteDAO;
import entidades.Cliente;
import java.util.List;

/**
 *
 * @author danie
 */
public class ClienteBO {

    private ClienteDAO clienteDAO;

    public ClienteBO() {
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
}
