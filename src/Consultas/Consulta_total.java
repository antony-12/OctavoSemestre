package Consultas;

import Controlador.operaciones_productos;
import Formularios.Facturar;
import Formularios.Registro_productos;
import static Formularios.Registro_productos.tabla_prod;
import Listas.ListaProductos;
import Validaciones.Recurso;
import static Interfaz.Menu.jDesktopPane1;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Consulta_total extends javax.swing.JInternalFrame {

    operaciones_productos op = new operaciones_productos();
    ListaProductos lp = new ListaProductos();
    Recurso re = new Recurso();
    

    String cod = "", nomP = "", precio = "", cant = "", iva;

    public Consulta_total() {
        initComponents();
        lp.Cargar();
        tbl_prod.setModel(op.mostrardatos(""));
        txtcantProd.setText(lp.CantidadProductos());
        modelo_tabla();
    }

    public void modelo_tabla() {

        tbl_prod.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbl_prod.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbl_prod.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(3).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(4).setPreferredWidth(40);
        tbl_prod.getColumnModel().getColumn(5).setPreferredWidth(40);
        //tbl_prod.getColumnModel().getColumn(6).setPreferredWidth(40);

        // define color de fonto y del texto del encabezado de la tabla
        tbl_prod.getTableHeader().setBackground(new Color(100, 200, 200));
        tbl_prod.getTableHeader().setForeground(Color.BLACK);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_prod.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }

    public void calcular() {
        double totalIva=0;
        double subtotal = 0, iva = 0;
        double precio;
        int cantidad;
        double imp = 0;
        for (int i = 0; i < Facturar.tblFactura.getRowCount(); i++) {
            precio = Double.parseDouble(Facturar.tblFactura.getValueAt(i, 2).toString());
            cantidad = Integer.parseInt(Facturar.tblFactura.getValueAt(i, 3).toString());
            iva = Double.parseDouble(Facturar.tblFactura.getValueAt(i, 4).toString());
            imp = precio * cantidad;
            totalIva = totalIva + (iva * imp);
            subtotal = subtotal + imp;//Acumula el subtotal  
            Facturar.tblFactura.setValueAt(Math.rint((iva * imp) * 100) / 100, i, 5);//total iva
            Facturar.tblFactura.setValueAt(Math.rint(imp * 100) / 100, i, 6);//muestra el total
        }
        Facturar.lblSubtotal.setText(subtotal + "");
        Facturar.lblIva.setText("" + Math.rint((totalIva) * 100) / 100);//iva
        Facturar.lblTotal.setText("" + Math.rint((subtotal + totalIva) * 100) / 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        buscarProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantProd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbMensaje1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle(" CONSULTAR PRODUCTOS");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_prod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_prod.setAlignmentX(2.0F);
        tbl_prod.setAlignmentY(2.0F);
        tbl_prod.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_prod.setRowHeight(25);
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        tbl_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_prodKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1140, 380));

        buscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdActionPerformed(evt);
            }
        });
        buscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarProdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarProdKeyReleased(evt);
            }
        });
        getContentPane().add(buscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 220, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad de Productos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 70, 50));

        txtcantProd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcantProd.setEnabled(false);
        getContentPane().add(txtcantProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 12, 220, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Checklist_30px.png"))); // NOI18N
        jButton1.setText("Mostrar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 140, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Detective_30px.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 140, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lbMensaje1.setText("Hacer doble clic en una fila de la tabla para seleccionar un producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbMensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMensaje1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 590, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton4.setText("Cerrar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 19, 110, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
        //Elegir producto        
        if (evt.getClickCount() == 2) {
            try {
                DefaultTableModel tabladet = (DefaultTableModel) Facturar.tblFactura.getModel();//tabla qeu se llena
                String[] dato = new String[6];
                int fila = tbl_prod.getSelectedRow();
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    cod = (String) tbl_prod.getValueAt(fila, 0);
                    nomP = (String) tbl_prod.getValueAt(fila, 1);
                    precio = (String) tbl_prod.getValueAt(fila, 2);
                    cant = (String) tbl_prod.getValueAt(fila, 3);
                    iva = (String) tbl_prod.getValueAt(fila, 4);
                    System.out.println(iva);
                    int c = 0;
                    boolean volver = false;
                    do {
                        String can = JOptionPane.showInputDialog("Ingrese la Cantidad ");
                        try {
                            if ((can.equals("")) || (can.equals("0"))) {
                                JOptionPane.showMessageDialog(this, "Debe ingresar un valor mayor que 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                                volver = true;
                            } else {
                                int canti = Integer.parseInt(can);//cantidad ingresada
                                int cantidad = Integer.parseInt(cant);  //cantidad de productos          
                                if (canti > cantidad) {
                                    JOptionPane.showMessageDialog(this, " no disponible");
                                    volver = true;
                                } else {
                                    if (c == 0) {
                                        dato[0] = cod;
                                        dato[1] = nomP;
                                        dato[2] = precio;
                                        dato[3] = can;
                                        dato[4] = iva;
                                        tabladet.addRow(dato);
                                        Facturar.tblFactura.setModel(tabladet);
                                        //metodo del iva
                                        calcular();
                                    }
                                    volver = false;
                                }
                            }
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println(e);
                        }
                    } while (volver == true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_tbl_prodMouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tbl_prod.setModel(op.mostrardatos(""));//carga con las litas enlazadas
        modelo_tabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        tbl_prod.setModel(lp.Buscar_prod(buscarProd.getText()));
        modelo_tabla();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_prodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_prodKeyReleased
        int row = tbl_prod.getSelectedRow();
    }//GEN-LAST:event_tbl_prodKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void buscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdActionPerformed
        // TODO add your handling code here:
     
         
    }//GEN-LAST:event_buscarProdActionPerformed

    private void buscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarProdKeyReleased
        // TODO add your handling code here:

        
         
         tbl_prod.setModel(lp.Buscar_prod(buscarProd.getText()));
        modelo_tabla();
      
       
       
    }//GEN-LAST:event_buscarProdKeyReleased

    private void buscarProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarProdKeyPressed
        // TODO add your handling code here:
       tbl_prod.setModel(lp.Buscar_prod(buscarProd.getText()));
        modelo_tabla();
       
    }//GEN-LAST:event_buscarProdKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMensaje1;
    public static javax.swing.JTable tbl_prod;
    private javax.swing.JTextField txtcantProd;
    // End of variables declaration//GEN-END:variables
}
