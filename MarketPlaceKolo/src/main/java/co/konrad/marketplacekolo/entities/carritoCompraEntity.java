
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
public class carritoCompraEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "idCarrito", unique = true)
      /*id del carrito*/
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

    @Column(name = "Producto")
    /*Nombre del Producto*/
    private String Productos;
    
    @Column(name = "CantidadProducto")
    /*Cantidad de Productos*/
    private int Cantidad;
    
    @Column(name = "FechaCarrito")
    /*Fecha del Carrito*/
    private date Fecha;
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    /*Relacion uno a muchos con la tabla Cliente*/
    private ClienteEntity cliente;

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

    public date getFecha() {
        return Fecha;
    }

    public void setFecha(date Fecha) {
        this.Fecha = Fecha;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    
}
