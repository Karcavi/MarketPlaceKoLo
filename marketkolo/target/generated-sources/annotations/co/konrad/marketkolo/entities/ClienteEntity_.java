package co.konrad.marketkolo.entities;

import co.konrad.marketkolo.entities.TipoDocumentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-18T02:13:57")
@StaticMetamodel(ClienteEntity.class)
public class ClienteEntity_ { 

    public static volatile SingularAttribute<ClienteEntity, String> apellidos;
    public static volatile SingularAttribute<ClienteEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<ClienteEntity, String> clave;
    public static volatile SingularAttribute<ClienteEntity, Long> idCliente;
    public static volatile SingularAttribute<ClienteEntity, String> correo;
    public static volatile SingularAttribute<ClienteEntity, String> direccion;
    public static volatile SingularAttribute<ClienteEntity, String> documento;
    public static volatile SingularAttribute<ClienteEntity, Integer> telefono;
    public static volatile SingularAttribute<ClienteEntity, String> nombres;

}