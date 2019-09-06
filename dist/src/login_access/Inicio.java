/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login_access;
import Clases.Carga_1Cajero;
import Clases.Carga_11Admin;
import Clases.Carga_111Vendedor;
import Conexion.Conexion;
import Interfaz.Menu;
import java.awt.Toolkit;
import java.sql.Connection;
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
import javax.swing.Timer;

/**
 *
 * @author Johny
 */

public class Inicio extends javax.swing.JFrame  implements Runnable{

  
    Conexion bd = new Conexion();
    Connection cn = bd.ConectarOracle();
    PreparedStatement pst = null;
    ResultSet rs = null;
    String usu;
    String hora,minutos,segundos,ampm;
    
    Thread hilo;
    public Inicio () {
         initComponents();
        setVisible(true);
        setLocationRelativeTo(null);//Centrar la ventan+
        setTitle("Inicia Sesion Administrador");
   
    hilo = new Thread(this);
    hilo.start();
    Calendar cal = Calendar.getInstance();
        String fecha , hora;
     fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha4.setText(fecha);
   
        cargarIcono();
    }
public void cargarIcono() {
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/iconotaz.ico"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }
 

  
     public void Validar_acceso() {
         
        usu = usuario.getText();
        char contrasena[] = possward.getPassword();
        String contra = new String(contrasena);
        String consulta = "SELECT * FROM  public.administrador WHERE ced_us=? and contra_usu=? ";
        try {
            pst = cn.prepareStatement(consulta);
            
            pst.setString(1, usu);
            pst.setString(2, contra);
           
            rs = pst.executeQuery();
            if (rs.next()) {
                dispose();
                Carga_11Admin rsh= new Carga_11Admin();
                rsh.setVisible(true);
                 rsh.show();  
              
            } else {
                label.setText("Datos incorrectos");
                JOptionPane.showMessageDialog(null, "Acceso no autorizado....", "ERROR", JOptionPane.ERROR_MESSAGE);
                usuario.setText("");
                possward.setText("");
                usuario.grabFocus();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        possward = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        titulohora9 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lbltiempo4 = new javax.swing.JLabel();
        JLB_Fecha4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ww.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(605, 663));
        setMinimumSize(new java.awt.Dimension(605, 663));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(605, 663));
        getContentPane().setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setOpaque(false);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 10, 20, 20);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(900, 580, 73, 23);

        possward.setBackground(new java.awt.Color(245, 248, 252));
        possward.setBorder(null);
        getContentPane().add(possward);
        possward.setBounds(270, 390, 130, 30);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Fecha");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(370, 570, 50, 30);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Login Administrador");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(220, 30, 220, 30);

        titulohora9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        titulohora9.setForeground(new java.awt.Color(255, 255, 255));
        titulohora9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulohora9.setText("Hora:");
        getContentPane().add(titulohora9);
        titulohora9.setBounds(60, 570, 40, 30);

        label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 204, 0));
        label.setFocusable(false);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(label);
        label.setBounds(250, 440, 180, 30);

        lbltiempo4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbltiempo4.setForeground(new java.awt.Color(255, 255, 0));
        lbltiempo4.setText("00:00:00");
        getContentPane().add(lbltiempo4);
        lbltiempo4.setBounds(120, 570, 180, 30);

        JLB_Fecha4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLB_Fecha4.setForeground(new java.awt.Color(255, 255, 0));
        JLB_Fecha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLB_Fecha4.setText("00/00/00");
        getContentPane().add(JLB_Fecha4);
        JLB_Fecha4.setBounds(440, 570, 140, 30);

        usuario.setBackground(new java.awt.Color(245, 248, 252));
        usuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(usuario);
        usuario.setBounds(270, 330, 130, 30);

        jButton3.setText("Cambiar Usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 520, 140, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(37, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(274, 478, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_access/logingeneral_1.jpg"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 606, 663);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Validar_acceso();
        
         /* String usu =txtContra.getText();
        String pas=txtContra.getText();
        
        comprovar(usu,pas);*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            dispose();
        sesion mssc = new  sesion();
         initComponents();
        setVisible(true);
        this.setVisible(false);
       
        setLocationRelativeTo(null);//Centrar la ventan+
        setTitle("Inicia Sesion");
         }
        catch(Exception ex){
             System.out.println("Inicio Admninistrador" + ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLB_Fecha4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbltiempo4;
    private javax.swing.JPasswordField possward;
    private javax.swing.JLabel titulohora9;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables


}
