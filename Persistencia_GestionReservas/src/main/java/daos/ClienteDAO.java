/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Cliente;
import javax.persistence.*;
import java.util.List;

public class ClienteDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public ClienteDAO() {
        // Crear la fábrica de EntityManager
        emf = Persistence.createEntityManagerFactory("Persistencia_GestionReservasPU");
        em = emf.createEntityManager();
    }

    public void close() {
        if (em != null && em.isOpen()) {
            em.close(); // Cerrar el EntityManager
        }
        if (emf != null && emf.isOpen()) {
            emf.close(); // Cerrar la fábrica si ya no se necesita
        }
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }

        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al agregar el cliente: " + e.getMessage(), e);
        }
    }

    public Cliente consultarCliente(Long idCliente) {
        if (idCliente == null) {
            throw new IllegalArgumentException("El ID del cliente no puede ser nulo.");
        }

        try {
            return em.find(Cliente.class, idCliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar el cliente: " + e.getMessage(), e);
        }
    }

    public List<Cliente> consultarTodosLosClientes() {
        try {
            return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar los clientes: " + e.getMessage(), e);
        }
    }

    public void actualizarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.merge(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al actualizar el cliente: " + e.getMessage(), e);
        }
    }

    public void eliminarCliente(Long idCliente) {
        if (idCliente == null) {
            throw new IllegalArgumentException("El ID del cliente no puede ser nulo.");
        }

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Cliente cliente = consultarCliente(idCliente);
            if (cliente != null) {
                em.remove(cliente);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al eliminar el cliente: " + e.getMessage(), e);
        }
    }

    public Cliente buscarPorNombreYTelefono(String nombre, String telefono) {
        String jpql = "SELECT c FROM Cliente c WHERE c.nombreCompleto = :nombre AND c.telefono = :telefono";
        TypedQuery<Cliente> query = em.createQuery(jpql, Cliente.class);
        query.setParameter("nombre", nombre);
        query.setParameter("telefono", telefono);

        try {
            List<Cliente> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar el cliente: " + e.getMessage());
        }
    }

    public List<Cliente> buscarPorNombreOTelefono(String criterio) {
        if (criterio == null || criterio.trim().isEmpty()) {
            throw new IllegalArgumentException("El criterio de búsqueda no puede estar vacío.");
        }

        String jpql = "SELECT c FROM Cliente c WHERE c.nombreCompleto LIKE :criterio OR c.telefono LIKE :criterio";
        TypedQuery<Cliente> query = em.createQuery(jpql, Cliente.class);
        query.setParameter("criterio", "%" + criterio + "%");

        try {
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar el cliente por nombre o teléfono: " + e.getMessage(), e);
        }
    }

    public void insercionMasivaClientes(List<Cliente> clientes) {
        if (clientes == null || clientes.isEmpty()) {
            throw new IllegalArgumentException("La lista de clientes no puede estar vacía.");
        }

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            for (Cliente cliente : clientes) {
                em.persist(cliente);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error al insertar clientes: " + e.getMessage(), e);
        }
    }
}
