package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.ProveedorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IAN
 */
public class ProveedorDTO {

    /**
     * Identificador del proveedor
     */
    private Long idProveedor;
    /**
     * Nit Proveedor
     */
    private String nitProveedor;
    /**
     * Nombre del Proveedor
     */
    private String nombreProveedor;
    /**
     * Clave del Proveedor
     */
    private String claveProveedor;
    /**
     * Imagen del Proveedor
     */
    private String imagenProveedor;
    /**
     * Ventas del Proveedor
     */
    private int ventasProveedor;
    /**
     * Ninvel de reputacion del Proveedor
     */
    private int nivelReputacion;
    /**
     * Telefono de contacto del Proveedor
     */
    private int telefonoProveedor;
    /**
     * url del chat con el Proveedor
     */
    private String urlChat;
    /**
     * direccion donde el Proveedor brinda servicio a sus clientes
     */
    private String direccionAtencion;

    public ProveedorDTO() {
    }

    public ProveedorDTO(ProveedorEntity proveedor) {
        this.idProveedor = proveedor.getIdProveedor();
        this.nitProveedor = proveedor.getNitProveedor();
        this.nombreProveedor = proveedor.getNombreProveedor();
        this.claveProveedor = proveedor.getClaveProveedor();
        this.imagenProveedor = proveedor.getImagenProveedor();
        this.ventasProveedor = proveedor.getVentasProveedor();
        this.nivelReputacion = proveedor.getNivelReputacion();
        this.telefonoProveedor = proveedor.getTelefonoProveedor();
        this.urlChat = proveedor.getUrlChat();
        this.direccionAtencion = proveedor.getDireccionAtencion();
    }

    public ProveedorEntity toEntity() {
        ProveedorEntity proveedor = new ProveedorEntity();
        proveedor.setIdProveedor(this.idProveedor);
        proveedor.setNitProveedor(this.nitProveedor);
        proveedor.setNombreProveedor(this.nombreProveedor);
        proveedor.setClaveProveedor(this.claveProveedor);
        proveedor.setImagenProveedor(this.imagenProveedor);
        proveedor.setVentasProveedor(this.ventasProveedor);
        proveedor.setNivelReputacion(this.nivelReputacion);
        proveedor.setTelefonoProveedor(this.telefonoProveedor);
        proveedor.setUrlChat(this.urlChat);
        proveedor.setDireccionAtencion(this.direccionAtencion);
        return proveedor;
    }

    public static List<ProveedorDTO> toProveedorList(List<ProveedorEntity> proveedorList) {
        List<ProveedorDTO> listaProveedores = new ArrayList<>();
        for (int i = 0; i < proveedorList.size(); i++) {
            listaProveedores.add(new ProveedorDTO(proveedorList.get(i)));
        }
        return listaProveedores;
    }

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

    /**
     * Metodos get y set
     *
     * @return
     */
}
