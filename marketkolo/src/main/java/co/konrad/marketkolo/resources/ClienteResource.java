/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketkolo.resources;

import co.konrad.marketkolo.dto.ClienteDTO;
import co.konrad.marketkolo.entities.ClienteEntity;
import co.konrad.marketkolo.logic.ClienteLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
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
 * @author Sebastián Méndez Garzón
 */
@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @EJB
    private ClienteLogic clienteLogic;

    @GET
    public List<ClienteDTO> getClienteList() {
        List<ClienteEntity> clientes = clienteLogic.getClientes();
        return ClienteDTO.toClienteList(clientes);
    }

    @GET
    @Path("{id: \\d+}")
    public ClienteDTO getCliente(@PathParam("id") Long id) {
        ClienteEntity cliente = clienteLogic.getCliente(id);
        if (cliente == null) {
            throw new RuntimeException("El cliente solicitado no existe");
        }
        return new ClienteDTO(cliente);
    }

    @POST
    public ClienteDTO createCliente(ClienteDTO cdto) {
        return new ClienteDTO(clienteLogic.createCliente(cdto.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public ClienteDTO updateCliente(@PathParam("id") Long id, ClienteDTO cliente) {
        ClienteEntity entity = clienteLogic.getCliente(id);
        if (entity == null) {
            throw new RuntimeException("El cliente solicitado no existe");
        }
        return new ClienteDTO(clienteLogic.updateCliente(id, cliente.toEntity()));
    }

    @DELETE
    @Path("{clienteId: \\d+}")
    public void deleteCliente(@PathParam("clienteId") Long id) {
        ClienteEntity entity = clienteLogic.getCliente(id);
        if (entity == null) {
            throw new RuntimeException("El cliente solicitado no existe");
        }
        clienteLogic.deleteCliente(id);
    }
}
