package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;

/**
 *
 * @author Sebastián Méndez Garzón
 */
@Entity
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_Cliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    /**
     * Nombres del cliente
     */
    @Column(name = "nombres_Cliente")
    private String nombres;

    /**
     * Apellidos del cliente
     */
    @Column(name = "apellidos_Cliente")
    private String apellidos;

    /**
     * # telefonico del cliente
     */
    @Column(name = "telefono_Cliente")
    private int telefono;

    /**
     * # del documento de identidad del cliente
     */
    @Column(name = "documento_Cliente")
    private String documento;

    /**
     * correo eletronico del cliente
     */
    @Column(name = "correo_Cliente")
    private String correo;
    
    /**
     * clave del cliente
     */
    @Column(name = "clave_Cliente")
    private String clave;
    
        /**
     * dirección del cliente
     */
    @Column(name = "direccion_Cliente")
    private String direccion;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_TipoDocumento", nullable=false, referencedColumnName = "id_TipoDocumento")
    /*Relacion muchos a uno con la tabla TipoDocumento*/
    private TipoDocumentoEntity tipoDocumento;
 

    public Long getIdCliente() {
        return idCliente;
    }

    /**
     *  Metodos get y set     
     * @param idCliente
     */
    public void setIdCliente(Long idCliente) { 
        this.idCliente = idCliente;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
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

    public TipoDocumentoEntity getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    
    

}
