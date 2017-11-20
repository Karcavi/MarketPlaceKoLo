package co.konrad.marketkolo.persistence;

import co.konrad.marketkolo.entities.ClienteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad cliente
 *
 * @author Sebastián Méndez Garzón
 */
@Stateless
public class ClientePersistence {

    @PersistenceContext(unitName = "koloPU")
    protected EntityManager em;

    /**
     * Metodo para encontrar objeto en la tabla Cliente
     *
     * @param id
     * @return Cliente
     */
    public ClienteEntity find(Long id) {
        ClienteEntity cliente = em.find(ClienteEntity.class, id);
        return cliente;
    }

    /**
     * Obtener Lista con los datos de tabla Cliente
     * @return lista de datos de la tabla cliente
     */
    public List<ClienteEntity> findAll() {
        Query todos = em.createQuery("select u from ClienteEntity u");
        return todos.getResultList();
    }

    /**
     * Creacion de un nuevo cliente
     *
     * @param cliente
     * @return nuevo cliente
     */
    public ClienteEntity create(ClienteEntity cliente) {
        em.persist(cliente);
        return cliente;
    }

    /**
     * Actualizacion del update
     *
     * @param entity
     * @return merge entity
     */
    public ClienteEntity update(ClienteEntity entity) {
        return em.merge(entity);
    }

    /**
     * Elimina el objeto de la tabla
     * @param id
     */
    public void delete(Long id) {
        ClienteEntity clienteDelete = em.find(ClienteEntity.class, id);
        em.remove(clienteDelete);
    }
}
