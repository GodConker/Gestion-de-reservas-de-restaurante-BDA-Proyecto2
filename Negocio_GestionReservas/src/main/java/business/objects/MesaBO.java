/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.objects;

import daos.MesaDAO;
import entidades.Mesa;
import entidades.Restaurante;
import java.util.List;
import java.util.UUID;

public class MesaBO {

    private final MesaDAO mesaDAO;

    public MesaBO() {
        this.mesaDAO = new MesaDAO(); // Suponiendo que tienes un constructor por defecto
    }

    public MesaBO(MesaDAO mesaDAO) {
        this.mesaDAO = mesaDAO;
    }

    // Lógica para agregar una mesa
    public void agregarMesa(Mesa mesa) {
        if (mesa.getTipo() == null || mesa.getCapacidad() <= 0) {
            throw new IllegalArgumentException("El tipo de mesa y la capacidad son obligatorios.");
        }
        mesaDAO.agregarMesa(mesa);
    }

    // Lógica para consultar una mesa por ID
    public Mesa consultarMesa(Long idMesa) {
        Mesa mesa = mesaDAO.consultarMesa(idMesa);
        if (mesa == null) {
            throw new RuntimeException("Mesa no encontrada");
        }
        return mesa;
    }

    // Lógica para consultar todas las mesas de un restaurante
    public List<Mesa> consultarMesasPorRestaurante(Long idRestaurante) {
        return mesaDAO.consultarMesasPorRestaurante(idRestaurante);
    }

    // Lógica para buscar una mesa disponible del tipo y capacidad solicitados
    public Mesa buscarMesaDisponible(Long idRestaurante, String tipoMesa, int capacidad) {
        List<Mesa> mesas = consultarMesasPorRestaurante(idRestaurante);
        for (Mesa mesa : mesas) {
            if (mesa.getTipo().equalsIgnoreCase(tipoMesa) && mesa.getCapacidad() >= capacidad) {
                // Aquí podrías agregar más lógica para verificar si la mesa está reservada
                return mesa; // Retorna la primera mesa que cumpla con los criterios
            }
        }
        return null; // Retorna null si no se encuentra una mesa
    }

    // Lógica para actualizar una mesa
    public void actualizarMesa(Mesa mesa) {
        if (mesaDAO.consultarMesa(mesa.getId()) == null) {
            throw new RuntimeException("Mesa no encontrada");
        }
        mesaDAO.actualizarMesa(mesa);
    }

    // Lógica para eliminar una mesa
    public void eliminarMesa(Long idMesa) {
        Mesa mesa = mesaDAO.consultarMesa(idMesa);
        if (mesa == null) {
            throw new RuntimeException("Mesa no encontrada");
        }
        mesaDAO.eliminarMesa(idMesa);
    }

    // Método para buscar o crear una mesa
    public Mesa buscarORegistrarMesa(String tipoMesa, int numPersonas, Long idRestaurante, String ubicacion) {
        // Buscar la mesa existente por tipo y capacidad
        Mesa mesa = mesaDAO.buscarMesaPorTipoYCapacidad(tipoMesa, numPersonas, idRestaurante);

        if (mesa == null) {
            // Crear una nueva mesa si no existe
            mesa = new Mesa();
            mesa.setTipo(tipoMesa);
            mesa.setCapacidad(numPersonas);

            // Asignar el restaurante correspondiente
            Restaurante restaurante = mesaDAO.obtenerRestaurantePorId(idRestaurante);
            mesa.setRestaurante(restaurante); // Asigna el restaurante

            // Generar un código único para la mesa usando la ubicación seleccionada
            String codigoMesa = mesaDAO.generarCodigoMesa(ubicacion, numPersonas); // Aquí pasas la ubicación
            mesa.setCodigoMesa(codigoMesa); // Asignar el código único

            mesaDAO.agregarMesa(mesa); // Registrar la nueva mesa en la base de datos
        }

        return mesa; // Retornar la mesa encontrada o creada
    }

    public String generarCodigoMesa() {
        // Generar un código único utilizando UUID
        return "MESA-" + UUID.randomUUID().toString(); // Esto generará un código único
    }
}
