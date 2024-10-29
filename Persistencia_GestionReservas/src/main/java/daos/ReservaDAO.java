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
        EntityManager emm = null; // Inicializar EntityManager a null

        try {
            emm = emf.createEntityManager(); // Obtener una instancia de EntityManager
            emm.getTransaction().begin();
            emm.persist(reserva); // Guardar la reserva
            emm.getTransaction().commit();
        } catch (Exception e) {
            if (emm != null && emm.getTransaction().isActive()) {
                emm.getTransaction().rollback(); // Revertir si hay un error
            }
            throw new Exception("Error al agregar la reserva: " + e.getMessage(), e);
        } finally {
            if (emm != null && emm.isOpen()) {
                emm.close(); // Cerrar el EntityManager si está abierto
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

    // Método para obtener una reserva por su ID
    public Reserva obtenerReservaPorId(Long idReserva) {
        try {
            return em.find(Reserva.class, idReserva);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la reserva por ID: " + e.getMessage());
        }
    }

    // Método para cancelar la reserva
    public void cancelarReserva(Long idReserva) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            // Obtener la reserva
            Reserva reserva = obtenerReservaPorId(idReserva);
            if (reserva != null) {
                // Cambiar el estado a CANCELADA
                reserva.setEstadoReserva(Reserva.EstadoReserva.Cancelada);
                em.merge(reserva); // Guardar los cambios
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Deshacer cambios en caso de error
            }
            throw new RuntimeException("Error al cancelar la reserva: " + e.getMessage());
        }
    }

    public Reserva buscarReservaPorId(int idReserva) {
        EntityManager emm = null; // Inicializar EntityManager a null
        Reserva reserva = null;

        try {
            emm = emf.createEntityManager(); // Obtener una instancia de EntityManager
            emm.getTransaction().begin(); // Iniciar transacción

            // Utilizar JPQL para buscar la reserva por su ID
            TypedQuery<Reserva> query = emm.createQuery(
                    "SELECT r FROM Reserva r WHERE r.idReserva = :id", Reserva.class);
            query.setParameter("id", idReserva);
            reserva = query.getSingleResult(); // Obtener el resultado

            emm.getTransaction().commit(); // Confirmar la transacción
        } catch (NoResultException e) {
            System.out.println("Reserva no encontrada con ID: " + idReserva);
            // Aquí puedes manejar lo que deseas hacer si no se encuentra la reserva
        } catch (Exception e) {
            if (emm != null && emm.getTransaction().isActive()) {
                emm.getTransaction().rollback(); // Revertir si hay un error
            }
            throw new RuntimeException("Error al buscar la reserva: " + e.getMessage(), e);
        } finally {
            if (emm != null && emm.isOpen()) {
                emm.close(); // Cerrar el EntityManager si está abierto
            }
        }

        return reserva; // Devuelve null si no se encuentra la reserva
    }
}
