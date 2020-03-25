
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Multa;

/**
 *
 * @author Paola Becerra
 */
public class MultaDAO {
    
    public String registrarMulta (Long id_prestamo){
        String resul = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO multa "
                + "VALUES ((nextval('secuenciaid')), NOW(), 'P',"+id_prestamo+");";
        try {
            pst = cn.prepareStatement(sql);
            System.out.println("antes de ejecutar query");
            pst.execute();
            resul = "Multa registrada";
        } catch (SQLException e){
            resul ="Error";
            System.out.println("error"+e);
        }
        
        return resul;    
    } 
}
