package Clases;
import Interfaz.login;
import Conexiones.cargar;
import login_access.sesion;


import java.awt.Toolkit;

public final class Inicio1 extends javax.swing.JFrame {
    double i = 50, j = 1;
    cargar hilo;
    
    public Inicio1() {
        initComponents();
        iniciar();
   }

    public javax.swing.JProgressBar getProgreso() {
        return progreso;
    }
    
    public void cargarIcono() {
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/50x51.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

   
    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.progreso = progreso;
    }
        
    public void iniciar(){
        setLocationRelativeTo(null);
        setResizable(false);
        cargarIcono();
        hilo = new cargar(getProgreso());
        hilo.start();
        hilo = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(880, 544));
        setMinimumSize(new java.awt.Dimension(880, 544));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 544));
        getContentPane().setLayout(null);

        icab.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        icab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/fondo tazinicio.jpg"))); // NOI18N
        getContentPane().add(icab);
        icab.setBounds(-10, 0, 890, 520);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        progreso.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        progreso.setForeground(new java.awt.Color(255, 204, 51));
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 516, Short.MAX_VALUE)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        if(progreso.getValue()==i){
            if(j!=101){
                setOpacity((float) ((100-j)/100f));
                i++;
                j+=2;
            }
            if(progreso.getValue()==99){
              sesion obj = new sesion();
               obj.setVisible(true); 
               this.dispose();
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Inicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel icab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables



}
