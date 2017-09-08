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
 * @author IAN
 */
@Entity
public class CiudadEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCiudad", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombreCiudad")
    /*Nombre de la Ciudad*/
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idPais")
    /*Relacion uno a muchos con la tabla Pais*/
    private PaisEntity pais;

    /*
    Setter's y getter's de la entidad Ciudad
     */
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

    public PaisEntity getPais() {
        return pais;
    }

    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }

}
