/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PromocionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPromocion;

    /**
     * correo eletronico del cliente
     */
    @Column(name = "precio_Oferta")
    private int precioOferta;
    /**
     * correo eletronico del cliente
     */
    @Column(name = "fecha_Inicio")
    private String fechaInicio;
    /**
     * correo eletronico del cliente
     */
    @Column(name = "fecha_Fin")
    private String fechaFin;

    public Long getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public int getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(int precioOferta) {
        this.precioOferta = precioOferta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
}
