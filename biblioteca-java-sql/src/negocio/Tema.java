
package negocio;

public class Tema {
    private Long k_tema;
    private String nom_tema;
    private String resultado; 
    

    public Long getId_tema() {
        return k_tema;
    }

    public void setId_tema(Long id_tema) {
        this.k_tema = id_tema;
    }

    public String getNom_tema() {
        return nom_tema;
    }

    public void setNom_tema(String nom_tema) {
        this.nom_tema = nom_tema;
    }
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    @Override
    public String toString() {
        return  nom_tema;
    }

}
