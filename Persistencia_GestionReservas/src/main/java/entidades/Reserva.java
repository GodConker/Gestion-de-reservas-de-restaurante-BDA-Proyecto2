/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cambiado a IDENTITY para mejor gestión de IDs
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false) // Hacer la columna no nula
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false) // Cambia esto a id_cliente
    private Cliente cliente;

    @Column(name = "fecha_reserva")
    private LocalDateTime fechaReserva;
    
    @Column(name = "hora_reserva", nullable = false)
    private LocalTime horaReserva;
    
    
    @Column(name = "num_personas") // Cambia esto para que coincida con la base de datos
    private int numPersonas;
    private double costo;

    public enum EstadoReserva {
        ACTIVA,
        CANCELADA
    }
    @Enumerated(EnumType.STRING) // Indica que se usará el nombre del enumerado
    @Column(name = "estado_reserva") // Asegúrate de que coincide con la columna de la base de datos
    private EstadoReserva estadoReserva;
    
    private double multa;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<HistorialReserva> historialReservas = new ArrayList<>();

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
        if (mesa == null) {
            throw new IllegalArgumentException("La mesa no puede ser nula.");
        }
        this.mesa = mesa;
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

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
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
        this.multa = multa;
    }

    public List<HistorialReserva> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(List<HistorialReserva> historialReservas) {
        this.historialReservas = historialReservas;
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

    public LocalTime getHoraReserva() {
        return horaReserva;
    }
    
    public void setHoraReserva(LocalTime horaReserva) {
    this.horaReserva = horaReserva;
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
        return "Reserva{" + "id=" + id + ", mesa=" + mesa + ", cliente=" + cliente + ", fechaReserva=" + fechaReserva + ", numPersonas=" + numPersonas + ", costo=" + costo + ", estadoReserva=" + estadoReserva + ", multa=" + multa + ", historialReservas=" + historialReservas + '}';
    }

}
