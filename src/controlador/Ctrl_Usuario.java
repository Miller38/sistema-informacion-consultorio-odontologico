package controlador;

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

    // Método para iniciar sesión.
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false; // Inicializa una variable booleana para indicar el resultado del inicio de sesión.

        // Validación de entrada del usuario
        if (!isValidUsername(objeto.getUsuario()) || !isValidPassword(objeto.getPassword())) {
            // Si el nombre de usuario o la contraseña no son válidos, muestra un mensaje y retorna false.
            JOptionPane.showMessageDialog(null, "Usuario o contraseña no válidos.");
            return false;
        }

        // Conexión a la base de datos
        String sql = "SELECT username, password FROM usuarios WHERE username = ? AND password = ?";
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
    private boolean isValidUsername(String username) {
        // Expresión regular: el nombre de usuario debe tener entre 4 y 20 caracteres alfanuméricos.
        String regex = "^[a-zA-Z0-9]{4,20}$";
        return Pattern.matches(regex, username); // Retorna true si el nombre de usuario cumple con la expresión regular.
    }

    // Método para validar la contraseña
    private boolean isValidPassword(String password) {
        // Expresión regular: la contraseña debe tener entre 8 y 20 caracteres
        // y contener al menos una letra y un número.
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,20}$";
        return Pattern.matches(regex, password); // Retorna true si la contraseña cumple con la expresión regular.
    }
}
