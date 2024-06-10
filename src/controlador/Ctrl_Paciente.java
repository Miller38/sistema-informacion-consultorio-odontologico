
package controlador; // Define el paquete controlador

import java.sql.*; // Importa clases necesarias de java.sql para manejo de bases de datos
import conexion.Conexion;  // Importa la clase Conexion del paquete conexion
import modelo.Paciente;   // Importa la clase Paciente del paquete modelo
import java.sql.SQLException; // Importa la clase SQLException de java.sql para manejar excepciones SQL
import java.sql.PreparedStatement; // Importa la clase PreparedStatement de java.sql para preparar sentencias SQL

/**
 * 
 * @author Milliany Tech
 * @version 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 */
public class Ctrl_Paciente {
    
    /**
     * ------------------------------------------------------------------------------------------------------------------------
     *                                 Método para guardar un nuevo paciente en la base de datos.
     * ------------------------------------------------------------------------------------------------------------------------
     */
    public boolean guardar(Paciente objeto) {
        // Inicializa la variable de respuesta como false
        boolean respuesta = false;
        // Establece la conexión a la base de datos
        Connection cn = Conexion.conectar();

        try {
            // Prepara la sentencia SQL para insertar un nuevo paciente
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO paciente VALUES (?,?,?,?,?,?)");
            // Asigna valores a los parámetros de la consulta
            consulta.setInt(1, 0); // El primer parámetro es el ID, que es autogenerado (asumido)
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getIdentificacion());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getTelefono());

            // Ejecuta la actualización y verifica si se insertó algún registro
            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Actualiza la respuesta a true si la inserción fue exitosa
            }
            // Cierra la conexión a la base de datos
            cn.close();

        } catch (SQLException e) {
            // Maneja cualquier excepción SQL y muestra un mensaje de error
            System.out.println("Error al guardar el paciente" + e.getMessage());
        }
        // Retorna la respuesta indicando si la operación fue exitosa o no
        return respuesta;
    }
    /**
     * ------------------------------------------------------------------------------------------------------------------------
     *                                Método para consultar si un paciente ya existe en la base de datos.
     * ------------------------------------------------------------------------------------------------------------------------
     */
    public boolean existePaciente(String identificacion) {
        // Inicializa la variable de respuesta como false
        boolean respuesta = false;
        // Define la consulta SQL para verificar la existencia del paciente por su identificación
        String sql = "SELECT identificacion FROM pacientes WHERE identificacion = '" + identificacion + "';";
        Statement st;

        try {
            // Establece la conexión a la base de datos
            Connection cn = Conexion.conectar();
            // Crea una declaración para ejecutar la consulta SQL
            st = cn.createStatement();
            // Ejecuta la consulta y obtiene el conjunto de resultados
            ResultSet rs = st.executeQuery(sql);

            // Recorre los resultados y actualiza la respuesta si se encuentra un registro
            while (rs.next()) {
                respuesta = true;
            }
            // Cierra la conexión a la base de datos
            cn.close();
        } catch (SQLException e) {
            // Maneja cualquier excepción SQL y muestra un mensaje de error
            System.out.println("Error al consultar el paciente" + e.getMessage());
        }
        // Retorna la respuesta indicando si el paciente existe o no
        return respuesta;
    }
}
