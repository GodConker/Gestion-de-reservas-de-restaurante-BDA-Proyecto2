/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Reserva;
import javax.persistence.*;
import java.util.List;

public class ReservaDAO {

    @PersistenceContext
    private EntityManager em;

    public ReservaDAO(EntityManager em) {
        this.em = em;
    }

    public void agregarReserva(Reserva reserva) {
        try {
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al agregar la reserva: " + e.getMessage());
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
}
