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
public class ReservaDTO {
    private int idReserva;
    private Date fechaReserva;
    private Date horaReserva;
    private int numPersonas;
    private double costo;
    private String estadoReserva;
    private double multa;
    private int idCliente;
    private int idMesa;

    public ReservaDTO() {}

    public ReservaDTO(int idReserva, Date fechaReserva, Date horaReserva, int numPersonas, double costo, 
                      String estadoReserva, double multa, int idCliente, int idMesa) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.numPersonas = numPersonas;
        this.costo = costo;
        this.estadoReserva = estadoReserva;
        this.multa = multa;
        this.idCliente = idCliente;
        this.idMesa = idMesa;
    }

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Date horaReserva) {
        this.horaReserva = horaReserva;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    
    @Override
    public String toString() {
        return "ReservaDTO{"
                + "idReserva=" + idReserva
                + ", fechaReserva=" + fechaReserva
                + ", horaReserva=" + horaReserva
                + ", numPersonas=" + numPersonas
                + ", costo=" + costo
                + ", estadoReserva='" + estadoReserva + '\''
                + ", multa=" + multa
                + ", idCliente=" + idCliente
                + ", idMesa=" + idMesa
                + '}';
    }
}