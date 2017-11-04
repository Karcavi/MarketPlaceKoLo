package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.TipoDocumentoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO para el mapeo objeto relacional de la entidad Cliente
 *
 * @author Sebastián Méndez Garzón
 */
public class TipoDocumentoDTO {

    /**
     * identificador del Tipo de documento
     */
    private Long idTipoDocumento;
    /**
     * Nombre del tipo de documento
     */
    private String nomTipoDocumento;

    public TipoDocumentoDTO() {
    }

    /**
     * Constructor
     *
     * @param tipoDocumento
     */
    public TipoDocumentoDTO(TipoDocumentoEntity tipoDocumento) {
        this.idTipoDocumento = tipoDocumento.getIdTipoDocumento();
        this.nomTipoDocumento = tipoDocumento.getNomTipoDocumento();
    }

    public TipoDocumentoEntity toEntity() {
        TipoDocumentoEntity tipoDocumento = new TipoDocumentoEntity();
        tipoDocumento.setIdTipoDocumento(this.idTipoDocumento);
        tipoDocumento.setNomTipoDocumento(this.nomTipoDocumento);
        return tipoDocumento;
    }

    public static List<TipoDocumentoDTO> toTipoDocumentoList(List<TipoDocumentoEntity> tipoDocumentoList) {
        List<TipoDocumentoDTO> listaTipoDocumentos = new ArrayList<>();
        for (int i = 0; i < tipoDocumentoList.size(); i++) {
            listaTipoDocumentos.add(new TipoDocumentoDTO(tipoDocumentoList.get(i)));
        }
        return listaTipoDocumentos;
    }

    /**
     * Metodos get y set
     *
     * @return
     */
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNomTipoDocumento() {
        return nomTipoDocumento;
    }

    public void setNomTipoDocumento(String nomTipoDocumento) {
        this.nomTipoDocumento = nomTipoDocumento;
    }

}
