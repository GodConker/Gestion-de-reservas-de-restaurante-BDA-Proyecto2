/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.MesaDAO;
import dtos.MesaDTO;

/**
 *
 * @author danie
 */
public class MesaBO {

    private MesaDAO mesaDAO;

    public MesaDTO buscarMesaPorId(int idMesa) throws Exception {
        MesaDTO mesaDTO = mesaDAO.obtenerPorId(idMesa);
        if (mesaDTO == null) {
            throw new Exception("Mesa no encontrada.");
        }
        return mesaDTO;
    }

    public MesaDTO buscarMesaPorTipo(String tipoMesa) {
        return mesaDAO.buscarMesaPorTipo(tipoMesa);
    }
}
