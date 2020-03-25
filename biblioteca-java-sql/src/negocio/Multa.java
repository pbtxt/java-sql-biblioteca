/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.Date;

/**
 *
 * @author Paola Becerra
 */
public class Multa {
    
    Long id_multa;
    float val_multa;
    Date f_inicio;
    Date f_pago;
    Long num_prestamo;
    String a;

    public Long getId_multa() {
        return id_multa;
    }

    public void setId_multa(Long id_multa) {
        this.id_multa = id_multa;
    }

    public float getVal_multa() {
        return val_multa;
    }

    public void setVal_multa(float val_multa) {
        this.val_multa = val_multa;
    }

    public Date getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }

    public Date getF_pago() {
        return f_pago;
    }

    public void setF_pago(Date f_pago) {
        this.f_pago = f_pago;
    }

    public Long getNum_prestamo() {
        return num_prestamo;
    }

    public void setNum_prestamo(Long num_prestamo) {
        this.num_prestamo = num_prestamo;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
    
    
}
