/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Restaurante;
import javax.persistence.*;
import java.util.List;

public class RestauranteDAO {

    @PersistenceContext
    private final EntityManager em;

    public RestauranteDAO(EntityManager em) {
        this.em = em;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        try {
            em.getTransaction().begin();
            em.persist(restaurante);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al agregar el restaurante: " + e.getMessage());
        }
    }

    public Restaurante consultarRestaurante(Long idRestaurante) {
        try {
            return em.find(Restaurante.class, idRestaurante);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar el restaurante: " + e.getMessage());
        }
    }

    public List<Restaurante> consultarTodosLosRestaurantes() {
        try {
            return em.createQuery("SELECT r FROM Restaurante r", Restaurante.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar los restaurantes: " + e.getMessage());
        }
    }

    public void actualizarRestaurante(Restaurante restaurante) {
        try {
            em.getTransaction().begin();
            em.merge(restaurante);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar el restaurante: " + e.getMessage());
        }
    }

    public void eliminarRestaurante(Long idRestaurante) {
        try {
            em.getTransaction().begin();
            Restaurante restaurante = consultarRestaurante(idRestaurante);
            if (restaurante != null) {
                em.remove(restaurante);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar el restaurante: " + e.getMessage());
        }
    }
}
