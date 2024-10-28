/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Reserva;
import java.util.List;

public interface IReservaDAO {
    
    void agregarReserva(Reserva reserva);
    
    Reserva consultarReserva(Long idReserva);
    
    List<Reserva> consultarTodasLasReservas();
    
    void actualizarReserva(Reserva reserva);
    
    void eliminarReserva(Long idReserva);
}
