
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Miller
 */
public class Menu extends javax.swing.JFrame {
   
/**
 * Creates new form Menu
 */
public Menu() {
    initComponents();
    // Establece la operación predeterminada cuando se cierra la ventana. En este caso, cierra todos los procesos en segundo plano.
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // Establece la ubicación de la ventana en el centro de la pantalla.
    this.setLocationRelativeTo(null);
    // Establece si la ventana es redimensionable o no. En este caso, la ventana no se puede redimensionar.
    this.setResizable(false);
    // Establece el tamaño de la ventana a 1200 píxeles de ancho y 700 píxeles de alto.
    this.setSize(new Dimension(1200, 700));
    // Hace visible la ventana, permitiendo que sea visible para el usuario.
    this.setVisible(true);
    // Establece el título de la ventana.
    this.setTitle("Menu");
    // Establece el diseño de la ventana como nulo, permitiendo una disposición personalizada de los componentes.
    this.setLayout(null);
    
   // ----------------------------------------Colocar imagen de fondo----------------------------------------------// 
 /*
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
 */
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Btn_usuarios = new javax.swing.JButton();
        Btn_cerrarSesion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        Btn_usuarios.setText("     usuarios");
        Btn_usuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Btn_usuariosMouseMoved(evt);
            }
        });
        Btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_usuariosMouseExited(evt);
            }
        });
        Btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_usuariosActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 30));

        Btn_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        Btn_cerrarSesion.setText("       Cerrar Sesion");
        Btn_cerrarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Btn_cerrarSesionMouseMoved(evt);
            }
        });
        Btn_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_cerrarSesionMouseExited(evt);
            }
        });
        Btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cerrarSesionActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 150, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jButton3.setText("     usuario");
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jButton4.setText("     usuario");
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jButton5.setText("     usuario");
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jButton6.setText("     usuario");
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(78, 84));
        jLabel1.setMinimumSize(new java.awt.Dimension(78, 84));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jPanel2.setBackground(new java.awt.Color(58, 65, 66));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SISTEMA DE INFORMACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 60));

        jLabel_Wallpaper.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Wallpaper.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 55, 970, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_usuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_usuariosMouseMoved
        Btn_usuarios.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_Btn_usuariosMouseMoved

    private void Btn_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_usuariosMouseExited
          Btn_usuarios.setBackground(new Color(58,65,66));
    }//GEN-LAST:event_Btn_usuariosMouseExited

    private void Btn_cerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cerrarSesionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cerrarSesionMouseMoved

    private void Btn_cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cerrarSesionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cerrarSesionMouseExited

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseMoved

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseMoved

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseExited

    private void Btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_usuariosActionPerformed
        FrmNuevoUsuario frmNuevoUsuario = new  FrmNuevoUsuario();
        frmNuevoUsuario.setVisible(true);
         frmNuevoUsuario.setSize(600, 450);
         // Mover la ventana a una nueva posición (x, y)
         frmNuevoUsuario.setLocation(550, 200); // Nueva posición: 500 píxeles desde la izquierda y 200 píxeles desde la parte superior
         frmNuevoUsuario.setDefaultCloseOperation( frmNuevoUsuario.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_Btn_usuariosActionPerformed

    private void Btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cerrarSesionActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
       dispose();
    }//GEN-LAST:event_Btn_cerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cerrarSesion;
    private javax.swing.JButton Btn_usuarios;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
