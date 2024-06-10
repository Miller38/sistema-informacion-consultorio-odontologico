package vista;

// Importa la clase Connection de java.sql para manejar la conexión con la base de datos
import java.sql.Connection;
// Importa la clase Conexion de un paquete personalizado 'conexion' para gestionar la conexión con la base de datos
import conexion.Conexion;
// Importa la clase PreparedStatement de java.sql para ejecutar consultas SQL precompiladas
import java.sql.Statement;
import java.awt.Image;
// Importa la clase SQLException de java.sql para manejar excepciones SQL
import java.sql.SQLException;
// Importa la clase ResultSet de java.sql para manejar los resultados de las consultas SQL
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Milliany Tech
 * @version: 0.1
 * @Date 2 enero - 2024
 * @Name Sistema de informacion
 *
 */
public class FrmFacturacion extends javax.swing.JFrame {

    public FrmFacturacion() {

        // Metodo para poner transparente el jframe
        //setUndecorated(true);
        initComponents();

        this.setSize(700, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Facturacion");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // cargar pacientes vista
        this.cargarPacientes();

        // Redondear las esquinas del jframe 
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
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
//        ImageIcon wallpaper_logo = new ImageIcon("src/img/logo.png");
//        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(
//                jLabel_Logo.getWidth(),
//                jLabel_Logo.getHeight(),
//                Image.SCALE_DEFAULT));
//        jLabel_Logo.setIcon(icono_logo);
//        this.repaint();
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

        jLabel_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_servicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_paciente = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        txt_paciente_buscar = new javax.swing.JTextField();
        Btn_buscar_paciente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Btn_añadir_servicio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_servicios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_totalpagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Btn_registrar_venta = new javax.swing.JButton();
        jLabel_cabecera = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Facturación");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        jComboBox_servicio.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_servicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_servicio.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Servicio", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Servicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jComboBox_paciente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_paciente.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar paciente", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txt_cantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 171, 70, 20));

        txt_paciente_buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_paciente_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, -1));

        Btn_buscar_paciente.setBackground(new java.awt.Color(255, 255, 255));
        Btn_buscar_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_buscar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        Btn_buscar_paciente.setText("Buscar");
        Btn_buscar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_buscar_pacienteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_buscar_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, 20));

        Btn_añadir_servicio.setBackground(new java.awt.Color(255, 255, 255));
        Btn_añadir_servicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_añadir_servicio.setForeground(new java.awt.Color(51, 51, 51));
        Btn_añadir_servicio.setText("Añadir Servicio");
        getContentPane().add(Btn_añadir_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_servicios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 640, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Subtotal :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Descuento :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Iva :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Total a pagar :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Efectivo :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cambio :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txt_subtotal.setEditable(false);
        txt_subtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, -1));

        txt_descuento.setEditable(false);
        txt_descuento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 140, -1));

        txt_iva.setEditable(false);
        txt_iva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, -1));

        txt_totalpagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_totalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 140, -1));

        txt_efectivo.setEditable(false);
        txt_efectivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));

        txt_cambio.setEditable(false);
        txt_cambio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Calcular cambio");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 150, 50));

        Btn_registrar_venta.setBackground(new java.awt.Color(255, 255, 255));
        Btn_registrar_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_registrar_venta.setForeground(new java.awt.Color(51, 51, 51));
        Btn_registrar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer_3.png"))); // NOI18N
        Btn_registrar_venta.setText("Registrar Venta");
        Btn_registrar_venta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_registrar_venta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(Btn_registrar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 640, 200));
        getContentPane().add(jLabel_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_buscar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_buscar_pacienteActionPerformed
        // Obtiene el texto del campo de búsqueda y lo recorta para eliminar espacios en blanco al principio y al final
        String pacienteBuscar = txt_paciente_buscar.getText().trim();
        // Establece la conexión a la base de datos
        Connection cn = Conexion.conectar();
        // Consulta SQL para obtener el nombre y apellido del paciente con la identificación especificada
        String sql = "SELECT nombre, apellido FROM paciente WHERE identificacion = '" + pacienteBuscar + "'";
        Statement st;
        try {
            // Crea una declaración para ejecutar la consulta SQL
            st = cn.createStatement();
            // Ejecuta la consulta SQL y obtiene los resultados
            ResultSet rs = st.executeQuery(sql);
            // Verifica si se encontró un resultado
            if (rs.next()) {
                // Selecciona el paciente en el JComboBox con el formato "nombre apellido"
                jComboBox_paciente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            } else {
                // Selecciona el ítem predeterminado en el JComboBox si no se encuentra el paciente
                jComboBox_paciente.setSelectedItem("Seleccione paciente");
                // Muestra un cuadro de diálogo de JOptionPane con un mensaje personalizado, título y un ícono
                JOptionPane.showMessageDialog(null, "Identificación no encontrada", "Warning!",
                        JOptionPane.PLAIN_MESSAGE, getIcon("/img/warning.png", 40, 40));
            }
            // Limpia el campo de texto de búsqueda
            txt_paciente_buscar.setText("");
            // Cierra la conexión a la base de datos
            cn.close();
        } catch (SQLException e) {
            // Maneja cualquier error que ocurra durante la consulta y muestra un mensaje de error
            System.out.println("Error al cargar pacientes " + e.getMessage());
        }

    }//GEN-LAST:event_Btn_buscar_pacienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFacturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_añadir_servicio;
    private javax.swing.JButton Btn_buscar_paciente;
    private javax.swing.JButton Btn_registrar_venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_paciente;
    private javax.swing.JComboBox<String> jComboBox_servicio;
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
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_servicios;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JTextField txt_paciente_buscar;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_totalpagar;
    // End of variables declaration//GEN-END:variables

    // -------------------------------- Metodo para cargar pacientes en combobox -----------------------------------------//
    private void cargarPacientes() {
        // Establece la conexión a la base de datos
        Connection cn = Conexion.conectar();
        // Consulta SQL para obtener todos los pacientes
        String sql = "SELECT * FROM paciente";
        Statement st;
        try {
            // Crea una declaración para ejecutar la consulta SQL
            st = cn.createStatement();
            // Ejecuta la consulta SQL y obtiene los resultados
            ResultSet rs = st.executeQuery(sql);
            // Limpia el combobox de pacientes
            jComboBox_paciente.removeAllItems();
            // Agrega un ítem predeterminado al combobox
            jComboBox_paciente.addItem("Seleccione paciente");

            // Recorre los resultados de la consulta
            while (rs.next()) {
                // Agrega cada paciente al combobox con el formato "nombre apellido"
                jComboBox_paciente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            // Cierra la conexión a la base de datos
            cn.close();
        } catch (SQLException e) {
            // Maneja cualquier error que ocurra durante la consulta y muestra un mensaje de error
            System.out.println("Error al cargar pacientes " + e.getMessage());
        }
    }

    // ------------------------------ Metodo para agregar iconos a los JOptionPane  -----------------------------//
    private Icon getIcon(String path, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path))
                .getImage().getScaledInstance(w, h, 0));
    }

}
