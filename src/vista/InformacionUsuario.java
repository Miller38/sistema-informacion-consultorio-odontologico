
package vista;

import conexion.Conexion;
import java.sql.Connection; // Importa la clase Connection de java.sql
import java.sql.PreparedStatement; // Importa la clase PreparedStatement de java.sql
import java.sql.SQLException; // Importa la clase SQLException de java.sql
import javax.swing.JOptionPane; // Importa la clase JOptionPane de javax.swing
import java.sql.ResultSet; // Importa la clase ResultSet de java.sql



/**
 *
 * @author Miller
 */
public class InformacionUsuario extends javax.swing.JFrame {
    
    public InformacionUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(400,300);
        
       try {
    Connection cn = Conexion.conectar();
    String query = "SELECT * FROM usuarios WHERE usuario = ?";
    PreparedStatement pst = cn.prepareStatement(query);
    pst.setString(1, "nombre");  // Uso de PreparedStatement para prevenir inyección SQL
    ResultSet rs = pst.executeQuery();

    if (rs.next()) {
        txt_nombre.setText(rs.getString("nombre"));
    }

    // Cerrar ResultSet y PreparedStatement antes de cerrar la conexión
    rs.close();
    pst.close();
    cn.close();
} catch (SQLException e) {
    System.err.println("Error al cargar usuario " + e);
    JOptionPane.showMessageDialog(null, "Error al cargar");
}

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion del usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 30));

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Nombre.setText("Nombre :");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
