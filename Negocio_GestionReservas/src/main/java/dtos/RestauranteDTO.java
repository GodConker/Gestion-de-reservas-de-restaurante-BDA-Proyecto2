/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author danie
 */
public class RestauranteDTO {

        private int idRestaurante;
        private String nombre;
        private String direccion;
        private String horarioApertura;
        private String horarioCierre;

        public RestauranteDTO() {}

        public RestauranteDTO(int idRestaurante, String nombre, String direccion, String horarioApertura, String horarioCierre) {
            this.idRestaurante = idRestaurante;
            this.nombre = nombre;
            this.direccion = direccion;
            this.horarioApertura = horarioApertura;
            this.horarioCierre = horarioCierre;
        }

        // Getters y Setters
        public int getIdRestaurante() {
            return idRestaurante;
        }

        public void setIdRestaurante(int idRestaurante) {
            this.idRestaurante = idRestaurante;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getHorarioApertura() {
            return horarioApertura;
        }

        public void setHorarioApertura(String horarioApertura) {
            this.horarioApertura = horarioApertura;
        }

        public String getHorarioCierre() {
            return horarioCierre;
        }

        public void setHorarioCierre(String horarioCierre) {
            this.horarioCierre = horarioCierre;
        }
        
        @Override
    public String toString() {
        return "RestauranteDTO{"
                + "idRestaurante=" + idRestaurante
                + ", nombre='" + nombre + '\''
                + ", direccion='" + direccion + '\''
                + ", horarioApertura='" + horarioApertura + '\''
                + ", horarioCierre='" + horarioCierre + '\''
                + '}';
    }
    
}
