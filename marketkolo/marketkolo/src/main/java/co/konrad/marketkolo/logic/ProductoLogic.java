
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
    
    
    
    
    
}
