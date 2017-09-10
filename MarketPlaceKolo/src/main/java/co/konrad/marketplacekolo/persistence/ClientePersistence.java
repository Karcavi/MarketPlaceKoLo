/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.ClienteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author David
 */
public class ClientePersistence {
     @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;
     /**
     * Método para encontrar un objeto de la clase cliente a través de un id
     *
     * @param id
     * @return cliente *
     */
    private ClienteEntity find(Long id) {
        ClienteEntity cliente = em.find(ClienteEntity.class, id);
        return cliente;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla cliente
     *
     * @return listado de datos de la tabla
     *
     */
    private List<ClienteEntity> findAll() {
        Query todos = em.createQuery("select u from ClienteEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param cliente
     * @return cliente
     *
     */
    private ClienteEntity create(ClienteEntity cliente) {
        em.persist(cliente);
        return cliente;
    }

    /*Actualización de la entidad
        @param 
        @return clienteUpdate*/
    private ClienteEntity update(Long id) {
        ClienteEntity clienteUpdate = em.find(ClienteEntity.class, id);
        em.merge(clienteUpdate);
        return clienteUpdate;
    }

    /**
     * Eliminar un objeto de la entidad proveedor
     *
     * @param id
     * @return clienteDelete*
     */
    private void delete(Long id) {
        ClienteEntity clienteDelete = em.find(ClienteEntity.class, id);
        em.remove(clienteDelete);
    }
}
