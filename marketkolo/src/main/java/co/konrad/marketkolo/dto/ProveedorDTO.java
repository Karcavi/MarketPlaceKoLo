
package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.ProveedorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO para el mapeo objeto relacional de la entidad Proveedor
 *
 * @author karcavi
 */
public class ProveedorDTO {
    /**
     * id del Proveedor
     */
    private Long id;
    
    /**
     * Ciudad del proveedor
     */
    private String ciudad;
    
    /**
     * Nombre del proveedor
     */
    private String nombre;
    
    /**
     * Ruta de la foto del proveedor
     */
    private String rutaFoto;
    
    /**
     * Ventas del proveedor
     */
    private int ventas;
    
    /**
     * Reputación del proveedor
     */
    private int reputacion;
    
    /**
     * Número telefónico del proveedor
     */
    private int telefono;
    
    /**
     * URL del chat del proveedor
     */
    private String urlChat;
    
    /**
     * Dirección física del proveedor
     */
    private String direccion;
    
    public ProveedorDTO() {
    }

    /**
     * Constructor
     *
     * @param proveedor
     */
    public ProveedorDTO(ProveedorEntity proveedor) {
        this.id = proveedor.getId();
        this.ciudad = proveedor.getCiudad();
        this.nombre = proveedor.getNombre();
        this.rutaFoto = proveedor.getRutaFoto();
        this.ventas = proveedor.getVentas();
        this.reputacion = proveedor.getReputacion();
        this.telefono = proveedor.getTelefono();
        this.urlChat = proveedor.getUrlChat();
        this.direccion = proveedor.getDireccion();
        
    }

    public ProveedorEntity toEntity() {
        ProveedorEntity proveedor = new ProveedorEntity();
        proveedor.setId(this.id);
        proveedor.setCiudad(this.ciudad);
        proveedor.setNombre(this.nombre);
        proveedor.setRutaFoto(this.rutaFoto);
        proveedor.setVentas(this.ventas);
        proveedor.setReputacion(this.reputacion);
        proveedor.setTelefono(this.telefono);
        proveedor.setUrlChat(this.urlChat);
        proveedor.setDireccion(this.direccion);

        return proveedor;
    }

    public static List<ProveedorDTO> toProveedorList(List<ProveedorEntity> proveedorList) {
        List<ProveedorDTO> listaProveedores = new ArrayList<>();
        for (int i = 0; i < proveedorList.size(); i++) {
            listaProveedores.add(new ProveedorDTO(proveedorList.get(i)));
        }
        return listaProveedores;
    }

     /**
     * Métodos get y set
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
}
