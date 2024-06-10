
package modelo; // Define el paquete en el que se encuentra esta clase

import java.util.Date; // Importa la clase Date del paquete java.util para manejar fechas

/**
 * 
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 */
public class Paciente {
    // Declaración de atributos privados
    private int idPaciente;        // Identificador único del paciente
    private int idUsuario;         // Identificador del usuario asociado al paciente
    private int idAuxiliar;        // Identificador del auxiliar asociado al paciente
    private int idOdontologo;      // Identificador del odontólogo asociado al paciente
    private String nombre;         // Nombre del paciente
    private String apellido;       // Apellido del paciente
    private String identificacion; // Identificación del paciente
    private Date fechaNacimiento;  // Fecha de nacimiento del paciente
    private String direccion;      // Dirección del paciente
    private String telefono;       // Teléfono del paciente
    private String ciudad;         // Ciudad del paciente
    private String email;          // Correo electrónico del paciente

    // Constructor por defecto
    public Paciente() {
        // Inicializa los atributos con valores por defecto
    }

    // Constructor con todos los campos
    public Paciente(int idUsuario, int idAuxiliar, int idOdontologo, String nombre, String apellido, String identificacion, Date fechaNacimiento, String direccion, String telefono, String ciudad, String email) {
        this.idUsuario = idUsuario;                // Inicializa idUsuario con el valor proporcionado
        this.idAuxiliar = idAuxiliar;              // Inicializa idAuxiliar con el valor proporcionado
        this.idOdontologo = idOdontologo;          // Inicializa idOdontologo con el valor proporcionado
        this.nombre = nombre;                      // Inicializa nombre con el valor proporcionado
        this.apellido = apellido;                  // Inicializa apellido con el valor proporcionado
        this.identificacion = identificacion;      // Inicializa identificacion con el valor proporcionado
        this.fechaNacimiento = fechaNacimiento;    // Inicializa fechaNacimiento con el valor proporcionado
        this.direccion = direccion;                // Inicializa direccion con el valor proporcionado
        this.telefono = telefono;                  // Inicializa telefono con el valor proporcionado
        this.ciudad = ciudad;                      // Inicializa ciudad con el valor proporcionado
        this.email = email;                        // Inicializa email con el valor proporcionado
    }

    // Métodos getters y setters para acceder y modificar los atributos privados

    // Obtiene el identificador único del paciente
    public int getIdPaciente() {
        return idPaciente;
    }

    // Establece el identificador único del paciente
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    // Obtiene el identificador del usuario asociado al paciente
    public int getIdUsuario() {
        return idUsuario;
    }

    // Establece el identificador del usuario asociado al paciente
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Obtiene el identificador del auxiliar asociado al paciente
    public int getIdAuxiliar() {
        return idAuxiliar;
    }

    // Establece el identificador del auxiliar asociado al paciente
    public void setIdAuxiliar(int idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    // Obtiene el identificador del odontólogo asociado al paciente
    public int getIdOdontologo() {
        return idOdontologo;
    }

    // Establece el identificador del odontólogo asociado al paciente
    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

    // Obtiene el nombre del paciente
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del paciente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtiene el apellido del paciente
    public String getApellido() {
        return apellido;
    }

    // Establece el apellido del paciente
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Obtiene la identificación del paciente
    public String getIdentificacion() {
        return identificacion;
    }

    // Establece la identificación del paciente
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    // Obtiene la fecha de nacimiento del paciente
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Establece la fecha de nacimiento del paciente
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Obtiene la dirección del paciente
    public String getDireccion() {
        return direccion;
    }

    // Establece la dirección del paciente
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Obtiene el teléfono del paciente
    public String getTelefono() {
        return telefono;
    }

    // Establece el teléfono del paciente
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Obtiene la ciudad del paciente
    public String getCiudad() {
        return ciudad;
    }

    // Establece la ciudad del paciente
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Obtiene el correo electrónico del paciente
    public String getEmail() {
        return email;
    }

    // Establece el correo electrónico del paciente
    public void setEmail(String email) {
        this.email = email;
    }
}
