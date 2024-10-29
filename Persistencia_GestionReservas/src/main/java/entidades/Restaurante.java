/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Restaurante") // Asegúrate de que esto coincide con el nombre de tu tabla
public class Restaurante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY para la gestión de IDs
    @Column(name = "id_restaurante") // Mapeo correcto del nombre de la columna
    private Long id;

    @Column(name = "nombre", nullable = false) // Mapeo y restricciones para nombre
    private String nombre; // Nombre del restaurante

    @Column(name = "direccion", nullable = false) // Mapeo y restricciones para dirección
    private String direccion; // Dirección del restaurante

    @Column(name = "horario_apertura", nullable = false) // Mapeo para horario de apertura
    private Time horarioApertura; // Tipo de dato Time para la hora de apertura

    @Column(name = "horario_cierre", nullable = false) // Mapeo para horario de cierre
    private Time horarioCierre; // Tipo de dato Time para la hora de cierre

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Mesa> mesas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del restaurante no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección del restaurante no puede ser nula o vacía.");
        }
        this.direccion = direccion;
    }

    public Time getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(Time horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public Time getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(Time horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
    
    

//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        if (telefono == null || telefono.trim().isEmpty()) {
//            throw new IllegalArgumentException("El teléfono del restaurante no puede ser nulo o vacío.");
//        }
//        this.telefono = telefono;
//    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    @Override
    public int hashCode() {
        return (id != null) ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Restaurante)) {
            return false;
        }
        Restaurante other = (Restaurante) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + ", mesas=" + mesas + '}';
    }
    
}
