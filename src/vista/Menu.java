package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {

        // Metodo para poner transparente el jframe
        //setUndecorated(true);

        initComponents();
        // Establece la operación predeterminada cuando se cierra la ventana. En este caso, cierra todos los procesos en segundo plano.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Establece la ubicación de la ventana en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        // Establece si la ventana es redimensionable o no. En este caso, la ventana no se puede redimensionar.
        this.setResizable(false);
        // Establece el tamaño de la ventana a 1000 píxeles de ancho y 600 píxeles de alto.
        this.setSize(new Dimension(1000, 600));
        // Hace visible la ventana, permitiendo que sea visible para el usuario.
        this.setVisible(true);
        // Establece el título de la ventana.
        this.setTitle("Menu");
        // Establece el diseño de la ventana como nulo, permitiendo una disposición personalizada de los componentes.
        this.setLayout(null);
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

        //------------------------------------ Cambiamos la imagen del logo ------------------------------------------//
        ImageIcon wallpaper_logo = new ImageIcon("src/img/logo.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(
                jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(),
                Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Btn_usuarios = new javax.swing.JButton();
        Btn_cerrarSesion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Btn_facturacion = new javax.swing.JButton();
        Btn_pacientes = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_cabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jLabel_Wallpaper.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Wallpaper.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 540));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        Btn_usuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-user_24px.png"))); // NOI18N
        Btn_usuarios.setText(" usuarios");
        Btn_usuarios.setBorder(null);
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
        jPanel4.add(Btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        Btn_cerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Btn_cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        Btn_cerrarSesion.setText("Cerrar Sesion");
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
        jPanel4.add(Btn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("reportes");
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
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 190, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_28px.png"))); // NOI18N
        jButton4.setText("configuracion");
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
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 30));

        Btn_facturacion.setBackground(new java.awt.Color(255, 255, 255));
        Btn_facturacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura_24px.png"))); // NOI18N
        Btn_facturacion.setText("facturacion");
        Btn_facturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Btn_facturacionMouseMoved(evt);
            }
        });
        Btn_facturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_facturacionMouseExited(evt);
            }
        });
        Btn_facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_facturacionActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 30));

        Btn_pacientes.setBackground(new java.awt.Color(255, 255, 255));
        Btn_pacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_pacientes.setText("    pacientes");
        Btn_pacientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Btn_pacientesMouseMoved(evt);
            }
        });
        Btn_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_pacientesMouseExited(evt);
            }
        });
        Btn_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pacientesActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 30));
        jPanel4.add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 540));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE INFORMACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 350, 30));

        jLabel_cabecera.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel_cabeceraComponentRemoved(evt);
            }
        });
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_usuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_usuariosMouseMoved

    }//GEN-LAST:event_Btn_usuariosMouseMoved

    private void Btn_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_usuariosMouseExited

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

    private void Btn_facturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_facturacionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_facturacionMouseMoved

    private void Btn_facturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_facturacionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_facturacionMouseExited

    private void Btn_pacientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_pacientesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_pacientesMouseMoved

    private void Btn_pacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_pacientesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_pacientesMouseExited

    private void Btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_usuariosActionPerformed
        FrmNuevoUsuario frmNuevoUsuario = new FrmNuevoUsuario();
        frmNuevoUsuario.setVisible(true);
        frmNuevoUsuario.setSize(600, 450);
        // Mover la ventana a una nueva posición (x, y)
        frmNuevoUsuario.setLocation(300, 150); // Nueva posición: 500 píxeles desde la izquierda y 200 píxeles desde la parte superior
        frmNuevoUsuario.setDefaultCloseOperation(frmNuevoUsuario.EXIT_ON_CLOSE);
    }//GEN-LAST:event_Btn_usuariosActionPerformed

    private void Btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cerrarSesionActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_cerrarSesionActionPerformed

    private void Btn_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pacientesActionPerformed
        FrmNuevoPaciente frmNuevoPaciente = new FrmNuevoPaciente();
        frmNuevoPaciente.setVisible(true);
        frmNuevoPaciente.setDefaultCloseOperation(frmNuevoPaciente.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_pacientesActionPerformed

    private void Btn_facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_facturacionActionPerformed
        FrmFacturacion frmFacturacion = new FrmFacturacion();
        frmFacturacion.setVisible(true);
        // Establece la operación predeterminada cuando se cierra la ventana. En este caso, cierra todos los procesos en segundo plano.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_Btn_facturacionActionPerformed

    private void jLabel_cabeceraComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel_cabeceraComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_cabeceraComponentRemoved

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
    private javax.swing.JButton Btn_facturacion;
    private javax.swing.JButton Btn_pacientes;
    private javax.swing.JButton Btn_usuarios;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
