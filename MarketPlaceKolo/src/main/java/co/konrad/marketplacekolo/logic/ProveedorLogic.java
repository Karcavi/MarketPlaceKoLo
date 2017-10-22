
package co.konrad.marketplacekolo.logic;

import javax.ejb.Stateless;
import co.konrad.marketplacekolo.persistence.ProveedorPersistence;
import co.konrad.marketplacekolo.entities.ProveedorEntity;
import java.util.List;
import javax.inject.Inject;

/*@author karcavi*/

/*Clase que contiene la logica del Proveedor*/
@Stateless
public class ProveedorLogic {
     /*Inyecciòn del persistence de la entidad Proveedor*/
        @Inject
        private ProveedorPersistence proveedorPersistence;
        public List<ProveedorEntity> getProveedores(){
        List<ProveedorEntity> proveedores = proveedorPersistence.findAll();
        return proveedores;
        }
        
         /*Obtener un proveedor a partir de su id
            @param id
            @return proveedor*/
        public ProveedorEntity getProveedor(Long id){
        ProveedorEntity proveedor = proveedorPersistence.find(id);
        if(proveedor == null){
            throw new IllegalArgumentException("El proveedor solicitado no existe");
        }
        return proveedor;
    }
        
        /*Crear un nuevo proveedor
        @param entity
        @return entity*/
        public ProveedorEntity createProveedor (ProveedorEntity entity){
        proveedorPersistence.create(entity);
        return entity;
        }
    
        
        /*Método para actualizar un objeto de la entidad proveedor
         @param id
         @param entity
         @return proveedor*/
        public ProveedorEntity updateProveedor (Long id, ProveedorEntity entity){
        ProveedorEntity proveedor = proveedorPersistence.update(entity);
        return proveedor;
        }
    
        /**Método para eliminar un objeto de la entidad Proveedor
        *@param id*/
        public void deleteProveedor(Long id){
        proveedorPersistence.delete(id);
    }  
    
}
