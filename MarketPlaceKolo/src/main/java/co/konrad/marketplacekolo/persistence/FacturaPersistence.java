
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.FacturaEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author karcavi
 */
public class FacturaPersistence {
    
    
     @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase Factura a través de un id
     *
     * @param id
     * @return idFactura *
     */
    private FacturaEntity find(Long id) {
        FacturaEntity idFactura = em.find(FacturaEntity.class, id);
        return idFactura;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla FacturaEntity
     *
     * @return listado de datos de la tabla
     *
     */
    private List<FacturaEntity> findAll() {
        Query todos = em.createQuery("select u from FacturaEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param idFactura
     * @return idFactura
     *
     */
    private FacturaEntity create(FacturaEntity idFactura) {
        em.persist(idFactura);
        return idFactura;
    }

    /*Actualización de la entidad
        @param 
        @return FacturaUpdate*/
    private FacturaEntity update(Long id) {
        FacturaEntity FacturaUpdate = em.find(FacturaEntity.class, id);
        em.merge(FacturaUpdate);
        return FacturaUpdate;
    }

    /**
     * Eliminar un objeto de la entidad Factura
     *
     * @param id
     * @return FacturaDelete*
     */
    private void delete(Long id) {
        FacturaEntity FacturaDelete = em.find(FacturaEntity.class, id);
        em.remove(FacturaDelete);
    }
    
    
    
    
}
