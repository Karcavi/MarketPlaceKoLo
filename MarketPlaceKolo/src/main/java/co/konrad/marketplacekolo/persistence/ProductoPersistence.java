/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.ProductoEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author David
 */
public class ProductoPersistence {
    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;
     /**
     * Método para encontrar un objeto de la clase producto a través de un id
     *
     * @param id
     * @return producto *
     */
    private ProductoEntity find(Long id) {
        ProductoEntity producto = em.find(ProductoEntity.class, id);
        return producto;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla producto
     *
     * @return listado de datos de la tabla
     *
     */
    private List<ProductoEntity> findAll() {
        Query todos = em.createQuery("select u from ProductoEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param producto
     * @return producto
     *
     */
    private ProductoEntity create(ProductoEntity producto) {
        em.persist(producto);
        return producto;
    }

    /*Actualización de la entidad
        @param 
        @return productoUpdate*/
    private ProductoEntity update(Long id) {
        ProductoEntity productoUpdate = em.find(ProductoEntity.class, id);
        em.merge(productoUpdate);
        return productoUpdate;
    }

    /**
     * Eliminar un objeto de la entidad producto
     *
     * @param id
     * @return productoDelete*
     */
    private void delete(Long id) {
        ProductoEntity productoDelete = em.find(ProductoEntity.class, id);
        em.remove(productoDelete);
    }
}
