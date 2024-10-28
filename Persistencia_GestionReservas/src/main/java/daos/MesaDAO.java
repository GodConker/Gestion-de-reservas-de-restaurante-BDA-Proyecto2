/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dtos.MesaDTO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author danie
 */
public class MesaDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public MesaDTO obtenerPorId(int idMesa) {
        return em.find(MesaDTO.class, idMesa);
    }
    
    public MesaDTO buscarMesaPorTipo(String tipoMesa) {
        TypedQuery<MesaDTO> query = em.createQuery(
            "SELECT m FROM Mesa m WHERE m.tipoMesa = :tipoMesa", MesaDTO.class);
        query.setParameter("tipoMesa", tipoMesa);
        
        // Obtener un solo resultado, o null si no se encuentra
        return query.getResultStream().findFirst().orElse(null);
    }
}
