/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author danie
 */
public interface IClienteBO {
    
    public void agregarCliente(Cliente cliente);
    public Cliente consultarCliente(Long idCliente);
    public List<Cliente> consultarTodosLosClientes();
    public void actualizarCliente(Cliente cliente);
}
