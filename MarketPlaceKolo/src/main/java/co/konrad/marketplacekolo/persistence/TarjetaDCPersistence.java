package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.TarjetaDCEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author karcavi
 */
public class TarjetaDCPersistence {
    
     @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase TarjetaDC a través de un id
     *
     * @param id
     * @return TarjetaDC *
     */
    private TarjetaDCEntity find(Long id) {
        TarjetaDCEntity tarjeta = em.find(TarjetaDCEntity.class, id);
        return tarjeta;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla TarjetaDC
     *
     * @return listado de datos de la tabla
     *
     */
    private List<TarjetaDCEntity> findAll() {
        Query todos = em.createQuery("select u from TarjetaDCEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param tarjeta
     * @return tarjeta
     *
     */
    private TarjetaDCEntity create(TarjetaDCEntity tarjeta) {
        em.persist(tarjeta);
        return tarjeta;
    }

    /*Actualización de la entidad
        @param 
        @return tarjetaUpdate*/
    private TarjetaDCEntity update(Long id) {
        TarjetaDCEntity tarjetaUpdate = em.find(TarjetaDCEntity.class, id);
        em.merge(tarjetaUpdate);
        return tarjetaUpdate;
    }

    /**
     * Eliminar un objeto de la entidad TarjetaDC
     *
     * @param id
     * @return tarjetaDelete*
     */
    private void delete(Long id) {
        TarjetaDCEntity tarjetaDelete = em.find(TarjetaDCEntity.class, id);
        em.remove(tarjetaDelete);
    }
    
    
    
}
