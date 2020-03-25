/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Prestamo;

/**
 *
 * @author Paola Becerra
 */
public class PrestamoDAO {
    
     public  static String registrarPrestamo (Prestamo prestamo){
        String resul = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO prestamo (id_prestamo, ti_prestamo, est_prestamo, "
                + "f_inicio, f_limite, id_reserva)"
                + "VALUES ( nextval('secuenciaid'), ?, ?, ?, ?, ?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, prestamo.getTi_prestamo());
            pst.setString(2, prestamo.getEst_prestamo());
            pst.setDate(3, prestamo.getFe_inicio());
            pst.setDate(4, prestamo.getFe_limite());
            pst.setLong(5, prestamo.getNum_reserva());
            System.out.println("antes de ejecutar query");
            pst.execute();
            resul = "Prestamo registrado";
        } catch (SQLException e){
            resul ="Error";
            System.out.println("error"+e);
        }
        
        
        return resul;    
    } 
}
