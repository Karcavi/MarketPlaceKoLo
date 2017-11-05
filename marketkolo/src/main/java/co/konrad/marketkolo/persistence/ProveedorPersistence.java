
package co.konrad.marketkolo.persistence;

import co.konrad.marketkolo.entities.ProveedorEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad proveedor
 *
 * @author Karcavi
 */
@Stateless
public class ProveedorPersistence {
    @PersistenceContext(unitName = "koloPU")
    protected EntityManager em;

    /**
     * Metodo para encontrar objeto en la tabla Proveedor
     *
     * @param id
     * @return Proveedor
     */
    public ProveedorEntity find(Long id) {
        ProveedorEntity proveedor = em.find(ProveedorEntity.class, id);
        return proveedor;
    }

    /**
     * Obtener Lista con los datos de tabla Proveedor
     * @return lista de datos de la tabla proveedor
     */
    public List<ProveedorEntity> findAll() {
        Query alle = em.createQuery("select u from ProveedorEntity u");
        return alle.getResultList();
    }

    /**
     * Creación de un nuevo proveedor
     *
     * @param proveedor
     * @return nuevo proveedor
     */
    public ProveedorEntity create(ProveedorEntity proveedor) {
        em.persist(proveedor);
        return proveedor;
    }

    /**
     * Update
     *
     * @param entity
     * @return merge entity
     */
    public ProveedorEntity update(ProveedorEntity entity) {
        return em.merge(entity);
    }

    /**
     * Elimina el objeto de la tabla
     * @param id
     */
    public void delete(Long id) {
        ProveedorEntity proveedorDelete = em.find(ProveedorEntity.class, id);
        em.remove(proveedorDelete);
    }
    
    
}
