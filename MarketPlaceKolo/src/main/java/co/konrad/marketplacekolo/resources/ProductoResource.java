package co.konrad.marketplacekolo.resources;

import co.konrad.marketplacekolo.DTO.ProductoDTO;
import co.konrad.marketplacekolo.entities.ProductoEntity;
import co.konrad.marketplacekolo.logic.ProductoLogic;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author karcavi
 * Recurso de Producto
 */

@Path("/productos")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class ProductoResource {
    @Inject
    private ProductoLogic productoLogic;
    
    @GET
    public List <ProductoDTO> getProductoList(){
        List<ProductoEntity> productos = productoLogic.getProductos();
        return ProductoDTO.toProductoList(productos);
    }
    
     @GET
    @Path("{id: \\d+}")
    public ProductoDTO getProducto(@PathParam("id") Long id){
        ProductoEntity producto = productoLogic.getProducto(id);
        if(producto == null){
            throw new RuntimeException("El producto solicitado no existe");
        }
        return new ProductoDTO(producto);
    }
    
     @POST
    public ProductoDTO createProducto(ProductoDTO prdto){
        return new ProductoDTO(productoLogic.createProducto(prdto.toEntity()));
    }
    
     @PUT
    @Path("{id: \\d+}")
    public ProductoDTO updateProducto(@PathParam("id") Long id, ProductoDTO producto){
        ProductoEntity entity = productoLogic.getProducto(id);
        if (entity == null){
            throw new RuntimeException("El producto solicitado no existe");
        }
        return new ProductoDTO(productoLogic.updateProducto(id, producto.toEntity()));
    }
    
     @DELETE
    @Path("{productoId: \\d+}")
    public void deleteProducto(@PathParam("productoId") Long id){
        ProductoEntity entity = productoLogic.getProducto(id);
        if(entity == null){
            throw new RuntimeException("El producto solicitado no existe");
        }
        productoLogic.deleteProducto(id);
    }
    
    
    
}
