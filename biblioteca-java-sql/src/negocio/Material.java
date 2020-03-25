
package negocio;

import java.sql.Date;
import java.time.LocalDate;

public class Material {
   private Long id_material;
   private String titulo;
   private Date f_publicacion;
   private String resultado;

    public Long getId_material() {
        return id_material;
    }

    public void setId_material(Long id_material) {
        this.id_material = id_material;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getF_publicacion() {
        return f_publicacion;
    }

    public void setF_publicacion(Date f_publicacion) {
        this.f_publicacion = f_publicacion;
    }


    


    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String toString() {
        return titulo ;
    }
   
   
    
}
