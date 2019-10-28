package co.konrad.marketkolo.logic;

import co.konrad.marketkolo.entities.ProveedorEntity;
import co.konrad.marketkolo.persistence.ProveedorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author IAN
 */
@Stateless
public class ProveedorLogic {
    
     /**
     * Inyección del persistence del proveedor
     */
    @Inject
    private ProveedorPersistence proveedorPersistence;
    
    /**
     * Obtener todos los proveedors
     * @return proveedors
     */
    public List<ProveedorEntity> getProveedors(){
        List<ProveedorEntity> proveedors = proveedorPersistence.findAll();
        return proveedors;
    }
    
    /**
     * Obtener un proveedor a partir de su id
     * @param id
     * @return proveedor
     */
    public ProveedorEntity getProveedor(Long id){
        ProveedorEntity proveedor = proveedorPersistence.find(id);
        if(proveedor == null){
            throw new IllegalArgumentException("El Proveedor solicitado no existe");
        }
        return proveedor;
    }
    
    /**
     * Crear un nuevo proveedor
     * @param entity
     * @return entity
     */
    public ProveedorEntity createProveedor(ProveedorEntity entity){
        proveedorPersistence.create(entity);
        return entity;
    }
    
    /**
     * Metodo para actualizar un objeto de la entidad proveedor
     * @param id
     * @param entity
     * @return proveedor
     */
    public ProveedorEntity updateProveedor (Long id, ProveedorEntity entity){
        ProveedorEntity proveedor = proveedorPersistence.update(entity);
        return proveedor;
    }
    
    /**
     * Metodo para eliminar un objeto de la entidad Proveedor
     * @param id 
     */
    public void deleteProveedor(Long id){
        proveedorPersistence.delete(id);
    }
}
