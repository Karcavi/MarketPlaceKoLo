/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.cinekonradista.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sebastián Méndez Garzón
 */
@Entity
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nombres del cliente
     */
    @Column(name = "nombresCliente")
    private String nombres;

    /**
     * Apellidos del cliente
     */
    @Column(name = "apellidosCliente")
    private String apellidos;

    /**
     * # telefonico del cliente
     */
    @Column(name = "telefonoCliente")
    private int telefono;

    /**
     * # del documento de identidad del cliente
     */
    @Column(name = "documentoCliente")
    private int documento;

    /**
     * correo eletronico del cliente
     */
    @Column(name = "correoCliente")
    private String correo;

    /**
     * clave del cliente
     */
    @Column(name = "claveCliente")
    private String clave;
    
    /**
     * Metodos get y set
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
