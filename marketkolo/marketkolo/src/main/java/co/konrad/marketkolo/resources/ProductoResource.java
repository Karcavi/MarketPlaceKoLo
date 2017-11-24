
package co.konrad.marketkolo.resources;

import co.konrad.marketkolo.dto.ProductoDTO;
import co.konrad.marketkolo.entities.ProductoEntity;
import co.konrad.marketkolo.logic.ProductoLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Recurso de Cliente
 * @author karcavi
 */
@Path("/productos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductoResource {
    @EJB
    private ProductoLogic productoLogic;

    @GET
    public List<ProductoDTO> getProductoList() {            //Resolver
        List<ProductoEntity> productos = productoLogic.getProductos();
        return ProductoDTO.toProductoList(productos);
    }

    @GET
    @Path("{id: \\d+}")
    public ProductoDTO getProducto(@PathParam("idProducto") Long idProducto) {
        ProductoEntity producto = productoLogic.getProducto(idProducto);
        if (producto == null) {
            throw new RuntimeException("El producto solicitado no existe");
        }
        return new ProductoDTO(producto);
    }
    
    @POST
    public ProductoDTO createProducto(ProductoDTO cdto) {
        return new ProductoDTO(productoLogic.createProducto(cdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public ProductoDTO updateProducto(@PathParam("id") Long id, ProductoDTO producto) {
        ProductoEntity entity = productoLogic.getProducto(id);
        if (entity == null) {
            throw new RuntimeException("El producto solicitado no existe");
        }
        return new ProductoDTO(productoLogic.updateProducto(id, producto.toEntity()));
    }

    @DELETE
    @Path("{productoId: \\d+}")
    public void deleteProducto(@PathParam("productoId") Long id) {
        ProductoEntity entity = productoLogic.getProducto(id);
        if (entity == null) {
            throw new RuntimeException("El producto solicitado no existe");
        }
        productoLogic.deleteProducto(id);
    }
    
    
}
