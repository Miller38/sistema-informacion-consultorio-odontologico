
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Miller
 */
public class Conexion {
    
    //Conexion local
    public static Connection conectar(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:33065/bd_consultorio_mjv", "root", "");
            return cn;
            
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
    
}
