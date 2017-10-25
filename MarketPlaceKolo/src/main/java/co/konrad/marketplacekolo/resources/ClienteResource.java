/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.cinekonradista.resources;

import co.konrad.cinekonradista.dto.ClienteDTO;
import co.konrad.cinekonradista.dto.FestivalDTO;
import co.konrad.cinekonradista.entities.ClienteEntity;
import co.konrad.cinekonradista.entities.FestivalEntity;
import co.konrad.cinekonradista.logic.ClienteLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Recurso de Cliente
 *
 * @author Sebastián Méndez Garzón
 */
public class ClienteResource {

    @EJB
    private ClienteLogic clienteLogic;

    @GET
    public List<ClienteDTO> getFestivalList() {
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
