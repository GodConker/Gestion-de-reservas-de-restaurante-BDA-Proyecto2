/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Reserva;
import entidades.Restaurante;
import javax.persistence.*;
import java.util.List;

public class ReservaDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public ReservaDAO() {
        emf = Persistence.createEntityManagerFactory("Persistencia_GestionReservasPU");
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public void crearReserva(Reserva reserva) throws Exception {
        EntityManager em = null; // Inicializar EntityManager a null

        try {
            em = emf.createEntityManager(); // Obtener una instancia de EntityManager
            em.getTransaction().begin();
            em.persist(reserva); // Guardar la reserva
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Revertir si hay un error
            }
            throw new Exception("Error al agregar la reserva: " + e.getMessage(), e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close(); // Cerrar el EntityManager si está abierto
            }
        }
    }   

    public Reserva consultarReserva(Long idReserva) {
        try {
            return em.find(Reserva.class, idReserva);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la reserva: " + e.getMessage());
        }
    }

    public List<Reserva> consultarTodasLasReservas() {
        try {
            return em.createQuery("SELECT r FROM Reserva r", Reserva.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar las reservas: " + e.getMessage());
        }
    }

    public void actualizarReserva(Reserva reserva) {
        try {
            em.getTransaction().begin();
            em.merge(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar la reserva: " + e.getMessage());
        }
    }

    public void eliminarReserva(Long idReserva) {
        try {
            em.getTransaction().begin();
            Reserva reserva = consultarReserva(idReserva);
            if (reserva != null) {
                em.remove(reserva);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar la reserva: " + e.getMessage());
        }
    }
    
    public List<Restaurante> obtenerRestaurantes() {
        EntityManager emm = emf.createEntityManager();
        List<Restaurante> restaurantes = null;

        try {
            TypedQuery<Restaurante> query = emm.createQuery("SELECT r FROM Restaurante r", Restaurante.class);
            restaurantes = query.getResultList();
        } finally {
            emm.close();
        }

        return restaurantes;
    }
}
