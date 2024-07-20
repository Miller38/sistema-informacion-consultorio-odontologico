package modelo;

/**
 * 
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 */
public class Usuario {
    
    // Atributos
    private int idUsuario; // Identificador único del usuario
    private String nombre; // Nombre del usuario
    private String apellido; // Apellido del usuario
    private String usuario; // Nombre de usuario para iniciar sesión
    private String password; // Contraseña del usuario
    private String telefono; // Número de teléfono del usuario
    private String email; // Email del usuario
    private byte[] imagen; // Imagen del usuario
    private String registrado_por; // Usuario que registró al usuario
    private int estado; // Estado del usuario (activo, inactivo, etc.)
    
    // Constructor
    public Usuario() {
        // Inicialización de atributos por defecto
        this.idUsuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.email = "";
        this.imagen = null;
        this.registrado_por = "";
        this.estado = 0;
    }
    
    // Métodos getter y setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getRegistrado_por() {
        return registrado_por;
    }

    public void setRegistrado_por(String registrado_por) {
        this.registrado_por = registrado_por;
    }  

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
