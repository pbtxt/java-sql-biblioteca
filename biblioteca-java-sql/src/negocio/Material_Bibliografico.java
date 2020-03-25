
package negocio;

public class Material_Bibliografico {
    
   private Long id_material; 
   private Long isbn;
   private String clasificacion;
   
   

    public Long getisbn() {
        return isbn;
    }

    public void setisbn(Long isbn) {
        this.isbn = isbn;
    }



    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Long getId_material() {
        return id_material;
    }

    public void setId_material(Long id_material) {
        this.id_material = id_material;
    }

   
}
