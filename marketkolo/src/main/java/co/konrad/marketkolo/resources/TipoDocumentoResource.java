package co.konrad.marketkolo.resources;

import co.konrad.marketkolo.dto.TipoDocumentoDTO;
import co.konrad.marketkolo.entities.TipoDocumentoEntity;
import co.konrad.marketkolo.logic.TipoDocumentoLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Recurso del Tipo del Documento
 * @author Sebastián Méndez Garzón
 */
@Path("/tipoDocumentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoDocumentoResource {
    
    @EJB
    private TipoDocumentoLogic tipoDocumentoLogic;

    @GET
    public List<TipoDocumentoDTO> getTipoDocumentolist() {
        List<TipoDocumentoEntity> tipoDocumentos = tipoDocumentoLogic.getTipoDocumentos();
        return TipoDocumentoDTO.toTipoDocumentoList(tipoDocumentos);
    }

    @GET
    @Path("{id: \\d+}")
    public TipoDocumentoDTO getTipoDocumento(@PathParam("id") Long id) {
        TipoDocumentoEntity tipoDocumento = tipoDocumentoLogic.getTipoDocumento(id);
        if (tipoDocumento == null) {
            throw new RuntimeException("El Tipo de Documento solicitado no existe");
        }
        return new TipoDocumentoDTO(tipoDocumento);
    }

//    @POST
//    public ClienteDTO createCliente(ClienteDTO cdto) {
//        return new ClienteDTO(clienteLogic.createCliente(cdto.toEntity()));
//    }
//
//    @PUT
//    @Path("{id: \\d+}")
//    public ClienteDTO updateCliente(@PathParam("id") Long id, ClienteDTO cliente) {
//        ClienteEntity entity = clienteLogic.getCliente(id);
//        if (entity == null) {
//            throw new RuntimeException("El cliente solicitado no existe");
//        }
//        return new ClienteDTO(clienteLogic.updateCliente(id, cliente.toEntity()));
//    }
//
//    @DELETE
//    @Path("{clienteId: \\d+}")
//    public void deleteCliente(@PathParam("clienteId") Long id) {
//        ClienteEntity entity = clienteLogic.getCliente(id);
//        if (entity == null) {
//            throw new RuntimeException("El cliente solicitado no existe");
//        }
//        clienteLogic.deleteCliente(id);
//    }
    
}
