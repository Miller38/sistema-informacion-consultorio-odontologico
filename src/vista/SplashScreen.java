
package vista;

// Librerias
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author Miller
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion 
 * 
 */
public class SplashScreen extends javax.swing.JFrame {


    public SplashScreen() {
        
          // Metodo para poner transparente el jframe
        setUndecorated(true);
        
        
        initComponents();
        
         //30% de opacidad del jframe
        //setOpacity(0.5f);

        
        setLayout(null);
        // cierra todos los procesos en segundo plano cuando se cierra lainterfaz
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
        // Tamaño del jFrame
        setSize(900,500 );
        // El usuario no puede modificar el tamaño del jFrame
        setResizable(false);
        // Para que se muestre el jFrame
        setVisible(true);
        // Permite que el jFrame aparezca en el centro
        setLocationRelativeTo(null);
        setTitle("SplashScreen.");        
        
         // Redondear las esquinas del jframe 
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 20,20));
        
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

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        BackgroundImage1 = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(51, 153, 255));
        BackgroundPanel.setMinimumSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 550, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SkyLand");
        BackgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 310, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SkyLand");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 310, 100));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(0, 0, 0));
        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 70, -1));

        BackgroundImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/robot-assistant.png"))); // NOI18N
        BackgroundPanel.add(BackgroundImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 310, 490));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoadingLabel.setText("Loading . . .");
        BackgroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        BackgroundPanel.add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
            // Crea una instancia de la pantalla de inicio (splash screen) y la hace visible
SplashScreen sp = new SplashScreen();
sp.setVisible(true);

try {
    // Inicia un bucle que simula el progreso de carga de la aplicación
    for(int i = 0; i <= 100; i++){
        // Pausa la ejecución del hilo actual durante 100 milisegundos
        Thread.sleep(100);
        
        // Actualiza el texto del componente que muestra el porcentaje de carga
        sp.LoadingValue.setText(i + " %");
        
        // Cambia el texto del componente de carga en función del progreso
        if(i == 10){
            sp.LoadingLabel.setText("Turning On Modules . . .");
        }
        if(i == 20){
            sp.LoadingLabel.setText("Loading Modules . . .");
        }
        if(i == 50){
            sp.LoadingLabel.setText("Connecting to Database . . .");
        }
        if(i == 70){
            sp.LoadingLabel.setText("Connecting Successful . . .");
        }
        if(i == 80){
            sp.LoadingLabel.setText("Launching Application . . .");
        }
        
        // Actualiza el valor de la barra de carga con el progreso actual
        sp.LoadingBar.setValue(i);
    }

    // Crea una instancia del formulario de inicio de sesión y lo muestra
    FrmLogin login = new FrmLogin();
    login.setBounds(0, 0, 700, 500); // Establece el tamaño y la posición del formulario
    login.setVisible(true); // Hace visible el formulario de inicio de sesión
    login.setResizable(false); // Impide que el formulario sea redimensionable
    login.setLocationRelativeTo(null); // Centra el formulario en la pantalla
    sp.setVisible(false); // Oculta la pantalla de inicio después de cargar

} catch (Exception e) {
    // Muestra un mensaje de error en caso de una excepción durante el proceso de carga
    JOptionPane.showMessageDialog(null, e);
}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage1;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
