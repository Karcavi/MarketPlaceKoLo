package co.konrad.marketkolo.persistence;

import co.konrad.marketkolo.entities.ProductoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *Manejador de la entidad Producto
 * @author karcavi
 */

@Stateless
public class ProductoPersistence {
    @PersistenceContext(unitName = "koloPU")
    protected EntityManager em;

    
    /**
     * Metodo para encontrar objeto en la tabla Producto
     *
     * @param id
     * @return Producto
     */
    public ProductoEntity find(Long id) {
        ProductoEntity producto = em.find(ProductoEntity.class, id);
        return producto;
    }

    /**
     * Obtener Lista con los datos de tabla Producto
     * @return Lista de datos de la tabla Producto
     */
    public List<ProductoEntity> findAll() {
        Query alle = em.createQuery("select u from ProductoEntity u");
        return alle.getResultList();
    }

    /**
     * Creación de un nuevo producto
     *
     * @param producto
     * @return nuevo producto
     */
    public ProductoEntity create(ProductoEntity producto) {
        em.persist(producto);
        return producto;
    }

    /**
     * Actualización del update
     *
     * @param entity
     * @return merge entity
     */
    public ProductoEntity update(ProductoEntity entity) {
        return em.merge(entity);
    }

    /**
     * Elimina el objeto de la tabla
     * @param id
     */
    public void delete(Long id) {
        ProductoEntity productoDelete = em.find(ProductoEntity.class, id);
        em.remove(productoDelete);
    }
}
