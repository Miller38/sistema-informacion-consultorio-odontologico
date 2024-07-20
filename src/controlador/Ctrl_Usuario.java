package controlador;

import pdf.GeneradorPDF;
import modelo.Usuario; // Importa la clase Usuario del paquete modelo
import conexion.Conexion; // Importa la clase Conexion del paquete conexion
import java.sql.Connection; // Importa la clase Connection de java.sql
import java.sql.PreparedStatement; // Importa la clase PreparedStatement de java.sql
import java.sql.SQLException; // Importa la clase SQLException de java.sql
import javax.swing.JOptionPane; // Importa la clase JOptionPane de javax.swing
import java.sql.ResultSet; // Importa la clase ResultSet de java.sql
import java.util.logging.Level; // Importa la clase Level de java.util.logging
import java.util.logging.Logger; // Importa la clase Logger de java.util.logging
import servicios.Utilidades;


/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class Ctrl_Usuario {
    /*
   / * ------------------------------------------------------------------------------------------------------------------------
    *                                                     Método para guardar un nuevo usuario.
    * ------------------------------------------------------------------------------------------------------------------------
     */
     public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO usuarios "
                    + "(idUsuario, usuario, password, nombre, apellido, telefono, email, imagen, registrado_por) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)");

            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getUsuario());
            consulta.setString(3, objeto.getPassword());
            consulta.setString(4, objeto.getNombre());
            consulta.setString(5, objeto.getApellido());
            consulta.setString(6, objeto.getTelefono());
            consulta.setString(7, objeto.getEmail());
            consulta.setBytes(8, objeto.getImagen());
            consulta.setString(9, objeto.getRegistrado_por());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el usuario " + e);
        }
        return respuesta;
    }

    
/* ------------------------------------------------------------------------------------------------------------------------
*                                     Método para consultar si el usuario ya existe en la BD .
/* ------------------------------------------------------------------------------------------------------------------------
*/
    public boolean existeUsuario(String usuario) {
        // Variable para almacenar la respuesta si el usuario existe o no.
        boolean respuesta = false;

        // Consulta SQL para verificar si el usuario existe en la tabla 'usuarios'.
        String sql = "SELECT usuario FROM usuarios WHERE usuario = ?;";

        // Uso de try-with-resources para asegurar que la conexión y el PreparedStatement se cierren automáticamente.
        try (
                Connection cn = Conexion.conectar(); 
                PreparedStatement ps = cn.prepareStatement(sql)) {

            // Establece el valor del parámetro en la consulta SQL.
            ps.setString(1, usuario);

            // Ejecuta la consulta SQL y obtiene el resultado en un ResultSet.
            try (ResultSet rs = ps.executeQuery()) {
                // Si hay un resultado, significa que el usuario existe.
                if (rs.next()) {
                    respuesta = true;
                }
            }
        } catch (SQLException e) {
            // Manejo de excepciones: imprime el error en la consola.
            System.out.println("Error al consultar el usuario: " + e.getMessage());
        }
        // Retorna la respuesta: true si el usuario existe, false si no.
        return respuesta;
    }

    /*
    * ------------------------------------------------------------------------------------------------------------------------
    *                                                               Método para iniciar sesión.
    * ------------------------------------------------------------------------------------------------------------------------
     */
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false; // Inicializa una variable booleana para indicar el resultado del inicio de sesión.

        // Encripta la contraseña proporcionada por el usuario
    String passwordEncriptada = Utilidades.encriptarSHA3(objeto.getPassword());

        
        // Conexión a la base de datos
        String sql = "SELECT usuario, password FROM usuarios WHERE usuario = ? AND password = ?";
        try (
                Connection cn = Conexion.conectar(); // Conecta a la base de datos y abre un Connection.
                 PreparedStatement pst = cn.prepareStatement(sql)) { // Prepara la sentencia SQL para evitar inyección SQL.
          
            pst.setString(1, objeto.getUsuario()); // Establece el primer parámetro (nombre de usuario).
            pst.setString(2, passwordEncriptada); // Establece el segundo parámetro (contraseña).
            try (
                    ResultSet rs = pst.executeQuery()) { // Ejecuta la consulta y obtiene el ResultSet.
                if (rs.next()) { // Si hay al menos un resultado, significa que las credenciales son correctas.
                    respuesta = true; // Establece la respuesta como true.
                }
            }
        } catch (SQLException e) {
            // Si ocurre una SQLException, se registra el error y se muestra un mensaje de error.
            Logger.getLogger(Ctrl_Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"Error al iniciar sesión. Por favor, inténtelo de nuevo.");
        } 
        return respuesta; // Retorna el resultado del inicio de sesión.
    }  
    /*
    /*
 * ------------------------------------------------------------------------------------------------------------------------
 *                                                               Método para actualizar usuario.
 * ------------------------------------------------------------------------------------------------------------------------
     */
// Método para actualizar un usuario en la base de datos
    public boolean actualizar(Usuario objeto, int idUsuario) {
        // Inicializa la variable de respuesta como falsa
        boolean respuesta = false;
        // Establece la conexión con la base de datos
        Connection cn = Conexion.conectar();
        try {
            // Encripta la contraseña antes de actualizarla
        String passwordEncriptada = Utilidades.encriptarSHA3(objeto.getPassword());

            // Prepara la consulta SQL para actualizar los datos del usuario
            PreparedStatement consulta = cn.prepareStatement("UPDATE usuarios SET  usuario=? , password=?,  nombre=?, apellido=?, telefono=?, email=? WHERE idUsuario = '" + idUsuario + "'");
            // Establece los valores de los parámetros de la consulta SQL
            consulta.setString(1, objeto.getUsuario());
            consulta.setString(2, passwordEncriptada); // Contraseña encriptada
            //consulta.setString(2, objeto.getPassword());
            consulta.setString(3, objeto.getNombre());
            consulta.setString(4, objeto.getApellido());
            consulta.setString(5, objeto.getTelefono());
            consulta.setString(6, objeto.getEmail());

            // Ejecuta la consulta SQL de actualización
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            // Cierra la conexión con la base de datos
            cn.close();
        } catch (SQLException e) {
            // En caso de una excepción SQL, imprime un mensaje de error con la información de la excepción
            System.out.println("Error al actualizar el usuario: " + e);
        }
        // Devuelve la respuesta, que indica si la operación fue exitosa o no
        return respuesta;
    }

    /*
 * ------------------------------------------------------------------------------------------------------------------------
 *                                                               Método para eliminar usuario
 * ------------------------------------------------------------------------------------------------------------------------
     */
// Método para eliminar un usuario de la base de datos
    public boolean eliminar(int idUsuario) {
        // Inicializa la variable de respuesta como falsa
        boolean respuesta = false;
        // Establece la conexión con la base de datos
        Connection cn = Conexion.conectar();

        try {
            // Prepara la consulta SQL para eliminar el usuario
            PreparedStatement consulta = cn.prepareStatement(
                    "DELETE  FROM usuarios WHERE idUsuario = '" + idUsuario + "' ");
            // Ejecuta la consulta SQL de eliminación
            consulta.executeUpdate();

            // Si se realizó una eliminación exitosa, actualiza la respuesta a verdadera
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            // Cierra la conexión con la base de datos
            cn.close();
        } catch (SQLException e) {
            // En caso de una excepción SQL, imprime un mensaje de error con la información de la excepción
            System.out.println("Error al eliminar el usuario: " + e);
        }
        // Devuelve la respuesta, que indica si la operación fue exitosa o no
        return respuesta;
    }
    
     /*
 * ------------------------------------------------------------------------------------------------------------------------
 *                                                               Método para generar reportes PDF
 * ------------------------------------------------------------------------------------------------------------------------
     */
  public void generarReportePDF() {
        GeneradorPDF generador = new GeneradorPDF();
        generador.generarReporteUsuarios();
    }
}
