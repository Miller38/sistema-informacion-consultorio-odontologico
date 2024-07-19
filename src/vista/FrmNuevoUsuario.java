package vista;

import servicios.TextPrompt;
import controlador.Ctrl_Usuario;
import modelo.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import servicios.Utilidades;

/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class FrmNuevoUsuario extends javax.swing.JFrame {

    private FileInputStream fis;
    private int longitudBytes;

    public FrmNuevoUsuario() {

        // Metodo para poner transparente el jframe
        //setUndecorated(true);
        initComponents();
        this.setSize(600, 530);
        this.setLocationRelativeTo(null);
        this.setTitle("Nuevo Usuario.");

        // placeholder
        TextPrompt nombrePrompt = new TextPrompt("         Ingrese aqui su nombre.", txt_nombre);
        TextPrompt usuarioPrompt = new TextPrompt("  Ingrese aqui su usuario.", txt_usuario);
        TextPrompt apellidoPrompt = new TextPrompt("         Ingrese aqui su apellido.", txt_apellido);
        TextPrompt telefonoPrompt = new TextPrompt("        Ingrese aqui su telefono.", txt_telefono);
        TextPrompt emailPrompt = new TextPrompt("         ingrese aqui su email.", txt_email);
        TextPrompt passPrompt = new TextPrompt(" ingrese aqui su password.", txt_password);
        TextPrompt registradoPrompt = new TextPrompt("         ingrese registrado por.", txt_registrado_por);
        TextPrompt tiponivelPrompt = new TextPrompt("         ingrese su tipo de nivel.", txt_tipo_nivel);

        txt_password.setVisible(true);
        txt_password_visible.setVisible(false);
        // Evita que el programa se cierre al cerrar esta ventana 
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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
                ClassLoader.getSystemResource("img/favicon.png")
        );
        // Devuelve la imagen obtenida
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_regresar = new javax.swing.JButton();
        Btn_gestionarUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        Btn_guardar = new javax.swing.JButton();
        jLabel_apellido = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        Jlabel_email = new javax.swing.JLabel();
        jLabel_password4 = new javax.swing.JLabel();
        jLabel_password5 = new javax.swing.JLabel();
        jLabel_password6 = new javax.swing.JLabel();
        txt_tipo_nivel = new javax.swing.JTextField();
        txt_registrado_por = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jCheckBox_ver_clave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel_foto = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        label_nombreusuario = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_regresar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        Btn_regresar.setText("regresar");
        Btn_regresar.setToolTipText("Click para regresar al Menu");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 140, -1));

        Btn_gestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        Btn_gestionarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_gestionarUsuarios.setText("Gestionar Usuarios");
        Btn_gestionarUsuarios.setToolTipText("Click para ver y gestionar los usuarios");
        Btn_gestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_gestionarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_gestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, -1));

        jLabel_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_username.setText("Usuario :");
        getContentPane().add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_password.setText("Password :");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 180, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 180, -1));

        Btn_guardar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anydo.png"))); // NOI18N
        Btn_guardar.setText("Guardar");
        Btn_guardar.setToolTipText("Click para guardar un nuevo usuario");
        Btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 140, -1));

        jLabel_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_apellido.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_apellido.setText("Apellido :");
        getContentPane().add(jLabel_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_telefono.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_telefono.setText("Telefono :");
        getContentPane().add(jLabel_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, -1));

        Jlabel_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jlabel_email.setForeground(new java.awt.Color(51, 51, 51));
        Jlabel_email.setText("Email :");
        getContentPane().add(Jlabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel_password4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_password4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_password4.setText("Tipo Nivel :");
        getContentPane().add(jLabel_password4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel_password5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_password5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_password5.setText("Registrado por :");
        getContentPane().add(jLabel_password5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel_password6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_password6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_password6.setText("Nombre :");
        getContentPane().add(jLabel_password6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txt_tipo_nivel.setBackground(new java.awt.Color(255, 255, 255));
        txt_tipo_nivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_tipo_nivel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tipo_nivel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_tipo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 230, -1));

        txt_registrado_por.setBackground(new java.awt.Color(255, 255, 255));
        txt_registrado_por.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_registrado_por.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registrado_por.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_registrado_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 230, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, -1));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 230, -1));

        txt_email.setBackground(new java.awt.Color(255, 255, 255));
        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, -1));

        jCheckBox_ver_clave.setToolTipText("Click para ver su password");
        jCheckBox_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ver_claveMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        txt_password_visible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password_visible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password_visible.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 180, -1));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        jLabel_foto.setToolTipText("Click para agregar una fotografia");
        jLabel_foto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fotoMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, 140));

        txt_ruta.setFocusable(false);
        txt_ruta.setOpaque(false);
        getContentPane().add(txt_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 180, -1));
        getContentPane().add(label_nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 280, 30));

        jLabel_Wallpaper.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Wallpaper.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
        // Crea una nueva instancia de la clase Menu.
        Menu menu = new Menu();
        // Establece la visibilidad de la ventana Menu como verdadera para que sea visible para el usuario.
        menu.setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dispose();

    }//GEN-LAST:event_Btn_regresarActionPerformed

    private void Btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_guardarActionPerformed

        // Validamos que no hayan campos vacíos.
        if (txt_usuario.getText().isEmpty() || txt_password.getText().isEmpty() || txt_nombre.getText().isEmpty()
                || txt_apellido.getText().isEmpty() || txt_telefono.getText().isEmpty() || txt_email.getText().isEmpty()
                || txt_registrado_por.getText().isEmpty()) {
            // Si alguno de los campos está vacío, mostramos un mensaje de advertencia.
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos.");
            // LLamamos el metodo limpiar para borrar la informacion ingresada
            Limpiar();
        } else {
            // Creamos una instancia de Ctrl_Usuario para manejar las operaciones de usuario.
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

            // Validamos si el usuario ya está registrado.
            if (controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                // Si el usuario ya existe, mostramos un mensaje de advertencia.
                JOptionPane.showMessageDialog(null, "Usuario ya registrado en la Base de datos, intenta de nuevo.");

                Limpiar();
            } else {
                // Si el usuario no existe, creamos una nueva instancia de Usuario.
                Usuario usuario = new Usuario();

                // Establecemos los valores del usuario con los datos ingresados en los campos de texto.
                usuario.setUsuario(txt_usuario.getText().trim());
                // Encriptamos la contraseña antes de establecerla en el objeto Usuario.
                usuario.setPassword(Utilidades.encriptarSHA1(txt_password.getText().trim()));
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setEmail(txt_email.getText().trim());
                usuario.setRegistrado_por(txt_registrado_por.getText().trim());

                // Intentamos guardar el nuevo usuario.
                if (controlUsuario.guardar(usuario)) {
                    // Si el usuario se guarda con éxito, mostramos un mensaje de confirmación.
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
                    // Establecer el color de los campos a verde.
                    Limpiar();
                } else {
                    // Si hay un error al guardar el usuario, mostramos un mensaje de error.
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario.");

                    Limpiar();
                }
            }
        }

    }//GEN-LAST:event_Btn_guardarActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jCheckBox_ver_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveMouseClicked

        if (jCheckBox_ver_clave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_password.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_ver_claveMouseClicked

    private void Btn_gestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_gestionarUsuariosActionPerformed
        FrmGestionarUsuarios frmGestionarUsuarios = new FrmGestionarUsuarios();
        frmGestionarUsuarios.setVisible(true);
        frmGestionarUsuarios.setLocation(300, 150); // Nueva posición: 500 píxeles desde la izquierda y 200 píxeles desde la parte superior

    }//GEN-LAST:event_Btn_gestionarUsuariosActionPerformed

    private void jLabel_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fotoMouseClicked
// Crea un objeto JFileChooser para abrir un diálogo de selección de archivos
        JFileChooser archivo = new JFileChooser();
// Configura el JFileChooser para permitir solo la selección de archivos (no directorios)
        archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
// Muestra el cuadro de diálogo de apertura de archivos y almacena el resultado (aceptar o cancelar)
        int estado = archivo.showOpenDialog(null);
// Verifica si el usuario seleccionó un archivo (presionó "Aceptar")
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                // Crea un FileInputStream para leer el archivo seleccionado
                fis = new FileInputStream(archivo.getSelectedFile());
                // Almacena la longitud del archivo seleccionado en bytes
                this.longitudBytes = (int) archivo.getSelectedFile().length();
                // Lee la imagen del archivo seleccionado
                Image icono = ImageIO.read(archivo.getSelectedFile());
                // Escala la imagen a las dimensiones del jLabel_foto
                Image scaledIcono = icono.getScaledInstance(jLabel_foto.getWidth(), jLabel_foto.getHeight(), Image.SCALE_DEFAULT);
                // Establece la imagen escalada como el ícono del jLabel_foto
                jLabel_foto.setIcon(new ImageIcon(scaledIcono));
            } catch (FileNotFoundException e) {
                // Maneja la excepción si el archivo no se encuentra
                e.printStackTrace();
                System.out.println("Error en el primer catch");
            } catch (IOException e) {
                // Maneja la excepción si ocurre un error de entrada/salida al leer el archivo
                e.printStackTrace();
                System.out.println("Error en el segundo catch");
            }
        }

    }//GEN-LAST:event_jLabel_fotoMouseClicked

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
            java.util.logging.Logger.getLogger(FrmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_gestionarUsuarios;
    private javax.swing.JButton Btn_guardar;
    private javax.swing.JButton Btn_regresar;
    private javax.swing.JLabel Jlabel_email;
    private javax.swing.JCheckBox jCheckBox_ver_clave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_password4;
    private javax.swing.JLabel jLabel_password5;
    private javax.swing.JLabel jLabel_password6;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JLabel label_nombreusuario;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_registrado_por;
    private javax.swing.JTextField txt_ruta;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo_nivel;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_usuario.setText("");
        // Limpia el campo de texto para la contraseña, estableciéndolo como una cadena vacía.
        txt_password.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_telefono.setText("");
        txt_email.setText("");
        txt_registrado_por.setText("");
        txt_tipo_nivel.setText("");
    }
}
