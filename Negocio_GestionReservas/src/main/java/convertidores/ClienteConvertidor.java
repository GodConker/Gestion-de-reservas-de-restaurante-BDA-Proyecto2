/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dtos.ClienteDTO;
import entidades.Cliente;

/**
 *
 * @author danie
 */
public class ClienteConvertidor {
    // De Entidad a DTO
    public static ClienteDTO aDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(cliente.getId());
        clienteDTO.setNombreCompleto(cliente.getNombreCompleto());
        clienteDTO.setTelefono(cliente.getTelefono());
        return clienteDTO;
    }

    // De DTO a Entidad
    public static Cliente aEntidad(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getIdCliente());
        cliente.setNombreCompleto(clienteDTO.getNombreCompleto());
        cliente.setTelefono(clienteDTO.getTelefono());
        return cliente;
    }
}
