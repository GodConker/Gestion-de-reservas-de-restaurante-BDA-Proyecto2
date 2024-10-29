/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Mesa")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa")
    private Long id;

    @Column(name = "codigo_mesa", nullable = false) // Asegúrate de que este campo esté aquí
    private String codigoMesa;

    @ManyToOne
    @JoinColumn(name = "id_restaurante", nullable = false)
    private Restaurante restaurante;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "tipo_mesa")
    private String tipoMesa;

    public enum Ubicacion {
        General,
        Ventana,
        Terraza
    }
    @Enumerated(EnumType.STRING)
    @Column(name = "ubicacion")
    private Ubicacion ubicacion;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        if (codigoMesa == null || codigoMesa.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la mesa no puede estar vacío.");
        }
        this.codigoMesa = codigoMesa;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        if (restaurante == null) {
            throw new IllegalArgumentException("El restaurante no puede ser nulo.");
        }
        this.restaurante = restaurante;
    }

    public String getTipo() {
        return tipoMesa;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de mesa no puede estar vacío.");
        }
        this.tipoMesa = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        this.capacidad = capacidad;
    }

    public String getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public int hashCode() {
        return (id != null) ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Mesa{id=" + id + ", codigo='" + codigoMesa + "', tipo='" + tipoMesa + "', capacidad=" + capacidad + ", restaurante=" + (restaurante != null ? restaurante.getId() : "null") + "}";
    }
}
