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
public class ProveedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProveedor;
    
    /**
     * Nit Proveedor
     */
    @Column(name = "nit_Proveedor")
    private String nitProveedor;
    /**
     * Nombre del Proveedor
     */
    @Column(name = "nombre_Proveedor")
    private String nombreProveedor;
    /**
     * Clave del Proveedor
     */
    @Column(name = "clave_Proveedor")
    private String claveProveedor;
    /**
     * Imagen del Proveedor
     */
    @Column(name = "imagen_Proveedor")
    private String imagenProveedor;
    /**
     * Ventas del Proveedor
     */
    @Column(name = "ventas_Proveedor")
    private int ventasProveedor;
    /**
     * Ninvel de reputacion del Proveedor
     */
    @Column(name = "nivel_Reputacion")
    private int nivelReputacion;
    /**
     * Telefono de contacto del Proveedor
     */
    @Column(name = "telefono_Proveedor")
    private int telefonoProveedor;
    /**
     * url del chat con el Proveedor
     */
    @Column(name = "url_Chat")
    private String urlChat;
    /**
     * direccion donde el Proveedor brinda servicio a sus clientes
     */
    @Column(name = "direccion_Atencion")
    private String direccionAtencion;

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getClaveProveedor() {
        return claveProveedor;
    }

    public void setClaveProveedor(String claveProveedor) {
        this.claveProveedor = claveProveedor;
    }

    public String getImagenProveedor() {
        return imagenProveedor;
    }

    public void setImagenProveedor(String imagenProveedor) {
        this.imagenProveedor = imagenProveedor;
    }

    public int getVentasProveedor() {
        return ventasProveedor;
    }

    public void setVentasProveedor(int ventasProveedor) {
        this.ventasProveedor = ventasProveedor;
    }

    public int getNivelReputacion() {
        return nivelReputacion;
    }

    public void setNivelReputacion(int nivelReputacion) {
        this.nivelReputacion = nivelReputacion;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getUrlChat() {
        return urlChat;
    }

    public void setUrlChat(String urlChat) {
        this.urlChat = urlChat;
    }

    public String getDireccionAtencion() {
        return direccionAtencion;
    }

    public void setDireccionAtencion(String direccionAtencion) {
        this.direccionAtencion = direccionAtencion;
    }
    
    

}
