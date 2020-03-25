
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Autor;
import negocio.MaterialAutor;

public class MaterialAutorDAO {
    
        public static String registrarmaterial_autor(MaterialAutor ma){
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO material_autor (id_material, id_autor ) VALUES (?,?)";
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1,ma.getId_material());
            pst.setLong(2, ma.getId_autor());
            
           
            pst.execute();
            resul = "Material Autor registrado con éxito";
        }catch (SQLException e){
            resul = "Error, No pudo registrar el Material Autor: " + e.getMessage();
        }finally{ 
            try{
            if(cn != null){
                cn.close();
                pst.close();
            }
            }catch (Exception e) {
                resul = "Error: "+e;
            }
            
        }return resul;
    }
    
}
