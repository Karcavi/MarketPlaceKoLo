
package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author karcavi
 */
@Entity
public class ProveedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idProveedor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /**
     * Ciudad del proveedor
     */
    @Column(name = "ciudadProveedor")
    private String ciudad;
    
    /**
     * Nombres del proveedor
     */
    @Column(name = "nombreProveedor")
    private String nombre;
    
    /**
     * Ruta de la foto del proveedor
     */
    @Column(name = "rutaFoto")
    private String rutaFoto;
    
    /**
     * Ventas del proveedor
     */
    @Column(name = "ventasProveedor")
    private int ventas;
    
    /**
     * Reputación del proveedor: dada del 1 al 5, siendo 5 EXCELENTE
     */
    @Column(name = "reputacionProveedor")
    private int reputacion;
    
    /**
     * Número telefónico del proveedor
     */
    @Column(name = "telefonoProveedor")
    private int telefono;
    
    /**
     * URL del chat del proveedor
     */
    @Column(name = "urlChat")
    private String urlChat;
    
    /**
     * Dirección física del proveedor
     */
    @Column(name = "direccionAtencion")
    private String direccion;
    
    
    /**
     * Getters y setters de los atributos
     */
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
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

    
    
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof ProveedorEntity)) {
//            return false;
//        }
//        ProveedorEntity other = (ProveedorEntity) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "co.konrad.marketkolo.entities.ProveedorEntity[ id=" + id + " ]";
//    }
    
}
