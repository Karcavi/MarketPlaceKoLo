
package co.konrad.marketkolo.dto;
import co.konrad.marketkolo.entities.PromocionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *DTO para el mapeo objeto relacional de la entidad Promocion
 * @author karcavi
 */
public class PromocionDTO {
    /**
     * Identificador de la promoción
     */
    private Long idPromocion;
    
    /**
     * Precio de la oferta
     */
    private int precioOferta;
    
    /**
     * Fecha de inicio de la promociòn
     */
    private String fechaInicio;
    
    /**
     * Fecha de finalización de la promoción
     */
    private String fechaFin;
    
    
     public PromocionDTO() {
    }

    /**
     * Constructor
     *
     * @param promocion
     */
    
     public PromocionDTO(PromocionEntity promocion) {
        this.idPromocion = promocion.getIdPromocion();
        this.precioOferta = promocion.getPrecioOferta();
        this.fechaInicio = promocion.getFechaInicio();
        this.fechaFin = promocion.getFechaFin();
    }
     
     public PromocionEntity toEntity() {
        PromocionEntity promocion = new PromocionEntity();
        promocion.setIdPromocion(this.idPromocion);
        promocion.setPrecioOferta(this.precioOferta);
        promocion.setFechaInicio(this.fechaInicio);
        promocion.setFechaFin(this.fechaFin);
        return promocion;
    }
     
      public static List<PromocionDTO> toPromocionList(List<PromocionEntity> promocionList) {
        List<PromocionDTO> listaPromociones = new ArrayList<>();
        for (int i = 0; i < promocionList.size(); i++) {
            listaPromociones.add(new PromocionDTO(promocionList.get(i)));
        }
        return listaPromociones;
        }

    public Long getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public int getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(int precioOferta) {
        this.precioOferta = precioOferta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
      
      
      
      
}
