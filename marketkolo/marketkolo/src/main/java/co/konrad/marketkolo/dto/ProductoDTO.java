
package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.CategoriaEntity;
import co.konrad.marketkolo.entities.ProductoEntity;
import co.konrad.marketkolo.entities.PromocionEntity;
import co.konrad.marketkolo.entities.ProveedorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *DTO para el mapeo objeto relacional de la entidad Producto
 * @author karcavi
 */
public class ProductoDTO {
    
    /**
     * Identificador del Producto
     */
    private Long idProducto;
    
    /**
     * Valor del Producto
     */
    private int valorUnitario;
    
    /**
     * Marca del Producto
     */
    private String marcaProducto;
    
    /**
     * Tiempo de garantía del Producto 
     */
    private String garantiaProducto;
    
     /**
     * Cantidad de unidades del Producto disponibles para la venta
     */
    private int stockProducto;
    
    /**
     * URL de la Imagen del Producto a la venta
     */
    private String imagenProducto;
    
    
    /**
     * Llaves foráneas
     */
     private ProveedorDTO proveedordto;
     
     private CategoriaDTO categoriadto;
     
     private PromocionDTO promociondto;
     
     
     public ProductoDTO(){
     }
     
      /**
     * Constructor
     *
     * @param producto
     */
    public ProductoDTO(ProductoEntity producto) {
        this.idProducto = producto.getIdProducto();
        this.valorUnitario = producto.getValorUnitario();
        this.marcaProducto = producto.getMarcaProducto();
        this.garantiaProducto = producto.getGarantiaProducto();
        this.stockProducto = producto.getStockProducto();
        this.imagenProducto = producto.getImagenProducto();
        
        if (producto.getProveedor() != null) {
            ProveedorEntity proveedor = new ProveedorEntity();
            proveedor.setIdProveedor(producto.getProveedor().getIdProveedor());
            proveedor.setNombreProveedor(producto.getProveedor().getNombreProveedor());
            //this.setProveedordto(new ProveedorDTO(proveedor));
            this.proveedordto = new ProveedorDTO(proveedor);  
        }
        
         if (producto.getCategoria() != null) {
            CategoriaEntity categoria = new CategoriaEntity();
            categoria.setIdCategoria(producto.getCategoria().getIdCategoria());
            categoria.setNombreCategoria(producto.getCategoria().getNombreCategoria());
            //this.setProveedordto(new ProveedorDTO(proveedor));
            this.categoriadto = new CategoriaDTO(categoria);  
        }
         
         if (producto.getPromocion() != null) {
            PromocionEntity promocion = new PromocionEntity();
            promocion.setIdPromocion(producto.getPromocion().getIdPromocion());
            promocion.setPrecioOferta(producto.getPromocion().getPrecioOferta());
            //this.setProveedordto(new ProveedorDTO(proveedor));
            this.promociondto = new PromocionDTO(promocion);  
        }
    }
        
    public ProductoEntity toEntity() {
        ProductoEntity producto = new ProductoEntity();
        producto.setIdProducto(this.idProducto);
        producto.setValorUnitario(this.valorUnitario);
        producto.setMarcaProducto(this.marcaProducto);
        producto.setGarantiaProducto(this.garantiaProducto);
        producto.setStockProducto(this.stockProducto);
        producto.setImagenProducto(this.imagenProducto);
        
        if (this.proveedordto != null) {
            ProveedorEntity proveedor = new ProveedorEntity();
            proveedor.setIdProveedor(this.proveedordto.getIdProveedor());
            producto.setProveedor(proveedor);
        }
        
        if (this.categoriadto != null) {
            CategoriaEntity categoria = new CategoriaEntity();
            categoria.setIdCategoria(this.categoriadto.getIdCategoria());
            producto.setCategoria(categoria);
        }
        
        if (this.promociondto != null) {
            PromocionEntity promocion = new PromocionEntity();
            promocion.setIdPromocion(this.promociondto.getIdPromocion());
            producto.setPromocion(promocion);
        }
        
        return producto;
    }
   
    public static List<ProductoDTO> toProductoList(List<ProductoEntity> productoList) {
        List<ProductoDTO> listaProductos = new ArrayList<>();
        for (int i = 0; i < productoList.size(); i++) {
            listaProductos.add(new ProductoDTO(productoList.get(i)));
        }
        return listaProductos;
    }
    
    
    /*Getters y setters*/

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getGarantiaProducto() {
        return garantiaProducto;
    }

    public void setGarantiaProducto(String garantiaProducto) {
        this.garantiaProducto = garantiaProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public ProveedorDTO getProveedordto() {
        return proveedordto;
    }

    public void setProveedordto(ProveedorDTO proveedordto) {
        this.proveedordto = proveedordto;
    }

    public CategoriaDTO getCategoriadto() {
        return categoriadto;
    }

    public void setCategoriadto(CategoriaDTO categoriadto) {
        this.categoriadto = categoriadto;
    }

    public PromocionDTO getPromociondto() {
        return promociondto;
    }

    public void setPromociondto(PromocionDTO promociondto) {
        this.promociondto = promociondto;
    }
    
}
