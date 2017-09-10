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
public class PromocionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idPromocion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "precioOferta")
    /*Precio de la Oferta*/
    private String oferta;
    @Column(name = "fechaInicio")
    /*Fecha inicio de la oferta*/
    private String inicio;
    @Column(name = "fechaFin")
    /*Fecha Fin de la oferta*/
    private String fin;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    /*Relacion uno a muchos con la tabla Producto*/
    private CiudadEntity producto;
    @ManyToOne
    @JoinColumn(name = "idCiudad")
    /*Relacion uno a muchos con la tabla Ciudad*/
    private CiudadEntity ciudad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public CiudadEntity getProducto() {
        return producto;
    }

    public void setProducto(CiudadEntity producto) {
        this.producto = producto;
    }

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }

}
