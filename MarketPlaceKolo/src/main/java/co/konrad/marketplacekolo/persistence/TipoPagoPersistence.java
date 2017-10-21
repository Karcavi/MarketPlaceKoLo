
package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.TipoPagoEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author karcavi
 */
public class TipoPagoPersistence {
    
    @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase TipoPago a través de un id
     *
     * @param id
     * @return TipoPago *
     */
    private TipoPagoEntity find(Long id) {
        TipoPagoEntity TipoPago = em.find(TipoPagoEntity.class, id);
        return TipoPago;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla TipoPago
     *
     * @return listado de datos de la tabla
     *
     */
    private List<TipoPagoEntity> findAll() {
        Query todos = em.createQuery("select u from TipoPagoEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param TipoPago
     * @return TipoPago
     *
     */
    private TipoPagoEntity create(TipoPagoEntity TipoPago) {
        em.persist(TipoPago);
        return TipoPago;
    }

    /*Actualización de la entidad
        @param 
        @return TipoPagoUpdate*/
    private TipoPagoEntity update(Long id) {
        TipoPagoEntity TipoPagoUpdate = em.find(TipoPagoEntity.class, id);
        em.merge(TipoPagoUpdate);
        return TipoPagoUpdate;
    }

    /**
     * Eliminar un objeto de la entidad TipoPago
     *
     * @param id
     * @return TipoPagoDelete*
     */
    private void delete(Long id) {
        TipoPagoEntity TipoPagoDelete = em.find(TipoPagoEntity.class, id);
        em.remove(TipoPagoDelete);
    }

    
    
    
}
