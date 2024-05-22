package vista;

import controlador.Ctrl_Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Miller
 */
public class FrmNuevoUsuario extends javax.swing.JFrame {

    public FrmNuevoUsuario() {
        initComponents();
        this.setSize(500, 400);
        this.setTitle("Nuevo Usuario.");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_regresar.setText("regresar");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Btn_gestionarUsuarios.setText("Gestionar Usuarios");
        getContentPane().add(Btn_gestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        jLabel_username.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_username.setText("Usuario :");
        getContentPane().add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel_password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Password :");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, -1));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 180, -1));

        Btn_guardar.setText("Guardar");
        Btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, -1));

        jLabel3.setText("el usuario y el password debe tener entre 8 y 20 caracteres alfanumericos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 380, 20));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
        // Crea una nueva instancia de la clase Menu.
        Menu menu = new Menu();
        // Establece la visibilidad de la ventana Menu como verdadera para que sea visible para el usuario.
        menu.setVisible(true);

    }//GEN-LAST:event_Btn_regresarActionPerformed

    private void Btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_guardarActionPerformed

        // Validamos que no hayan campos vacíos.
        if (txt_usuario.getText().isEmpty() || txt_password.getText().isEmpty()) {
            // Si alguno de los campos está vacío, mostramos un mensaje de advertencia.
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos.");
            // Establecer el color de los campos a rojo.
            txt_usuario.setBackground(Color.RED);
            txt_password.setBackground(Color.RED);
        } else {
            // Creamos una instancia de Ctrl_Usuario para manejar las operaciones de usuario.
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

            // Validamos si el usuario ya está registrado.
            if (controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                // Si el usuario ya existe, mostramos un mensaje de advertencia.
                JOptionPane.showMessageDialog(null, "Usuario ya registrado en la Base de datos, intenta de nuevo.");
                // Establecer el color de los campos a rojo.
                txt_usuario.setBackground(Color.RED);
                txt_password.setBackground(Color.RED);
            } else {
                // Si el usuario no existe, creamos una nueva instancia de Usuario.
                Usuario usuario = new Usuario();

                // Establecemos los valores del usuario con los datos ingresados en los campos de texto.
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_password.getText().trim());

                // Intentamos guardar el nuevo usuario.
                if (controlUsuario.guardar(usuario)) {
                    // Si el usuario se guarda con éxito, mostramos un mensaje de confirmación.
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
                    // Establecer el color de los campos a verde.
                    txt_usuario.setBackground(Color.green);
                    txt_password.setBackground(Color.green);
                } else {
                    // Si hay un error al guardar el usuario, mostramos un mensaje de error.
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario.");
                    // Establecer el color de los campos a rojo.
                    txt_usuario.setBackground(Color.RED);
                    txt_password.setBackground(Color.RED);
                }
            }
        }

    }//GEN-LAST:event_Btn_guardarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_usuario.setText("");
        // Limpia el campo de texto para la contraseña, estableciéndolo como una cadena vacía.
        txt_password.setText("");
    }
}
