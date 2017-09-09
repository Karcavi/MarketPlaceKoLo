/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketplacekolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author David
 */
@Entity
public class ProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idProducto", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombreProducto")
    /*Nombre del producto*/
    private String nombre;
    @Column(name = "valorUnitario")
    /*Valor del producto*/
    private String valor_unitario;
    @Column(name = "marca")
    /*Marca del producto*/
    private String marca;
    @Column(name = "garantia")
    /*Garantia del producto*/
    private String garantia;
    @Column(name = "stockProducto")
    /*Stock del producto*/
    private String stock;
    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    /*Relacion uno a muchos con la tabla Empresa*/
    private CiudadEntity empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public CiudadEntity getEmpresa() {
        return empresa;
    }

    public void setEmpresa(CiudadEntity empresa) {
        this.empresa = empresa;
    }
    
}
