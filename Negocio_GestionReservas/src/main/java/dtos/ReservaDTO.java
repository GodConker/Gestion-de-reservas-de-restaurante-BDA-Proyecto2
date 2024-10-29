/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;


/**
 *
 * @author danie
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDTO {
    private int idReserva;
    private LocalDate fechaReserva;
    private LocalTime horaReserva;
    private int numPersonas;
    private double costo;
    private String estadoReserva;
    private double multa;
    private Long idCliente;
    private String nombreCliente;
    private Long idMesa;

    public ReservaDTO() {}

    public ReservaDTO(int idReserva, LocalDate fechaReserva, LocalTime horaReserva, int numPersonas, 
                      double costo, String estadoReserva, double multa, Long idCliente, Long idMesa) {
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
    
    public ReservaDTO(int idReserva, LocalDate fechaReserva, LocalTime horaReserva, int numPersonas, 
                      double costo, String estadoReserva, double multa, Long idCliente, 
                      String nombreCliente, Long idMesa) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.numPersonas = numPersonas;
        this.costo = costo;
        this.estadoReserva = estadoReserva;
        this.multa = multa;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idMesa = idMesa;
    }

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Long idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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