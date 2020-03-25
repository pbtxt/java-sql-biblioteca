/*
 */
package negocio;

public class Estudiante {
    private long k_codigo; 
    private String nom_estudiante;
    private String ape_estudiante;
    private String gen_estudiante;
    private String est_estudiante;
    private String f_nacimiento;
    private String i_tipo;
    private String resultado; 

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    public Estudiante(){ 
        
    }
 
    /**
     *métodos getters and setters 
     */
    public long getK_codigo() {
        return k_codigo;
    }

    public void setK_codigo(long k_codigo) {
        this.k_codigo = k_codigo;
    }

    public String getNom_estudiante() {
        return nom_estudiante;
    }

    public void setNom_estudiante(String nom_estudiante) {
        this.nom_estudiante = nom_estudiante;
    }

    public String getApe_estudiante() {
        return ape_estudiante;
    }

    public void setApe_estudiante(String ape_estudiante) {
        this.ape_estudiante = ape_estudiante;
    }

    public String getGen_estudiante() {
        return gen_estudiante;
    }

    public void setGen_estudiante(String gen_estudiante) {
        this.gen_estudiante = gen_estudiante;
    }

    public String getEst_estudiante() {
        return est_estudiante;
    }

    public void setEst_estudiante(String est_estudiante) {
        this.est_estudiante = est_estudiante;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getI_tipo() {
        return i_tipo;
    }

    public void setI_tipo(String i_tipo) {
        this.i_tipo = i_tipo;
    }

    @Override
    public String toString() {
        return  nom_estudiante +  ape_estudiante;
    }
    
    
    
}
