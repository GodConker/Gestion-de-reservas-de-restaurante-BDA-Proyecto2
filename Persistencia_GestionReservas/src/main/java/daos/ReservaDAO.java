/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Reserva;
import entidades.Restaurante;
import java.time.LocalDate;
import javax.persistence.*;
import java.util.List;

public class ReservaDAO {

    private final EntityManagerFactory emf;

    public ReservaDAO() {
        emf = Persistence.createEntityManagerFactory("Persistencia_GestionReservasPU");
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crearReserva(Reserva reserva) throws Exception {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(reserva);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new Exception("Error al agregar la reserva: " + e.getMessage(), e);
        } finally {
            em.close();
        }
    }

    public Reserva consultarReserva(Long idReserva) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reserva.class, idReserva);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la reserva: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Reserva> consultarTodasLasReservas() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT r FROM Reserva r", Reserva.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar las reservas: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public void actualizarReserva(Reserva reserva) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(reserva);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al actualizar la reserva: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public void eliminarReserva(Long idReserva) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Reserva reserva = consultarReserva(idReserva);
            if (reserva != null) {
                em.remove(reserva);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al eliminar la reserva: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Restaurante> obtenerRestaurantes() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Restaurante> query = em.createQuery("SELECT r FROM Restaurante r", Restaurante.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Reserva buscarReservaPorId(int idReserva) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reserva.class, idReserva);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la reserva por ID: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public void cancelarReserva(int idReserva) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Reserva reserva = buscarReservaPorId(idReserva);
            if (reserva != null) {
                reserva.setEstadoReserva(Reserva.EstadoReserva.Cancelada);
                em.merge(reserva);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al cancelar la reserva: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Reserva> buscarReservas(String nombre, String telefono, LocalDate fechaDesde, LocalDate fechaHasta, String area, Integer tamanoMesa) {
        EntityManager em = getEntityManager();
        StringBuilder jpql = new StringBuilder("SELECT r FROM Reserva r WHERE 1=1");

        if (nombre != null && !nombre.isEmpty()) {
            jpql.append(" AND r.cliente.nombreCompleto LIKE :nombre");
        }
        if (telefono != null && !telefono.isEmpty()) {
            jpql.append(" AND r.cliente.telefono = :telefono");
        }
        if (fechaDesde != null) {
            jpql.append(" AND r.fechaReserva >= :fechaDesde");
        }
        if (fechaHasta != null) {
            jpql.append(" AND r.fechaReserva <= :fechaHasta");
        }
        if (area != null && !area.isEmpty()) {
            jpql.append(" AND r.area = :area");
        }
        if (tamanoMesa != null) {
            jpql.append(" AND r.mesa.tamano = :tamanoMesa");
        }

        TypedQuery<Reserva> query = em.createQuery(jpql.toString(), Reserva.class);
        if (nombre != null && !nombre.isEmpty()) {
            query.setParameter("nombre", "%" + nombre + "%");
        }
        if (telefono != null && !telefono.isEmpty()) {
            query.setParameter("telefono", telefono);
        }
        if (fechaDesde != null) {
            query.setParameter("fechaDesde", fechaDesde);
        }
        if (fechaHasta != null) {
            query.setParameter("fechaHasta", fechaHasta);
        }
        if (area != null && !area.isEmpty()) {
            query.setParameter("area", area);
        }
        if (tamanoMesa != null) {
            query.setParameter("tamanoMesa", tamanoMesa);
        }

        return query.getResultList();
    }
}
