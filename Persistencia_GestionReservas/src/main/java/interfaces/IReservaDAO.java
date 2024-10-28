/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Reserva;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public interface IReservaDAO {
    public void agregarReserva(Reserva reserva) throws SQLException;
}
