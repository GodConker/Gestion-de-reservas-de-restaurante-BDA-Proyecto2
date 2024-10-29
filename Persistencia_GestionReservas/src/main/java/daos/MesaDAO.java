/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Mesa;
import entidades.Restaurante;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

public class MesaDAO {

    private EntityManagerFactory emf;

    public MesaDAO() {
        emf = Persistence.createEntityManagerFactory("Persistencia_GestionReservasPU");
    }

    public String generarCodigoMesa() {
        // Generar un código único utilizando UUID o cualquier otra lógica
        return "MESA-" + UUID.randomUUID().toString(); // Ajusta según tus necesidades
    }

    public void agregarMesa(Mesa mesa) {
        // Generar el código de mesa antes de agregar
        mesa.setCodigoMesa(generarCodigoMesa());

        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(mesa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al agregar la mesa: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    public Mesa consultarMesa(Long idMesa) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Mesa.class, idMesa);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la mesa: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    public List<Mesa> consultarTodasLasMesas() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT m FROM Mesa m", Mesa.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar las mesas: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    public void actualizarMesa(Mesa mesa) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.merge(mesa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al actualizar la mesa: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    public void eliminarMesa(Long idMesa) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Mesa mesa = consultarMesa(idMesa);
            if (mesa != null) {
                em.remove(mesa);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al eliminar la mesa: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    public Mesa buscarMesaPorTipoYCapacidad(String tipoMesa, int numPersonas, Long idRestaurante) {
    EntityManager em = emf.createEntityManager();
    
    try {
        String jpql = "SELECT m FROM Mesa m WHERE m.tipoMesa = :tipoMesa AND m.capacidad >= :numPersonas AND m.restaurante.id = :idRestaurante";
        TypedQuery<Mesa> query = em.createQuery(jpql, Mesa.class);
        query.setParameter("tipoMesa", tipoMesa);
        query.setParameter("numPersonas", numPersonas);
        query.setParameter("idRestaurante", idRestaurante);

        // Obtener la primera mesa disponible que cumpla con los criterios
        return query.setMaxResults(1).getSingleResult(); // Retorna una mesa o lanza NoResultException si no se encuentra
    } catch (NoResultException e) {
        return null; // No se encontró ninguna mesa
    } catch (Exception e) {
        throw new RuntimeException("Error al buscar la mesa: " + e.getMessage(), e);
    } finally {
        em.close(); // Asegurarse de cerrar el EntityManager
    }
}

    public List<Mesa> consultarMesasPorRestaurante(Long idRestaurante) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        List<Mesa> mesas = null;

        try {
            transaction.begin();
            // Consulta las mesas que pertenecen al restaurante con el ID proporcionado
            TypedQuery<Mesa> query = em.createQuery(
                    "SELECT m FROM Mesa m WHERE m.restaurante.id = :idRestaurante", Mesa.class);
            query.setParameter("idRestaurante", idRestaurante);
            mesas = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al consultar las mesas del restaurante: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager
        }
        return mesas;
    }
    
    public Restaurante obtenerRestaurantePorId(Long idRestaurante) {
    EntityManager em = emf.createEntityManager();
    
    try {
        return em.find(Restaurante.class, idRestaurante); // Devuelve el restaurante si existe
    } catch (Exception e) {
        throw new RuntimeException("Error al obtener el restaurante: " + e.getMessage(), e);
    } finally {
        em.close(); // Cerrar el EntityManager
    }
}
}
