/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Sheratan
 */
public class Copia {
    Long id_copia;
    String est_fisico;
    Long id_material;

    public Long getId_copia() {
        return id_copia;
    }

    public void setId_copia(Long id_copia) {
        this.id_copia = id_copia;
    }

    public String getEst_fisico() {
        return est_fisico;
    }

    public void setEst_fisico(String est_fisico) {
        this.est_fisico = est_fisico;
    }

    public Long getId_material() {
        return id_material;
    }

    public void setId_material(Long id_material) {
        this.id_material = id_material;
    }
    
}
