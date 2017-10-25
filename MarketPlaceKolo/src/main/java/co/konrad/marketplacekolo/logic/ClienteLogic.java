/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.cinekonradista.logic;

import co.konrad.cinekonradista.entities.ClienteEntity;
import co.konrad.cinekonradista.entities.FestivalEntity;
import javax.ejb.Stateless;
import co.konrad.cinekonradista.persistence.ClientePersistence;
import co.konrad.cinekonradista.persistence.FestivalPersistence;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase que contiene la logica del Cliente
 *
 * @author Sebastián Méndez Garzón
 */
@Stateless
public class ClienteLogic {
   
    /**
     * Inyección del persistence del festival
     */
    @Inject
    private ClientePersistence clientePersistence;
    
    /**
     * Obtener todos los clientes
     * @return clientes
     */
    public List<ClienteEntity> getClientes(){
        List<ClienteEntity> clientes = clientePersistence.findAll();
        return clientes;
    }
    
    /**
     * Obtener un cliente a partir de su id
     * @param id
     * @return cliente
     */
    public ClienteEntity getCliente(Long id){
        ClienteEntity cliente = clientePersistence.find(id);
        if(cliente == null){
            throw new IllegalArgumentException("El Cliente solicitado no existe");
        }
        return cliente;
    }
    
    /**
     * Crear un nuevo cliente
     * @param entity
     * @return entity
     */
    public ClienteEntity createCliente(ClienteEntity entity){
        clientePersistence.create(entity);
        return entity;
    }
    
    /**
     * Metodo para actualizar un objeto de la entidad cliente
     * @param id
     * @param entity
     * @return cliente
     */
    public ClienteEntity updateCliente (Long id, ClienteEntity entity){
        ClienteEntity cliente = clientePersistence.update(entity);
        return cliente;
    }
    
    /**
     * Metodo para eliminar un objeto de la entidad Cliente
     * @param id 
     */
    public void deleteCliente(Long id){
        clientePersistence.delete(id);
    }
 
}
