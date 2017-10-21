package co.konrad.marketplacekolo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author karcavi
 */
@Entity
public class FacturaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idFactura", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*ID de la factura*/
    private Long id;

    @Column(name = "fechaCompra")
    /*Fecha en que se realiza la compra*/
    private Date fecha;
   
     @Column(name = "productosCompra")
    /*Productos de la lista*/
    private String productosCompra;
    
    @Column(name = "precioTotal")
    /*Precio total de la lista*/
    private int precioTotal;
    
    
    @ManyToOne
    @JoinColumn(name = "idTarjeta")
    /*Relacion uno a muchos con la tabla Tarjeta*/
    private TarjetaDCEntity tarjeta;
    
    @ManyToOne
    @JoinColumn(name = "idTipo")
    /*Relacion uno a muchos con la tabla tipoTarjeta*/
    private TipoPagoEntity idTipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(String productosCompra) {
        this.productosCompra = productosCompra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public TarjetaDCEntity getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDCEntity tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TipoPagoEntity getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(TipoPagoEntity idTipo) {
        this.idTipo = idTipo;
    }

    
}
