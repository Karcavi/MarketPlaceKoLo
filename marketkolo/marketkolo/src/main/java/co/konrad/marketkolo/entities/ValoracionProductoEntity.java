
package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IAN
 */
@Entity
public class ValoracionProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idValoracionProducto;

    /**
     * Puntuacion del Producto
     */
    @Column(name = "puntuacion")
    private int puntuacion;
    /**
     * Comentario del Producto
     */
    @Column(name = "comentario")
    private int comentario;
    
}
