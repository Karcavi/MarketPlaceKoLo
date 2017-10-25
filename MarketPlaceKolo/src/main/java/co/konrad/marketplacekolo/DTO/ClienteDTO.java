/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.cinekonradista.dto;

import co.konrad.cinekonradista.entities.ClienteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO para el mapeo objeto relacional de la entidad Cliente
 *
 * @author Sebastián Méndez Garzón
 */
public class ClienteDTO {

    /**
     * identificador del cliente
     */
    private Long id;
    /**
     * Nombres del cliente
     */
    private String nombres;
    /**
     * Apellidos del cliente
     */
    private String apellidos;
    /**
     * Numero telefonocio del cliente
     */
    private int telefono;
    /**
     * Numero del documento del cliente
     */
    private int documento;
    /**
     * Correo del cliente
     */
    private String correo;
    /**
     * Clave del cliente
     */
    private String clave;

    public ClienteDTO() {
    }

    /**
     * Constructor
     *
     * @param cliente
     */
    public ClienteDTO(ClienteEntity cliente) {
        this.id = cliente.getId();
        this.nombres = cliente.getNombres();
        this.apellidos = cliente.getApellidos();
        this.telefono = cliente.getTelefono();
        this.documento = cliente.getDocumento();
        this.correo = cliente.getCorreo();
        this.clave = cliente.getClave();
    }

    public ClienteEntity toEntity() {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setId(this.id);
        cliente.setNombres(this.nombres);
        cliente.setApellidos(this.apellidos);
        cliente.setTelefono(this.telefono);
        cliente.setDocumento(this.documento);
        cliente.setCorreo(this.correo);
        cliente.setClave(this.clave);

        return cliente;
    }

    public static List<ClienteDTO> toClienteList(List<ClienteEntity> clienteList) {
        List<ClienteDTO> listaClientes = new ArrayList<>();
        for (int i = 0; i < clienteList.size(); i++) {
            listaClientes.add(new ClienteDTO(clienteList.get(i)));
        }
        return listaClientes;
    }
}
