
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
public class tipoPagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idTipo", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
     /*ID del Tipo de Pago*/
    private Long id;

    @Column(name = "tipoPago")
    /*Tipo de Pago*/
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
