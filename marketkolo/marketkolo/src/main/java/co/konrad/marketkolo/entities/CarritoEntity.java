/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketkolo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author cindy
 */
@Entity
public class CarritoEntity implements Serializable {
    @Id
    @Column(name="carrito_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarrito;
    
    private String fechaCarrito;
    
    @OneToMany(cascade = {CascadeType.ALL})
    private List<CarritoProductoEntity> productos;

    public Long getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }
    
    public String getFechaCarrito() {
        return fechaCarrito;
    }

    public void setFechaCarrito(String fechaCarrito) {
        this.fechaCarrito = fechaCarrito;
    }

    public List<CarritoProductoEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<CarritoProductoEntity> productos) {
        this.productos = productos;
    }
}
