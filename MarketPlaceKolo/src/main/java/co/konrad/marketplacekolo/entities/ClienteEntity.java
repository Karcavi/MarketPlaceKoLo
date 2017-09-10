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
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idDocumento", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipoDocumento")
    /*Tipo de documento del cliente*/
    private String tipo_documento;
    @Column(name = "nombresCliente")
    /*Nombres del cliente*/
    private String nombres;
    @Column(name = "apellidosClientes")
    /*Apellidos del cliente*/
    private String apellidos;
    @Column(name = "fechaNacimiento")
    /*Fecha de nacimiento del cliente*/
    private String fecha_nacimiento;
    @Column(name = "direccionCliente")
    /*Direccion del cliente*/
    private String direccion;
    @Column(name = "numeroTelefono")
    /*Numero de telefono del cliente*/
    private String telefono;
    @Column(name = "correoCliente")
    /*Correo del cliente*/
    private String correo;
    @Column(name = "claveCliente")
    /*Clave del cliente*/
    private String clave;
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

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }
    
}
