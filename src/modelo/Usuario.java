
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
    public String usuario; // Nombre de usuario para iniciar sesión
    private String password; // Contraseña del usuario
    private String telefono; // Número de teléfono del usuario
    private String email; // Email del usuario
    private String registrado_por; 
    private int estado; // Estado del usuario (activo, inactivo, etc.)
    

    
    // Constructor
    public Usuario(){

        // Inicialización de atributos por defecto
        this.idUsuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.email = "";
        this.registrado_por = "";
        this.estado = 0;
        
    }
    
    // setter and getter

    // Métodos para acceder y modificar el identificador único del usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

     // Métodos para acceder y modificar el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     // Métodos para acceder y modificar el apellido del usuario
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     // Métodos para acceder y modificar el nombre de usuario para iniciar sesión
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

     // Métodos para acceder y modificar la contraseña del usuario
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Métodos para acceder y modificar el número de teléfono del usuario
    public String getTelefono() {
        return telefono;
    }
    
    // Establece el número de teléfono del usuario
public void setTelefono(String telefono) {
    this.telefono = telefono;
}

// Devuelve el correo electrónico del usuario
public String getEmail() {
    return email;
}

// Establece el correo electrónico del usuario
public void setEmail(String email) {
    this.email = email;
}

// Devuelve el nombre del usuario que lo registró
public String getRegistrado_por() {
    return registrado_por;
}

// Establece el nombre del usuario que lo registró
public void setRegistrado_por(String registrado_por) {
    this.registrado_por = registrado_por;
}  
    

    // Métodos para acceder y modificar el estado del usuario
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
