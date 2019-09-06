package Clases;
import Interfaz.Menu;
import Conexiones.cargar1;
import java.awt.Toolkit;
import Interfaz.login;

public final class Carga_111Vendedor extends javax.swing.JFrame {
    double i = 5, j = 1;
    cargar1 hilo;

    public Carga_111Vendedor() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("CARGANDO...");
        cargarIcono();
        hilo = new cargar1(getProgreso());
        hilo.start();
        hilo = null;
         cargarIcono();
    }
    
    public void cargarIcono() {
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/icons8_Load_24px.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }


    public javax.swing.JProgressBar getProgreso() {
        return progreso;
    }

    
    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.progreso = progreso;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(310, 602));
        setMinimumSize(new java.awt.Dimension(310, 602));
        setUndecorated(true);
        setResizable(false);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.setMaximumSize(new java.awt.Dimension(310, 602));
        jPanel12.setMinimumSize(new java.awt.Dimension(310, 602));
        jPanel12.setLayout(null);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Close_Window_32px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel19);
        jLabel19.setBounds(270, 0, 30, 32);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Minimize_Window_32px.png"))); // NOI18N
        jLabel20.setToolTipText("");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel20);
        jLabel20.setBounds(240, 0, 30, 32);

        progreso.setBackground(new java.awt.Color(255, 255, 255));
        progreso.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        progreso.setForeground(new java.awt.Color(255, 204, 0));
        progreso.setBorderPainted(false);
        progreso.setEnabled(false);
        progreso.setFocusable(false);
        progreso.setRequestFocusEnabled(false);
        progreso.setVerifyInputWhenFocusTarget(false);
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        jPanel12.add(progreso);
        progreso.setBounds(60, 420, 190, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/otrovendedor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(-30, 0, 340, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(Carga_111Vendedor.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        if(progreso.getValue()==i){
            if(j!=60){
                i++;
                j+=5;
            }
            if(progreso.getValue()==30){
                 dispose();
               Menu T=new Menu();
               T.Consultas.setVisible(false);
              
               T.ADMINMEN.setVisible(false);
               T.Productos.setVisible(false);
               T.Cajeromenu.setVisible(false);
               T.Ventas.setVisible(false);
               T.acercade_Menu.setVisible(false);
               
               T.show();      
              
            }
        }
    }//GEN-LAST:event_progresoStateChanged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga_111Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Carga_111Vendedor().setVisible(true);
            }
        });
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
