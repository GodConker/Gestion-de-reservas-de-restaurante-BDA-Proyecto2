/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Cliente;
import javax.persistence.*;
import java.util.List;

public class ClienteDAO {

    @PersistenceContext
    private EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
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
}
