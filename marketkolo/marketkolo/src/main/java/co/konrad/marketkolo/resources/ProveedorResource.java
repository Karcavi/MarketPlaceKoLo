package co.konrad.marketkolo.resources;

import co.konrad.marketkolo.dto.ProveedorDTO;
import co.konrad.marketkolo.entities.ProveedorEntity;
import co.konrad.marketkolo.logic.ProveedorLogic;
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
 * Recurso de Proveedor
 *
 * @author Sebastián Méndez Garzón
 */
@Path("/proveedores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProveedorResource {

    @EJB
    private ProveedorLogic proveedorLogic;

    @GET
    public List<ProveedorDTO> getProveedorList() {
        List<ProveedorEntity> proveedores = proveedorLogic.getProveedors();
        return ProveedorDTO.toProveedorList(proveedores);
    }

    @GET
    @Path("{id: \\d+}")
    public ProveedorDTO getProveedor(@PathParam("id") Long id) {
        ProveedorEntity proveedor = proveedorLogic.getProveedor(id);
        if (proveedor == null) {
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        return new ProveedorDTO(proveedor);
    }

    @POST
    public ProveedorDTO createProveedor(ProveedorDTO cdto) {
        return new ProveedorDTO(proveedorLogic.createProveedor(cdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public ProveedorDTO updateProveedor(@PathParam("id") Long id, ProveedorDTO proveedor) {
        ProveedorEntity entity = proveedorLogic.getProveedor(id);
        if (entity == null) {
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        return new ProveedorDTO(proveedorLogic.updateProveedor(id, proveedor.toEntity()));
    }

    @DELETE
    @Path("{proveedorId: \\d+}")
    public void deleteProveedor(@PathParam("proveedorId") Long id) {
        ProveedorEntity entity = proveedorLogic.getProveedor(id);
        if (entity == null) {
            throw new RuntimeException("El proveedor solicitado no existe");
        }
        proveedorLogic.deleteProveedor(id);
    }
}
