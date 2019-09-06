/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import static Consultas.Consulta_Productos.tbl_prod;
import Controlador.operaciones_productos;
import Entidades.Producto;
import Listas.ListaProductos;
import Validaciones.Recurso;
import Validaciones.Validaciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class Registro_productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registro_productos
     */
     operaciones_productos op = new operaciones_productos();
   
    Producto prod = new Producto();
    ListaProductos lp = new ListaProductos();
     Recurso re = new Recurso();
    double iva = 0;

    public Registro_productos() {
        initComponents();
        lp.Cargar();
        bloquear();
        tabla_prod.setModel(op.mostrardatos(""));
        
        bloqCamp();
        modelo_tabla() ;
    }
      public void modelo_tabla() {
        
        tabla_prod.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabla_prod.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabla_prod.getColumnModel().getColumn(2).setPreferredWidth(40);
        tabla_prod.getColumnModel().getColumn(3).setPreferredWidth(40);
        tabla_prod.getColumnModel().getColumn(4).setPreferredWidth(40);
        tabla_prod.getColumnModel().getColumn(5).setPreferredWidth(40);
        // define color de fonto y del texto del encabezado de la tabla
        tabla_prod.getTableHeader().setBackground(new Color(100, 200, 200));
        tabla_prod.getTableHeader().setForeground(Color.BLACK);
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_prod.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
      public void modelo_tabla1() {

        tbl_prod.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbl_prod.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbl_prod.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(3).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(4).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(5).setPreferredWidth(40);
        //tbl_prod.getColumnModel().getColumn(6).setPreferredWidth(40);

        // define color de fonto y del texto del encabezado de la tabla
        tbl_prod.getTableHeader().setBackground(new Color(255,102,102));//red ligh
        tbl_prod.getTableHeader().setForeground(Color.WHITE);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_prod.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
        public void modelo_tabla2() {

        tbl_prod.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbl_prod.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbl_prod.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(3).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(4).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(5).setPreferredWidth(40);
      //  tbl_prod.getColumnModel().getColumn(6).setPreferredWidth(40);

        // define color de fonto y del texto del encabezado de la tabla
        tbl_prod.getTableHeader().setBackground(new Color(102,255,102));//green ligh
        tbl_prod.getTableHeader().setForeground(Color.BLACK);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_prod.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }

    public double Iva() {
        double iva = 0;
        if (txtIva.isSelected()) {
            iva = 0.14;
            return iva;
        } else {
            return iva;
        }
    }

    public void limpiar() {
        descr_prec.setText("");
        descr_prec.setText("");
        txt_precio.setText("");
        cant_prec.setText("");
        txtIva.setSelected(false);
        siIva.setText("");
    }

    public void bloqCamp() {
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEli.setEnabled(false);
    }

    public void bloquear() {
        descr_prec.setEnabled(false);
        descr_prec.setEnabled(false);
        txt_precio.setEnabled(false);
        cant_prec.setEnabled(false);
        txtIva.setEnabled(false);
        comCat.setEnabled(false);
        //insertCateg.setEnabled(false);

    }

    public void desbloquear() {
        descr_prec.setEnabled(true);
        descr_prec.setEnabled(true);
        txt_precio.setEnabled(true);
        cant_prec.setEnabled(true);
        txtIva.setEnabled(true);
        comCat.setEnabled(true);
       // insertCateg.setEnabled(true);

    }

    public void pinta_text() {
        Validaciones.pinta_text(txtCod);
        Validaciones.pinta_text(descr_prec);
        Validaciones.pinta_text(txt_precio);
        Validaciones.pinta_text(cant_prec);
        label.setText("");
    }

    public boolean form_validado() {
        boolean ok = true;
        String men = "Campos requeridos o con errores: ";
        //validar requerido

        if (!Validaciones.esRequerido(descr_prec)) {
            ok = false;
            men += ", Descripcion ";
        }
        if (!Validaciones.esFlotante(txt_precio)) {
            ok = false;
            men += ", precio ";
        }

        if (!Validaciones.esFlotante(cant_prec)) {
            ok = false;
            men += ", cantidad ";
        }

        label.setText(men);
        //validar más controles
        return ok;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        txt_precio = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        descr_prec = new javax.swing.JTextField();
        cant_prec = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_prod = new javax.swing.JTable();
        txtBuscarP = new javax.swing.JTextField();
        comCat = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtIva = new javax.swing.JCheckBox();
        siIva = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        lbMensaje1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Registro de Productos");
        setPreferredSize(new java.awt.Dimension(1080, 600));
        getContentPane().setLayout(null);

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precio);
        txt_precio.setBounds(126, 140, 140, 40);

        txtCod.setEnabled(false);
        getContentPane().add(txtCod);
        txtCod.setBounds(120, 50, 290, 30);

        descr_prec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(descr_prec);
        descr_prec.setBounds(126, 90, 140, 40);

        cant_prec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cant_prec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_precActionPerformed(evt);
            }
        });
        getContentPane().add(cant_prec);
        cant_prec.setBounds(126, 190, 140, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cod:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 40, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 47, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Descripcion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 90, 83, 40);

        tabla_prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_prod.setRowHeight(25);
        tabla_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_prod);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 240, 950, 220);

        txtBuscarP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarP);
        txtBuscarP.setBounds(430, 190, 580, 40);

        comCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Otro", "Manulidades", "Dulces ", "Piñatas", "Novedades", "Regalos", "Botanas", " " }));
        comCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCatActionPerformed(evt);
            }
        });
        getContentPane().add(comCat);
        comCat.setBounds(410, 83, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 67, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 90, 72, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Buscar:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 190, 100, 40);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Compose_30px.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save All_30px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sort By Creation Date_30px.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

        btnEli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete File_30px.png"))); // NOI18N
        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEli);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1000, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        txtIva.setText("IVA");
        jPanel1.add(txtIva);
        txtIva.setBounds(20, 10, 43, 23);

        siIva.setEnabled(false);
        jPanel1.add(siIva);
        siIva.setBounds(70, 10, 60, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 120, 150, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        label.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(label);
        label.setBounds(50, 10, 160, 30);

        lbMensaje1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMensaje1.setText("Hacer doble clic en una fila de la tabla para seleccionar un Producto");
        lbMensaje1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbMensaje1);
        lbMensaje1.setBounds(136, 0, 630, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(170, 470, 810, 0);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(93, 67));
        jButton2.setMinimumSize(new java.awt.Dimension(93, 67));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(1010, 10, 20, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1150, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (form_validado()) {
            pinta_text();
            
            prod.setCodigo(Integer.parseInt(txtCod.getText()));
            prod.setDescripcion(descr_prec.getText());
            prod.setPrecio(txt_precio.getText());
            prod.setCosto(cant_prec.getText());
            prod.setIva(Iva() + "");//Guarda el iva 
            prod.setCategoria(comCat.getSelectedItem().toString());
          //  prod.setCategoria(insertCateg.getText());
            op.Registrar(prod);
            btnGuardar.setEnabled(false);
            tabla_prod.setModel(op.mostrardatos(""));
             modelo_tabla();
            lp.Cargar();
            //cantProd.setText(lp.CantidadProductos());
            limpiar();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

        if (form_validado()) {
            pinta_text();
             
            prod.setCodigo(Integer.parseInt(txtCod.getText()));
            prod.setDescripcion(descr_prec.getText());
            prod.setPrecio(txt_precio.getText());
            prod.setCosto(cant_prec.getText());
            prod.setIva(Iva() + "");//Guarda el iva 
            prod.setCategoria(comCat.getSelectedItem().toString());
         //   prod.setCategoria(insertCateg.getText());
            op.Modificar(prod);
            btnGuardar.setEnabled(false);
            tabla_prod.setModel(op.mostrardatos(""));
            modelo_tabla() ;
            // pinta_text();
            limpiar();

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        // TODO add your handling code here:
        if (form_validado()) {
            pinta_text();         
            prod.setCodigo(Integer.parseInt(txtCod.getText()));        
            op.Eliminar(prod);
            txtCod.setText("");
            tabla_prod.setModel(op.mostrardatos(""));
             modelo_tabla() ;
            //cantProd.setText(lp.CantidadProductos());
            limpiar();
        }
    }//GEN-LAST:event_btnEliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo      
        //txtCod.setText(lp.CodProducto() + "P02" + 1 + "");
         txtCod.setText(lp.CodProducto() + 02350 + "");
        desbloquear();
        limpiar();
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEli.setEnabled(false);
        pinta_text();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_prodMouseClicked
        // TODO add your handling code here:

        int fila = tabla_prod.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tabla_prod.getValueAt(fila, 0).toString());
            descr_prec.setText(tabla_prod.getValueAt(fila, 1).toString());
            txt_precio.setText(tabla_prod.getValueAt(fila, 2).toString());
            cant_prec.setText(tabla_prod.getValueAt(fila, 3).toString());
            comCat.setSelectedItem(tabla_prod.getValueAt(fila, 5).toString());
          //  insertCateg.setText(tabla_prod.getValueAt(fila, 5).toString());
            siIva.setText(tabla_prod.getValueAt(fila, 4).toString());
            desbloquear();
            btnGuardar.setEnabled(false);
            btnActualizar.setEnabled(true);
            btnEli.setEnabled(true);
            pinta_text();

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_tabla_prodMouseClicked

    private void comCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comCatActionPerformed

    private void txtBuscarPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPKeyReleased

        tabla_prod.setModel(op.mostrardatos(txtBuscarP.getText()));
        modelo_tabla();

    }//GEN-LAST:event_txtBuscarPKeyReleased

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cant_precActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_precActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_precActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cant_prec;
    private javax.swing.JComboBox comCat;
    private javax.swing.JTextField descr_prec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbMensaje1;
    private javax.swing.JTextField siIva;
    public static javax.swing.JTable tabla_prod;
    private javax.swing.JTextField txtBuscarP;
    private javax.swing.JTextField txtCod;
    private javax.swing.JCheckBox txtIva;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
