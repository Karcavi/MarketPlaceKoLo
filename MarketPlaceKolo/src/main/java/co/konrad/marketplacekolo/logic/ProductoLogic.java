package co.konrad.marketplacekolo.logic;

import co.konrad.marketplacekolo.entities.ProductoEntity;
import co.konrad.marketplacekolo.persistence.ProductoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author karcavi
 */
/*Clase que contiene la logica del Producto*/
@Stateless
public class ProductoLogic {
    /*Inyecciòn del persistence de la entidad Producto*/
        @Inject
        private ProductoPersistence productoPersistence;
        public List<ProductoEntity> getProductos(){
        List<ProductoEntity> productos = productoPersistence.findAll();
        return productos;
        }
        
         /*Obtener un producto a partir de su id
            @param id
            @return producto*/
        public ProductoEntity getProducto(Long id){
        ProductoEntity producto = productoPersistence.find(id);
        if(producto == null){
            throw new IllegalArgumentException("El producto solicitado no existe");
        }
        return producto;
    }
        
         /*Crear un nuevo producto
        @param entity
        @return entity*/
        public ProductoEntity createProducto (ProductoEntity entity){
        productoPersistence.create(entity);
        return entity;
        }
    
        
        /*Método para actualizar un objeto de la entidad Producto
         @param id
         @param entity
         @return producto*/
        public ProductoEntity updateProducto (Long id, ProductoEntity entity){
        ProductoEntity producto = productoPersistence.update(entity);
        return producto;
        }
    
        /**Método para eliminar un objeto de la entidad Producto
        *@param id*/
        public void deleteProducto(Long id){
        productoPersistence.delete(id);
    }  
    
    
    
    
    
}
