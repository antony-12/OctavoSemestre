/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Consultas.Consulta_Productos;
import Consultas.Consulta_clientes;
import Consultas.Consultar_ventas;
import Controlador.operaciones_detalleFac;
import Controlador.operaciones_factura;
import Controlador.operaciones_productos;
import Controlador.operaciones_clientes;
import Validaciones.Validaciones;
import static Interfaz.Menu.jDesktopPane1;
import Entidades.Factura;
import Entidades.detFactura;
import static Formularios.Facturar.ced_cli;
import static Formularios.Facturar.codFac;
import static Formularios.Facturar.lblFecha;
import static Formularios.Facturar.lblIva;
import static Formularios.Facturar.lblNombre;
import static Formularios.Facturar.lblSubtotal;
import static Formularios.Facturar.lblTotal;
import Validaciones.Recurso;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ryeventh
 */
public class Cobr extends javax.swing.JInternalFrame implements Runnable  {

    /**
     * Creates new form Cobr
     */
        String hora,minutos,segundos,ampm;
     Thread hilo;  
    public Cobr() {
       initComponents();
  

    hilo = new Thread(this);
    hilo.start();
    Calendar cal = Calendar.getInstance();
        String fecha , hora;
     fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha4.setText(fecha);
   
   
    }


 public void hora()
    {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if (ampm.equals("PM")) 
        {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            
            hora = h>9?""+h:"0"+h;
            
        } 
        else
        {
            
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);   
        }
         minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
      public void run()
    {
        Thread current=Thread.currentThread();
        hora();
        int h;
        h= Integer.parseInt(hora);
        if (h==0) 
        {   
            
 
        while(current==hilo)
        {
            hora();
            
            lbltiempo4.setText("12"+":"+minutos+":"+segundos+" "+ampm);
        }
            
            
    
        } 
        else
        {
                   while(current==hilo)
        {
            hora();
            
            lbltiempo4.setText(hora+":"+minutos+":"+segundos+" "+ampm);
        }
            
        }
   
    }

      public boolean form_validado() {
        boolean ok = true;
      
        String total = "";
        String men = "";
        //validar requerido
if (!Validaciones.esRequerido(Efectivo)) {
            ok = false;
            men += "";
        }
if (!Validaciones.esRequerido(lbltotal)) {
            ok = false;
            total += "EL TOTAL ";
        }

        lbefectivo.setText(men);
        
        jLabel10.setText(total);
        return ok;
    }
 
  public boolean form_validado1() {
      
      boolean ok = true;
      
        String total = "";
        String men = "Intenta nuevamente";
       
         
        if (!Validaciones.esRequerido1(Efectivo)) {
            ok = false;
            total += "";
        }
        if (!Validaciones.esRequerido1(lbltotal)) {
          ok = false;
            total += "";
        }
           if (!Validaciones.esFlotante(Cambio)) {
          ok = false;
            total += "";
        }
        jLabel12.setText(men);
         return ok;
        
    }
  public void limpiar() {
        lbefectivo.setText("");
        Efectivo.setText("");
        lblcambio.setText("");
        jLabel10.setText("");
        Cambio.setText("");
    
}
    
    
    public void pinta_text() {
        Validaciones.pinta_text(Efectivo);
        label.setText("");
    }
    
    public void keyTypedcero() {
    
    }
          public void keyTyped(KeyEvent e) {
        
         char caracter = e.getKeyChar();
        if (Efectivo.getText().length() >= 15) {
            e.consume();
        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)&& (caracter != '.' || Efectivo.getText().contains(".")) ) {
            e.consume();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbefectivo = new javax.swing.JLabel();
        lblcambio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Efectivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JTextField();
        Cambio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancelarbtn = new javax.swing.JButton();
        JLB_Fecha4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        titulohora9 = new javax.swing.JLabel();
        lbltiempo4 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        cobrarbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tx101 = new javax.swing.JTextField();
        tx100 = new javax.swing.JTextField();
        tx200 = new javax.swing.JTextField();
        tx500 = new javax.swing.JTextField();
        tx1000 = new javax.swing.JTextField();
        tx50 = new javax.swing.JTextField();
        tx20 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tx51 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(665, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(665, 520));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 64, 260, 50);

        lbefectivo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbefectivo.setForeground(new java.awt.Color(204, 0, 0));
        lbefectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbefectivo);
        lbefectivo.setBounds(100, 150, 220, 50);

        lblcambio.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblcambio.setForeground(new java.awt.Color(204, 0, 0));
        lblcambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblcambio);
        lblcambio.setBounds(100, 230, 380, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Efectivo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(8, 150, 80, 50);

        Efectivo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Efectivo.setForeground(new java.awt.Color(51, 204, 0));
        Efectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectivoActionPerformed(evt);
            }
        });
        Efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EfectivoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EfectivoKeyTyped(evt);
            }
        });
        jPanel1.add(Efectivo);
        Efectivo.setBounds(100, 140, 300, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total a Pagar:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 10, 120, 33);

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(204, 0, 0));
        lbltotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbltotal.setCaretColor(new java.awt.Color(255, 0, 0));
        lbltotal.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        lbltotal.setEnabled(false);
        jPanel1.add(lbltotal);
        lbltotal.setBounds(100, 60, 300, 60);

        Cambio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Cambio.setForeground(new java.awt.Color(255, 204, 0));
        Cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cambio.setCaretColor(new java.awt.Color(255, 204, 0));
        Cambio.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        Cambio.setEnabled(false);
        jPanel1.add(Cambio);
        Cambio.setBounds(100, 210, 300, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cambio :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 210, 71, 65);

        cancelarbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarbtn.setForeground(new java.awt.Color(0, 153, 153));
        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cash in Hand_30px.png"))); // NOI18N
        cancelarbtn.setText("Cobrar");
        cancelarbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarbtn);
        cancelarbtn.setBounds(170, 280, 170, 50);

        JLB_Fecha4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLB_Fecha4.setForeground(new java.awt.Color(0, 102, 102));
        JLB_Fecha4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLB_Fecha4.setText("00/00/00");
        jPanel1.add(JLB_Fecha4);
        JLB_Fecha4.setBounds(70, 390, 130, 22);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Fecha");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(20, 390, 37, 19);

        titulohora9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        titulohora9.setForeground(new java.awt.Color(102, 0, 0));
        titulohora9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulohora9.setText("Hora:");
        jPanel1.add(titulohora9);
        titulohora9.setBounds(20, 420, 34, 19);

        lbltiempo4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbltiempo4.setForeground(new java.awt.Color(0, 102, 102));
        lbltiempo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltiempo4.setText("00:00:00");
        jPanel1.add(lbltiempo4);
        lbltiempo4.setBounds(70, 420, 130, 22);

        label.setBackground(new java.awt.Color(255, 255, 204));
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(label);
        label.setBounds(130, 470, 240, 40);

        cobrarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Bill_24px.png"))); // NOI18N
        cobrarbtn.setText("Calcular");
        cobrarbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cobrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cobrarbtn);
        cobrarbtn.setBounds(243, 340, 140, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Load_24px.png"))); // NOI18N
        jButton1.setText("Corregir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 380, 130, 30);

        tx101.setEditable(false);
        tx101.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tx101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx101.setCaretColor(new java.awt.Color(204, 153, 0));
        tx101.setDisabledTextColor(new java.awt.Color(0, 153, 153));
        tx101.setEnabled(false);
        jPanel1.add(tx101);
        tx101.setBounds(130, 470, 240, 40);

        tx100.setEditable(false);
        tx100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx100.setText("100");
        tx100.setEnabled(false);
        jPanel1.add(tx100);
        tx100.setBounds(530, 230, 0, 20);

        tx200.setEditable(false);
        tx200.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx200.setText("200");
        tx200.setEnabled(false);
        jPanel1.add(tx200);
        tx200.setBounds(470, 230, 0, 20);

        tx500.setEditable(false);
        tx500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx500.setText("500");
        tx500.setEnabled(false);
        jPanel1.add(tx500);
        tx500.setBounds(470, 230, 0, 20);

        tx1000.setEditable(false);
        tx1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx1000.setText("1000");
        tx1000.setEnabled(false);
        tx1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx1000ActionPerformed(evt);
            }
        });
        jPanel1.add(tx1000);
        tx1000.setBounds(470, 230, 0, 20);

        tx50.setEditable(false);
        tx50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx50.setText("50");
        tx50.setEnabled(false);
        tx50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx50ActionPerformed(evt);
            }
        });
        jPanel1.add(tx50);
        tx50.setBounds(470, 230, 0, 20);

        tx20.setEditable(false);
        tx20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx20.setText("20");
        tx20.setEnabled(false);
        tx20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx20ActionPerformed(evt);
            }
        });
        jPanel1.add(tx20);
        tx20.setBounds(470, 230, 0, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(90, 420, 300, 30);

        tx51.setEditable(false);
        tx51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx51.setText("50");
        tx51.setEnabled(false);
        tx51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx51ActionPerformed(evt);
            }
        });
        jPanel1.add(tx51);
        tx51.setBounds(470, 230, 0, 20);

        jPanel2.setBackground(new java.awt.Color(50, 45, 93));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(50, 45, 93));

        jToolBar1.setBackground(new java.awt.Color(50, 45, 93));
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar1.setPreferredSize(new java.awt.Dimension(152, 437));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jToolBar1.add(jLabel11);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/20pesos.jpg"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/50.jpeg"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel8);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/100 (3).jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel5);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/500.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel9);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caja/200.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel4);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1000 150px.jpg"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jToolBar1.add(jLabel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 170, 520));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(420, 0, 210, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EfectivoActionPerformed

    private void EfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EfectivoKeyPressed
        // TODO add your handling code here:
        if (form_validado()) {
            pinta_text();
            double n1 = Double.parseDouble(lbltotal.getText());
            double n2 = Double.parseDouble(Efectivo.getText());
            double result = n2 - n1;
            Cambio.setText("" + result);

        }

    }//GEN-LAST:event_EfectivoKeyPressed

    private void EfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EfectivoKeyTyped
        //evento donde me permite decimales
        keyTyped(evt);
    }//GEN-LAST:event_EfectivoKeyTyped

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        //cancela y mostar mensaje

        if (form_validado1() && form_validado()) {

            try {
                String cad = codFac.getText();
                //agregar parametros al reporte
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("id_factura", cad);
                //params.put("SUBREPORT_DIR", Global.getPathReport());
                Global.generarReporte("factura_venta", params);
                tx101.setText("Cobro Exitoso");

            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(this, "Imposible imprimir ticket");
            }
            dispose();
        }

    }//GEN-LAST:event_cancelarbtnActionPerformed

    private void cobrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarbtnActionPerformed
        if (form_validado()) {
            pinta_text();
            double n1 = Double.parseDouble(lbltotal.getText());
            double n2 = Double.parseDouble(Efectivo.getText());
            double result = n2 - n1;
            Cambio.setText("" + result);

        }
        //}
        //else{
            //  limpiar();
            // }
    }//GEN-LAST:event_cobrarbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
        String men ="Intenta de nuevo";

        if (!Validaciones.esRequerido1(Efectivo)) {

        }
        if (!Validaciones.esRequerido1(lbltotal)) {
        }
        if (!Validaciones.esRequerido1(Cambio)) {

        }
        jLabel12.setText(men);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        //20
        Efectivo.setText(tx20.getText());
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        //50
        Efectivo.setText(tx50.getText());
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Efectivo.setText(tx100.getText());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //200
        Efectivo.setText(tx200.getText());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:500
        Efectivo.setText(tx500.getText());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //1000
        Efectivo.setText(tx1000.getText());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tx1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx1000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx1000ActionPerformed

    private void tx50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx50ActionPerformed

    private void tx20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx20ActionPerformed

    private void tx51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx51ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Cambio;
    public static javax.swing.JTextField Efectivo;
    private javax.swing.JLabel JLB_Fecha4;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JButton cobrarbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbefectivo;
    private javax.swing.JLabel lblcambio;
    private javax.swing.JLabel lbltiempo4;
    public static javax.swing.JTextField lbltotal;
    private javax.swing.JLabel titulohora9;
    private javax.swing.JTextField tx100;
    private javax.swing.JTextField tx1000;
    private javax.swing.JTextField tx101;
    private javax.swing.JTextField tx20;
    private javax.swing.JTextField tx200;
    private javax.swing.JTextField tx50;
    private javax.swing.JTextField tx500;
    private javax.swing.JTextField tx51;
    // End of variables declaration//GEN-END:variables
}
