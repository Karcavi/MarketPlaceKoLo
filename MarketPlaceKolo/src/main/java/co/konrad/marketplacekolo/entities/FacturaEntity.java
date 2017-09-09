/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class FacturaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "idFactura", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*ID de la factura*/
    private Long id;

    @Column(name = "fechaCompra")
    /*Fecha en que se realiza la compra*/
    private date fecha;
   
     @Column(name = "productosCompra")
    /*Productos de la lista*/
    private String productosCompra;
    
    @Column(name = "precioTotal")
    /*Precio total de la lista*/
    private int precioTotal;
    
    
    @ManyToOne
    @JoinColumn(name = "idTarjeta")
    /*Relacion uno a muchos con la tabla Tarjeta*/
    private TarjetaEntity tarjeta;
    
    @ManyToOne
    @JoinColumn(name = "idTipoTarjeta")
    /*Relacion uno a muchos con la tabla tipoTarjeta*/
    private TipoTarjeta tipoTarjeta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
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

    public TarjetaEntity getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaEntity tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
     
     
}
