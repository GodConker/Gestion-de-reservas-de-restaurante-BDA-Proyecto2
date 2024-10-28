/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Cliente;
import java.util.List;

public interface IClienteDAO {
    
    void agregarCliente(Cliente cliente);
    
    Cliente consultarCliente(Long idCliente);
    
    List<Cliente> consultarTodosLosClientes();
    
    void actualizarCliente(Cliente cliente);
    
    void eliminarCliente(Long idCliente);
}
