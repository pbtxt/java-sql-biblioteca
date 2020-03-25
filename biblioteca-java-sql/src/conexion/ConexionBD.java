package conexion; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {
    
    private Connection connection = null;
     /**
     * constructor  con try y catch
     */
    public ConexionBD() {
        String url = "jdbc:postgresql://localhost:5432/Biblioteca";
        String password = "123";
        try {
            Class.forName("org.postgresql.Driver"); 
            connection = DriverManager.getConnection(url, "postgres", password);     
        }catch (Exception e){
            System.out.println("Problemas de conexion "+e.getMessage());
        }
    }
    /**
     * metodo para obtener la conexión
     */
    public Connection getConnection(){
        return connection;
    }
        /**
     * metodo para desconectarnos de la base de datos
     */
    public void desconectar(){
        connection = null;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    public void Conexion(){ 
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "postgres2019";
        
        if(connection != null) {
            return;
        }
        try {
            Class.forName("org.postgresql.Driver"); 
            connection = DriverManager.getConnection(url, "postgres", password);
            if(connection != null) {
                System.out.println("Conectando a Base de Datos...");
            }   
        } catch (Exception e) {
            System.out.println("Problemas de conexion "+e.getMessage());
    }
    }
}
