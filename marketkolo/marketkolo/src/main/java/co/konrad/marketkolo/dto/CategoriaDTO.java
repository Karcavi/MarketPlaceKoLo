
package co.konrad.marketkolo.dto;

import co.konrad.marketkolo.entities.CategoriaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *DTO para el mapeo del objeto relacional de la entidad Categoría
 * @author karcavi
 */
public class CategoriaDTO {
    /**
     * Identificador de la categoría
     */
    private Long idCategoria;
    
    /**
     * Nombre de la categoría
     */
    private String nombreCategoria;
    
    
    public CategoriaDTO(){
    
    }
        
    /**
     * Constructor
     *
     * @param categoría
     */

    public CategoriaDTO(CategoriaEntity categoria) {
        this.idCategoria = categoria.getIdCategoria();
        this.nombreCategoria = categoria.getNombreCategoria();
    }
    
     public CategoriaEntity toEntity() {
        CategoriaEntity categoria = new CategoriaEntity();
        categoria.setIdCategoria(this.idCategoria);
        categoria.setNombreCategoria(this.nombreCategoria);
        return categoria;
    }
     
    public static List<CategoriaDTO> toCategoriaList(List<CategoriaEntity> categoriaList) {
        List<CategoriaDTO> listaCategoria = new ArrayList<>();
        for (int i = 0; i < categoriaList.size(); i++) {
            listaCategoria.add(new CategoriaDTO(categoriaList.get(i)));
        }
        return listaCategoria;
    } 

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
    
        
}
