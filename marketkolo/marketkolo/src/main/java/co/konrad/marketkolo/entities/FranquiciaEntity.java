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
public class FranquiciaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFranquicia;

    /**
     * Nombre de la Franquicia
     */
    @Column(name = "nombre_Franquicia")
    private String nombreFranquicia;

    public Long getIdFranquicia() {
        return idFranquicia;
    }

    public void setIdFranquicia(Long idFranquicia) {
        this.idFranquicia = idFranquicia;
    }

    public String getNombreFranquicia() {
        return nombreFranquicia;
    }

    public void setNombreFranquicia(String nombreFranquicia) {
        this.nombreFranquicia = nombreFranquicia;
    }
    
    
    
    
}
