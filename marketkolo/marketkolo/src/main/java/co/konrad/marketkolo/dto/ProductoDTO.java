
package co.konrad.marketkolo.dto;

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
     * Llave foránea
     */
    private TipoDocumentoDTO tipoDocumentodto;
    
    
    
    
}
