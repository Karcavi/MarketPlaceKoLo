/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.PaisEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author IAN
 */
public class PaisPersistence {
    
    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase Pais a través de un id
     *
     * @param id
     * @return Pais *
     */
    private PaisEntity find(Long id) {
        PaisEntity pais = em.find(PaisEntity.class, id);
        return pais;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla Pais
     *
     * @return listado de datos de la tabla
     *
     */
    private List<PaisEntity> findAll() {
        Query todos = em.createQuery("select u from PaisEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param pais
     * @return pais
     *
     */
    private PaisEntity create(PaisEntity pais) {
        em.persist(pais);
        return pais;
    }

    /*Actualización de la entidad
        @param 
        @return paisUpdate*/
    
    private PaisEntity update(Long id) {
        PaisEntity paisUpdate = em.find(PaisEntity.class, id);
        em.merge(paisUpdate);
        return paisUpdate;
    }

    /**
     * Eliminar un objeto de la entidad Pais
     *
     * @param id
     * @return paisDelete*
     */
    private void delete(Long id) {
        PaisEntity paisDelete = em.find(PaisEntity.class, id);
        em.remove(paisDelete);
    }
}
