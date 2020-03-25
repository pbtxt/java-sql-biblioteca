
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Autor;

public class AutorDAO {
    
    public static String registrarAutor(Autor autor){
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO autor (id_autor, nom_autor, nacionalidad ) VALUES (?,?,?)";
        
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1,autor.getId_autor());
            pst.setString(2, autor.getNom_autor());
            pst.setString(3, autor.getNacionalidad());
           
            pst.execute();
            resul = "Autor registrado con éxito";
        }catch (SQLException e){
            resul = "Error, No pudo registrar el autor: " + e.getMessage();
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
    
    public static Autor buscarAutor(Long clave){
        Autor autor= new Autor();
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
        PreparedStatement pst = null; 
        String sql = "SELECT * FROM autor WHERE id_autor = ?" ;
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1, clave);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                autor.setId_autor(Long.valueOf(rs.getString(1)));
                autor.setNom_autor(rs.getString(2));
                autor.setNacionalidad(rs.getString(3));
            }
            autor.setResultado( "Busqueda Exitosa");
        }catch (SQLException e){
            autor.setResultado("Error en la consulta: " + e.getMessage());
        }finally{ 
            try{
            if(cn != null){
                cn.close();
                pst.close();
            }
            }catch (Exception e) {
                 autor.setResultado( "Error: "+e);
            }
            
        }return autor;
    }
    
    public static ArrayList<Autor> getListAutor() {
        ArrayList<Autor> listAutor = new ArrayList<Autor>();
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
        PreparedStatement pst = null; 
        Autor autor = null;
        String sql = "SELECT *FROM autor;";
        
        try{
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                autor = new Autor();
                autor.setId_autor(Long.valueOf(rs.getString(1)));
                autor.setNom_autor(rs.getString(2));
                autor.setNacionalidad(rs.getString(3)); //puse esto
                if(listAutor.isEmpty()){
                    listAutor.add(0, autor);
                }else{
                    listAutor.add(autor);
                }
            }  
        }catch (SQLException e){
            System.out.println("Error en la consulta: "+ e.getMessage());   
        } finally { 
            try { 
                if  (cn != null){ 
                     cn.close();
                     pst.close();
                }
            }catch (Exception e){
                System.out.println("error: "+e);
            }
        }
        return listAutor;
    }
    
}
