package Formularios;

import Consultas.Consulta_Productos;
import static Consultas.Consulta_Productos.tbl_prod;
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
import Validaciones.Recurso;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Facturar extends javax.swing.JInternalFrame {

    Factura fac = new Factura();
    operaciones_factura of = new operaciones_factura();
    operaciones_productos opp = new operaciones_productos();
    Recurso r = new Recurso();
    operaciones_detalleFac odf = new operaciones_detalleFac();
    detFactura df = new detFactura();
    DefaultTableModel campos;

    public Facturar() {
        initComponents();
        lblFecha.setText(r.fechaactual());
        bloquearBot();
        diseTabla();

    }

    public void imprimirFacturaDisponible() {
    /*  JOptionPane.showMessageDialog(this, "Cargando factura.......Espere un momento");
        try {
            String cad = codFac.getText();
            //agregar parametros al reporte
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id_factura", cad);
            //params.put("SUBREPORT_DIR", Global.getPathReport());
            Global.generarReporte("factura_venta", params);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }*/
      /*  int n=JOptionPane.showConfirmDialog(null,"Desea Imprimir Tiket","An Inane Question",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
        try {
            String cad = codFac.getText();
            //agregar parametros al reporte
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id_factura", cad);
            //params.put("SUBREPORT_DIR", Global.getPathReport());
            Global.generarReporte("factura_venta", params);
        }/* catch (Exception ex) {
            System.out.println(ex);
        }
   /*} else{
           
        }
    }*/
        
      /*  JOptionPane.showMessageDialog(this, "Cargando Tiket de compra.......Espere un momento");
        try {
            String cad = codFac.getText();
            //agregar parametros al reporte
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id_factura", cad);
            //params.put("SUBREPORT_DIR", Global.getPathReport());
            Global.generarReporte("factura_venta", params);
        } catch (Exception ex) {
            System.out.println(ex);
        }*/
    
    }
    //Tabla titulos
    public void diseTabla() {
        String[] titulos = {"Cod", "Detalle", "Precio", "Cantidad", "Iva", "Total iva", "Total"};
        String[] Registros = new String[7];//Numero de columnas
        campos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblFactura.getTableHeader().setBackground(new Color(100, 200, 200));
        tblFactura.getTableHeader().setForeground(Color.BLACK);
        tblFactura.setModel(campos);
        tblFactura.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblFactura.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblFactura.getColumnModel().getColumn(2).setPreferredWidth(40);
        tblFactura.getColumnModel().getColumn(3).setPreferredWidth(40);
        tblFactura.getColumnModel().getColumn(4).setPreferredWidth(40);
        tblFactura.getColumnModel().getColumn(5).setPreferredWidth(40);
        tblFactura.getColumnModel().getColumn(6).setPreferredWidth(40);
    }
    /*
     public static String getPathFacturas() {
     return getPath() + "Facturas\\";
     }*/

    public void descontarDatosFac() {//Descuenta la cantidad de productos
        String datoFac = "";
        String codProd = "", cantP = "";
        for (int i = 0; i < Facturar.tblFactura.getRowCount(); i++) {//Recorre toda la tabla
            codProd = Facturar.tblFactura.getValueAt(i, 0).toString();
            cantP = Facturar.tblFactura.getValueAt(i, 3).toString();
            System.out.println("codigo:" + codProd);
            System.out.println("cantidad:" + cantP);
            opp.descontarProd(codProd, cantP);//Descuenta la cantidad

        }//Limpia la tabla
        LimpiarTabla();
    }

    public void guardarDetalle() {
        try {
            for (int i = 0; i < tblFactura.getRowCount(); i++) {
                df.setId_fac(codFac.getText());//String codio factura
                df.setCod_prod(Integer.parseInt(tblFactura.getValueAt(i, 0).toString()));
                df.setNom_Prod(tblFactura.getValueAt(i, 1).toString());
                df.setPrecio(Double.parseDouble(tblFactura.getValueAt(i, 2).toString()));
                df.setCant(Integer.parseInt(tblFactura.getValueAt(i, 3).toString()));
                df.setTotal(Double.parseDouble(tblFactura.getValueAt(i, 6).toString()));
                odf.Registrar(df);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblFactura.getModel();
        int a = tblFactura.getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void limpiar() {
        lblIva.setText("");
        lblSubtotal.setText("");
        lblTotal.setText("");
        lblSubtotal.setText("");
        lblIva.setText("");
        ced_cli.setText("");
        lblNombre.setText("");
        //lblDireccion.setText("");
       // lblTelefono.setText("");
        LimpiarTabla();

    }

    public void bloquearBot() {
        jButton1.setEnabled(false);
        btnBusCl.setEnabled(false);
        btnAdici.setEnabled(false);
        btnQuitar.setEnabled(false);

    }

    public void pinta_text() {
        Validaciones.pinta_text(codFac);
        Validaciones.pinta_text(lblIva);
        Validaciones.pinta_text(lblSubtotal);
        Validaciones.pinta_text(lblFecha);
        Validaciones.pinta_text(lblNombre);
        Validaciones.pinta_text(ced_cli);
       // Validaciones.pinta_text(lblDireccion);
        Validaciones.pinta_text(lblTotal);
       // Validaciones.pinta_text(lblTelefono);

        label.setText("");
    }

    public boolean form_validado() {
        boolean ok = true;
        String men = "Campos requeridos o con errores: ";
        //validar requerido

        if (!Validaciones.esRequerido(codFac)) {
            ok = false;
            men += ", Cod Factura ";
        }
        if (!Validaciones.esRequerido(lblIva)) {
            ok = false;
            men += ", Iva ";
        }
        if (!Validaciones.esRequerido(lblSubtotal)) {
            ok = false;
            men += ", Subtotal ";
        }
        if (!Validaciones.esRequerido(lblFecha)) {
            ok = false;
            men += ", Fecha ";
        }
        if (!Validaciones.esRequerido(lblNombre)) {
            ok = false;
            men += ", nombre ";
        }
        if (!Validaciones.esRequerido(ced_cli)) {
            ok = false;
            men += ", cedula ";
        }
      /*  if (!Validaciones.esRequerido(lblDireccion)) {
            ok = false;
            men += ",direccion ";
        }
        if (!Validaciones.esRequerido(lblTelefono)) {
            ok = false;
            men += ", Telefono ";
        }
      */  if (!Validaciones.esRequerido(lblTotal)) {
            ok = false;
            men += ",Total ";
        }

        label.setText(men);
        return ok;
    }

    public void guardar() {
        
        if (form_validado()) {
            pinta_text();
            fac.setCod_fac(codFac.getText());
            fac.setTotal(Double.parseDouble(lblTotal.getText()));
            fac.setSubtotal(Double.parseDouble(lblSubtotal.getText()));
            fac.setIva(Double.parseDouble(lblIva.getText()));
            fac.setFecha(lblFecha.getText());
            fac.setId_cliente(ced_cli.getText());
            of.Registrar(fac);
            
            guardarDetalle();
            descontarDatosFac();
            
           Cobr rc = new Cobr();//Descontar datos 
           Cobr.lbltotal.setText(lblTotal.getText());
           limpiar();
            jButton1.setEnabled(false);
            btnBusCl.setEnabled(false);
            btnAdici.setEnabled(false);
            btnQuitar.setEnabled(false);
            int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
            int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
            if (rc.isShowing()) {
                rc.setLocation(x, y);
            } else {
                jDesktopPane1.add(rc);
                rc.setLocation(x, y);
                rc.show();
            }
       
         //   Cobr n = new Cobr();//Descontar datos 
           // Cobr.lbltotal.setText(lblTotal.getText());
            //imprimirFacturaDisponible();
            
          /*  limpiar();
            jButton1.setEnabled(false);
            btnBusCl.setEnabled(false);
            btnAdici.setEnabled(false);
            btnQuitar.setEnabled(false);
            */
        }else {
            JOptionPane.showMessageDialog(this, "Error LLene todos los campos para continuiar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codFac = new javax.swing.JTextField();
        btnBusCl = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        lblNombre = new javax.swing.JTextField();
        ced_cli = new javax.swing.JTextField();
        lblFecha = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JTextField();
        lblIva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btnAdici = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        lblTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        setPreferredSize(new java.awt.Dimension(1180, 590));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(910, 50, 50, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("SUBTOTAL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(830, 400, 190, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("I.V.A");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(860, 440, 160, 20);

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFactura);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 150, 1050, 230);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("TOTAL");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(860, 480, 41, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Clave Cliente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 88, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 61, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Num_ticket");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(890, 10, 100, 30);

        codFac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codFac.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        codFac.setEnabled(false);
        codFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFacActionPerformed(evt);
            }
        });
        getContentPane().add(codFac);
        codFac.setBounds(1000, 12, 130, 30);

        btnBusCl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBusCl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Detective_30px.png"))); // NOI18N
        btnBusCl.setText("Buscar Cliente");
        btnBusCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusClActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusCl);
        btnBusCl.setBounds(450, 70, 170, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Print_30px.png"))); // NOI18N
        jButton3.setText("Imprimir Tickets");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(240, 450, 270, 50);

        label.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(label);
        label.setBounds(80, 390, 720, 30);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblNombre.setEnabled(false);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(130, 60, 230, 30);

        ced_cli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ced_cli.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ced_cli.setEnabled(false);
        ced_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ced_cliActionPerformed(evt);
            }
        });
        getContentPane().add(ced_cli);
        ced_cli.setBounds(130, 100, 230, 30);

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblFecha.setEnabled(false);
        getContentPane().add(lblFecha);
        lblFecha.setBounds(970, 60, 160, 30);

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblSubtotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblSubtotal.setEnabled(false);
        lblSubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblSubtotalKeyTyped(evt);
            }
        });
        getContentPane().add(lblSubtotal);
        lblSubtotal.setBounds(910, 390, 220, 40);

        lblIva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblIva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblIva.setEnabled(false);
        lblIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIvaActionPerformed(evt);
            }
        });
        lblIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblIvaKeyTyped(evt);
            }
        });
        getContentPane().add(lblIva);
        lblIva.setBounds(910, 440, 220, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cash in Hand_30px.png"))); // NOI18N
        jButton1.setText("Realizar Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 450, 250, 50);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jToolBar1.setRollover(true);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Shopping Cart_30px.png"))); // NOI18N
        jButton4.setText("   Nuevo  ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rotate_30px.png"))); // NOI18N
        jButton6.setText("   Limpiar  ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_30px.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(103, 37));
        jButton2.setMinimumSize(new java.awt.Dimension(103, 37));
        jButton2.setPreferredSize(new java.awt.Dimension(60, 80));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1150, 50);

        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(210, 440, 590, 70);

        jToolBar2.setRollover(true);

        btnAdici.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdici.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add Node_30px.png"))); // NOI18N
        btnAdici.setText("Añadir");
        btnAdici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiciActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAdici);

        jLabel2.setText("          ");
        jToolBar2.add(jLabel2);

        btnQuitar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete_30px.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnQuitar);

        getContentPane().add(jToolBar2);
        jToolBar2.setBounds(890, 100, 240, 40);

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblTotal.setEnabled(false);
        lblTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTotalActionPerformed(evt);
            }
        });
        getContentPane().add(lblTotal);
        lblTotal.setBounds(910, 490, 220, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 1220, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusClActionPerformed

        try {
            Consulta_clientes rc = new Consulta_clientes();
            int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
            int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
            if (rc.isShowing()) {
                rc.setLocation(x, y);
            } else {
                jDesktopPane1.add(rc);
                rc.setLocation(x, y);
                rc.show();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnBusClActionPerformed

    private void btnAdiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiciActionPerformed
        btnQuitar.setEnabled(true);
        try {
            Consulta_Productos rc = new Consulta_Productos();
            int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
            int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
            if (rc.isShowing()) {
                rc.setLocation(x, y);
            } else {
                jDesktopPane1.add(rc);
                rc.setLocation(x, y);
                rc.show();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAdiciActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            Consultar_ventas rc = new Consultar_ventas();
            int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
            int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
            if (rc.isShowing()) {
                rc.setLocation(x, y);
            } else {
                jDesktopPane1.add(rc);
                rc.setLocation(x, y);
                rc.show();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed

        try {
            DefaultTableModel modelo = (DefaultTableModel) tblFactura.getModel();
            int fila = tblFactura.getSelectedRow();
            if (fila >= 0) {
                modelo.removeRow(fila);
                Consulta_Productos pro = new Consulta_Productos();
                pro.calcular();
            } else {
                JOptionPane.showMessageDialog(null, "No Selecciono ninguna fila");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
        pinta_text();
        //codFac.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        codFac.setText(of.codigo_Fact());
        jButton1.setEnabled(true);
        btnBusCl.setEnabled(true);
        btnAdici.setEnabled(true);
        limpiar();
        pinta_text();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (!lblTotal.getText().equals("0.0")) {
            guardar();//Guarda la factura
           
        } else {
            JOptionPane.showMessageDialog(this, "Debe "
                    + "ingresar almenos un producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    private void lblSubtotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSubtotalKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (lblSubtotal.getText().length() >= 4) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_lblSubtotalKeyTyped

    private void lblIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIvaKeyTyped
        char car = evt.getKeyChar();
        if (lblIva.getText().length() >= 4) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_lblIvaKeyTyped

    private void lblIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIvaActionPerformed

    private void codFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codFacActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ced_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ced_cliActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ced_cliActionPerformed

    private void lblTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdici;
    private javax.swing.JButton btnBusCl;
    private javax.swing.JButton btnQuitar;
    public static javax.swing.JTextField ced_cli;
    public static javax.swing.JTextField codFac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel label;
    public static javax.swing.JTextField lblFecha;
    public static javax.swing.JTextField lblIva;
    public static javax.swing.JTextField lblNombre;
    public static javax.swing.JTextField lblSubtotal;
    public static javax.swing.JTextField lblTotal;
    public static javax.swing.JTable tblFactura;
    // End of variables declaration//GEN-END:variables

}
