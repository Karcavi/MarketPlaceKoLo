package co.konrad.marketplacekolo.persistence;

import co.konrad.marketplacekolo.entities.CarritoCompraEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author karcavi
 */
public class CarritoCompraPersistence {
    
  @PersistenceContext(unitName = "MarketPlaceKoloPU")
    protected EntityManager em;

    /**
     * Método para encontrar un objeto de la clase CarritoCompra a través de un id
     *
     * @param id
     * @return CarritoCompra *
     */
    private CarritoCompraEntity find(Long id) {
        CarritoCompraEntity CarritoCompra = em.find(CarritoCompraEntity.class, id);
        return CarritoCompra;
    }

    /**
     * Obtener todos los objetos encontrados en la tabla CarritoCompra
     *
     * @return listado de datos de la tabla
     *
     */
    private List<CarritoCompraEntity> findAll() {
        Query todos = em.createQuery("select u from CarritoCompraEntity u");
        return todos.getResultList();
    }

    /**
     * Creación de un nuevo registro
     *
     * @param CarritoCompra
     * @return CarritoCompra
     *
     */
    private CarritoCompraEntity create(CarritoCompraEntity CarritoCompra) {
        em.persist(CarritoCompra);
        return CarritoCompra;
    }

    /*Actualización de la entidad
        @param 
        @return CarritoCompraUpdate*/
    private CarritoCompraEntity update(Long id) {
        CarritoCompraEntity CarritoCompraUpdate = em.find(CarritoCompraEntity.class, id);
        em.merge(CarritoCompraUpdate);
        return CarritoCompraUpdate;
    }

    /**
     * Eliminar un objeto de la entidad CarritoCompra
     *
     * @param id
     * @return CarritoCompraDelete*
     */
    private void delete(Long id) {
        CarritoCompraEntity CarritoCompraDelete = em.find(CarritoCompraEntity.class, id);
        em.remove(CarritoCompraDelete);
    }

    
    
}
