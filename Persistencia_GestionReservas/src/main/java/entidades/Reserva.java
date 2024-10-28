/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mesa_id") // Nombre de la columna en la tabla de Reserva
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Nombre de la columna en la tabla de Reserva
    private Cliente cliente;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<HistorialReserva> historialReservas = new ArrayList<>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora; // Fecha y hora de la creación de la reserva

    @Temporal(TemporalType.DATE)
    private Date fechaReserva; // Atributo para la fecha de la reserva

    private int numPersonas; // Atributo para el número de personas
    
    private int costo; // Atributo para el costo de la reserva

    public Reserva() {}

    public Reserva(Long id, Mesa mesa, Cliente cliente, Date fechaHora, Date fechaReserva, int numPersonas, int costo) {
        this.id = id;
        this.mesa = mesa;
        this.cliente = cliente;
        this.fechaHora = fechaHora;
        this.fechaReserva = fechaReserva; // Inicializar la fecha de la reserva
        this.numPersonas = numPersonas;
        this.costo = costo; // Inicializar el costo
    }

    // Métodos Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        if (numPersonas <= 0) {
            throw new IllegalArgumentException("El número de personas debe ser mayor que cero.");
        }
        this.numPersonas = numPersonas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        if (costo < 0) {
            throw new IllegalArgumentException("El costo no puede ser negativo.");
        }
        this.costo = costo;
    }

    // Método para obtener la ubicación de la mesa
    public String getUbicacionMesa() {
        if (mesa != null) {
            return mesa.getUbicacion();
        }
        return null; 
    }

    // Método para agregar un historial a la reserva
    public void agregarHistorialReserva(HistorialReserva historial) {
        historialReservas.add(historial);
        historial.setReserva(this); // Establecer la relación inversa
    }

    @Override
    public int hashCode() {
        return (id != null) ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "entidades.Reserva[ id=" + id + ", numPersonas=" + numPersonas + ", costo=" + costo + " ]";
    }
}