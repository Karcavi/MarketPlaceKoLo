/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.CiudadEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author IAN
 */
public class CiudadPersistence {

    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase Ciudad a través de un id
     *
     * @param id
     * @return Ciudad *
     */
    private CiudadEntity find(Long id) {
        CiudadEntity ciudad = em.find(CiudadEntity.class, id);
        return ciudad;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla Ciudad
     *
     * @return listado de datos de la tabla
     *
     */
    private List<CiudadEntity> findAll() {
        Query todos = em.createQuery("select u from CiudadEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param ciudad
     * @return ciudad
     *
     */
    private CiudadEntity create(CiudadEntity ciudad) {
        em.persist(ciudad);
        return ciudad;
    }

    /*Actualización de la entidad
        @param 
        @return ciudadUpdate*/
    private CiudadEntity update(Long id) {
        CiudadEntity ciudadUpdate = em.find(CiudadEntity.class, id);
        em.merge(ciudadUpdate);
        return ciudadUpdate;
    }

    /**
     * Eliminar un objeto de la entidad Ciudad
     *
     * @param id
     * @return ciudadDelete*
     */
    private void delete(Long id) {
        CiudadEntity ciudadDelete = em.find(CiudadEntity.class, id);
        em.remove(ciudadDelete);
    }
}
