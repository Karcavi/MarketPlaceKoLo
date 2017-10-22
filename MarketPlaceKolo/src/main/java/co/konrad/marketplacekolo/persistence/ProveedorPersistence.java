
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.ProveedorEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author IAN
 */
public class ProveedorPersistence {

    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase Proveedor a través de un id
     *
     * @param id
     * @return Proveedor *
     */
    public ProveedorEntity find(Long id) {
        ProveedorEntity proveedor = em.find(ProveedorEntity.class, id);
        return proveedor;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla Proveedor
     *
     * @return listado de datos de la tabla
     *
     */
    public List<ProveedorEntity> findAll() {
        Query todos = em.createQuery("select u from ProveedorEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param proveedor
     * @return proveedor
     *
     */
    public ProveedorEntity create(ProveedorEntity proveedor) {
        em.persist(proveedor);
        return proveedor;
    }

    /*Actualización de la entidad
        @param 
        @return proveedorUpdate*/
    private ProveedorEntity update(Long id) {
        ProveedorEntity proveedorUpdate = em.find(ProveedorEntity.class, id);
        em.merge(proveedorUpdate);
        return proveedorUpdate;
    }

    /**
     * Eliminar un objeto de la entidad proveedor
     *
     * @param id
     * @return proveedorDelete*
     */
    public void delete(Long id) {
        ProveedorEntity proveedorDelete = em.find(ProveedorEntity.class, id);
        em.remove(proveedorDelete);
    }

    public ProveedorEntity update(ProveedorEntity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
