
package negocio;

import java.sql.Date;

public class Prestamo {
     Long num_prestamo;
    String ti_prestamo;
    String est_prestamo;
    Date fe_inicio;
    Date fe_limite;
    Date fe_devolucion;
    Long num_reserva;
    String resultado; 

    public Long getNum_prestamo() {
        return num_prestamo;
    }

    public void setNum_prestamo(Long num_prestamo) {
        this.num_prestamo = num_prestamo;
    }

    public String getTi_prestamo() {
        return ti_prestamo;
    }

    public void setTi_prestamo(String ti_prestamo) {
        this.ti_prestamo = ti_prestamo;
    }

    public String getEst_prestamo() {
        return est_prestamo;
    }

    public void setEst_prestamo(String est_prestamo) {
        this.est_prestamo = est_prestamo;
    }

    public Date getFe_inicio() {
        return fe_inicio;
    }

    public void setFe_inicio(Date fe_inicio) {
        this.fe_inicio = fe_inicio;
    }

    public Date getFe_limite() {
        return fe_limite;
    }

    public void setFe_limite(Date fe_limite) {
        this.fe_limite = fe_limite;
    }

    public Date getFe_devolucion() {
        return fe_devolucion;
    }

    public void setFe_devolucion(Date fe_devolucion) {
        this.fe_devolucion = fe_devolucion;
    }

    public Long getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(Long num_reserva) {
        this.num_reserva = num_reserva;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
