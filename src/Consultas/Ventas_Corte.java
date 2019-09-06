/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import Clases.Carga_1Cajero;
import Conexion.Conexion;
import Controlador.operaciones_factura;
import Formularios.Global;
import Validaciones.Recurso;
import Validaciones.Validaciones;

import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

public class Ventas_Corte extends javax.swing.JInternalFrame {

    private String sql = "INSERT FROM public.resgistro_corte \n"
            + "WHERE alias_corte=?"; 
    private PreparedStatement ps = null;
   
 Recurso re =new Recurso();
    DefaultTableModel campos;
    DefaultTableModel campos1;
     Conexion bd = new Conexion();
    Connection cn = bd.ConectarOracle();
       /**
     * Creates new form Consultar_ventas
     */
    operaciones_factura of = new operaciones_factura();
 
  public void eliminar(){

        

  }
        
    
    public Ventas_Corte() {
        initComponents();
        tabla_ventas1.setModel(of.totalventas1(""));
          initComponents();
         Tabla();
          Calendar cal = Calendar.getInstance();
      
        String fecha;
        fecha = cal.get(Calendar.DATE) + "" + (cal.get(Calendar.MARCH)) + "" + cal.get(Calendar.YEAR)+""+cal.get(Calendar.HOUR) + "" + (cal.get(Calendar.MINUTE)) + "" + cal.get(Calendar.SECOND);
        this.cod.setText(fecha);
        modelo_tabla1();
         modelo_tabla12();
    }
    
    void Tabla()
    {
       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("alias");
        modelo.addColumn("caso corte");
        modelo.addColumn("tipo us");
        modelo.addColumn("fecha/hora");
        modelo.addColumn("total corte");
        
        tablaBD.setModel(modelo);
        String sql ="SELECT * FROM public.cort";
        
        String dato[] = new String [6];
        Statement st;
        try 
        {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
              
                
                modelo.addRow(dato); 
            }
            
            tablaBD.setModel(modelo);
            
        } 
        catch (SQLException ex) 
        {
           
        }
        
        
    }     //+++++++++++++++++++++++++++++++++++++++++++++
    
     public DefaultTableModel corte_alias1(String dato) {
        String[] titulos = {"Id corte","Alias", "Caso de corte", "tipo de usuario", " Fecha Corte", " Total corte"};
        String[] Registros = new String[6];//Numero de columnas
        campos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String snexistencia = "SELECT * FROM public.cort WHERE CONCAT(alias_corte,' ',  fecha_actual,' ', total_corte) LIKE '%" + dato + "%'";
         

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(snexistencia);
            while (rs.next()) {
                Registros[0] = rs.getString("cod");
                Registros[1] = rs.getString("alias_corte");
                Registros[2] = rs.getString("caso_corte");
                Registros[3] = rs.getString("tipo_usuario_corte");
                Registros[4] = rs.getString("fecha_actual");
                Registros[5] = rs.getString("total_corte");
            
                campos.addRow(Registros);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return campos;
    }
    
     //***********************************************
    public DefaultTableModel corte_general(String dato) {
        String[] titulos = {"Id corte","Alias", "Caso de corte", "tipo de usuario", " Fecha Corte", " Total corte"};
        String[] Registros = new String[6];//Numero de columnas
        campos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String snexistencia = "SELECT * FROM public.cort";
         

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(snexistencia);
            while (rs.next()) {
                Registros[0] = rs.getString("cod");
                Registros[1] = rs.getString("alias_corte");
                Registros[2] = rs.getString("caso_corte");
                Registros[3] = rs.getString("tipo_usuario_corte");
                Registros[4] = rs.getString("fecha_actual");
                Registros[5] = rs.getString("total_corte");
            
                campos.addRow(Registros);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return campos;
    }
    //***********************************************
     //***********************************************
    public DefaultTableModel corte_1(String dato) {
        String[] titulos = {"Id corte","Alias", "Caso de corte", "tipo de usuario", " Fecha Corte", " Total corte"};
        String[] Registros = new String[6];//Numero de columnas
        campos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String snexistencia = "SELECT * FROM public.cort WHERE CONCAT(alias_corte,'Luisa_admi',  fecha_actual,' ', total_corte) LIKE '%" + dato + "%'";
         

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(snexistencia);
            while (rs.next()) {
             Registros[0] = rs.getString("Id de corte");
                Registros[1] = rs.getString("alias_corte");
                Registros[2] = rs.getString("caso_corte");
                Registros[3] = rs.getString("tipo_usuario_corte");
                Registros[4] = rs.getString("fecha_actual");
                Registros[5] = rs.getString("total_corte");
            
                campos.addRow(Registros);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return campos;
    }
    
    //************************************
public void modelo_tabla12() {
        
        tabla_prod.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabla_prod.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabla_prod.getColumnModel().getColumn(2).setPreferredWidth(40);
        tabla_prod.getColumnModel().getColumn(3).setPreferredWidth(40);
        tabla_prod.getColumnModel().getColumn(4).setPreferredWidth(40);
   
        // define color de fonto y del texto del encabezado de la tabla
        tabla_prod.getTableHeader().setBackground(new Color(100, 200, 200));
        tabla_prod.getTableHeader().setForeground(Color.BLACK);
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_prod.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    public void modelo_tabla1() {

        tabla_ventas1.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabla_ventas1.getColumnModel().getColumn(1).setPreferredWidth(50);       
        // define color de fonto y del texto del encabezado de la tabla
        tabla_ventas1.getTableHeader().setBackground(new Color(100, 200, 200));
        tabla_ventas1.getTableHeader().setForeground(Color.BLACK);

    }
     public void modelo_tabla2() {

        tabla_ventas1.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabla_ventas1.getColumnModel().getColumn(1).setPreferredWidth(50);       
        // define color de fonto y del texto del encabezado de la tabla
        tabla_ventas1.getTableHeader().setBackground(new Color(100, 200, 200));
        tabla_ventas1.getTableHeader().setForeground(Color.BLACK);

    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fechabus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filtrarbtn = new javax.swing.JButton();
        verproductos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fechabus1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        selectalias11 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_prod = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jTextField1_corte_total = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        selectalias = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_tipous = new javax.swing.JComboBox<>();
        jTextField_nombre = new javax.swing.JComboBox<>();
        fecha_actual = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();
        BuscaR = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(980, 575));
        setMinimumSize(new java.awt.Dimension(980, 575));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(980, 575));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 575));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 575));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 575));

        tabla_ventas1.setAutoCreateRowSorter(true);
        tabla_ventas1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tabla_ventas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla_ventas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabla_ventas1.setAlignmentX(1.0F);
        tabla_ventas1.setAlignmentY(1.0F);
        tabla_ventas1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabla_ventas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_ventas1.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_ventas1.setRowHeight(20);
        tabla_ventas1.setRowMargin(5);
        tabla_ventas1.setSelectionBackground(new java.awt.Color(255, 204, 0));
        tabla_ventas1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla_ventas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventas1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ventas1);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Close_Window_32px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setText("Ingresa Fecha");

        fechabus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechabusKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechabusKeyTyped(evt);
            }
        });

        jButton1.setText("Corte de Caja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Realiza el corte de caja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)))
                        .addComponent(fechabus, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechabus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Totaliza los productos vendidos");

        jLabel3.setText("Nombre Producto");

        filtrarbtn.setText("Totalizar");
        filtrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarbtnActionPerformed(evt);
            }
        });

        verproductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verproductosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verproductosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtrarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Totalizar   ", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(980, 575));
        jPanel4.setMinimumSize(new java.awt.Dimension(980, 575));
        jPanel4.setPreferredSize(new java.awt.Dimension(980, 575));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setText("Ingresa Fecha");

        fechabus1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechabus1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechabus1KeyTyped(evt);
            }
        });

        jButton3.setText("Rechazar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        selectalias11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige usuario", "Luisa@gg ", "Luisa_admi", "Yadira@VV", "Mario_V.acc", "Juan.acc", "Ronaldo_ac" }));
        selectalias11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectalias11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectalias11ItemStateChanged(evt);
            }
        });

        jLabel13.setText("Panel de filtrado");

        jButton2.setText("Mostrar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(selectalias11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechabus1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectalias11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechabus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        tabla_prod.setAutoCreateRowSorter(true);
        tabla_prod.setBackground(new java.awt.Color(233, 232, 233));
        tabla_prod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tabla_prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabla_prod.setAlignmentX(1.0F);
        tabla_prod.setAlignmentY(1.0F);
        tabla_prod.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabla_prod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_prod.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_prod.setRowHeight(20);
        tabla_prod.setRowMargin(5);
        tabla_prod.setSelectionBackground(new java.awt.Color(255, 204, 0));
        tabla_prod.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_prodMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_prod);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Close_Window_32px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel21)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Cortes Cajeros individuales    ", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(980, 575));
        jPanel6.setMinimumSize(new java.awt.Dimension(980, 575));
        jPanel6.setPreferredSize(new java.awt.Dimension(980, 575));

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTextField1_corte_total.setEnabled(false);

        cod.setEditable(false);
        cod.setEnabled(false);

        selectalias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige usuario", "Luisa@gg ", "Luisa_admi", "Yadira@VV", "Mario_V.acc", "Juan.acc", "Ronaldo_ac" }));
        selectalias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectalias.setEnabled(false);
        selectalias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectaliasItemStateChanged(evt);
            }
        });

        jLabel7.setText("Caso corte");

        jLabel8.setText("Tipo de usuario");

        jTextField_tipous.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el usuario al que pertenece", "Cajero", "Administrador" }));
        jTextField_tipous.setEnabled(false);
        jTextField_tipous.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTextField_tipousItemStateChanged(evt);
            }
        });

        jTextField_nombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el motivo por el corte de caja", "Cambio de turno", "Problemas personales", "Corte Parcial", "otros" }));
        jTextField_nombre.setEnabled(false);
        jTextField_nombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTextField_nombreItemStateChanged(evt);
            }
        });

        fecha_actual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fecha_actual.setForeground(new java.awt.Color(0, 102, 102));
        fecha_actual.setDateFormatString("d/MM/yyyy HH:mm:ss");
        fecha_actual.setEnabled(false);

        jLabel9.setText("Fecha / Hora:");

        jLabel10.setText("Total Corte");

        jLabel11.setText("Numero de corte");

        jLabel12.setText("Alias");

        Mensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 0, 0));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnGuardar)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField1_corte_total, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fecha_actual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                                            .addComponent(selectalias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_tipous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))))
                        .addGap(209, 209, 209))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectalias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_tipous, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_actual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_corte_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))))
        );

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_Close_Window_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaBD);

        jButton4.setText("Rechazar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setText("Filtrar");

        jButton5.setText("Mostrar Todos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Nuevo Corte");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscaR, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(BuscaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jButton5)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cortes generales", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ventas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventas1MouseClicked
       


    }//GEN-LAST:event_tabla_ventas1MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         dispose();
    }//GEN-LAST:event_jLabel19MouseClicked
 //TableRowSorter trs;
    private void fechabusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechabusKeyTyped

    }//GEN-LAST:event_fechabusKeyTyped


    private void fechabusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechabusKeyReleased
        // TODO add your handling code here:
      tabla_ventas1.setModel(of.totalventas1(fechabus.getText()));
      modelo_tabla1();
       // filtrarbtn.setEnabled(false);
        verproductos.setEnabled(false);
 
    }//GEN-LAST:event_fechabusKeyReleased

    private void filtrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarbtnActionPerformed
      // TODO add your handling code here:
         //filtrado actrivando consulta
      //   Ocultar_consulta22();
    tabla_ventas1.setModel(of.totalventas(verproductos.getText()));
        modelo_tabla2();
       jButton1.setEnabled(true);
        fechabus.setEnabled(false);
        verproductos.setEnabled(true);
    }//GEN-LAST:event_filtrarbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tabla_ventas1.setModel(of.totalventas1(fechabus.getText()));
        modelo_tabla1();
        // filtrarbtn.setEnabled(false);
        fechabus.setEnabled(true);
        verproductos.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verproductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verproductosKeyReleased
        // TODO add your handling code here:AAAAAAAAAAAAAAAAAAAAAAAAAAAA
        tabla_ventas1.setModel(of.totalventas(verproductos.getText()));
         modelo_tabla2();
      //jButton1.setEnabled(false);
        fechabus.setEnabled(true);
        verproductos.setEnabled(true);
        fechabus.setEnabled(false);
        
       
    }//GEN-LAST:event_verproductosKeyReleased

    private void verproductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verproductosKeyPressed
        // TODO add your handling code here:
         tabla_ventas1.setModel(of.totalventas(verproductos.getText()));
         modelo_tabla2();
      //jButton1.setEnabled(false);
        fechabus.setEnabled(true);
        verproductos.setEnabled(true);
        fechabus.setEnabled(false);
    }//GEN-LAST:event_verproductosKeyPressed

    private void fechabus1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechabus1KeyReleased
        // TODO add your handling code here:
        tabla_prod.setModel(corte_alias1(fechabus1.getText()));
        modelo_tabla12();
        // filtrarbtn.setEnabled(false);

    }//GEN-LAST:event_fechabus1KeyReleased

    private void fechabus1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechabus1KeyTyped
        // TODO add your handling code here:
        //filtrar fechas

        /*
        fieldfecha.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                super.keyReleased(ke); //To change body of generated methods, choose Tools | Templates.
                trs.setRowFilter(javax.swing.RowFilter.regexFilter(fieldfecha.getText(), 1));
            }

        });
        trs= new TableRowSorter(campos1);
        tabla_ventas1.setRowSorter(trs);*/
    }//GEN-LAST:event_fechabus1KeyTyped

    private void tabla_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_prodMouseClicked

    }//GEN-LAST:event_tabla_prodMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(
            null,
            "Desea eliminar el cliente seleccionado?",
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION)
        {
            int fila= tabla_prod.getSelectedRow();

            String valor = tabla_prod.getValueAt(fila,0).toString();
            if (fila>=0)
            {
                try
                {
                    PreparedStatement pps =cn.prepareStatement("DELETE FROM public.cort WHERE cod ='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Datos Eliminados");
                 
           Tabla();

                } catch (SQLException ex)
                {
                   
                    System.out.println(ex+"error");
                }

            }

        }
        else
        {
           
            JOptionPane.showMessageDialog(null, "Cliente no eliminado");
        }

        
        
    }//GEN-LAST:event_jButton3ActionPerformed
  public void pinta_text() {
        Validaciones.pinta_text(jTextField1_corte_total);
      
        Mensaje.setText("");
        
    }

    public boolean form_validado() {
        boolean ok = true;
        String men = "Error ingresa valor numerico en : ";
        //validar requerido
    
        
        if (!Validaciones.esFlotante(jTextField1_corte_total)) {
            ok = false;
            men += ",Total Corte ";
        }
        
        Mensaje.setText(men);
        //validar más controles
        return ok;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //Guardar
 if (form_validado()) {

            int n=JOptionPane.showConfirmDialog(null,"Desea enviar corte al administrador","Verifique antes de enviar",JOptionPane.YES_NO_OPTION);
            if(n==JOptionPane.YES_OPTION)
            {
                try {
                    
                    PreparedStatement pps = cn.prepareStatement("INSERT INTO  public.cort(cod, alias_corte , caso_corte , tipo_usuario_corte , fecha_actual , total_corte)VALUES(? , ? , ? , ? , ?, ?)");
                     pps.setString(1, cod.getText());
                    pps.setString(2, (String) selectalias.getSelectedItem());
                    pps.setString(3, (String) jTextField_nombre.getSelectedItem());
                    pps.setString(4, (String) jTextField_tipous.getSelectedItem());
                    pps.setString(5,((JTextField)fecha_actual.getDateEditor().getUiComponent()).getText());
                    pps.setString(6, jTextField1_corte_total.getText());
                   
                    pps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Datos Guardados");

                    Tabla();
 bloquear();
  Validaciones.esRequerido1(jTextField1_corte_total);
      
        Mensaje.setText("");
       
                } catch (SQLException ex) {

                }

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos no Guardados");
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void selectaliasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectaliasItemStateChanged
        // TODO add your handling code here:lige

    }//GEN-LAST:event_selectaliasItemStateChanged

    private void jTextField_tipousItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTextField_tipousItemStateChanged
        // TODO add your handling code here:
        String n1 = String.valueOf(jTextField_tipous.getSelectedItem());

    }//GEN-LAST:event_jTextField_tipousItemStateChanged

    private void jTextField_nombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTextField_nombreItemStateChanged
        // TODO add your handling code here:
        String n1 = String.valueOf(jTextField_nombre.getSelectedItem());

    }//GEN-LAST:event_jTextField_nombreItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
            
        int n = JOptionPane.showConfirmDialog(
            null,
            "Desea eliminar el cliente seleccionado?",
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION)
        {
            int fila= tablaBD.getSelectedRow();

            String valor = tablaBD.getValueAt(fila,0).toString();
            if (fila>=0)
            {
                try
                {
                    PreparedStatement pps =cn.prepareStatement("DELETE FROM public.cort WHERE cod ='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Datos Eliminados");

                    Tabla();

                } catch (SQLException ex)
                {
                    System.out.println(ex+"error");
                }

            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cliente no eliminado");
        }
tabla_ventas1.setModel(of.totalventas1(""));
           Tabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void selectalias11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectalias11ItemStateChanged
        // TODO add your handling code here:
        tabla_prod.setModel(corte_alias1((String) selectalias11.getSelectedItem()));
        modelo_tabla12();
    }//GEN-LAST:event_selectalias11ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            tabla_prod.setModel(corte_general(jButton2.getActionCommand()));
       
         tablaBD.setModel(corte_general(jButton2.getActionCommand()));
        modelo_tabla12();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        tablaBD.setModel(corte_general(jButton5.getActionCommand()));
         tabla_prod.setModel(corte_general(jButton5.getActionCommand()));
        modelo_tabla12();
    }//GEN-LAST:event_jButton5ActionPerformed
public void desbloquear(){
        selectalias.setEnabled(true);
        jTextField_nombre.setEnabled(true);
       jTextField_tipous.setEnabled(true);
        fecha_actual.setEnabled(true);
        jTextField1_corte_total.setEnabled(true);
        btnGuardar.setEnabled(true);
}
public void bloquear(){
        selectalias.setEnabled(false);
        jTextField_nombre.setEnabled(false);
       jTextField_tipous.setEnabled(false);
        fecha_actual.setEnabled(false);
        jTextField1_corte_total.setEnabled(false);
        btnGuardar.setEnabled(false);
}
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //new corte
        try{
            Calendar cal = Calendar.getInstance();
            String fecha;
            fecha = cal.get(Calendar.DATE) + "" + (cal.get(Calendar.MARCH) + 1) + "" + cal.get(Calendar.YEAR)+""+cal.get(Calendar.HOUR) + "" + (cal.get(Calendar.MINUTE)) + "" + cal.get(Calendar.SECOND);
            this.cod.setText(fecha);
            desbloquear();
        }catch(Exception ex){
            System.out.println(""+ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscaR;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cod;
    private com.toedter.calendar.JDateChooser fecha_actual;
    private javax.swing.JTextField fechabus;
    private javax.swing.JTextField fechabus1;
    private javax.swing.JButton filtrarbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1_corte_total;
    private javax.swing.JComboBox<String> jTextField_nombre;
    private javax.swing.JComboBox<String> jTextField_tipous;
    private javax.swing.JComboBox<String> selectalias;
    private javax.swing.JComboBox<String> selectalias11;
    private javax.swing.JTable tablaBD;
    private javax.swing.JTable tabla_prod;
    private javax.swing.JTable tabla_ventas1;
    private javax.swing.JTextField verproductos;
    // End of variables declaration//GEN-END:variables

  

   

  
}
