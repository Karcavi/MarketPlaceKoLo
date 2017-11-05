package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Sebastián Méndez Garzón
 */
@Entity
public class TipoDocumentoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idTipoDocumento")

    private Long idTipoDocumento;
    /**
     * Tipo del documento del cliente
     */
    @Column(name = "nomTipoDocumento")
    private String nomTipoDocumento;    

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
