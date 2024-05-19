
package vista;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Miller
 */
public class FrmLicencia extends JFrame implements ActionListener, ChangeListener{
    
    private JLabel label1, label2 ;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane1;
    private JTextArea textarea1;
    String nombre = "";
 
    
    public FrmLicencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        // cierra todos los procesos en segundo plano cuando se cierra lainterfaz
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
        setIconImage(new ImageIcon(getClass().getResource("/img/dentistry.png")).getImage());
        
        
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 3, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                                         "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE MILLIAN.TECH. "  +
                                         "\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." + 
                                         "\n          C. MILLIAN.TECH NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                                         "\n\n          LOS ACUERDOS EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                                         "\n          (MILLIAN.TECH Y EL AUTOR MILLER), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                                         "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO)" +
                                         "\n          SI USTED NO ACEPTA ESTOS TERMINOS , HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                                         "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                                         "\n          https://www.millian.tech.com");
        scrollPane1 = new JScrollPane(textarea1);
        scrollPane1.setBounds(10,40,575,200);
        add(scrollPane1);
        
        check1 = new JCheckBox("Yo  acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);
        
        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
        
        boton2 = new JButton("No "+ nombre +"acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
        

    }
    
    // Metodo para los eventos del chekbox
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true ){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
             boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    // Metodo para los eventos de los botones
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Menu menu =new Menu();
            menu.setBounds(0,0,996,541);
            menu.setVisible(true);
            menu.setResizable(false);
            menu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
         if(e.getSource() == boton2){
            FrmLogin login = new FrmLogin();
            login.setBounds(0,0,700,500);
            login.setVisible(true);
            login.setResizable(false);
            login.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        FrmLicencia Licencia = new FrmLicencia();
        Licencia.setBounds(0,0,610,370);
        Licencia.setVisible(true);
        Licencia.setResizable(false);
        Licencia.setLocationRelativeTo(null);
    }
    
}
