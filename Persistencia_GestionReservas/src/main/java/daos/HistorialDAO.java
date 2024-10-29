/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author danie
 */
import entidades.HistorialReserva;
import entidades.HistorialReserva.EstadoReserva;
import entidades.Reserva;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class HistorialDAO {

    private final EntityManager entityManager;

    public HistorialDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void registrarCancelacion(Reserva reserva, double multa, Date fechaCancelacion) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();

            // Crear una nueva entrada en el historial de reservas
            HistorialReserva historial = new HistorialReserva();
            historial.setReserva(reserva);
            historial.setEstado(EstadoReserva.CANCELADA); // Asegúrate de que EstadoReserva.CANCELADA sea correcto
            historial.setFechaCambioEstado(fechaCancelacion); // Usar la fecha de cancelación

            // Persistir el historial
            entityManager.persist(historial);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Deshacer cambios en caso de error
            }
            throw e; // Volver a lanzar la excepción
        }
    }
}
