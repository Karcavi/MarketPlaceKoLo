/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.PromocionEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author David
 */
public class PromocionPersistence {
    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;
     /**
     * Método para encontrar un objeto de la clase Promocion a través de un id
     *
     * @param id
     * @return Proveedor *
     */
    private PromocionEntity find(Long id) {
        PromocionEntity promocion = em.find(PromocionEntity.class, id);
        return promocion;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla Promocion
     *
     * @return listado de datos de la tabla
     *
     */
    private List<PromocionEntity> findAll() {
        Query todos = em.createQuery("select u from PromocionEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param promocion
     * @return promocion
     *
     */
    private PromocionEntity create(PromocionEntity promocion) {
        em.persist(promocion);
        return promocion;
    }

    /*Actualización de la entidad
        @param 
        @return promocionUpdate*/
    private PromocionEntity update(Long id) {
        PromocionEntity promocionUpdate = em.find(PromocionEntity.class, id);
        em.merge(promocionUpdate);
        return promocionUpdate;
    }

    /**
     * Eliminar un objeto de la entidad proveedor
     *
     * @param id
     * @return promocionDelete*
     */
    private void delete(Long id) {
        PromocionEntity promocionDelete = em.find(PromocionEntity.class, id);
        em.remove(promocionDelete);
    }
}
