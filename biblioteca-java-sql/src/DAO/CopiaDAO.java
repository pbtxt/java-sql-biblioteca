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
import negocio.Copia;

/**
 *
 * @author Paola Becerra
 */
public class CopiaDAO {

    public static String registrarCopiaBibliografico(Copia copia) {
        String resul = null, lats = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;

        String sql = "INSERT INTO copia (id_copia, est_fisico, id_material)"
                + "VALUES (?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setLong(1, copia.getId_copia());
            pst.setString(2, copia.getEst_fisico());
            pst.setLong(3, copia.getId_material());
            pst.execute();
            resul = "Copia registrada con exito";
            
        } catch (SQLException e) {
            resul = "Error, no se pudo guardar la copia";
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                resul = "Error" + e;
            }
        }
        return resul;

    }
    
    
}
