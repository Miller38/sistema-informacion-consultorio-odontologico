package vista;

// Importa la clase Ctrl_Usuario del paquete controlador
import controlador.Ctrl_Usuario;
// Importa la clase Image del paquete java.awt para trabajar con imágenes en la interfaz gráfica
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
// Importa la interfaz Icon del paquete javax.swing para representar iconos en componentes Swing
import javax.swing.Icon;
// Importa la clase ImageIcon del paquete javax.swing para crear iconos a partir de imágenes
import javax.swing.ImageIcon;
import javax.swing.JFrame;
// Importa la clase JOptionPane del paquete javax.swing para mostrar cuadros de diálogo estándar
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
// Importa la clase Usuario del paquete modelo
import modelo.Usuario;
// Importa la clase TextPrompt del paquete servicios (asumo que esta clase proporciona funcionalidad para mostrar texto de sugerencia en campos de texto)
import servicios.TextPrompt;

/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        this.setUndecorated(true);
        initComponents();

        // metodo para el placeholder en los txt        
        TextPrompt usuario = new TextPrompt("   Ingrese su username.", txt_usuario);
        TextPrompt contrasena = new TextPrompt("   Ingrese su password.", txt_password);

        // Hace visible el campo de texto para la contraseña oculta
        txt_password.setVisible(true);
        // Hace invisible el campo de texto para la contraseña visible
        txt_password_visible.setVisible(false);

        
        // cierra todos los procesos en segundo plano cuando se cierra lainterfaz
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
        this.setLayout(null);
        // No permite que el jFrame sea modificado por usuario
        this.setResizable(false);
        // Permite que el jFrame sea visible
        this.setVisible(true);
        // Titulo del jFrame
        this.setTitle("Login");
        // Centra el jFrame
        this.setLocationRelativeTo(null);
        // Medidas del jFrame
        this.setSize(700, 500);

           // Redondear las esquinas del jframe 
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 20,20));
        

        /*
    * ------------------------------------------------------------------------------------------------------------------------
    *                                                            Colocar imagen de fondo
    * ------------------------------------------------------------------------------------------------------------------------
         */
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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_IniciarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Btn_cerrarLogin = new javax.swing.JButton();
        jCheckBox_ver_clave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema De Informacion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Designed by Milliany Tech 2024");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));
        jPanel1.add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(null);
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 30));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 160, 30));

        btn_IniciarSesion.setBackground(new java.awt.Color(51, 153, 255));
        btn_IniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_IniciarSesion.setText("Iniciar Sesion");
        btn_IniciarSesion.setToolTipText("Click para iniciar sesion");
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 160, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, 160, 2));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 2));

        Btn_cerrarLogin.setBackground(new java.awt.Color(51, 153, 255));
        Btn_cerrarLogin.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Btn_cerrarLogin.setText("X");
        Btn_cerrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cerrarLoginActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_cerrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        jCheckBox_ver_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ver_claveActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 20, -1));

        txt_password_visible.setBackground(new java.awt.Color(255, 255, 255));
        txt_password_visible.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_password_visible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password_visible.setBorder(null);
        jPanel2.add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 150, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 10, 40, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        this.login();
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

    private void Btn_cerrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cerrarLoginActionPerformed
        // Termina la ejecución de la aplicación y cierra todos los procesos asociados
    // El código de salida 0 indica que la aplicación se cerró correctamente sin errores
    System.exit(0);
    }//GEN-LAST:event_Btn_cerrarLoginActionPerformed

    private void jCheckBox_ver_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveActionPerformed

       // Verifica si el checkbox para mostrar la contraseña está seleccionado
    if (jCheckBox_ver_clave.isSelected()) {
        // Si el checkbox está seleccionado, se debe mostrar la contraseña en formato de texto
        // Obtiene la contraseña ingresada en el campo de contraseña (oculto) como un arreglo de caracteres
        String pass = new String(txt_password.getPassword());
        // Establece la contraseña obtenida en el campo de texto visible para mostrarla
        txt_password_visible.setText(pass);
        // Oculta el campo de contraseña (oculto) ya que ahora se mostrará el campo de texto visible
        txt_password.setVisible(false);
        // Muestra el campo de texto visible que contiene la contraseña en formato de texto
        txt_password_visible.setVisible(true);
    } else {
        // Si el checkbox no está seleccionado, se debe ocultar la contraseña en formato de texto
        // Obtiene la contraseña ingresada en el campo de texto visible (que es la contraseña en formato de texto)
        String passwordIngresado = txt_password_visible.getText().trim();
        // Establece la contraseña obtenida en el campo de contraseña (oculto) para que se oculte nuevamente
        txt_password.setText(passwordIngresado);
        // Muestra el campo de contraseña (oculto) para que la contraseña sea visible solo en formato oculto
        txt_password.setVisible(true);
        // Oculta el campo de texto visible que contiene la contraseña en formato de texto
        txt_password_visible.setVisible(false);
    }

    }//GEN-LAST:event_jCheckBox_ver_claveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cerrarLogin;
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox_ver_clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    /*
    * ------------------------------------------------------------------------------------------------------------------------
    *                                                            Metodo para loguearse
    * ------------------------------------------------------------------------------------------------------------------------
     */
    private void login() {

        // Método para manejar el proceso de inicio de sesión
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            // Verifica que los campos de usuario y contraseña no estén vacíos
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            // Crea una instancia del controlador de usuario
            Usuario usuario = new Usuario();
            // Crea una instancia de un objeto Usuario
            usuario.setUsuario(txt_usuario.getText().trim());
            // Asigna el texto del campo de usuario al objeto usuario, eliminando espacios en blanco
            usuario.setPassword(txt_password.getText().trim());
            // Asigna el texto del campo de contraseña al objeto usuario, eliminando espacios en blanco
            if (controlUsuario.loginUser(usuario)) {
                // Verifica si el usuario es válido según el controlador

                //JOptionPane.showMessageDialog(null, "Login correcto");
                // Muestra un mensaje de confirmación de inicio de sesión correcto (comentado)
                Menu menu = new Menu();
                // Crea una instancia del menú principal
                menu.setBounds(0, 0, 1000, 600);
                // Establece el tamaño y posición del menú
                menu.setVisible(true);
                // Muestra el menú
                menu.setResizable(false);
                // Deshabilita el redimensionamiento del menú
                menu.setLocationRelativeTo(null);
                // Centra el menú en la pantalla
                this.setVisible(false);
                // Oculta la ventana de inicio de sesión
                dispose();
                // Libera los recursos de la ventana de inicio de sesión
            } else {                
                 JOptionPane.showMessageDialog(this, "Error al iniciar sesion.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {           
             JOptionPane.showMessageDialog(this, "Debes completar todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        // Metodo para limpiar los campos despues del mensaje de advertencia
        Limpiar();

    }

    /*
    * ------------------------------------------------------------------------------------------------------------------------
    *                                                     Metodo para limpiar los campos
    * ------------------------------------------------------------------------------------------------------------------------
     */
    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_usuario.setText("");
        // Limpia el campo de texto para la contraseña, estableciéndolo como una cadena vacía.
        txt_password.setText("");
    }
}
