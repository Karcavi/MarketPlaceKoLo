package co.konrad.marketplacekolo.DTO;

import co.konrad.marketplacekolo.entities.CiudadEntity;
import co.konrad.marketplacekolo.entities.ProductoEntity;
import java.util.ArrayList;
import java.util.List;

/**DTO para el mapeo objeto relacional de la entidad Proveedor
 * @author karcavi*/

public class ProductoDTO {
    
    /*id del producto*/
    private Long id;
    
/*nombre del producto*/    
    private String nombre;

/*valor del producto*/    
    private String valor_unitario;
    
/*Marca del producto*/
    private String marca;

/*Garantia del producto*/
    private String garantia;
    
/*Stock del producto*/
    private String stock;

/*Relacion uno a muchos con la tabla Empresa*/
    private CiudadEntity empresa;

    
     public ProductoDTO(){
    }
   /**
 *Constructor
 * @param producto
 */ 
   
    public ProductoDTO(ProductoEntity producto){
        this.id = producto.getId();
        this.nombre = producto.getNombre();
        this.valor_unitario = producto.getValor_unitario();
        this.marca = producto.getMarca();
        this.garantia = producto.getGarantia();
        this.stock = producto.getStock();
        this.empresa = producto.getEmpresa();
     }
    
    
    public ProductoEntity toEntity(){
        ProductoEntity producto = new ProductoEntity();
        producto.setId(this.id);
        producto.setNombre(this.nombre);
        producto.setValor_unitario(this.valor_unitario);
        producto.setMarca(this.marca);
        producto.setGarantia(this.garantia);
        producto.setStock(this.stock);
        producto.setEmpresa(this.empresa);
        return producto;
    }
    
    public static List<ProductoDTO> toProductoList(List<ProductoEntity> productoList){
        List<ProductoDTO> listaProductos = new ArrayList<>();
        for (int i=0; i<productoList.size(); i++){
            listaProductos.add(new ProductoDTO(productoList.get(i)));
        }
        return listaProductos;
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

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public CiudadEntity getEmpresa() {
        return empresa;
    }

    public void setEmpresa(CiudadEntity empresa) {
        this.empresa = empresa;
    }
    
    
}
