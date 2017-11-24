package co.konrad.marketkolo.resources;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author Sebastián Méndez Garzón
 */
@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    } 
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.konrad.marketkolo.resources.ClienteResource.class);
        resources.add(co.konrad.marketkolo.resources.ProductoResource.class);
        resources.add(co.konrad.marketkolo.resources.ProveedorResource.class);
        resources.add(co.konrad.marketkolo.resources.TipoDocumentoResource.class);
    }
}

