
package vista;

// Este código importa la clase Color del paquete java.awt
import java.awt.Color;

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
          // cierra todos los procesos en segundo plano cuando se cierra lainterfaz
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        // Establece la ubicación de la ventana en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        // Establece si la ventana es redimensionable o no. En este caso, la ventana no se puede redimensionar.
        this.setResizable(false);
        // Establece el tamaño de la ventana a 996 píxeles de ancho y 541 píxeles de alto.
        this.setSize(996,541);
        // Hace visible la ventana, lo que permite que sea visible para el usuario.
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel_Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_Agenda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Historial = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel_Reportes = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel_Citas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_Pacientes = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel_Usuarios = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Home.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Home.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_HomeMouseMoved(evt);
            }
        });
        jPanel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_HomeMouseExited(evt);
            }
        });
        jPanel_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        jPanel_Home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jPanel4.add(jPanel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, -1));

        jPanel_Agenda.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Agenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_AgendaMouseMoved(evt);
            }
        });
        jPanel_Agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_AgendaMouseExited(evt);
            }
        });
        jPanel_Agenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Agenda.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agenda");
        jPanel_Agenda.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        jPanel4.add(jPanel_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, -1));

        jPanel_Historial.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Historial.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_HistorialMouseMoved(evt);
            }
        });
        jPanel_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_HistorialMouseExited(evt);
            }
        });
        jPanel_Historial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Historial.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Historial");
        jPanel_Historial.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 30));

        jPanel4.add(jPanel_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, -1));

        jPanel_Reportes.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Reportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_ReportesMouseMoved(evt);
            }
        });
        jPanel_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_ReportesMouseExited(evt);
            }
        });
        jPanel_Reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reportes");
        jPanel_Reportes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 80, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Reportes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel4.add(jPanel_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, -1));

        jPanel_Citas.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Citas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_CitasMouseMoved(evt);
            }
        });
        jPanel_Citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_CitasMouseExited(evt);
            }
        });
        jPanel_Citas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Citas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Citas");
        jPanel_Citas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jPanel4.add(jPanel_Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, -1));

        jPanel_Pacientes.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Pacientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_PacientesMouseMoved(evt);
            }
        });
        jPanel_Pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_PacientesMouseExited(evt);
            }
        });
        jPanel_Pacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Pacientes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pacientes");
        jPanel_Pacientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jPanel4.add(jPanel_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jPanel_Usuarios.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_Usuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_UsuariosMouseMoved(evt);
            }
        });
        jPanel_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_UsuariosMouseExited(evt);
            }
        });
        jPanel_Usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user.png"))); // NOI18N
        jPanel_Usuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Usuarios");
        jPanel_Usuarios.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jPanel4.add(jPanel_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 540));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SISTEMA DE INFORMACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 810, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 760, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
 * Método que se activa cuando el mouse se mueve sobre el panel de usuarios.
 * Cambia el color de fondo del panel a un tono gris claro para indicar interacción.
 * @param evt El evento de mouse que desencadena esta acción.
 */
    private void jPanel_HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HomeMouseMoved
         // Establece el color de fondo del panel a gris claro.
        jPanel_Home.setBackground(new Color(204,204,204)); 
    }//GEN-LAST:event_jPanel_HomeMouseMoved

    /**
 * Método que se activa cuando el mouse sale del área del panel de usuarios.
 * Restaura el color de fondo del panel al color predeterminado de azul claro.
 * @param evt El evento de mouse que desencadena esta acción.
 */
    private void jPanel_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HomeMouseExited
       // Restaura el color de fondo del panel a azul claro.
        jPanel_Home.setBackground(new Color(51,153,255)); 
    }//GEN-LAST:event_jPanel_HomeMouseExited

    private void jPanel_AgendaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgendaMouseMoved
        jPanel_Agenda.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_AgendaMouseMoved

    private void jPanel_AgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgendaMouseExited
        jPanel_Agenda.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_AgendaMouseExited

    private void jPanel_HistorialMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HistorialMouseMoved
        jPanel_Historial.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_HistorialMouseMoved

    private void jPanel_HistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HistorialMouseExited
         jPanel_Historial.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_HistorialMouseExited

    private void jPanel_ReportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ReportesMouseMoved
         jPanel_Reportes.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_ReportesMouseMoved

    private void jPanel_ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ReportesMouseExited
         jPanel_Reportes.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_ReportesMouseExited

    private void jPanel_CitasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CitasMouseMoved
         jPanel_Citas.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_CitasMouseMoved

    private void jPanel_CitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CitasMouseExited
         jPanel_Citas.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_CitasMouseExited

    private void jPanel_PacientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PacientesMouseMoved
         jPanel_Pacientes.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_PacientesMouseMoved

    private void jPanel_PacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PacientesMouseExited
         jPanel_Pacientes.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_PacientesMouseExited

    private void jPanel_UsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_UsuariosMouseMoved
         jPanel_Usuarios.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel_UsuariosMouseMoved

    private void jPanel_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_UsuariosMouseExited
         jPanel_Usuarios.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_jPanel_UsuariosMouseExited

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel_Agenda;
    private javax.swing.JPanel jPanel_Citas;
    private javax.swing.JPanel jPanel_Historial;
    private javax.swing.JPanel jPanel_Home;
    private javax.swing.JPanel jPanel_Pacientes;
    private javax.swing.JPanel jPanel_Reportes;
    private javax.swing.JPanel jPanel_Usuarios;
    // End of variables declaration//GEN-END:variables
}
