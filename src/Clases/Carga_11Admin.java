package Clases;
import Interfaz.Menu;
import Conexiones.cargar1;
import java.awt.Toolkit;
import Interfaz.login;

public final class Carga_11Admin extends javax.swing.JFrame {
    double i = 5, j = 1;
    cargar1 hilo;

    public Carga_11Admin() {
     
   initComponents();
        setVisible(true);
       setLocationRelativeTo(null);
       setTitle("CARGANDO...");
      
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

        jPanel12 = new javax.swing.JPanel();
        progreso = new javax.swing.JProgressBar();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(310, 600));
        setMinimumSize(new java.awt.Dimension(310, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(310, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel12.setBackground(new java.awt.Color(50, 45, 93));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.setMaximumSize(new java.awt.Dimension(310, 600));
        jPanel12.setLayout(null);

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
        progreso.setBounds(50, 420, 200, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Close_Window_32px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel19);
        jLabel19.setBounds(230, 0, 40, 30);

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
        jLabel20.setBounds(200, 0, 30, 32);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 30);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Accediendo al perfil");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(0, 290, 310, 58);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡Espere un momento por favor!");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(0, 450, 310, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cargando.gif"))); // NOI18N
        jPanel12.add(jLabel4);
        jLabel4.setBounds(0, 120, 300, 140);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Administrador");
        jPanel12.add(jLabel5);
        jLabel5.setBounds(0, 380, 310, 20);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(0, 0, 310, 550);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 45, 93));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sistema TAZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 550, 300, 20);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 580, 300, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(Carga_11Admin.ICONIFIED);
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
                T.vendedor.setVisible(false);
                T.Cajeromenu.setVisible(false);
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
            java.util.logging.Logger.getLogger(Carga_11Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga_11Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
