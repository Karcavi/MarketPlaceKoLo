package co.konrad.marketplacekolo.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import co.konrad.marketplacekolo.DTO.ProveedorDTO;
import co.konrad.marketplacekolo.entities.ProveedorEntity;
import co.konrad.marketplacekolo.logic.ProveedorLogic;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

/**
 *
 * @author karcavi
    Recurso de Proveedor*/

@Path("/proveedores")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped

public class ProveedorResource {
    
    @Inject
    private ProveedorLogic proveedorLogic;
    
    @GET
    public List <ProveedorDTO> getProveedorList(){
        List<ProveedorEntity> proveedores = proveedorLogic.getProveedores();
        return ProveedorDTO.toProveedorList(proveedores);
    }
    
     @GET
    @Path("{id: \\d+}")
    public ProveedorDTO getProveedor(@PathParam("id") Long id){
        ProveedorEntity proveedor = proveedorLogic.getProveedor(id);
        if(proveedor == null){
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        return new ProveedorDTO(proveedor);
    }
    
     @POST
    public ProveedorDTO createProveedor(ProveedorDTO pdto){
        return new ProveedorDTO(proveedorLogic.createProveedor(pdto.toEntity()));
    }
    
     @PUT
    @Path("{id: \\d+}")
    public ProveedorDTO updateProveedor(@PathParam("id") Long id, ProveedorDTO proveedor){
        ProveedorEntity entity = proveedorLogic.getProveedor(id);
        if (entity == null){
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        return new ProveedorDTO(proveedorLogic.updateProveedor(id, proveedor.toEntity()));
    }
    
     @DELETE
    @Path("{proveedorId: \\d+}")
    public void deleteProveedor(@PathParam("proveedorId") Long id){
        ProveedorEntity entity = proveedorLogic.getProveedor(id);
        if(entity == null){
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        proveedorLogic.deleteProveedor(id);
    }
    
    
}
