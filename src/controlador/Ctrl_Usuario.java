package controlador;

import com.mysql.jdbc.Statement;
import modelo.Usuario; // Importa la clase Usuario del paquete modelo
import conexion.Conexion; // Importa la clase Conexion del paquete conexion
import java.sql.Connection; // Importa la clase Connection de java.sql
import java.sql.PreparedStatement; // Importa la clase PreparedStatement de java.sql
import java.sql.SQLException; // Importa la clase SQLException de java.sql
import javax.swing.JOptionPane; // Importa la clase JOptionPane de javax.swing
import java.sql.ResultSet; // Importa la clase ResultSet de java.sql
import java.util.regex.Pattern; // Importa la clase Pattern de java.util.regex
import java.util.logging.Level; // Importa la clase Level de java.util.logging
import java.util.logging.Logger; // Importa la clase Logger de java.util.logging

/**
 *
 * @author Miller
 */
public class Ctrl_Usuario {
 
    /*
    * ------------------------------------------------------------------------------------------------------------------------
    *                                                     Método para guardar un nuevo usuario.
    * ------------------------------------------------------------------------------------------------------------------------
   */
    public boolean guardar(Usuario objeto) {
    // Variable para almacenar la respuesta si el usuario se ha guardado con éxito o no.
    boolean respuesta = false;

    // Obtiene una conexión a la base de datos.
    Connection cn = Conexion.conectar();

    try {
        // Verifica si el usuario ya existe en la base de datos.
        if (!existeUsuario(objeto.getUsuario())) {
            // Prepara la consulta SQL para insertar un nuevo usuario en la tabla 'usuarios'.
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?)");
        
            // Establece los valores de los parámetros en la consulta SQL.
            // El primer parámetro es un ID auto-generado, por lo que se establece como 0.
            consulta.setInt(1, 0); 
            // El segundo parámetro es el nombre de usuario.
            consulta.setString(2, objeto.getUsuario());
            // El tercer parámetro es la contraseña del usuario.
            consulta.setString(3, objeto.getPassword());

            // Ejecuta la consulta y verifica si se ha insertado al menos una fila.
            if (consulta.executeUpdate() > 0) {
                // Si se ha insertado una fila, la respuesta es true.
                respuesta = true;
            }
        } else {
            // Si el usuario ya existe, imprime un mensaje.
            System.out.println("El usuario ya existe en la base de datos.");
        }
    } catch (SQLException e) {
        // Manejo de excepciones: imprime el error en la consola.
        System.out.println("Error al guardar el usuario: " + e);
    } finally {
        try {
            // Cierra la conexión a la base de datos si no es nula.
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    // Retorna la respuesta: true si el usuario se ha guardado con éxito, false si no.
    return respuesta;
}

/*
* ------------------------------------------------------------------------------------------------------------------------
* Método para consultar si el usuario ya existe en la BD .
* ------------------------------------------------------------------------------------------------------------------------
*/
public boolean existeUsuario(String usuario) {
    // Variable para almacenar la respuesta si el usuario existe o no.
    boolean respuesta = false;

    // Consulta SQL para verificar si el usuario existe en la tabla 'usuarios'.
    String sql = "SELECT usuario FROM usuarios WHERE usuario = ?;";

    // Uso de try-with-resources para asegurar que la conexión y el PreparedStatement se cierren automáticamente.
    try (Connection cn = Conexion.conectar();
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

        // Validación de entrada del usuario
        if (!isValidUsername(objeto.getUsuario()) || !isValidPassword(objeto.getPassword())) {
            // Si el nombre de usuario o la contraseña no son válidos, muestra un mensaje y retorna false.
            JOptionPane.showMessageDialog(null, "Usuario o contraseña no válidos.");
            return false;
        }

        // Conexión a la base de datos
        String sql = "SELECT usuario, password FROM usuarios WHERE usuario = ? AND password = ?";
        try (Connection cn = Conexion.conectar(); // Conecta a la base de datos y abre un Connection.
             PreparedStatement pst = cn.prepareStatement(sql)) { // Prepara la sentencia SQL para evitar inyección SQL.
            pst.setString(1, objeto.getUsuario()); // Establece el primer parámetro (nombre de usuario).
            pst.setString(2, objeto.getPassword()); // Establece el segundo parámetro (contraseña).
            try (ResultSet rs = pst.executeQuery()) { // Ejecuta la consulta y obtiene el ResultSet.
                if (rs.next()) { // Si hay al menos un resultado, significa que las credenciales son correctas.
                    respuesta = true; // Establece la respuesta como true.
                }
            }
        } catch (SQLException e) {
            // Si ocurre una SQLException, se registra el error y se muestra un mensaje de error.
            Logger.getLogger(Ctrl_Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión. Por favor, inténtelo de nuevo.");
        }
        return respuesta; // Retorna el resultado del inicio de sesión.
    }

    // Método para validar el nombre de usuario
    private boolean isValidUsername(String usuario) {
        // Expresión regular: el nombre de usuario debe tener entre 4 y 20 caracteres alfanuméricos.
        String regex = "^[a-zA-Z0-9]{4,20}$";
        return Pattern.matches(regex, usuario); // Retorna true si el nombre de usuario cumple con la expresión regular.
    }

    // Método para validar la contraseña
    private boolean isValidPassword(String password) {
        // Expresión regular: la contraseña debe tener entre 8 y 20 caracteres
        // y contener al menos una letra y un número.
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,20}$";
        return Pattern.matches(regex, password); // Retorna true si la contraseña cumple con la expresión regular.
    }
}
