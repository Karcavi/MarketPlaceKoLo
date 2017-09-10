package co.konrad.marketplacekolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author karcavi
 */
@Entity
public class TarjetaDCEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idTarjeta", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombrePropietario")
    /*Nombre del Propietario de la Tarjeta*/
    private String nombre;
    
    @Column(name = "idPropietario")
    /*ID del Propietario de la Tarjeta*/
    private int idPropietario;
    
    @Column(name = "linea")
    /*Línea de la Tarjeta (Visa, Mastercard o Amex)*/
    private String linea;
    
    @Column(name = "CVV")
    /*CVV (número de seguridad) de la Tarjeta*/
    private int CVV;
    
    @Column(name = "fechaVencimiento")
    /*Fecha de vencimiento de la tarjeta*/
    private int fechaVencimiento;
    
    
    
}
