/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controlador.operaciones_usuarios;
import Entidades.Usuarios;
import Listas.ListaUsuario;
import Validaciones.Validaciones;
import java.util.UUID;

import javax.swing.JOptionPane;

/**
 *
 * @author alm
 */
public class Registrar_Usuario extends javax.swing.JInternalFrame {

    operaciones_usuarios ous = new operaciones_usuarios();
    Usuarios usua = new Usuarios();
    ListaUsuario luarios = new ListaUsuario();

    public Registrar_Usuario() {
        initComponents();
        luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));

        // ous.mostrardatos("");
        bloquearC();
        bloquearBtnes();
    }

    public void limpiar() {
        cedUs.setText("");
        nomUs.setText("");
        apeUs.setText("");
        telfUs.setText("");
        direUs.setText("");
        paswUs.setText("");

    }

    public void bloquearBtnes() {
        btnGuardar.setEnabled(false);
        btnActua.setEnabled(false);
        btnEli.setEnabled(false);

    }

    public void desbloquearC() {
        cedUs.setEnabled(true);
        nomUs.setEnabled(true);
        apeUs.setEnabled(true);
        direUs.setEnabled(true);
        comboUs.setEnabled(true);
        paswUs.setEnabled(true);

    }

    public void bloquearC() {
        cedUs.setEnabled(false);
        nomUs.setEnabled(false);
        apeUs.setEnabled(false);
        direUs.setEnabled(false);
        comboUs.setEnabled(false);
        paswUs.setEnabled(false);

    }

    public void pinta_text() {
        Validaciones.pinta_text(cedUs);
        Validaciones.pinta_text(nomUs);
        Validaciones.pinta_text(apeUs);
        Validaciones.pinta_text(direUs);
        Validaciones.pinta_text(telfUs);
        Validaciones.pinta_text(paswUs);
        txtMensaje.setText("");
    }

    public boolean form_validado() {
        boolean ok = true;
        String men = "Campos requeridos o con errores: ";
        //validar requerido
    
        if (!Validaciones.esLetras(nomUs)) {
            ok = false;
            men += ", Nombre ";
        }
        if (!Validaciones.esLetras(apeUs)) {
            ok = false;
            men += ", Apellido ";
        }
        if (!Validaciones.esRequerido(direUs)) {
            ok = false;
            men += ", Direccion ";
        }

        if (!Validaciones.esTelefono(telfUs)) {
            ok = false;
            men += ", Telefono ";
        }
        if (!Validaciones.esRequerido(paswUs)) {
            ok = false;
            men += ", Pasward ";
        }
        txtMensaje.setText(men);
        //validar más controles
        return ok;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paswUs = new javax.swing.JTextField();
        nomUs = new javax.swing.JTextField();
        apeUs = new javax.swing.JTextField();
        cedUs = new javax.swing.JTextField();
        codUs = new javax.swing.JTextField();
        telfUs = new javax.swing.JTextField();
        direUs = new javax.swing.JTextField();
        comboUs = new javax.swing.JComboBox();
        busUs = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActua = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtMensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTNpass = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Registro de Usuarios");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(901, 565));
        setPreferredSize(new java.awt.Dimension(901, 565));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 170, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cod:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 25, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Teléfono:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 90, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 90, 29, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 130, 47, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Buscar por cedula:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 220, 410, 15);

        tablaUsu.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUsu.setGridColor(new java.awt.Color(0, 153, 153));
        tablaUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 250, 860, 220);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tipo Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 130, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Dirección:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 50, 60, 30);
        getContentPane().add(paswUs);
        paswUs.setBounds(410, 170, 220, 30);
        getContentPane().add(nomUs);
        nomUs.setBounds(80, 130, 180, 30);
        getContentPane().add(apeUs);
        apeUs.setBounds(80, 170, 180, 30);
        getContentPane().add(cedUs);
        cedUs.setBounds(80, 90, 180, 30);

        codUs.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        codUs.setEnabled(false);
        getContentPane().add(codUs);
        codUs.setBounds(80, 50, 180, 30);
        getContentPane().add(telfUs);
        telfUs.setBounds(410, 90, 280, 30);
        getContentPane().add(direUs);
        direUs.setBounds(410, 50, 280, 30);

        comboUs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Vendedor", "Cajero" }));
        getContentPane().add(comboUs);
        comboUs.setBounds(410, 130, 120, 30);

        busUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busUsKeyReleased(evt);
            }
        });
        getContentPane().add(busUs);
        busUs.setBounds(340, 210, 520, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Apellido:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 170, 46, 30);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add User Group Woman Man_30px.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add Node_30px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnActua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Compose_30px.png"))); // NOI18N
        btnActua.setText("Editar");
        btnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActua);

        btnEli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete_30px.png"))); // NOI18N
        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEli);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 760, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMensaje.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 480, 650, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        BTNpass.setText("Generar Contraseña");
        BTNpass.setEnabled(false);
        BTNpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpassActionPerformed(evt);
            }
        });
        jPanel2.add(BTNpass);
        BTNpass.setBounds(650, 170, 160, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Guardar datos
        if (form_validado()) {
            pinta_text();
             luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));
            usua.setCod_usu(Integer.parseInt(codUs.getText()));
            usua.setCed(cedUs.getText());
            usua.setNom(nomUs.getText());
            usua.setApe(apeUs.getText());
            usua.setTelf(telfUs.getText());
            usua.setDireccion(direUs.getText());
            usua.setTip_usuario(comboUs.getSelectedItem().toString());
            usua.setPossward(paswUs.getText());
            ous.Registrar(usua);
            tablaUsu.setModel(ous.mostrardatos(""));
            bloquearC();
            limpiar();
             BTNpass.setEnabled(false);
                luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));
codUs.setText("");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuaActionPerformed
        // 
        if (form_validado() ) {
            pinta_text();
            usua.setCod_usu(Integer.parseInt(codUs.getText()));
            usua.setCed(cedUs.getText());
            usua.setNom(nomUs.getText());
            usua.setApe(apeUs.getText());
            usua.setTelf(telfUs.getText());
            usua.setDireccion(direUs.getText());
            usua.setTip_usuario(comboUs.getSelectedItem().toString());
            usua.setPossward(paswUs.getText());
            ous.Modificar(usua);
            tablaUsu.setModel(ous.mostrardatos(""));
            bloquearC();
            limpiar();
             BTNpass.setEnabled(false);
                luarios.Cargar();
                 BTNpass.setEnabled(false);
        tablaUsu.setModel(ous.mostrardatos(""));
codUs.setText("");
        }
    }//GEN-LAST:event_btnActuaActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        // TODO add your handling code here:
        if (form_validado()) {
            pinta_text();
            luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));
            usua.setCod_usu(Integer.parseInt(codUs.getText()));
            usua.setCed(cedUs.getText());
            usua.setNom(nomUs.getText());
            usua.setApe(apeUs.getText());
            usua.setTelf(telfUs.getText());
            usua.setDireccion(direUs.getText());
            usua.setTip_usuario(comboUs.getSelectedItem().toString());
            usua.setPossward(paswUs.getText());
            ous.Eliminar(usua);
            tablaUsu.setModel(ous.mostrardatos(""));
    
            bloquearC();
            limpiar();
            luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));
codUs.setText("");
        }
    }//GEN-LAST:event_btnEliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            luarios.Cargar();
        tablaUsu.setModel(ous.mostrardatos(""));
        codUs.setText(luarios.CodUsuario() + 1 + "");
        desbloquearC();
        limpiar();
        btnGuardar.setEnabled(true);
        BTNpass.setEnabled(true);
        btnActua.setEnabled(false);
        btnEli.setEnabled(false);
        pinta_text();



    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuMouseClicked
        // TODO add your handling code here:
        int fila = tablaUsu.getSelectedRow();
        if (fila >= 0) {
            codUs.setText(tablaUsu.getValueAt(fila, 0).toString());
            cedUs.setText(tablaUsu.getValueAt(fila, 1).toString());
            nomUs.setText(tablaUsu.getValueAt(fila, 2).toString());
            apeUs.setText(tablaUsu.getValueAt(fila, 3).toString());
            direUs.setText(tablaUsu.getValueAt(fila, 4).toString());
            telfUs.setText(tablaUsu.getValueAt(fila, 5).toString());
            comboUs.setSelectedItem(tablaUsu.getValueAt(fila, 6).toString());
            paswUs.setText(tablaUsu.getValueAt(fila, 7).toString());

            btnGuardar.setEnabled(false);
            btnActua.setEnabled(true);
            btnEli.setEnabled(true);
            BTNpass.setEnabled(true);
            desbloquearC();
            pinta_text();

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tablaUsuMouseClicked

    private void busUsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busUsKeyReleased
        tablaUsu.setModel(ous.mostrardatos(busUs.getText()));

    }//GEN-LAST:event_busUsKeyReleased

    public void password()
    {
        paswUs.setText(UUID.randomUUID().toString().toUpperCase().substring(0,6)+luarios.CodUsuario() + 145 + "S8"); 
    }
    
    private void BTNpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpassActionPerformed
        // TODO add your handling code here:
       password();
    }//GEN-LAST:event_BTNpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNpass;
    private javax.swing.JTextField apeUs;
    private javax.swing.JButton btnActua;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField busUs;
    private javax.swing.JTextField cedUs;
    private javax.swing.JTextField codUs;
    private javax.swing.JComboBox comboUs;
    private javax.swing.JTextField direUs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nomUs;
    private javax.swing.JTextField paswUs;
    public static javax.swing.JTable tablaUsu;
    private javax.swing.JTextField telfUs;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables
}
