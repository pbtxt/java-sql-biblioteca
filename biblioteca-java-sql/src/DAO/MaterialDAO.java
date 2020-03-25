package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Autor;
import negocio.Material;

public class MaterialDAO {

    public static String registrarMaterial(Material material) {
        String resul = null, lats = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        //sirve para hacer llamado a la base
        PreparedStatement pst = null;
        String sql = "INSERT INTO material (id_material, nom_material, f_publicacion ) VALUES (?,?,?)";

        try {
            pst = cn.prepareStatement(sql);
            pst.setLong(1, material.getId_material());
            pst.setString(2, material.getTitulo());
            pst.setDate(3, material.getF_publicacion());
            // pst.setString(3, material.getF_publicacion());
            pst.execute();
            resul = "Material registrado con éxito";
        } catch (SQLException e) {
            resul = "Error, No pudo crear el material: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                resul = "Error: " + e;
            }

        }
        return resul;
    }

    public static ArrayList<Material> getListMaterial() {
        ArrayList<Material> listMaterial = new ArrayList<Material>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        Material material = null;
        String sql = "SELECT *FROM material;";

        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                material = new Material();
                material.setId_material(Long.valueOf(rs.getString(1)));
                material.setTitulo(rs.getString(2));
                material.setF_publicacion(rs.getDate(3));
                if (listMaterial.isEmpty()) {
                    listMaterial.add(0, material);
                } else {
                    listMaterial.add(material);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
        return listMaterial;
    }
    
    
    //--------------------------------------------------------------
    public static Material buscarMaterial(Long id){ 
        Material material = new Material(); 
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
        PreparedStatement pst = null; 
        String sql = "SELECT * FROM material WHERE id_material = ?" ;
        try{ 
            pst = cn.prepareStatement(sql);
            pst.setLong(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                
                material.setId_material(Long.valueOf(rs.getString(1)));
                material.setTitulo(rs.getString(2));
                Date f =java.sql.Date.valueOf(rs.getString(3));
                material.setF_publicacion(f);
            }
            material.setResultado("busqueda exitosa");
        }catch (SQLException e){
            material.setResultado("Error en la consulta: "+e.getMessage());
        }finally{ 
            try{
            if(cn != null){
                cn.close();
                pst.close();
            }
            }catch (Exception e) {
                 material.setResultado( "Error: "+e);
            }
        }
        
        return material; 
    }
    
}


   