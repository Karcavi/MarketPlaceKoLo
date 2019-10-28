
package co.konrad.marketkolo.logic;

import co.konrad.marketkolo.entities.ProductoEntity;
import co.konrad.marketkolo.persistence.ProductoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Clase que contiene la logica del Producto
 * @author karcavi
 */

@Stateless
public class ProductoLogic {
    
    /**
     * Inyección del persistence del producto
     */
    @Inject
    private ProductoPersistence productoPersistence;
    
    /**
     * Obtener todos los productos
     * @return productos
     */
    public List<ProductoEntity> getProductos(){
        List<ProductoEntity> productos = productoPersistence.findAll();
        return productos;
    }
    
    /**
     * Obtener un producto a partir de su id
     * @param idProducto
     * @return producto
     */
    public ProductoEntity getProducto(Long idProducto){
        ProductoEntity producto = productoPersistence.find(idProducto);
        if(producto == null){
            throw new IllegalArgumentException("El producto solicitado no existe");
        }
        return producto;
    }
    
    /**
     * Crear un nuevo producto
     * @param entity
     * @return entity
     */
    public ProductoEntity createProducto(ProductoEntity entity){
        productoPersistence.create(entity);
        return entity;
    }
    
    /**
     * Método para actualizar un objeto de la entidad producto
     * @param idProducto
     * @param entity
     * @return producto
     */
    public ProductoEntity updateProducto (Long idProducto, ProductoEntity entity){
        ProductoEntity producto = productoPersistence.update(entity);
        return producto;
    }
    
    /**
     * Metodo para eliminar un objeto de la entidad Producto
     * @param idProducto
     */
    public void deleteProducto(Long idProducto){
        productoPersistence.delete(idProducto);
    }
}
