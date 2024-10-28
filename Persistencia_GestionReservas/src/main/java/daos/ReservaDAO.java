/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Reserva;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author danie
 */
public class ReservaDAO {

    private EntityManager entityManager;
    
    public ReservaDAO(){}
    
    public ReservaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardarReserva(Reserva reserva) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(reserva);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void agregarReserva(Reserva reserva) {
        try {
            entityManager.getTransaction().begin();
            // Guardar la nueva reserva en la base de datos
            entityManager.persist(reserva);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); // Rollback en caso de error
            }
            throw new RuntimeException("Error al agregar la reserva: " + e.getMessage());
        }
    }
}
