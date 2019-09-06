/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;



import Conexion.Conexion;
import static Formularios.Cobro.Cambio;
import static Formularios.Cobro.Efectivo;
import static Formularios.Cobro.lbltotal;
import static Formularios.Facturar.ced_cli;
import static Formularios.Facturar.codFac;
import static Formularios.Facturar.lblFecha;
import static Formularios.Facturar.lblIva;
import static Formularios.Facturar.lblNombre;
import static Formularios.Facturar.lblSubtotal;
import static Formularios.Facturar.lblTotal;
import static Interfaz.Menu.jDesktopPane1;
import static Caja.validar.jPasswordField1;
import Validaciones.Recurso;
import Validaciones.Validaciones;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Ryeventh
 */
public class corte_ccccc extends javax.swing.JInternalFrame {
   private String sql = "INSERT INTO  public.cort(alias_corte , caso_corte , tipo_usuario_corte , fecha_actual , total_corte,cod )VALUES(? , ? , ? , ? , ?, ?)"; 
    private PreparedStatement ps = null;
     Conexion bd = new Conexion();
    Connection cn =Conexion.ConectarOracle();
    /**
     * Creates new form corte_ccccc
     */
    public corte_ccccc() {
        initComponents();
 
         setVisible(true);
            
    }

    public void pinta_text() {
        Validaciones.pinta_text(jTextField1_login_grab);
        Validaciones.pinta_text(jTextField_Nombre_grab);
        Validaciones.pinta_text(jTextField_tipo_grab);
        Validaciones.pinta_text(jTextField1_corte_total);
          
    }
    
    public boolean form_validado1() {
        boolean ok = true;
        String men = "";
        //validar requerido

        if (!Validaciones.esRequerido(jTextField1_login_grab)) {
            ok = false;
            men += ", Alias";
        }
        if (!Validaciones.esRequerido(jTextField_Nombre_grab)) {
            ok = false;
            men += ", Caso ";
        }
        if (!Validaciones.esRequerido(jTextField_tipo_grab)) {
            ok = false;
            men += ", tipo de usuario";
        }
        if (!Validaciones.esRequerido(jTextField1_corte_total)) {
            ok = false;
            men += ", total del corte ";
        }
      
        jLabel16.setText(men);
        return ok;
    }
  public void limpiar() {
       jTextField1_login_grab.setText("");
       jTextField_Nombre_grab.setText("");
       jTextField_tipo_grab.setText("");
       jTextField1_corte_total.setText("");
       jTextField1_corte_total.setText("");
       jTextField1_total_opcion.setText("");
       jTextField2_comprobar_total.setText("");
       ide.setText("");
       fecha_actual.setCalendar(Calendar.getInstance());
       jTextField_20.setText("");
       jTextField_200.setText("");
       jTextField_50.setText("");
       jTextField_1000.setText("");
       jTextField_100.setText("");
       jTextField_500.setText("");
       jTextField_20total.setText("");
       jTextField_50total.setText("");
       jTextField_100total.setText("");
       jTextField_200total.setText("");
       jTextField_500total.setText("");
       jTextField_1000total.setText("");
       
       
    }
  

    public void insertarFecha(){
    if (form_validado1()) {
            pinta_text();
 int n=JOptionPane.showConfirmDialog(null,"Desea enviar corte al administrador","Verifique antes de enviar",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
          
          try{
             
           Conexion.ConectarOracle();
           ps=cn.prepareStatement(sql);
           ps.setString(1, jTextField1_login_grab.getText());
           ps.setString(2, jTextField_Nombre_grab.getText());
           ps.setString(3, jTextField_tipo_grab.getText());
           ps.setString(4,((JTextField)fecha_actual.getDateEditor().getUiComponent()).getText());
           ps.setString(5, jTextField1_corte_total.getText());
           ps.setString(6, ide.getText());
           ps.execute();
           jTextField1_login_grab.setEnabled(false);
        jTextField1_corte_total.setEnabled(false);
        jTextField_tipo_grab.setEnabled(false);
        fecha_actual.setEnabled(false);
        limpiar();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error de conexion"+ e.getMessage());
       }
    
 
 } 
      else{
 
   }
    }
   } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_tipous = new javax.swing.JComboBox<>();
        jTextField_nombre = new javax.swing.JComboBox<>();
        alias = new javax.swing.JComboBox<>();
        fecha_actual = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ide = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_20 = new javax.swing.JTextField();
        jTextField_50 = new javax.swing.JTextField();
        jTextField_100 = new javax.swing.JTextField();
        jTextField_200 = new javax.swing.JTextField();
        jTextField_500 = new javax.swing.JTextField();
        jTextField_1000 = new javax.swing.JTextField();
        jTextField_total = new javax.swing.JTextField();
        jTextField_20total = new javax.swing.JTextField();
        jTextField_100total = new javax.swing.JTextField();
        jTextField_50total = new javax.swing.JTextField();
        jTextField_1000total = new javax.swing.JTextField();
        jTextField_200total = new javax.swing.JTextField();
        jTextField_500total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1_50mul = new javax.swing.JTextField();
        jTextField1_200mul = new javax.swing.JTextField();
        jTextField1_100mul = new javax.swing.JTextField();
        jTextField1_500mul = new javax.swing.JTextField();
        jTextField1_1000mul = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField_totalmonedas = new javax.swing.JTextField();
        jTextField1_20mul = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1_total_opcion = new javax.swing.JTextField();
        jTextField2_comprobar_total = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_login_grab = new javax.swing.JTextField();
        jTextField_tipo_grab = new javax.swing.JTextField();
        jTextField_Nombre_grab = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1_corte_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Corte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 45, 93))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 204));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alias (Usuario login :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Accion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de usuario :");

        jTextField_tipous.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_tipous.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el usuario al que pertenece", "Cajero", "Administrador" }));
        jTextField_tipous.setEnabled(false);
        jTextField_tipous.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTextField_tipousItemStateChanged(evt);
            }
        });

        jTextField_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_nombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el motivo por el corte de caja", "Cambio de turno", "Problemas personales", "Corte Parcial", "otros" }));
        jTextField_nombre.setEnabled(false);
        jTextField_nombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTextField_nombreItemStateChanged(evt);
            }
        });

        alias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige usuario", "Luisa@gg ", "Luisa_admi", "Yadira@VV", "Mario_V.acc", "Juan.acc", "Ronaldo_ac" }));
        alias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alias.setEnabled(false);
        alias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aliasItemStateChanged(evt);
            }
        });

        fecha_actual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fecha_actual.setForeground(new java.awt.Color(0, 102, 102));
        fecha_actual.setDateFormatString("d/MM/yyyy HH:mm:ss");
        fecha_actual.setEnabled(false);
        fecha_actual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha_actual.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                fecha_actualComponentRemoved(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fecha / Hora:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_tipous, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_tipous, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(40, 100, 810, 210);

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel15.setText("Clic para Iniciar Corte");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(50, 30, 130, 16);

        ide.setEditable(false);
        ide.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ide.setEnabled(false);
        jPanel2.add(ide);
        ide.setBounds(410, 40, 230, 40);

        jButton3.setText("Nuevo Corte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 50, 210, 40);

        jLabel19.setText("ID Corte");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(350, 40, 120, 40);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("Es necesario completar el formulario ");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(40, 10, 270, 16);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setOpaque(false);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(840, 10, 20, 20);

        jTabbedPane1.addTab("  Datos Formulario de corte  ", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setMaximumSize(new java.awt.Dimension(885, 290));
        jPanel1.setMinimumSize(new java.awt.Dimension(885, 290));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("Ingresa Montos para realizar el calculo:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(35, 13, 235, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Billetes ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 30, 47, 15);

        jTextField_20.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_20.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_20KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_20KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_20);
        jTextField_20.setBounds(40, 150, 91, 30);

        jTextField_50.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_50.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_50KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_50KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_50);
        jTextField_50.setBounds(170, 150, 91, 30);

        jTextField_100.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_100.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_100KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_100KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_100);
        jTextField_100.setBounds(310, 150, 91, 30);

        jTextField_200.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_200.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_200.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_200KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_200KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_200);
        jTextField_200.setBounds(440, 150, 91, 30);

        jTextField_500.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_500.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_500.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_500KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_500KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_500);
        jTextField_500.setBounds(580, 150, 91, 30);

        jTextField_1000.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_1000.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_1000.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_1000KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_1000KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_1000);
        jTextField_1000.setBounds(710, 150, 91, 30);

        jTextField_total.setEditable(false);
        jTextField_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(0, 153, 0));
        jTextField_total.setMaximumSize(new java.awt.Dimension(59, 20));
        jTextField_total.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextField_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_total);
        jTextField_total.setBounds(710, 260, 91, 30);

        jTextField_20total.setEditable(false);
        jTextField_20total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_20total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_20total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_20total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_20total.setEnabled(false);
        jPanel1.add(jTextField_20total);
        jTextField_20total.setBounds(41, 190, 90, 25);

        jTextField_100total.setEditable(false);
        jTextField_100total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_100total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_100total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_100total.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_100total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_100total.setEnabled(false);
        jPanel1.add(jTextField_100total);
        jTextField_100total.setBounds(311, 190, 90, 25);

        jTextField_50total.setEditable(false);
        jTextField_50total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_50total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_50total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_50total.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_50total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_50total.setEnabled(false);
        jPanel1.add(jTextField_50total);
        jTextField_50total.setBounds(171, 190, 90, 25);

        jTextField_1000total.setEditable(false);
        jTextField_1000total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_1000total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_1000total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_1000total.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_1000total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_1000total.setEnabled(false);
        jPanel1.add(jTextField_1000total);
        jTextField_1000total.setBounds(710, 190, 90, 25);

        jTextField_200total.setEditable(false);
        jTextField_200total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_200total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_200total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_200total.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_200total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_200total.setEnabled(false);
        jPanel1.add(jTextField_200total);
        jTextField_200total.setBounds(441, 190, 90, 25);

        jTextField_500total.setEditable(false);
        jTextField_500total.setBackground(new java.awt.Color(235, 235, 235));
        jTextField_500total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_500total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_500total.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_500total.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        jTextField_500total.setEnabled(false);
        jPanel1.add(jTextField_500total);
        jTextField_500total.setBounds(580, 190, 90, 25);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(97, 232, 318, 0);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/20pesos.jpg"))); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(40, 80, 90, 50);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/50.jpeg"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(170, 80, 100, 50);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/100.jpg"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(310, 80, 100, 50);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/1000 150px.jpg"))); // NOI18N
        jLabel24.setText("jLabel20");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(710, 80, 100, 50);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/500.png"))); // NOI18N
        jLabel23.setText("jLabel20");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(580, 80, 100, 50);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/200.jpg"))); // NOI18N
        jLabel22.setText("jLabel20");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(440, 80, 100, 50);

        jTextField1_50mul.setEditable(false);
        jTextField1_50mul.setText("50");
        jTextField1_50mul.setEnabled(false);
        jPanel1.add(jTextField1_50mul);
        jTextField1_50mul.setBounds(190, 100, 47, 20);

        jTextField1_200mul.setEditable(false);
        jTextField1_200mul.setText("200");
        jTextField1_200mul.setEnabled(false);
        jPanel1.add(jTextField1_200mul);
        jTextField1_200mul.setBounds(470, 100, 47, 20);

        jTextField1_100mul.setEditable(false);
        jTextField1_100mul.setText("100");
        jTextField1_100mul.setEnabled(false);
        jPanel1.add(jTextField1_100mul);
        jTextField1_100mul.setBounds(340, 100, 47, 20);

        jTextField1_500mul.setEditable(false);
        jTextField1_500mul.setText("500");
        jTextField1_500mul.setEnabled(false);
        jPanel1.add(jTextField1_500mul);
        jTextField1_500mul.setBounds(610, 100, 47, 20);

        jTextField1_1000mul.setEditable(false);
        jTextField1_1000mul.setText("1000");
        jTextField1_1000mul.setEnabled(false);
        jPanel1.add(jTextField1_1000mul);
        jTextField1_1000mul.setBounds(740, 100, 47, 20);

        jLabel13.setText("Total Monedas");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(630, 224, 81, 30);

        jTextField_totalmonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalmonedasActionPerformed(evt);
            }
        });
        jTextField_totalmonedas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_totalmonedasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_totalmonedasKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_totalmonedas);
        jTextField_totalmonedas.setBounds(710, 220, 91, 30);

        jTextField1_20mul.setEditable(false);
        jTextField1_20mul.setText("20");
        jTextField1_20mul.setEnabled(false);
        jPanel1.add(jTextField1_20mul);
        jTextField1_20mul.setBounds(50, 100, 47, 20);

        jPanel7.setBackground(new java.awt.Color(233, 234, 233));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("Total corte");

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addComponent(jLabel11)
                .addGap(158, 158, 158))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(30, 60, 820, 270);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(840, 10, 20, 20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("  Proceso de corte  ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Este panel, solo se utilizara si ya cuenta con el corte establecido, es decir si realizo el conteo manual:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1_total_opcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1_total_opcionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_total_opcionKeyReleased(evt);
            }
        });

        jTextField2_comprobar_total.setEditable(false);
        jTextField2_comprobar_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2_comprobar_total.setForeground(new java.awt.Color(0, 153, 0));

        jButton5.setText("Cargar...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cantidad de efectivo TOTAL :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Commpruebe su total:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2_comprobar_total)
                            .addComponent(jTextField1_total_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_total_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_comprobar_total, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setOpaque(false);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Insertar Total  ", jPanel4);

        jPanel6.setBackground(new java.awt.Color(50, 45, 93));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setMaximumSize(new java.awt.Dimension(910, 290));
        jPanel6.setMinimumSize(new java.awt.Dimension(910, 290));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alias (Usuario login) :");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(80, 10, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acción :");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(150, 50, 80, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de usuario :");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(100, 110, 140, 40);

        jTextField1_login_grab.setEditable(false);
        jTextField1_login_grab.setBackground(new java.awt.Color(238, 232, 232));
        jPanel6.add(jTextField1_login_grab);
        jTextField1_login_grab.setBounds(240, 10, 150, 30);

        jTextField_tipo_grab.setEditable(false);
        jTextField_tipo_grab.setBackground(new java.awt.Color(238, 232, 232));
        jTextField_tipo_grab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_tipo_grabKeyPressed(evt);
            }
        });
        jPanel6.add(jTextField_tipo_grab);
        jTextField_tipo_grab.setBounds(240, 110, 150, 30);

        jTextField_Nombre_grab.setEditable(false);
        jTextField_Nombre_grab.setBackground(new java.awt.Color(238, 232, 232));
        jTextField_Nombre_grab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nombre_grabActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField_Nombre_grab);
        jTextField_Nombre_grab.setBounds(240, 60, 150, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Corte Total al dia :");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(520, 0, 170, 50);

        jTextField1_corte_total.setEditable(false);
        jTextField1_corte_total.setBackground(new java.awt.Color(238, 232, 232));
        jTextField1_corte_total.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1_corte_total.setForeground(new java.awt.Color(51, 102, 255));
        jTextField1_corte_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(jTextField1_corte_total);
        jTextField1_corte_total.setBounds(430, 40, 360, 53);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Enviar al administrador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(520, 110, 153, 30);

        jLabel16.setBackground(new java.awt.Color(204, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel16);
        jLabel16.setBounds(10, 150, 880, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 874, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 373, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 182, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_tipousItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTextField_tipousItemStateChanged
        // TODO add your handling code here:
        String n1 = String.valueOf(jTextField_tipous.getSelectedItem());
        jTextField_tipo_grab.setText("" + n1);

    }//GEN-LAST:event_jTextField_tipousItemStateChanged

    private void jTextField_nombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTextField_nombreItemStateChanged
        // TODO add your handling code here:
        String n1 = String.valueOf(jTextField_nombre.getSelectedItem());
        jTextField_Nombre_grab.setText("" + n1);
    }//GEN-LAST:event_jTextField_nombreItemStateChanged

    private void aliasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aliasItemStateChanged
        // TODO add your handling code here:lige
        String n1 = String.valueOf(alias.getSelectedItem());
        jTextField1_login_grab.setText("" + n1);

    }//GEN-LAST:event_aliasItemStateChanged

    private void jTextField_20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_20KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_20KeyPressed

    private void jTextField_20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_20KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_20mul.getText());
            double n2 = Double.parseDouble(jTextField_20.getText());
            float result = (float) (n2 * n1);
            jTextField_20total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_20KeyReleased

    private void jTextField_50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_50KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_50KeyPressed

    private void jTextField_50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_50KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_50mul.getText());
            double n2 = Double.parseDouble(jTextField_50.getText());
            float result = (float) (n2 * n1);
            jTextField_50total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_50KeyReleased

    private void jTextField_100KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_100KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_100KeyPressed

    private void jTextField_100KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_100KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_100mul.getText());
            double n2 = Double.parseDouble(jTextField_100.getText());
            float result = (float) (n2 * n1);
            jTextField_100total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_100KeyReleased

    private void jTextField_200KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_200KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_200KeyPressed

    private void jTextField_200KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_200KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_200mul.getText());
            double n2 = Double.parseDouble(jTextField_200.getText());
            float result = (float) (n2 * n1);
            jTextField_200total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_200KeyReleased

    private void jTextField_500KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_500KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_500KeyPressed

    private void jTextField_500KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_500KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_500mul.getText());
            double n2 = Double.parseDouble(jTextField_500.getText());
            float result = (float) (n2 * n1);
            jTextField_500total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_500KeyReleased

    private void jTextField_1000KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_1000KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_1000KeyPressed

    private void jTextField_1000KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_1000KeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_1000mul.getText());
            double n2 = Double.parseDouble(jTextField_1000.getText());
            float result = (float) (n2 * n1);
            jTextField_1000total.setText("" + result);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField_1000KeyReleased

    private void jTextField_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalActionPerformed

    private void jTextField_totalmonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalmonedasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalmonedasActionPerformed

    private void jTextField_totalmonedasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_totalmonedasKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_totalmonedasKeyPressed

    private void jTextField_totalmonedasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_totalmonedasKeyReleased
        // TODO add your handling code here:
        try {
            double t = Double.parseDouble(jTextField_50total.getText());
            double t1 = Double.parseDouble(jTextField_20total.getText());
            double t2 = Double.parseDouble(jTextField_100total.getText());
            double t3 = Double.parseDouble(jTextField_200total.getText());
            double t4 = Double.parseDouble(jTextField_500total.getText());
            double t5 = Double.parseDouble(jTextField_1000total.getText());
            double t6 = Double.parseDouble(jTextField_totalmonedas.getText());

            float res = (float) (t + t1 + t2 + t3 + t4 + t5 + t6);
            jTextField_total.setText("" + res);
        } catch (NumberFormatException result) {
            System.out.println(result);
        }
    }//GEN-LAST:event_jTextField_totalmonedasKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            double t = Double.parseDouble(jTextField_50total.getText());
            double t1 = Double.parseDouble(jTextField_20total.getText());
            double t2 = Double.parseDouble(jTextField_100total.getText());
            double t3 = Double.parseDouble(jTextField_200total.getText());
            double t4 = Double.parseDouble(jTextField_500total.getText());
            double t5 = Double.parseDouble(jTextField_1000total.getText());
            double t6 = Double.parseDouble(jTextField_totalmonedas.getText());

            float res = (float) (t + t1 + t2 + t3 + t4 + t5 + t6);
            jTextField_total.setText("" + res);
        } catch (NumberFormatException result) {
            System.out.println(result);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField_total.getText());
            jTextField1_corte_total.setText("" + n1);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1_total_opcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_total_opcionKeyPressed
        // TODO add your handling code here:
        // calcular

    }//GEN-LAST:event_jTextField1_total_opcionKeyPressed

    private void jTextField1_total_opcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_total_opcionKeyReleased
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField1_total_opcion.getText());
            jTextField2_comprobar_total.setText("" + n1);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jTextField1_total_opcionKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            double n1 = Double.parseDouble(jTextField2_comprobar_total.getText());
            jTextField1_corte_total.setText("" + n1);
        } catch (NumberFormatException result) {
            System.out.println(result);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField_tipo_grabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tipo_grabKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_tipo_grabKeyPressed

    private void jTextField_Nombre_grabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nombre_grabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Nombre_grabActionPerformed
public boolean  abrir_ventana()
   { 
        validar mc = new validar();      
        int x = (jDesktopPane1.getWidth() / 2) - (mc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (mc.getHeight() / 2);
        if (mc.isShowing()) {
            mc.setLocation(x, y);
     
        } else {
            jDesktopPane1.add(mc);
            mc.setLocation(x, y);
            mc.show();
        }
      
          return false;
    }    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        validar mc = new validar();      
        int x = (jDesktopPane1.getWidth() / 2) - (mc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (mc.getHeight() / 2);
        if (mc.isShowing()) {
            mc.setLocation(x, y);
     
        } else {
            jDesktopPane1.add(mc);
            mc.setLocation(x, y);
            mc.show();
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed
 public void desbloquear() {
       alias.setEnabled(true);
        jTextField_nombre.setEnabled(true);
       jTextField_tipous.setEnabled(true);
        fecha_actual.setEnabled(true);
        
 
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //new corte
        try{
        Calendar cal = Calendar.getInstance();
        String fecha;
        fecha = cal.get(Calendar.DATE) + "" + (cal.get(Calendar.MARCH) + 1) + "" + cal.get(Calendar.YEAR)+""+cal.get(Calendar.HOUR) + "" + (cal.get(Calendar.MINUTE)) + "" + cal.get(Calendar.SECOND);
        this.ide.setText(fecha);
         desbloquear();
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fecha_actualComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_fecha_actualComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_actualComponentRemoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alias;
    public static com.toedter.calendar.JDateChooser fecha_actual;
    private javax.swing.JTextField ide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1_1000mul;
    private javax.swing.JTextField jTextField1_100mul;
    private javax.swing.JTextField jTextField1_200mul;
    private javax.swing.JTextField jTextField1_20mul;
    private javax.swing.JTextField jTextField1_500mul;
    private javax.swing.JTextField jTextField1_50mul;
    public static javax.swing.JTextField jTextField1_corte_total;
    public static javax.swing.JTextField jTextField1_login_grab;
    private javax.swing.JTextField jTextField1_total_opcion;
    private javax.swing.JTextField jTextField2_comprobar_total;
    private javax.swing.JTextField jTextField_100;
    private javax.swing.JTextField jTextField_1000;
    private javax.swing.JTextField jTextField_1000total;
    private javax.swing.JTextField jTextField_100total;
    private javax.swing.JTextField jTextField_20;
    private javax.swing.JTextField jTextField_200;
    private javax.swing.JTextField jTextField_200total;
    private javax.swing.JTextField jTextField_20total;
    private javax.swing.JTextField jTextField_50;
    private javax.swing.JTextField jTextField_500;
    private javax.swing.JTextField jTextField_500total;
    private javax.swing.JTextField jTextField_50total;
    public static javax.swing.JTextField jTextField_Nombre_grab;
    private javax.swing.JComboBox<String> jTextField_nombre;
    public static javax.swing.JTextField jTextField_tipo_grab;
    private javax.swing.JComboBox<String> jTextField_tipous;
    private javax.swing.JTextField jTextField_total;
    private javax.swing.JTextField jTextField_totalmonedas;
    // End of variables declaration//GEN-END:variables
}
