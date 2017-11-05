package co.konrad.marketkolo.logic;

import co.konrad.marketkolo.entities.TipoDocumentoEntity;
import javax.ejb.Stateless;
import co.konrad.marketkolo.persistence.TipoDocumentoPersistence;
import java.util.List;
import javax.inject.Inject;



/**
 * Clase que contiene la logica del tipo de documento
 * @author Sebastián Méndez Garzón
 */
@Stateless
public class TipoDocumentoLogic {
    
     /**
     * Inyección del persistence del tipoDocumento
     */
    @Inject
    private TipoDocumentoPersistence tipoDocumentoPersistence;
    
    
    /**
     * Obtener todos los Tipos de Documento
     * @return tipoDocumento
     */
    public List<TipoDocumentoEntity> getTipoDocumentos(){
        List<TipoDocumentoEntity> tipoDocumentos = tipoDocumentoPersistence.findAll();
        return tipoDocumentos;
    }
    
    /**
     * Obtener un Tipo de Documento a partir de su id
     * @param id
     * @return tipoDocumento
     */
    public TipoDocumentoEntity getTipoDocumento(Long id){
        TipoDocumentoEntity tipoDocumento = tipoDocumentoPersistence.find(id);
        if(tipoDocumento == null){
            throw new IllegalArgumentException("El Tipo de Documento solicitado no existe");
        }
        return tipoDocumento;
    }
    
//    /**
//     * Crear un nuevo tipoDocumento
//     * @param entity
//     * @return entity
//     */
//    public TipoDocumentoEntity createTipoDocumento(TipoDocumentoEntity entity){
//        tipoDocumentoPersistence.create(entity);
//        return entity;
//    }
    
//    /**
//     * Metodo para actualizar un objeto de la entidad TipoDocumento
//     * @param id
//     * @param entity
//     * @return tipoDocumento
//     */
//    public TipoDocumentoEntity updateTipoDocumento (Long id, TipoDocumentoEntity entity){
//        TipoDocumentoEntity tipoDocumento = tipoDocumentoPersistence.update(entity);
//        return tipoDocumento;
//    }
    
//    /**
//     * Metodo para eliminar un objeto de la entidad TipoDocumento
//     * @param id 
//     */
//    public void deleteTipoDocumento(Long id){
//        tipoDocumentoPersistence.delete(id);
//    }
}
