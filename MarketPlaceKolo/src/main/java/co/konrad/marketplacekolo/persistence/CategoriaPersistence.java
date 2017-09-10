/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.CategoriaEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author IAN
 */
public class CategoriaPersistence {

    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase Pais a través de un id
     *
     * @param id
     * @return Pais *
     */
    private CategoriaEntity find(Long id) {
        CategoriaEntity categoria = em.find(CategoriaEntity.class, id);
        return categoria;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla Pais
     *
     * @return listado de datos de la tabla
     *
     */
    private List<CategoriaEntity> findAll() {
        Query todos = em.createQuery("select u from CategoriaEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param categoria
     * @return categoria
     *
     */
    private CategoriaEntity create(CategoriaEntity categoria) {
        em.persist(categoria);
        return categoria;
    }

    /*Actualización de la entidad
        @param 
        @return categoriaUpdate*/
    private CategoriaEntity update(Long id) {
        CategoriaEntity categoriaUpdate = em.find(CategoriaEntity.class, id);
        em.merge(categoriaUpdate);
        return categoriaUpdate;
    }

    /**
     * Eliminar un objeto de la entidad Categoria
     *
     * @param id
     * @return categoriaDelete*
     */
    private void delete(Long id) {
        CategoriaEntity categoriaDelete = em.find(CategoriaEntity.class, id);
        em.remove(categoriaDelete);
    }
}
