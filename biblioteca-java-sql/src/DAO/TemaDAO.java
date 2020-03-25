/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Tema;
/**
 *
 * @author Home
 */
public class TemaDAO {
    
    public static String registrarTema(Tema autor){
        String resul = null, lats=null;
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
       //sirve para hacer llamado a la base
        PreparedStatement pst = null; 
        String sql = "INSERT INTO tema (id_tema, nom_tema ) VALUES (?,?)";
        
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1,autor.getId_tema());
            pst.setString(2, autor.getNom_tema());
           
            pst.execute();
            resul = "Tema registrado con éxito";
        }catch (SQLException e){
            resul = "Error, No pudo registrar el Tema: " + e.getMessage();
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
    
    public static Tema buscarAutor(Long clave){
        Tema tema= new Tema();
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
        PreparedStatement pst = null; 
        String sql = "SELECT * FROM tema WHERE id_tema = ?" ;
        try{
            pst = cn.prepareStatement(sql);
            pst.setLong(1, clave);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                tema.setId_tema(Long.valueOf(rs.getString(1)));
                tema.setNom_tema(rs.getString(2));
            }
            tema.setResultado( "Busqueda Exitosa");
        }catch (SQLException e){
            tema.setResultado("Error en la consulta: " + e.getMessage());
        }finally{ 
            try{
            if(cn != null){
                cn.close();
                pst.close();
            }
            }catch (Exception e) {
                 tema.setResultado( "Error: "+e);
            }
            
        }return tema;
    }
    
    public static ArrayList<Tema> getListTema() {
        ArrayList<Tema> listTema = new ArrayList<Tema>();
        ConexionBD cc = new ConexionBD(); 
        Connection cn = cc.getConnection();
        PreparedStatement pst = null; 
        Tema tema = null;
        String sql = "SELECT *FROM tema;";
        
        try{
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                tema = new Tema();
                tema.setId_tema(Long.valueOf(rs.getString(1)));
                tema.setNom_tema(rs.getString(2));
                if(listTema.isEmpty()){
                    listTema.add(0, tema);
                }else{
                    listTema.add(tema);
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
        return listTema;
    }
    
    
    
}
