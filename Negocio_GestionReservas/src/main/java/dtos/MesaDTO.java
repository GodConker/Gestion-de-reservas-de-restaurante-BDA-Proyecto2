/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author danie
 */
public class MesaDTO {

    private int idMesa;
    private String codigoMesa;
    private String tipoMesa;
    private int capacidad;
    private String ubicacion;
    private int idRestaurante;

    public MesaDTO() {
    }

    public MesaDTO(int idMesa, String codigoMesa, String tipoMesa, int capacidad, String ubicacion, int idRestaurante) {
        this.idMesa = idMesa;
        this.codigoMesa = codigoMesa;
        this.tipoMesa = tipoMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.idRestaurante = idRestaurante;
    }

    // Getters y Setters
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public String getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    @Override
    public String toString() {
        return "MesaDTO{"
                + "idMesa=" + idMesa
                + ", codigoMesa='" + codigoMesa + '\''
                + ", tipoMesa='" + tipoMesa + '\''
                + ", capacidad=" + capacidad
                + ", ubicacion='" + ubicacion + '\''
                + ", idRestaurante=" + idRestaurante
                + '}';
    }
}
