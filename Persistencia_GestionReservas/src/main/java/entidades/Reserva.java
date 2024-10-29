/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Reserva") // Asegúrate de que el nombre de la tabla sea correcto
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva") // Asegúrate de que coincide con la columna de la base de datos
    private int idReserva; // Cambiado a int para que coincida con la base de datos

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @Column(name = "fecha_reserva", nullable = false)
    private LocalDate fechaReserva; // Cambiado a LocalDate

    @Column(name = "hora_reserva", nullable = false)
    private LocalTime horaReserva;

    @Column(name = "num_personas", nullable = false)
    private int numPersonas;

    @Column(name = "costo", nullable = false)
    private double costo;

    public enum EstadoReserva {
        Activa,
        Cancelada
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_reserva")
    private EstadoReserva estadoReserva = EstadoReserva.Activa; // Valor por defecto

    @Column(name = "multa", nullable = false)
    private double multa = 0.00; // Valor por defecto

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<HistorialReserva> historialReservas = new ArrayList<>();

    // Constructor vacío
    public Reserva() {}

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        if (mesa == null) {
            throw new IllegalArgumentException("La mesa no puede ser nula.");
        }
        this.mesa = mesa;
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
        if (costo < 0) {
            throw new IllegalArgumentException("El costo no puede ser negativo.");
        }
        this.costo = costo;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        if (multa < 0) {
            throw new IllegalArgumentException("La multa no puede ser negativa.");
        }
        this.multa = multa;
    }

    public List<HistorialReserva> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(List<HistorialReserva> historialReservas) {
        this.historialReservas = historialReservas;
    }
    
    // Métodos para obtener los IDs
    public Long getIdCliente() {
        return cliente.getId(); // Asumiendo que tu clase Cliente tiene un método getId()
    }

    public Long getIdMesa() {
        return mesa.getId(); // Asumiendo que tu clase Mesa tiene un método getId()
    }

    @Override
    public int hashCode() {
        return (idReserva != 0) ? Integer.hashCode(idReserva) : 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        return this.idReserva == other.idReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                ", fechaReserva=" + fechaReserva +
                ", horaReserva=" + horaReserva +
                ", numPersonas=" + numPersonas +
                ", costo=" + costo +
                ", estadoReserva=" + estadoReserva +
                ", multa=" + multa +
                '}';
    }
}
