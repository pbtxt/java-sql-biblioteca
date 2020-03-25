package negocio;

import java.sql.Date;

public class Reserva {
    Long id_reserva;
    Date f_reserva;
    Long id_material;
    Long codigo_estudiante;
    Long id_copia; 

    public Long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getF_reserva() {
        return f_reserva;
    }

    public void setF_reserva(Date f_reserva) {
        this.f_reserva = f_reserva;
    }

    public Long getId_material() {
        return id_material;
    }

    public void setId_material(Long id_material) {
        this.id_material = id_material;
    }

    public Long getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setCodigo_estudiante(Long codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public Long getId_copia() {
        return id_copia;
    }

    public void setId_copia(Long id_copia) {
        this.id_copia = id_copia;
    }

    
    
    
}
