
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
        
        boolean respuesta = false;
        
        Connection cn =Conexion.conectar();
        String sql = "select usuario, password from usuario where usuario = '" +  objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'" ;
        Statement st;
        
        try {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){                
                respuesta =true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        
        return respuesta;
    }
    
}
