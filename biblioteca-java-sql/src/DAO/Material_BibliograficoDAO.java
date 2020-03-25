
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.Material;
import negocio.Material_Bibliografico;

public class Material_BibliograficoDAO {
    
    public static String registrarMaterialBibligrafico(Material_Bibliografico material_bibligrafico){
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO bibliografico (id_material, isbn, clasificacion ) VALUES (?,?,?)";
        
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1, material_bibligrafico.getId_material());
            pst.setLong(2, material_bibligrafico.getisbn());
            pst.setString(3, material_bibligrafico.getClasificacion());
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
    

