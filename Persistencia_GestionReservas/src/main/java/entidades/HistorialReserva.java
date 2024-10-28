/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class HistorialReserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cambio de AUTO a IDENTITY para generación de ID
    private Long id;

    // Relación muchos a uno con Reserva.
    @ManyToOne
    @JoinColumn(name = "id_reserva", nullable = false) // Hacer la columna no nula
    private Reserva reserva;

    public HistorialReserva(Long id, Reserva reserva) {
        this.id = id;
        this.reserva = reserva;
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
        return "HistorialReserva{id=" + id + ", reserva=" + (reserva != null ? reserva.getId() : "null") + "}";
    }
}
