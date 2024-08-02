
package vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Miller
 */
public class FrmReportes extends javax.swing.JFrame {

 
    public FrmReportes() {
        initComponents();
        
        this.setSize(682, 501);
         // Establece el título de la ventana.
        this.setTitle("Configuracion.");
        // Muestra el menú
        this.setVisible(true);
        // Deshabilita el redimensionamiento del menú
        this.setResizable(false);
        // Centra el menú en la pantalla
        this.setLocationRelativeTo(null);
        // Establece la operación predeterminada cuando se cierra la ventana. En este caso, cierra todos los procesos en segundo plano.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        ImageIcon wallpaperMenu = new ImageIcon("src/img/3d-business.png");
        Icon iconoMenu = new ImageIcon(wallpaperMenu.getImage().getScaledInstance(
                jLabel_imagen_menu.getWidth(),
                jLabel_imagen_menu.getHeight(),
                Image.SCALE_DEFAULT));
        jLabel_imagen_menu.setIcon(iconoMenu);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel_imagen_menu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn_regresar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reportes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, 30));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));
        getContentPane().add(jLabel_imagen_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 270, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lo sentimos ,esta interfaz se encuentra en construccion.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 70));

        Btn_regresar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        Btn_regresar.setText("Regresar");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 1, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
       // Hace que la ventana actual se vuelva invisible.
        this.setVisible(false);
        // Libera los recursos asociados con la ventana actual y la cierra.
        this.dispose();

        // Crea y muestra la ventana de Menu
        Menu menu = new Menu();
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JLabel jLabel_imagen_menu;
    // End of variables declaration//GEN-END:variables
}
