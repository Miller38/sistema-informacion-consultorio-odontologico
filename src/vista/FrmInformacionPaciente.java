package vista;

import conexion.Conexion;
import controlador.Ctrl_Paciente;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Paciente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import servicios.TextPrompt;

/**
 *
 * @author Miller
 */
public class FrmInformacionPaciente extends javax.swing.JFrame {

    public FrmInformacionPaciente() {
        initComponents();
        this.setTitle("Informacion  Pacientes");
        this.setSize(635, 592);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
          TextPrompt nombrePrompt = new TextPrompt("   Ingrese la identificacion .", txt_buscarPac);
        
        
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

        txt_nombrePac = new javax.swing.JTextField();
        txt_apellidoPac = new javax.swing.JTextField();
        txt_identificacionPac = new javax.swing.JTextField();
        txt_direccionPac = new javax.swing.JTextField();
        txt_telefonoPac = new javax.swing.JTextField();
        jLabel_imagenPac = new javax.swing.JLabel();
        Btn_buscarPac = new javax.swing.JButton();
        txt_buscarPac = new javax.swing.JTextField();
        txt_fechaNacimiento = new javax.swing.JTextField();
        txt_ciudadPac = new javax.swing.JTextField();
        txt_emailPac = new javax.swing.JTextField();
        Btn_regresar = new javax.swing.JButton();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_odontologo = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombrePac.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombrePac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombrePac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombrePac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombrePac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, -1));

        txt_apellidoPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellidoPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidoPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_apellidoPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, -1));

        txt_identificacionPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_identificacionPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_identificacionPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_identificacionPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_identificacionPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionPacActionPerformed(evt);
            }
        });
        getContentPane().add(txt_identificacionPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 230, -1));

        txt_direccionPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccionPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_direccionPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccionPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_direccionPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionPacActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccionPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 230, -1));

        txt_telefonoPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefonoPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefonoPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefonoPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefonoPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 230, -1));

        jLabel_imagenPac.setToolTipText("Imagen del paciente");
        jLabel_imagenPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel_imagenPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 170, 170));

        Btn_buscarPac.setBackground(new java.awt.Color(255, 255, 255));
        Btn_buscarPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_buscarPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_locate.png"))); // NOI18N
        Btn_buscarPac.setText("      Buscar");
        Btn_buscarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_buscarPacActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_buscarPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, -1));

        txt_buscarPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscarPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_buscarPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscarPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_buscarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarPacActionPerformed(evt);
            }
        });
        getContentPane().add(txt_buscarPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, -1));

        txt_fechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txt_fechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechaNacimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, -1));

        txt_ciudadPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_ciudadPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_ciudadPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ciudadPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ciudadPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 230, -1));

        txt_emailPac.setBackground(new java.awt.Color(255, 255, 255));
        txt_emailPac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_emailPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_emailPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_emailPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 230, -1));

        Btn_regresar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        Btn_regresar.setText("Regresar");
        Btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 160, 40));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Identificacion :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Identificacion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ciudad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));
        getContentPane().add(txt_odontologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 230, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_identificacionPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionPacActionPerformed

    private void Btn_buscarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_buscarPacActionPerformed
        String identificacion = txt_buscarPac.getText().trim();

        if (!identificacion.isEmpty()) {
            cargarInformacionPaciente(identificacion);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una identificación", "Advertencia", JOptionPane.QUESTION_MESSAGE);
        }

    }//GEN-LAST:event_Btn_buscarPacActionPerformed

    private void Btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_regresarActionPerformed
      // Cierra la ventana actual
        this.setVisible(false);
        this.dispose();

        // Crea y muestra la ventana de Menu
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_Btn_regresarActionPerformed

    private void txt_direccionPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionPacActionPerformed

    private void txt_buscarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarPacActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInformacionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInformacionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInformacionPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_buscarPac;
    private javax.swing.JButton Btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_cabecera;
    private javax.swing.JLabel jLabel_imagenPac;
    private javax.swing.JTextField txt_apellidoPac;
    private javax.swing.JTextField txt_buscarPac;
    private javax.swing.JTextField txt_ciudadPac;
    private javax.swing.JTextField txt_direccionPac;
    private javax.swing.JTextField txt_emailPac;
    private javax.swing.JTextField txt_fechaNacimiento;
    private javax.swing.JTextField txt_identificacionPac;
    private javax.swing.JTextField txt_nombrePac;
    private javax.swing.JTextField txt_odontologo;
    private javax.swing.JTextField txt_telefonoPac;
    // End of variables declaration//GEN-END:variables

    private void cargarInformacionPaciente(String identificacion) {
        Ctrl_Paciente ctrlPaciente = new Ctrl_Paciente();
        Paciente paciente = ctrlPaciente.obtenerPaciente(identificacion);

        if (paciente != null) {
            txt_nombrePac.setText(paciente.getNombre());
            txt_apellidoPac.setText(paciente.getApellido());
            txt_identificacionPac.setText(paciente.getIdentificacion());
            // Conversión de Date a String
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(paciente.getFechaNacimiento());
            txt_fechaNacimiento.setText(fechaNacimiento);
            txt_direccionPac.setText(paciente.getDireccion());
            txt_telefonoPac.setText(paciente.getTelefono());
            txt_ciudadPac.setText(paciente.getCiudad());
            txt_emailPac.setText(paciente.getEmail());
            // Aquí puedes agregar lógica para cargar la imagen si es necesario
            // jLabel_imagenPac.setIcon(...);
        } else {
            JOptionPane.showMessageDialog(this, "Paciente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Limpiar() {
        // Limpia el campo de texto para el usuario, estableciéndolo como una cadena vacía.
        txt_nombrePac.setText("");
        txt_apellidoPac.setText("");
        txt_identificacionPac.setText("");
        txt_fechaNacimiento.setText("");
        txt_direccionPac.setText("");
        txt_ciudadPac.setText("");
        txt_telefonoPac.setText("");
        txt_emailPac.setText("");
    }

}
