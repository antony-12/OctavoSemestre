package Clases;
import Interfaz.Menu;
import Conexiones.cargar1;
import java.awt.Toolkit;
import Interfaz.login;

public final class Carga_1Cajero extends javax.swing.JFrame {
    double i = 5, j = 1;
    cargar1 hilo;

    public Carga_1Cajero() {
        initComponents();
                setVisible(true);
        setLocationRelativeTo(null);
        setTitle("CARGANDO...");
        cargarIcono();
        
        hilo = new cargar1(getProgreso());
        hilo.start();
        hilo = null;
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
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(310, 601));
        setMinimumSize(new java.awt.Dimension(310, 601));
        setUndecorated(true);
        setResizable(false);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.setMaximumSize(new java.awt.Dimension(310, 601));
        jPanel12.setMinimumSize(new java.awt.Dimension(310, 601));
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
        jLabel19.setBounds(280, 0, 30, 32);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 45, 93));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sistema TAZ");
        jPanel12.add(jLabel1);
        jLabel1.setBounds(0, 580, 300, 20);

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
        jLabel20.setBounds(250, 0, 30, 32);

        jPanel13.setBackground(new java.awt.Color(50, 45, 93));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel13.setMaximumSize(new java.awt.Dimension(310, 600));
        jPanel13.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 30);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Accediendo al perfil");
        jPanel13.add(jLabel2);
        jLabel2.setBounds(0, 290, 310, 58);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡Espere un momento por favor!");
        jPanel13.add(jLabel3);
        jLabel3.setBounds(0, 450, 310, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cargando.gif"))); // NOI18N
        jPanel13.add(jLabel4);
        jLabel4.setBounds(0, 120, 300, 140);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cajero");
        jPanel13.add(jLabel5);
        jLabel5.setBounds(0, 380, 310, 20);

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
        jPanel13.add(progreso);
        progreso.setBounds(60, 420, 190, 20);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(0, 0, 320, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(Carga_1Cajero.ICONIFIED);
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
               Menu T=new Menu();
               T.Consultas.setVisible(false);
               T.Clientes.setVisible(false);
               T.ADMINMEN.setVisible(false);
               T.Productos.setVisible(false);
               T.acercade_Menu.setVisible(false);
               T.vendedor.setVisible(false);
               T.show();      
               dispose();
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
            java.util.logging.Logger.getLogger(Carga_1Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Carga_1Cajero().setVisible(true);
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
    private javax.swing.JPanel jPanel12;
    public static javax.swing.JPanel jPanel13;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
