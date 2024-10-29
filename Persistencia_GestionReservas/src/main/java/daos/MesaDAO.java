/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Mesa;
import entidades.Restaurante;
import javax.persistence.*;
import java.util.List;

public class MesaDAO {

    private final EntityManagerFactory emf;

    public MesaDAO() {
        emf = Persistence.createEntityManagerFactory("Persistencia_GestionReservasPU");
    }

    public String generarCodigoMesa(String ubicacion, int capacidad) {
        // Obtener las tres primeras letras de la ubicación
        String ubicacionCodigo;
        switch (ubicacion.toUpperCase()) { // Convierte a mayúsculas para hacer la comparación insensible a mayúsculas
            case "TERRAZA" ->
                ubicacionCodigo = "TER";
            case "VENTANA" ->
                ubicacionCodigo = "VEN";
            case "GENERAL" ->
                ubicacionCodigo = "GEN";
            default ->
                throw new IllegalArgumentException("Ubicación no válida: " + ubicacion);
        }
        // Convierte a mayúsculas para hacer la comparación insensible a mayúsculas

        // Generar un número único de tres dígitos
        String numeroUnico = String.format("%03d", obtenerNumeroUnico()); // Asegúrate de implementar este método

        // Construir el código de la mesa
        return ubicacionCodigo + "-" + capacidad + "-" + numeroUnico;
    }

    private int obtenerNumeroUnico() {
        // Lógica para generar un número único (por ejemplo, contar mesas existentes y sumar uno)
        // Aquí se puede implementar la lógica para asegurarte de que sea único
        // Por simplicidad, usaré un número aleatorio entre 1 y 999
        return (int) (Math.random() * 999) + 1; // Cambia esto por una lógica más robusta
    }

    public void agregarMesa(Mesa mesa) {
        // Validar que la mesa no sea nula
        if (mesa == null) {
            throw new IllegalArgumentException("La mesa no puede ser nula.");
        }

        // Generar el código de mesa antes de agregar
        // Asegúrate de que la ubicación sea un enum y usa su nombre
        String codigoMesa = generarCodigoMesa(mesa.getUbicacion().name(), mesa.getCapacidad());
        mesa.setCodigoMesa(codigoMesa);

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
