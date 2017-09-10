package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.TipoTarjetaEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author karcavi
 */
public class TipoTarjetaPersistence {
    
     @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase TipoTarjeta a través de un id
     *
     * @param id
     * @return TipoTarjeta *
     */
    private TipoTarjetaEntity find(Long id) {
        TipoTarjetaEntity tipoTarjeta = em.find(TipoTarjetaEntity.class, id);
        return tipoTarjeta;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla TipoTarjeta
     *
     * @return listado de datos de la tabla
     *
     */
    private List<TipoTarjetaEntity> findAll() {
        Query todos = em.createQuery("select u from TipoTarjetaEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param tipoTarjeta
     * @return tipoTarjeta
     *
     */
    private TipoTarjetaEntity create(TipoTarjetaEntity tipoTarjeta) {
        em.persist(tipoTarjeta);
        return tipoTarjeta;
    }

    /*Actualización de la entidad
        @param 
        @return TipoTarjetaUpdate*/
    private TipoTarjetaEntity update(Long id) {
        TipoTarjetaEntity tipoTarjetaUpdate = em.find(TipoTarjetaEntity.class, id);
        em.merge(tipoTarjetaUpdate);
        return tipoTarjetaUpdate;
    }

    /**
     * Eliminar un objeto de la entidad tipoTarjeta
     *
     * @param id
     * @return tipoTarjetaDelete*
     */
    private void delete(Long id) {
        TipoTarjetaEntity tipoTarjetaDelete = em.find(TipoTarjetaEntity.class, id);
        em.remove(tipoTarjetaDelete);
    }
    
    
    
}
