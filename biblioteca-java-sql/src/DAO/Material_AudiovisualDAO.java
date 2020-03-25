
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Material_Audiovisual;


public class Material_AudiovisualDAO {
    
    public static String registrarMaterialAudiovisual(Material_Audiovisual material_audiovisual){
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO audiovisual (id_material, isan, formato ) VALUES (?,?,?)";
        
        try{
            pst = cn.prepareStatement(sql);
            
            pst.setLong(1, material_audiovisual.getId_material());
            pst.setLong(2, material_audiovisual.getIsan());
            pst.setString(3, material_audiovisual.getFormato());
            pst.execute();
            resul = "Material registrado con éxito";
        }catch (SQLException e){
            resul = "Error, No pudo crear el material: " + e.getMessage();
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