
package co.konrad.marketplacekolo.DTO;
import co.konrad.marketplacekolo.entities.CiudadEntity;
import co.konrad.marketplacekolo.entities.ProveedorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *DTO para el mapeo objeto relacional de la entidad Proveedor
 * @author karcavi
 */


public class ProveedorDTO {
    
/*id del proveedor*/
    private Long id;
    
/*nombre del `proveedor*/    
    private String nombre;

/*contraseña del `proveedor*/    
    private String clave;

/*ruta del logo del `proveedor*/
    private String imagen;
    
/*ventas hechas por el `proveedor*/
    private int ventas;

/*Nivel de reputación de 1 a 5, siendo 5 la mejor del `proveedor*/
    private int reputacion;

/*Número teléfonocio de atención del `proveedor*/
    private int telefono;

/*Dirección URL del chat*/
    private String urlChat;

/*Dirección de atención del proveedor*/
    private String direccion;

/*Relacion uno a muchos con la tabla Ciudad*/
    private CiudadEntity ciudad;

    
    public ProveedorDTO(){
    }
    
       /**
 *Constructor
 * @param proveedor
 */ 
    
    public ProveedorDTO(ProveedorEntity proveedor){
        this.id = proveedor.getId();
        this.nombre = proveedor.getNombre();
        this.clave = proveedor.getClave();
        this.imagen = proveedor.getImagen();
        this.ventas = proveedor.getVentas();
        this.reputacion = proveedor.getReputacion();
        this.telefono = proveedor.getTelefono();
        this.urlChat = proveedor.getUrlChat();
        this.direccion = proveedor.getDireccion();
     }
    
    
    public ProveedorEntity toEntity(){
        ProveedorEntity proveedor = new ProveedorEntity();
        proveedor.setId(this.id);
        proveedor.setNombre(this.nombre);
        proveedor.setClave(this.clave);
        proveedor.setImagen(this.imagen);
        proveedor.setVentas(this.ventas);
        proveedor.setReputacion(this.reputacion);
        proveedor.setTelefono(this.telefono);
        proveedor.setUrlChat(this.urlChat);
        proveedor.setDireccion(this.direccion);
        return proveedor;
    }
    
    
    public static List<ProveedorDTO> toProveedorList(List<ProveedorEntity> proveedorList){
        List<ProveedorDTO> listaProveedores = new ArrayList<>();
        for (int i=0; i<proveedorList.size(); i++){
            listaProveedores.add(new ProveedorDTO(proveedorList.get(i)));
        }
        return listaProveedores;
    }
    
    
   /*Métodos get y set*/  

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
    
    


}
