package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class Menu extends javax.swing.JFrame {

    /**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion 
 * 
 */
 
    public Menu() {
        
        // Metodo para poner transparente el jframe
        //setUndecorated(true);
        
        initComponents();
        
        this.setSize(1000,600);
         // Establece el título de la ventana.
        this.setTitle("Menu");
        // Muestra el menú
        this.setVisible(true);
        // Deshabilita el redimensionamiento del menú
        this.setResizable(false);
        // Centra el menú en la pantalla
        this.setLocationRelativeTo(null);
        // Establece la operación predeterminada cuando se cierra la ventana. En este caso, cierra todos los procesos en segundo plano.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
         // Redondear las esquinas del jframe 
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        
          // ----------------------------------------Colocar imagen de fondo----------------------------------------------// 
         //Crea un objeto ImageIcon con la imagen ubicada en el directorio especificado
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
        
          // Inicia el temporizador.
         timer.start();
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
      //------------------------------------ metodo para mostrar la hora y la fecha ------------------------------------------//

     //Crea una instancia de Timer que se ejecuta cada 1000 milisegundos (1 segundo).
Timer timer = new Timer(1000, new ActionListener(){
    // Define la acción que se ejecutará cada vez que el temporizador se active.
    @Override
    public void actionPerformed(ActionEvent e){
        // Obtiene la fecha y hora actual del sistema.
        Calendar cal = new GregorianCalendar();        
        // Declara variables para almacenar la hora, minutos, segundos, día, mes y año.
        int hh, mm, ss, dia, mes, aa;        
        // Obtiene la hora actual.
        hh = cal.get(Calendar.HOUR);        
        // Obtiene los segundos actuales.
        ss = cal.get(Calendar.SECOND);        
        // Obtiene los minutos actuales.
        mm = cal.get(Calendar.MINUTE);        
        // Obtiene el día del mes actual.
        dia = cal.get(Calendar.DAY_OF_MONTH);        
        // Obtiene el mes actual (nota: los meses empiezan desde 0 en Calendar, por lo que enero es 0).
        mes = cal.get(Calendar.MONTH) + 1;        
        // Obtiene el año actual.
        aa = cal.get(Calendar.YEAR);        
        // Actualiza la etiqueta Lb_hora con la hora, minutos y segundos actuales.
        Lb_hora.setText(hh + ":" + mm + ":" + ss);        
        // Actualiza la etiqueta Lb_fecha con el día, mes y año actuales.
        Lb_fecha.setText(dia + "/ "+ mes + "/ "+ aa);
    }
});

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_usuarios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Lb_hora = new javax.swing.JLabel();
        Lb_fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Btn_cerrar_sesion = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        Btn_usuarios.setText("Usuarios");
        Btn_usuarios.setToolTipText("Click para agregar un nuevo usuario");
        Btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_usuariosActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pacientes ");
        jButton2.setToolTipText("Click para agregar un nuevo paciente");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Facturacion");
        jButton3.setToolTipText("Click para crear una factura");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 170, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Configuracion");
        jButton4.setToolTipText("Click para configurar la aplicacion");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reportes");
        jButton5.setToolTipText("Click para visualizar los reportes");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 40));

        Lb_hora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lb_hora.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(Lb_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 60, 20));

        Lb_fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lb_fecha.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(Lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hora :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        Btn_cerrar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        Btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        Btn_cerrar_sesion.setText("     Cerrar Sesion");
        Btn_cerrar_sesion.setToolTipText("Click para cerrar la sesion");
        Btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cerrar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 170, 30));
        jPanel1.add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 760, 60));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 760, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_usuariosActionPerformed
        FrmNuevoUsuario frmNuevoUsuario = new FrmNuevoUsuario();
        frmNuevoUsuario.setVisible(true);
    }//GEN-LAST:event_Btn_usuariosActionPerformed

    private void Btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cerrar_sesionActionPerformed
        
         dispose();  
        // this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        FrmLogin frmLogin = new FrmLogin();
         frmLogin.setVisible(true);
       
              
    }//GEN-LAST:event_Btn_cerrar_sesionActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cerrar_sesion;
    private javax.swing.JButton Btn_usuarios;
    private javax.swing.JLabel Lb_fecha;
    private javax.swing.JLabel Lb_hora;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
