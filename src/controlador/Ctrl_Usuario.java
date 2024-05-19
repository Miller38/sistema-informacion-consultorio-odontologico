
package controlador;

import modelo.Usuario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Miller
 */
public class Ctrl_Usuario {
    
    // Metodopara iniciar sesion.
    public boolean loginUser(Usuario objeto){
        
        // Se inicializa una variable booleana para indicar el resultado del inicio de sesión.
        boolean respuesta = false;
        
        // Se establece una conexión a la base de datos.
        Connection cn =Conexion.conectar();
        
        // Se crea la consulta SQL para buscar el usuario y la contraseña en la base de datos.
        String sql = "select username, password from usuarios where username = '" +  objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'" ;
       
         // Se declara un objeto Statement para ejecutar la consulta.
        Statement st;
        
        try {
             // Se crea un Statement a partir de la conexión.
            st = cn.createStatement();
             // Se ejecuta la consulta SQL.
            ResultSet rs = st.executeQuery(sql);
            
            // Se itera sobre los resultados para verificar si existe al menos una coincidencia.
            while (rs.next()){                
                respuesta =true;
            }
            
        } catch (SQLException e) {
            // Se maneja cualquier excepción SQLException que pueda ocurrir.
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        
        // Se devuelve el resultado del inicio de sesión.
        return respuesta;
    }
    
}

