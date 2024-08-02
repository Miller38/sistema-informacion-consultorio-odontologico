package vista;

// Importa la clase Connection de java.sql para manejar la conexión con la base de datos
import java.sql.Connection;
// Importa la clase Conexion de un paquete personalizado 'conexion' para gestionar la conexión con la base de datos
import conexion.Conexion;
// Importa la clase Ctrl_Usuario de un paquete personalizado 'controlador' para manejar las operaciones de usuario
import controlador.Ctrl_Usuario;
import pdf.GeneradorPDF;
// Importa las clases MouseAdapter y MouseEvent de java.awt.event para manejar eventos de mouse
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// Importa la clase Image de java.awt para manejar imágenes
import java.awt.Image;
// Importa la clase Toolkit de java.awt para obtener las herramientas del sistema
import java.awt.Toolkit;
// Importa la clase RoundRectangle2D de java.awt.geom para manejar formas geométricas
import java.awt.geom.RoundRectangle2D;
// Importa la clase WindowConstants de javax.swing para manejar constantes de ventana
import javax.swing.WindowConstants;
// Importa la clase DefaultTableModel de javax.swing.table para manejar modelos de tablas
import javax.swing.table.DefaultTableModel;
// Importa la clase SQLException de java.sql para manejar excepciones SQL
import java.sql.SQLException;
// Importa la clase ResultSet de java.sql para manejar los resultados de las consultas SQL
import java.sql.ResultSet;
// Importa la clase Statement de java.sql para ejecutar sentencias SQL
import java.sql.Statement;
// Importa la clase PreparedStatement de java.sql para ejecutar consultas SQL precompiladas
import java.sql.PreparedStatement;
// Importa la clase Icon de javax.swing para manejar iconos
import javax.swing.Icon;
// Importa la clase ImageIcon de javax.swing para manejar imágenes como iconos
import javax.swing.ImageIcon;
// Importa la clase JOptionPane de javax.swing para mostrar cuadros de diálogo
import javax.swing.JOptionPane;
// Importa la clase JTable de javax.swing para manejar tablas
import javax.swing.JTable;
// Importa la clase Usuario de un paquete personalizado 'modelo' para representar la entidad usuario
import modelo.Usuario;



/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class FrmGestionarUsuarios extends javax.swing.JFrame {

    // Declara una variable de instancia privada de tipo int para almacenar el ID del usuario
    private int idUsuario;

    public FrmGestionarUsuarios() {

        // Metodo para poner transparente el jframe
        //setUndecorated(true);

        initComponents();
        // Establece el tamaño de la ventana en píxeles
        this.setSize(770, 575);
        // Establece el título de la ventana
        this.setTitle("Gestionar Usuarios");
        this.setLocation(300, 150); // Nueva posición: 500 píxeles desde la izquierda y 200 píxeles desde la parte superior

        // Evita que el programa se cierre al cerrar esta ventana 
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // llamamos el metodo
        this.CargarTablaUsuarios();

        // Redondear las esquinas del jframe 
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        // ----------------------------------------Colocar imagen de fondo----------------------------------------------// 
        // Crea un objeto ImageIcon con la imagen ubicada en el directorio especificado
        ImageIcon wallpaper = new ImageIcon("src/img/bg-gradiente.jpg");
// Escala la imagen a las dimensiones actuales del jLabel_Wallpaper
// Obtiene la imagen del ImageIcon
        Icon icono = new ImageIcon(
                wallpaper.getImage().getScaledInstance( // Escala la imagen
                        jLabel_Wallpaper.getWidth(), // Ancho actual del jLabel_Wallpaper
                        jLabel_Wallpaper.getHeight(), // Alto actual del jLabel_Wallpaper
                        Image.SCALE_DEFAULT // Algoritmo de escalado (por defecto)
                )
        );
// Establece el nuevo icono (imagen escalada) en el jLabel_Wallpaper
        jLabel_Wallpaper.setIcon(icono);
// Vuelve a pintar el contenedor para asegurarse de que la imagen se renderice correctamente
        this.repaint();

        // -------------------------------------Colocar imagen de fondo cabecera----------------------------------------// 
        // Crea un objeto ImageIcon con la imagen ubicada en el directorio especificado
        ImageIcon wallpaper_cabecera = new ImageIcon("src/img/fondo3.jpg");
// Escala la imagen a las dimensiones actuales del jLabel_Wallpaper
// Obtiene la imagen del ImageIcon
        Icon icono_ = new ImageIcon(
                wallpaper_cabecera.getImage().getScaledInstance( // Escala la imagen
                        jLabel_cabecera.getWidth(), // Ancho actual del jLabel_Wallpaper
                        jLabel_cabecera.getHeight(), // Alto actual del jLabel_Wallpaper
                        Image.SCALE_DEFAULT // Algoritmo de escalado (por defecto)
                )
        );
// Establece el nuevo icono (imagen escalada) en el jLabel_Wallpaper
        jLabel_cabecera.setIcon(icono_);
// Vuelve a pintar el contenedor para asegurarse de que la imagen se renderice correctamente
        this.repaint();

    }

    //------------------------------------ Cambiamos el icono del Jframe ------------------------------------------//
    @Override
    public Image getIconImage() {
        // Utiliza Toolkit para obtener la imagen desde el recurso especificado
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                // Ruta del recurso de la imagen dentro del classpath
                ClassLoader.getSystemResource("img/favicon_1.png")
        );
        // Devuelve la imagen obtenida
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Btn_actualizar = new javax.swing.JButton();
        Btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Btn_reporte_pdf = new javax.swing.JButton();
        Btn_regresar = new javax.swing.JButton();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Gestionar Usuarios");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 180, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_usuarios.setToolTipText("Informacion usuarios registrados ");
        jScrollPane1.setViewportView(jTable_usuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 740, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_actualizar.setBackground(new java.awt.Color(153, 255, 153));
        Btn_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        Btn_actualizar.setText("Actualizar");
        Btn_actualizar.setToolTipText("Click para actualizar la informacion de un usuario");
        Btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_actualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 140, 40));

        Btn_eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel.png"))); // NOI18N
        Btn_eliminar.setText("Eliminar");
        Btn_eliminar.setToolTipText("Click para eliminar un usuario");
        Btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 60, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(51, 51, 51));
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(51, 51, 51));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefono");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(51, 51, 51));
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 160, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(51, 51, 51));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        txt_email.setBackground(new java.awt.Color(255, 255, 255));
        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 160, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(51, 51, 51));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 70, 20));

        Btn_reporte_pdf.setBackground(new java.awt.Color(255, 255, 255));
        Btn_reporte_pdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_reporte_pdf.setText("Reporte PDF");
        Btn_reporte_pdf.setToolTipText("Click para imprimir un reporte PDF");
        Btn_reporte_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_reporte_pdfActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_reporte_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, 40));

        Btn_regresar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        Btn_regresar.setText("Regresar");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 740, 160));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void Btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_actualizarActionPerformed

        // Verifica si todos los campos de texto están vacíos
        if (txt_usuario.getText().isEmpty() && txt_password.getText().isEmpty() && txt_nombre.getText().isEmpty()
                && txt_apellido.getText().isEmpty() && txt_telefono.getText().isEmpty() && txt_email.getText().isEmpty()) {

            // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
              JOptionPane.showMessageDialog(this, "Debes completar todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            // Crea una instancia de la clase Usuario
            Usuario usuario = new Usuario();
            // Crea una instancia de la clase Ctrl_Usuario para controlar las operaciones del usuario
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

            // Asigna los valores de los campos de texto a los atributos del objeto usuario, eliminando los espacios en blanco
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());
            usuario.setNombre(txt_nombre.getText().trim());
            usuario.setApellido(txt_apellido.getText().trim());
            usuario.setTelefono(txt_telefono.getText().trim());
            usuario.setEmail(txt_email.getText().trim());

            if (controlUsuario.actualizar(usuario, idUsuario)) {
                // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
                  JOptionPane.showMessageDialog(this, "Datos del usuario actualizados.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                // Llama al método CargarTablaUsuarios para cargar los datos de los usuarios en la tabla
                this.CargarTablaUsuarios();
                // Llama al método Limpiar para limpiar los campos de entrada de datos en la interfaz
                this.Limpiar();

            } else {
                // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
                  JOptionPane.showMessageDialog(this, "Error al actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Btn_actualizarActionPerformed

    private void Btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_eliminarActionPerformed

        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

if (idUsuario == 0) {
    // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
    JOptionPane.showMessageDialog(this, "Debes seleccionar un usuario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
} else {
    // Muestra un cuadro de diálogo de confirmación de JOptionPane
    int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar este usuario?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Si el usuario confirma la eliminación
        boolean eliminado = controlUsuario.eliminar(idUsuario);
        
        if (eliminado) {
            // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
            JOptionPane.showMessageDialog(this, "Usuario eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            // Llama al método CargarTablaUsuarios para actualizar la información de los usuarios en la tabla
            this.CargarTablaUsuarios();
            // Llama al método Limpiar para limpiar los campos de entrada de datos en la interfaz
            this.Limpiar();
        } else {
            // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
            JOptionPane.showMessageDialog(this, "Error al eliminar usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Si el usuario elige "No", no se realiza ninguna acción adicional
        JOptionPane.showMessageDialog(this, "Eliminación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
    }
}

    }//GEN-LAST:event_Btn_eliminarActionPerformed

    private void Btn_reporte_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_reporte_pdfActionPerformed
        GeneradorPDF generadorPdf = new GeneradorPDF();
        generadorPdf.generarReporteUsuarios();
    }//GEN-LAST:event_Btn_reporte_pdfActionPerformed

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
         // Hace que la ventana actual se vuelva invisible.
        this.setVisible(false);
        // Libera los recursos asociados con la ventana actual y la cierra.
        this.dispose();
        
        FrmNuevoUsuario frmNuevoUsuario = new FrmNuevoUsuario();
        frmNuevoUsuario.setVisible(true);
        
    }//GEN-LAST:event_Btn_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_actualizar;
    private javax.swing.JButton Btn_eliminar;
    private javax.swing.JButton Btn_regresar;
    private javax.swing.JButton Btn_reporte_pdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_usuarios;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

// -------------------------------- Metodo para mostrar todos los usuarios -----------------------------------------// 
// Método para cargar la tabla de usuarios
    private void CargarTablaUsuarios() {
        // Establece la conexión a la base de datos
        Connection con = Conexion.conectar();
        // Crea un modelo de tabla por defecto
        DefaultTableModel model = new DefaultTableModel();
        // Consulta SQL para obtener todos los usuarios
        String sql = "SELECT idUsuario, usuario, password, nombre, apellido, telefono, email, registrado_por FROM usuarios";
        Statement st;

        try {
            // Crea una declaración para ejecutar la consulta SQL
            st = con.createStatement();
            // Ejecuta la consulta SQL y obtiene los resultados
            ResultSet rs = st.executeQuery(sql);
            // Inicializa la tabla de usuarios con el modelo creado
            FrmGestionarUsuarios.jTable_usuarios = new JTable(model);
            // Asocia la tabla al panel de desplazamiento
            FrmGestionarUsuarios.jScrollPane1.setViewportView(FrmGestionarUsuarios.jTable_usuarios);

            // Agrega columnas al modelo de la tabla
            // Agrega una columna con el encabezado "idUsuario" al modelo de la tabla
            model.addColumn("idUsuario");
            // Agrega una columna con el encabezado "usuario" al modelo de la tabla
            model.addColumn("usuario");
             model.addColumn("password");
            // Agrega una columna con el encabezado "nombre" al modelo de la tabla
            model.addColumn("nombre");
            // Agrega una columna con el encabezado "apellido" al modelo de la tabla
            model.addColumn("apellido");
            // Agrega una columna con el encabezado "telefono" al modelo de la tabla
            model.addColumn("telefono");
            // Agrega una columna con el encabezado "email" al modelo de la tabla
            model.addColumn("email");
            // Agrega una columna con el encabezado "password" al modelo de la tabla           
           
            // Recorre los resultados de la consulta
            while (rs.next()) {
                // Crea un array de objetos para almacenar una fila
                Object fila[] = new Object[7];
                // Asigna los valores de cada columna a la fila
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                // Agrega la fila al modelo de la tabla
                model.addRow(fila);
            }
            // Cierra la conexión a la base de datos
            con.close();
        } catch (SQLException e) {
            // Maneja cualquier error que ocurra durante la consulta y muestra un mensaje de error
            System.out.println("Error al llenar la tabla usuarios " + e.getMessage());
        }

        // -------------------------------- Metodo para seleccionar los usuarios -----------------------------------------// 
        // Agrega un listener de eventos de ratón a la tabla de usuarios
        jTable_usuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtiene la fila en la que se hizo clic
                int fila_point = jTable_usuarios.rowAtPoint(e.getPoint());
                // Columna específica (3) que contiene el ID del usuario
                int columna_point = 0;

                // Verifica que se haya hecho clic en una fila válida
                if (fila_point > -1) {
                    // Obtiene el ID del usuario de la fila seleccionada    
                    idUsuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(idUsuario);

                }
            }
        });
    }

    // -------------------------------- Metodo para enviar datos seleccionados -----------------------------------------// 
    // Método para enviar los datos del usuario seleccionado
    private void EnviarDatosUsuarioSeleccionado(int idUsuario) {
        try {
            // Establece la conexión con la base de datos
            Connection con = Conexion.conectar();
            // Prepara la consulta SQL para obtener los datos del usuario con el id especificado
            PreparedStatement pst = con.prepareStatement(
                    "SELECT idUsuario, usuario, nombre, apellido, telefono, email, password FROM usuarios WHERE idUsuario  = '" + idUsuario + "'");
            // Ejecuta la consulta SQL
            ResultSet rs = pst.executeQuery();
            // Si hay un resultado, obtiene los datos del usuario y los asigna a los campos correspondientes en la interfaz
            if (rs.next()) {
                // Asigna el valor del campo "usuario" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_usuario.setText(rs.getString("usuario"));
                // Asigna el valor del campo "nombre" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_nombre.setText(rs.getString("nombre"));
                // Asigna el valor del campo "apellido" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_apellido.setText(rs.getString("apellido"));
                // Asigna el valor del campo "telefono" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_telefono.setText(rs.getString("telefono"));
                // Asigna el valor del campo "email" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_email.setText(rs.getString("email"));
                // Asigna el valor del campo "password" del resultado de la consulta al campo de texto correspondiente en la interfaz
                txt_password.setText(rs.getString("password"));

            }
            // Cierra la conexión con la base de datos
            con.close();
        } catch (SQLException e) {
            // Imprime un mensaje de error en caso de una excepción SQL
            System.out.println("Error al seleccionar usuario");
        }
    }

    // -----------------------------------  Metodo para limpiar los campos  ----------------------------------------//
    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_usuario.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_telefono.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }
    
     
}
