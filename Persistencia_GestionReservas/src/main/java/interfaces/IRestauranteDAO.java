/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Restaurante;
import java.util.List;

public interface IRestauranteDAO {
    
    void agregarRestaurante(Restaurante restaurante);
    
    Restaurante consultarRestaurante(Long idRestaurante);
    
    List<Restaurante> consultarTodosLosRestaurantes();
    
    void actualizarRestaurante(Restaurante restaurante);
    
    void eliminarRestaurante(Long idRestaurante);
}
