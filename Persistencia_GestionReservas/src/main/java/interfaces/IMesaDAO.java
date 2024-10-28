/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Mesa;
import java.util.List;

public interface IMesaDAO {
    
    void agregarMesa(Mesa mesa);
    
    Mesa consultarMesa(Long idMesa);
    
    List<Mesa> consultarTodasLasMesas();
    
    void actualizarMesa(Mesa mesa);
    
    void eliminarMesa(Long idMesa);
}
