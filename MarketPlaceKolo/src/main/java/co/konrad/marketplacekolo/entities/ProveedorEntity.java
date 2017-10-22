package co.konrad.marketplacekolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*@author IAN*/
@Entity
public class ProveedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "nitProveedor", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombreProveedor")
    /*Nombre del Proveedor*/
    private String nombre;

    @Column(name = "claveProveedor")
    /*Contraseña del Proveedor*/
    private String clave;

    @Column(name = "rutaImagen")
    /*Ruta del logo del proveedor */
    private String imagen;

    @Column(name = "ventasProveedor")
    /*Ventas hechas por el proveedor*/
    private int ventas;

    @Column(name = "nivelReputacion")
    /*Nivel del reputacion del proveedor*/
    private int reputacion;

    @Column(name = "numeroTelefono")
    /*Número de teléfono del proveedor*/
    private int telefono;

    @Column(name = "urlChat")
    /*Dirección URL del chat*/
    private String urlChat;

    @Column(name = "direccionAtencion")
    /*Dirección de centro de atención del proveedor*/
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idCiudad")
    /*Relacion uno a muchos con la tabla Ciudad*/
    private CiudadEntity ciudad;

    /*
    Setter's y getter's de la entidad Proveedor
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUrlChat() {
        return urlChat;
    }

    public void setUrlChat(String urlChat) {
        this.urlChat = urlChat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }

}
