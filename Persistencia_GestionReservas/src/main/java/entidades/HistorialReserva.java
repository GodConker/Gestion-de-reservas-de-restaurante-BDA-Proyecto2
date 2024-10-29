/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class HistorialReserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_reserva", nullable = false)
    private Reserva reserva;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING) // Usar STRING para almacenar el enum como texto
    private EstadoReserva estado; // Asegúrate de tener esta clase de enum

    public enum EstadoReserva {
        RESERVADA,
        CANCELADA
    }

    @Column(nullable = false)
    private Date fechaCambioEstado; // Cambiamos el tipo a Date

    public HistorialReserva() {
    }

    public HistorialReserva(Long id, Reserva reserva, EstadoReserva estado, Date fechaCambioEstado) {
        this.id = id;
        this.reserva = reserva;
        this.estado = estado;
        this.fechaCambioEstado = fechaCambioEstado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        if (reserva == null) {
            throw new IllegalArgumentException("La reserva no puede ser nula.");
        }
        this.reserva = reserva;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Date getFechaCambioEstado() {
        return fechaCambioEstado;
    }

    public void setFechaCambioEstado(Date fechaCambioEstado) {
        this.fechaCambioEstado = fechaCambioEstado;
    }

    @Override
    public int hashCode() {
        return (id != null) ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof HistorialReserva)) {
            return false;
        }
        HistorialReserva other = (HistorialReserva) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "HistorialReserva{id=" + id + ", reserva=" + (reserva != null ? reserva.getIdReserva(): "null")
                + ", estado=" + estado + ", fechaCambioEstado=" + fechaCambioEstado + "}";
    }
}
