package vista;

import controlador.Ctrl_Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import modelo.Usuario;

/**
 *
 * @author Miller
 */
public class FrmNuevoUsuario extends javax.swing.JFrame {

    public FrmNuevoUsuario() {
        initComponents();
        this.setSize(600, 450);
        this.setTitle("Nuevo Usuario.");
        
        txt_password.setVisible(true);
        txt_password_visible.setVisible(false);
     // Establecer la operación de cierre por defecto
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
          // ----------------------------------------Colocar imagen de fondo----------------------------------------------// 
    // Crea un objeto ImageIcon con la imagen ubicada en el directorio especificado
ImageIcon wallpaper = new ImageIcon("src/img/fondo2.jpg");
// Escala la imagen a las dimensiones actuales del jLabel_Wallpaper
// Obtiene la imagen del ImageIcon
Icon icono = new ImageIcon(
    wallpaper.getImage().getScaledInstance( // Escala la imagen
        jLabel_Wallpaper.getWidth(),        // Ancho actual del jLabel_Wallpaper
        jLabel_Wallpaper.getHeight(),       // Alto actual del jLabel_Wallpaper
        Image.SCALE_DEFAULT                 // Algoritmo de escalado (por defecto)
    )
);
// Establece el nuevo icono (imagen escalada) en el jLabel_Wallpaper
jLabel_Wallpaper.setIcon(icono);
// Vuelve a pintar el contenedor para asegurarse de que la imagen se renderice correctamente
this.repaint();
    }
    
    //------------------------------------ Cambiamos el icono del Jframe ------------------------------------------//
  @Override
public Image getIconImage() {
    // Utiliza Toolkit para obtener la imagen desde el recurso especificado
    Image retValue = Toolkit.getDefaultToolkit().getImage(
        // Ruta del recurso de la imagen dentro del classpath
        ClassLoader.getSystemResource("img/logo.png")
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
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_regresar.setText("regresar");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, -1));

        Btn_gestionarUsuarios.setText("Gestionar Usuarios");
        getContentPane().add(Btn_gestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 160, -1));

        jLabel_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_username.setText("Usuario :");
        getContentPane().add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Password :");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 180, -1));

        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 180, -1));

        Btn_guardar.setText("Guardar");
        Btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, -1));

        jLabel_apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_apellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_apellido.setText("Apellido :");
        getContentPane().add(jLabel_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_telefono.setText("Telefono :");
        getContentPane().add(jLabel_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 180, -1));

        Jlabel_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jlabel_email.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_email.setText("Email :");
        getContentPane().add(Jlabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel_password4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_password4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password4.setText("Tipo Nivel :");
        getContentPane().add(jLabel_password4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel_password5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_password5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password5.setText("Registrado por :");
        getContentPane().add(jLabel_password5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel_password6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_password6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password6.setText("Nombre :");
        getContentPane().add(jLabel_password6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txt_tipo_nivel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_tipo_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 180, -1));

        txt_registrado_por.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_registrado_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 180, -1));

        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, -1));

        txt_apellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, -1));

        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, -1));

        jCheckBox_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ver_claveMouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        txt_password_visible.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 180, -1));

        jLabel_Wallpaper.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
        // Crea una nueva instancia de la clase Menu.
        Menu menu = new Menu();
        // Establece la visibilidad de la ventana Menu como verdadera para que sea visible para el usuario.
        menu.setVisible(true);
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
                usuario.setPassword(txt_password.getText().trim());
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
        
        if(jCheckBox_ver_clave.isSelected() == true){
            String pass = "";
            char[ ] passIngresado = txt_password.getPassword();
            for(int i = 0; i < passIngresado.length; i++){
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        }else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_ver_claveMouseClicked

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
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_password4;
    private javax.swing.JLabel jLabel_password5;
    private javax.swing.JLabel jLabel_password6;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_registrado_por;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo_nivel;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_usuario.setText("");
        // Limpia el campo de texto para la contraseña, estableciéndolo como una cadena vacía.
        txt_password.setText("");
    }
}
