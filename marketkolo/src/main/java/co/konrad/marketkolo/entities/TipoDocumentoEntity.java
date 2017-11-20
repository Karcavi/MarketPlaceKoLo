package co.konrad.marketkolo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Sebastián Méndez Garzón
 */
@Entity
public class TipoDocumentoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_TipoDocumento")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoDocumento;
    /**
     * Tipo del documento del cliente
     */
    @Column(name = "nom_TipoDocumento")
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
