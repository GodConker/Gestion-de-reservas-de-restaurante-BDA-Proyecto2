/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Mesa;
import javax.persistence.*;
import java.util.List;

public class MesaDAO {

    @PersistenceContext
    private EntityManager em;

    public MesaDAO(EntityManager em) {
        this.em = em;
    }

    public void agregarMesa(Mesa mesa) {
        try {
            em.getTransaction().begin();
            em.persist(mesa);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al agregar la mesa: " + e.getMessage());
        }
    }

    public Mesa consultarMesa(Long idMesa) {
        try {
            return em.find(Mesa.class, idMesa);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la mesa: " + e.getMessage());
        }
    }

    public List<Mesa> consultarTodasLasMesas() {
        try {
            return em.createQuery("SELECT m FROM Mesa m", Mesa.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar las mesas: " + e.getMessage());
        }
    }

    public void actualizarMesa(Mesa mesa) {
        try {
            em.getTransaction().begin();
            em.merge(mesa);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar la mesa: " + e.getMessage());
        }
    }

    public void eliminarMesa(Long idMesa) {
        try {
            em.getTransaction().begin();
            Mesa mesa = consultarMesa(idMesa);
            if (mesa != null) {
                em.remove(mesa);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar la mesa: " + e.getMessage());
        }
    }
}
