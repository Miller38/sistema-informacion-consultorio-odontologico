
package conexion;   // Define el paquete en el que se encuentra la clase

import java.sql.Connection;   // Importa la clase Connection del paquete java.sql
import java.sql.SQLException;   // Importa la clase SQLException del paquete java.sql
import java.sql.DriverManager;  // Importa la clase DriverManager del paquete java.sql

/**
 * Clase para gestionar la conexión a la base de datos.
 * @author Miller
 */
public class Conexion {
    
     // Método para establecer una conexión a la base de datos local
    public static Connection conectar(){
        
        try {
            // Intenta establecer una conexión a la base de datos local MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:33065/consultorio_odontologico", "root", "");
            return cn;   // Retorna la conexión establecida
            
        } catch (SQLException e) {  // Captura y manejo de excepciones SQL
            System.out.println("Error en la conexion local " + e);   // Muestra un mensaje de error en caso de fallo
        }
        return null;   // Retorna null si la conexión no pudo establecerse
    }
    
}
