package co.konrad.marketkolo.persistence;

import co.konrad.marketkolo.entities.TipoDocumentoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad tipoDocumento
 *
 * @author Sebastián Méndez Garzón
 */
@Stateless
public class TipoDocumentoPersistence {

    @PersistenceContext(unitName = "koloPU")
    protected EntityManager em;

    /**
     * Metodo para encontrar objetos en la tabla TipoDocumento
     *
     * @param id
     * @return TipoDocumento
     */
    public TipoDocumentoEntity find(Long id) {
        TipoDocumentoEntity tipoDocumento = em.find(TipoDocumentoEntity.class, id);
        return tipoDocumento;
    }

    /**
     * Obtener Lista con los datos de tabla TipoDocumento
     *
     * @return lista de datos de la tabla TipoDocumento
     */
    public List<TipoDocumentoEntity> findAll() {
        Query todos = em.createQuery("select u from TipoDocumentoEntity u");
        return todos.getResultList();
    }

//    /**
//     * Creacion de un nuevo Tipo de Documento
//     *
//     * @param tipoDocumento
//     * @return nuevo tipoDocumento
//     */
//    public TipoDocumentoEntity create(TipoDocumentoEntity tipoDocumento) {
//        em.persist(tipoDocumento);
//        return tipoDocumento;
//    }
//    /**
//     * Actualizacion del update
//     *
//     * @param entity
//     * @return merge entity
//     */
//    public TipoDocumentoEntity update(TipoDocumentoEntity entity) {
//        return em.merge(entity);
//    }
//    /**
//     * Elimina el objeto de la tabla TipoDocumento
//     * @param id
//     */
//    public void delete(Long id) {
//        TipoDocumentoEntity tipoDocumentoDelete = em.find(TipoDocumentoEntity.class, id);
//        em.remove(tipoDocumentoDelete);
//    }
}
