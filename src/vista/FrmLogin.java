package vista;

import controlador.Ctrl_Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Miller
 */
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        this.setUndecorated(true);
        initComponents();
        // Cierra todos los procesos en segundo plano cuando se cierra esta ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        // No permite que el jFrame sea modificado por usuario
        this.setResizable(false);
        // Permite que el jFrame sea visible
        this.setVisible(true);
        // Titulo del jFrame
        this.setTitle("Login");
        // Medidas del jFrame
        this.setSize(700, 500);
        // Permite que el jFrame aparezca en el centro
        this.setLocationRelativeTo(null);

    }

//      // Objeto para agregar  icono JOptionPane 
//    public Icon icono (String path, int width, int heigth){
//        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
//            .getScaledInstance(width, heigth,java.awt.Image.SCALE_SMOOTH));
//        return  img;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_IniciarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

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
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 160, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, 160, 2));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Email or Username");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("x");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        this.login();
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

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
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    // Metodo para loguearse
    private void login() {

        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {

            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());

            if (controlUsuario.loginUser(usuario)) {

                //JOptionPane.showMessageDialog(null, "Login correcto");
                Menu menu = new Menu();
                menu.setBounds(0, 0, 1200, 700);
                menu.setVisible(true);
                menu.setResizable(false);
                menu.setLocationRelativeTo(null);
                this.setVisible(false);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
//                JOptionPane.showMessageDialog(null, "<html><p style=\"color:red;font-size:12px;\">Usuario o clave incorrectos." +"</p></html>",
//                        "advertencia", JOptionPane.PLAIN_MESSAGE, icono("/img/DS.png", 40 ,40));

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }

}
