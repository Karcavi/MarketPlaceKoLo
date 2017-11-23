/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author IAN
 */
@Entity
public class ProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;

    /**
     * Nombre del Producto
     */
    @Column(name = "nombre_Producto")
    private String nombreProducto;
    /**
     * Valor del Producto
     */
    @Column(name = "valor_Unitario")
    private int valorUnitario;
    /**
     * Marca del Producto
     */
    @Column(name = "marca_Producto")
    private String marcaProducto;
    /**
     * Tiempo de garantia del Producto 
     */
    @Column(name = "garantia_Producto")
    private String garantiaProducto;
    /**
     * Stock del Prodcuto en venta
     */
    @Column(name = "stock_Producto")
    private int stockProducto;
    /**
     * Imagen del Prodcuto en venta
     */
    @Column(name = "imagen_Producto")
    private String imagenProducto;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Proveedor", nullable = false, referencedColumnName = "idProveedor")
    /*Relacion muchos a uno con la tabla Proveedor*/
    private ProveedorEntity proveedor;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Categoria", nullable = false, referencedColumnName = "idCategoria")
    /*Relacion muchos a uno con la tabla Categoria*/
    private CategoriaEntity categoria;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Promocion", nullable = false, referencedColumnName = "idPromocion")
    /*Relacion muchos a uno con la tabla Promocion*/
    private PromocionEntity promocion;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getGarantiaProducto() {
        return garantiaProducto;
    }

    public void setGarantiaProducto(String garantiaProducto) {
        this.garantiaProducto = garantiaProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public ProveedorEntity getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorEntity proveedor) {
        this.proveedor = proveedor;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }
    
    
}
