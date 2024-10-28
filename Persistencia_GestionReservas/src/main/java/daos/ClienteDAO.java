/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author danie
 */

import dtos.ClienteDTO;
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
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al agregar el cliente: " + e.getMessage());
        }
    }

    public Cliente consultarCliente(Long idCliente) {
        try {
            return em.find(Cliente.class, idCliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar el cliente: " + e.getMessage());
        }
    }

    public List<Cliente> consultarTodosLosClientes() {
        try {
            return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar los clientes: " + e.getMessage());
        }
    }

    public void actualizarCliente(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al actualizar el cliente: " + e.getMessage());
        }
    }

    public void eliminarCliente(Long idCliente) {
        try {
            em.getTransaction().begin();
            Cliente cliente = consultarCliente(idCliente);
            if (cliente != null) {
                em.remove(cliente);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Error al eliminar el cliente: " + e.getMessage());
        }
    }
    
    public ClienteDTO obtenerPorNombre(String nombre) {
        try {
            return em.createQuery("SELECT c FROM Cliente c WHERE c.nombre = :nombre", ClienteDTO.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null si no encuentra el cliente
        }
    }
    
    public ClienteDTO buscarClientePorNombreYTelefono(String nombre, String telefono) {
        TypedQuery<ClienteDTO> query = em.createQuery(
            "SELECT c FROM Cliente c WHERE c.nombre = :nombre AND c.telefono = :telefono", ClienteDTO.class);
        query.setParameter("nombre", nombre);
        query.setParameter("telefono", telefono);
        
        // Obtener un solo resultado, o null si no se encuentra
        return query.getResultStream().findFirst().orElse(null);
    }
}