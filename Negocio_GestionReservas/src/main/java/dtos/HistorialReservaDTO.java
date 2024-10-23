/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Date;

/**
 *
 * @author danie
 */
public class HistorialReservaDTO {
    private int idHistorial;
    private int idReserva;
    private String estado;
    private Date fechaCambioEstado;

    // Constructor vacío
    public HistorialReservaDTO() {}

    // Constructor con parámetros
    public HistorialReservaDTO(int idHistorial, int idReserva, String estado, Date fechaCambioEstado) {
        this.idHistorial = idHistorial;
        this.idReserva = idReserva;
        this.estado = estado;
        this.fechaCambioEstado = fechaCambioEstado;
    }

    // Getters y Setters
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCambioEstado() {
        return fechaCambioEstado;
    }

    public void setFechaCambioEstado(Date fechaCambioEstado) {
        this.fechaCambioEstado = fechaCambioEstado;
    }
    
    @Override
    public String toString() {
        return "HistorialReservaDTO{"
                + "idHistorial=" + idHistorial
                + ", idReserva=" + idReserva
                + ", estado='" + estado + '\''
                + ", fechaCambioEstado=" + fechaCambioEstado
                + '}';
    }
}
