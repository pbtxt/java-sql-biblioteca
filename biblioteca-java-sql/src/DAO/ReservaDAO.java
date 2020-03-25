
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Reserva;

public class ReservaDAO {
    
    
    public static String registrarReserva(Reserva reserva){ 
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO reserva (id_reserva, f_reserva, id_material, codigo, id_copia ) VALUES (nextval('secuenciaid'),?,?,?,?)";
        
         try{
            pst = cn.prepareStatement(sql);
            pst.setDate(1, reserva.getF_reserva());
            pst.setLong(2, reserva.getId_material());
            pst.setLong(3, reserva.getCodigo_estudiante());
            pst.setLong(4, reserva.getId_copia());
        
           
            pst.execute();
            resul = "Reserva registrado con éxito";
        }catch (SQLException e){
           
            resul = "Error, No pudo registrar la reserva: " + e.getMessage();
        }finally{ 
            try{
            if(cn != null){
                cn.close();
                pst.close();
            }
            }catch (Exception e) {
                resul = "Error: "+e;
            }
            
        }
        return resul;
    }
    
}
