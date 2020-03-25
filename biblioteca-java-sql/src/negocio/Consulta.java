
package negocio;

public class Consulta {
   private Long id_material;
   private String titulo;
   private String f_publicacion;
   private Long id_autor;
   private String nom_autor;
   private String nacionalidad;
   private String clasificacion;
   private Long id_copia; 
   private String estado_fisico;
   

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

    public String getF_publicacion() {
        return f_publicacion;
    }

    public void setF_publicacion(String f_publicacion) {
        this.f_publicacion = f_publicacion;
    }

    public Long getId_autor() {
        return id_autor;
    }

    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    public String getNom_autor() {
        return nom_autor;
    }

    public void setNom_autor(String nom_autor) {
        this.nom_autor = nom_autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Long getId_copia() {
        return id_copia;
    }

    public void setId_copia(Long id_copia) {
        this.id_copia = id_copia;
    }

    public String getEstado_fisico() {
        return estado_fisico;
    }

    public void setEstado_fisico(String estado_fisico) {
        this.estado_fisico = estado_fisico;
    }
   
   
   
   
   
    
}
