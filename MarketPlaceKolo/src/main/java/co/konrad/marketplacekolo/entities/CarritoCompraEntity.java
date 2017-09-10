
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
public class CarritoCompraEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCompra", unique = true)
      /*id del carrito*/
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

    @Column(name = "productosCompra")
    /*Lista de productos registrados en la compra*/
    private String Productos;
    
    @Column(name = "CantidadProducto")
    /*Cantidad de Productos*/
    private int Cantidad;
    
    @Column(name = "FechaCarrito")
    /*Fecha del Carrito*/
    private Date Fecha;
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    /*Relacion uno a muchos con la tabla Cliente*/
    private ClienteEntity idCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductos() {
        return Productos;
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public ClienteEntity getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteEntity idCliente) {
        this.idCliente = idCliente;
    }

    
    
}
