/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.ClienteEntity;
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
    /**
     * Dirección del cliente
     */
    private String direccion;

    public ClienteDTO() {
    }

    /**
     * Constructor
     * @param cliente
     */
    public ClienteDTO(ClienteEntity cliente) {
        this.id = cliente.getIdCliente();
        this.nombres = cliente.getNombres();
        this.apellidos = cliente.getApellidos();
        this.telefono = cliente.getTelefono();
        this.documento = cliente.getDocumento();
        this.correo = cliente.getCorreo();
        this.clave = cliente.getClave();
        this.direccion = cliente.getDireccion();
    }

    public ClienteEntity toEntity() {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setIdCliente(this.id);
        cliente.setNombres(this.nombres);
        cliente.setApellidos(this.apellidos);
        cliente.setTelefono(this.telefono);
        cliente.setDocumento(this.documento);
        cliente.setCorreo(this.correo);
        cliente.setClave(this.clave);
        cliente.setDireccion(this.direccion);

        return cliente;
    }

    public static List<ClienteDTO> toClienteList(List<ClienteEntity> clienteList) {
        List<ClienteDTO> listaClientes = new ArrayList<>();
        for (int i = 0; i < clienteList.size(); i++) {
            listaClientes.add(new ClienteDTO(clienteList.get(i)));
        }
        return listaClientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Metodos get y set
     * @return 
     */
    
}
