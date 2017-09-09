
package co.konrad.marketplacekolo.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author karcavi
 */
@Entity
public class TipoTarjetaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "idTipoTarjeta", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*ID del tipo de tarjeta*/
    private Long id;

    @Column(name = "tipoTarjeta")
    /*Tipo de tarjeta*/
    private String tipoTarjeta;

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    
}
