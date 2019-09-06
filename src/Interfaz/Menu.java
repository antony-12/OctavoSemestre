package Interfaz;

import Caja.corte_caja;
import Caja.corte_ccccc;
import login_access.sesion;
import java.util.Date;
import java.util.*;
import Conexiones.Control;
import Conexiones.TryClass;
import Conexiones.cargar1;
import Consultas.Consulta_Productos;
import Consultas.Consulta_clientes;
import Consultas.Consultar_ventas;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Date;
import java.text.SimpleDateFormat;
import Consultas.Reportes;
import Consultas.Ventas_Corte;
import Formularios.Facturar;
import Formularios.Registrar_Usuario;
import Formularios.Registrar_proveedor;
import Formularios.Registro_Clientes;
import Formularios.Registro_productos;
import Interfaz.login;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Menu extends javax.swing.JFrame implements Runnable {

    Conexiones.Control Music = new Control();
    TryClass t = new TryClass();

    String hora, minutos, segundos, ampm;

    Thread hilo;

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);//Centrar la ventan
        setVisible(true);
        hilo = new Thread(this);
        hilo.start();
        Calendar cal = Calendar.getInstance();
        String fecha, hora;
        fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha.setText(fecha);
        hora = cal.get(Calendar.HOUR) + ":" + (cal.get(Calendar.MINUTE)) + ":" + cal.get(Calendar.SECOND);
        this.hr1.setText(hora);

       cargarIcono();
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);

        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;

            hora = h > 9 ? "" + h : "0" + h;

        } else {

            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();
        hora();
        int h;
        h = Integer.parseInt(hora);
        if (h == 0) {

            while (current == hilo) {
                hora();

                lbltiempo.setText("12" + ":" + minutos + ":" + segundos + " " + ampm);
            }

        } else {
            while (current == hilo) {
                hora();

                lbltiempo.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        titulohora = new javax.swing.JLabel();
        hr1 = new javax.swing.JLabel();
        JLB_Fecha = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        titulohora1 = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        state1 = new javax.swing.JLabel();
        Salir = new javax.swing.JMenuBar();
        Cajeromenu = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu1Consultas = new javax.swing.JMenu();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11Clientes = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12Productos = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ADMINMEN = new javax.swing.JMenu();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11clientesad = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12Productosad = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15Reinprecion = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        adusmenu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        vendedor = new javax.swing.JMenu();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenu1Consultas1 = new javax.swing.JMenu();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11Clientes1 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12Productos1 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        Ventas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        acercade_Menu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ExitMenu = new javax.swing.JMenu();
        camusuario1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setTitle("Tazmani");
        setBackground(new java.awt.Color(102, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1152, 641));
        setMinimumSize(new java.awt.Dimension(1152, 641));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1152, 641));
        setSize(new java.awt.Dimension(1152, 641));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDesktopPane1.setForeground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(50, 45, 93));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        titulohora.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        titulohora.setForeground(new java.awt.Color(102, 0, 0));
        titulohora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulohora.setText("Hora de acceso:");

        hr1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hr1.setForeground(new java.awt.Color(0, 102, 102));
        hr1.setText("00:00:00");

        JLB_Fecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLB_Fecha.setForeground(new java.awt.Color(0, 102, 102));
        JLB_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLB_Fecha.setText("00/00/00");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha:");

        titulohora1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        titulohora1.setForeground(new java.awt.Color(102, 0, 0));
        titulohora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulohora1.setText("Hora:");

        lbltiempo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbltiempo.setForeground(new java.awt.Color(0, 102, 102));
        lbltiempo.setText("00:00:00");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText(" Dulceria y Novedades Tazmania");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(titulohora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulohora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLB_Fecha)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(titulohora)
                .addComponent(hr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulohora1)
                .addComponent(lbltiempo)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(JLB_Fecha)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        state1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        state1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(949, 949, 949))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setBorder(null);

        Cajeromenu.setBackground(new java.awt.Color(50, 45, 93));
        Cajeromenu.setBorder(null);
        Cajeromenu.setForeground(new java.awt.Color(255, 255, 255));
        Cajeromenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Male User_30px.png"))); // NOI18N
        Cajeromenu.setText("        Cajero         ");
        Cajeromenu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Cajeromenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajeromenuActionPerformed(evt);
            }
        });
        Cajeromenu.add(jSeparator5);

        jMenu1Consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Checklist_30px.png"))); // NOI18N
        jMenu1Consultas.setText("Consultas  ");
        jMenu1Consultas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1Consultas.add(jSeparator19);

        jMenuItem11Clientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem11Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Profile_32px.png"))); // NOI18N
        jMenuItem11Clientes.setText("Clientes");
        jMenuItem11Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ClientesActionPerformed(evt);
            }
        });
        jMenu1Consultas.add(jMenuItem11Clientes);
        jMenu1Consultas.add(jSeparator17);

        jMenuItem12Productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem12Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Small Business_30px.png"))); // NOI18N
        jMenuItem12Productos.setText("Productos");
        jMenuItem12Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ProductosActionPerformed(evt);
            }
        });
        jMenu1Consultas.add(jMenuItem12Productos);
        jMenu1Consultas.add(jSeparator18);

        Cajeromenu.add(jMenu1Consultas);
        Cajeromenu.add(jSeparator3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Price Tag_30px.png"))); // NOI18N
        jMenuItem5.setText("Corte de Caja");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Cajeromenu.add(jMenuItem5);
        Cajeromenu.add(jSeparator6);

        Salir.add(Cajeromenu);

        ADMINMEN.setBackground(new java.awt.Color(50, 45, 93));
        ADMINMEN.setForeground(new java.awt.Color(255, 255, 255));
        ADMINMEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Female Profile_30px.png"))); // NOI18N
        ADMINMEN.setText("Administrador   ");
        ADMINMEN.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ADMINMEN.setMaximumSize(new java.awt.Dimension(149, 32767));
        ADMINMEN.setPreferredSize(new java.awt.Dimension(149, 30));
        ADMINMEN.add(jSeparator12);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Checklist_30px.png"))); // NOI18N
        jMenu1.setText("Consultas");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1.add(jSeparator8);

        jMenuItem11clientesad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem11clientesad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Profile_32px.png"))); // NOI18N
        jMenuItem11clientesad.setText("Clientes");
        jMenuItem11clientesad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem11clientesadMouseClicked(evt);
            }
        });
        jMenuItem11clientesad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11clientesadActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11clientesad);
        jMenu1.add(jSeparator9);

        jMenuItem12Productosad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem12Productosad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Small Business_30px.png"))); // NOI18N
        jMenuItem12Productosad.setText("Productos");
        jMenuItem12Productosad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem12ProductosadMouseClicked(evt);
            }
        });
        jMenuItem12Productosad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ProductosadActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12Productosad);
        jMenu1.add(jSeparator10);

        jMenuItem15Reinprecion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem15Reinprecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Print_30px.png"))); // NOI18N
        jMenuItem15Reinprecion.setText("Re-impreción Tickets");
        jMenuItem15Reinprecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem15ReinprecionMouseClicked(evt);
            }
        });
        jMenuItem15Reinprecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ReinprecionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15Reinprecion);
        jMenu1.add(jSeparator11);

        ADMINMEN.add(jMenu1);
        ADMINMEN.add(jSeparator1);

        adusmenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adusmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Team_32px.png"))); // NOI18N
        adusmenu.setText("Admin Sesiones");
        adusmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adusmenuActionPerformed(evt);
            }
        });
        ADMINMEN.add(adusmenu);
        ADMINMEN.add(jSeparator4);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Detective_30px.png"))); // NOI18N
        jMenuItem10.setText("Analisis de cortes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        ADMINMEN.add(jMenuItem10);
        ADMINMEN.add(jSeparator7);

        Salir.add(ADMINMEN);

        vendedor.setBackground(new java.awt.Color(50, 45, 93));
        vendedor.setBorder(null);
        vendedor.setForeground(new java.awt.Color(255, 255, 255));
        vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Team_30px.png"))); // NOI18N
        vendedor.setText("  Vendedor    ");
        vendedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        vendedor.setMaximumSize(new java.awt.Dimension(149, 32767));
        vendedor.setPreferredSize(new java.awt.Dimension(149, 30));
        vendedor.add(jSeparator20);

        jMenu1Consultas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Checklist_30px.png"))); // NOI18N
        jMenu1Consultas1.setText("Consultas  ");
        jMenu1Consultas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1Consultas1.add(jSeparator13);

        jMenuItem11Clientes1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem11Clientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Profile_32px.png"))); // NOI18N
        jMenuItem11Clientes1.setText("Clientes");
        jMenuItem11Clientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11Clientes1ActionPerformed(evt);
            }
        });
        jMenu1Consultas1.add(jMenuItem11Clientes1);
        jMenu1Consultas1.add(jSeparator14);

        jMenuItem12Productos1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem12Productos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Small Business_30px.png"))); // NOI18N
        jMenuItem12Productos1.setText("Productos");
        jMenuItem12Productos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12Productos1ActionPerformed(evt);
            }
        });
        jMenu1Consultas1.add(jMenuItem12Productos1);
        jMenu1Consultas1.add(jSeparator15);

        vendedor.add(jMenu1Consultas1);
        vendedor.add(jSeparator16);

        Salir.add(vendedor);

        Ventas.setBackground(new java.awt.Color(204, 204, 204));
        Ventas.setBorder(null);
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cash in Hand_30px.png"))); // NOI18N
        Ventas.setText("Ventas    ");
        Ventas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Paper Money_30px.png"))); // NOI18N
        jMenuItem4.setText("Tickets");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Ventas.add(jMenuItem4);

        Salir.add(Ventas);

        Clientes.setBackground(new java.awt.Color(63, 56, 125));
        Clientes.setBorder(null);
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add User Group Woman Man_30px.png"))); // NOI18N
        Clientes.setText("Agregar Clientes   ");
        Clientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenuItem13.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add User Male_30px.png"))); // NOI18N
        jMenuItem13.setText("Registrar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItem13);

        Salir.add(Clientes);

        Productos.setBackground(new java.awt.Color(63, 56, 125));
        Productos.setBorder(null);
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add Node_30px.png"))); // NOI18N
        Productos.setText("Agregar Productos    ");
        Productos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenuItem14.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Small Business_30px.png"))); // NOI18N
        jMenuItem14.setText("Registrar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        Productos.add(jMenuItem14);

        Salir.add(Productos);

        Consultas.setBackground(new java.awt.Color(63, 56, 125));
        Consultas.setBorder(null);
        Consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Show Property_30px.png"))); // NOI18N
        Consultas.setText("Imprimir Consultas  ");
        Consultas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Natural User Interface 2_30px.png"))); // NOI18N
        jMenuItem9.setText("Revisar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Consultas.add(jMenuItem9);

        Salir.add(Consultas);

        acercade_Menu.setBackground(new java.awt.Color(63, 56, 125));
        acercade_Menu.setBorder(null);
        acercade_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Identification Documents_30px.png"))); // NOI18N
        acercade_Menu.setText("Acerca de  ");
        acercade_Menu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Permanent Job_30px.png"))); // NOI18N
        jMenuItem2.setText("@Grupo E");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        acercade_Menu.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Profile_32px.png"))); // NOI18N
        jMenuItem3.setText("Ver");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        acercade_Menu.add(jMenuItem3);

        Salir.add(acercade_Menu);

        ExitMenu.setBackground(new java.awt.Color(63, 56, 125));
        ExitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Keepass_32px.png"))); // NOI18N
        ExitMenu.setText("Salir");
        ExitMenu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        camusuario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        camusuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login_32pxrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr.png"))); // NOI18N
        camusuario1.setText("Cambiar usuario");
        camusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camusuario1ActionPerformed(evt);
            }
        });
        ExitMenu.add(camusuario1);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Door Opened_32px.png"))); // NOI18N
        jMenuItem6.setText("Cerrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        ExitMenu.add(jMenuItem6);

        Salir.add(ExitMenu);

        setJMenuBar(Salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void cargarIcono() {
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/iconotaz.ico"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }


    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // 

        Facturar mc = new Facturar();
        int x = (jDesktopPane1.getWidth() / 2) - (mc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (mc.getHeight() / 2);
        if (mc.isShowing()) {
            mc.setLocation(x, y);
        } else {
            jDesktopPane1.add(mc);
            mc.setLocation(x, y);
            mc.show();
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        try {
            Reportes rc = new Reportes();
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

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "ITM 25/04/2018", "Autor:@Equipo4", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void camusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camusuario1ActionPerformed
        // TODO add your handling code here:
        dispose();
        sesion mc = new sesion();
        mc.setVisible(true);


    }//GEN-LAST:event_camusuario1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Nosotros mc = new Nosotros();
        mc.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Registro_Clientes rc = new Registro_Clientes();
        int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
        if (rc.isShowing()) {
            rc.setLocation(x, y);
        } else {
            jDesktopPane1.add(rc);
            rc.setLocation(x, y);
            rc.show();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Registro_productos rc = new Registro_productos();
        int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
        if (rc.isShowing()) {
            rc.setLocation(x, y);
        } else {
            jDesktopPane1.add(rc);
            rc.setLocation(x, y);
            rc.show();
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        try {
            Ventas_Corte rc = new Ventas_Corte();
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
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ClientesActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jMenuItem11ClientesActionPerformed

    private void jMenuItem12ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ProductosActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jMenuItem12ProductosActionPerformed

    private void jMenuItem11clientesadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11clientesadMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem11clientesadMouseClicked

    private void jMenuItem12ProductosadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12ProductosadMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem12ProductosadMouseClicked

    private void jMenuItem15ReinprecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15ReinprecionMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem15ReinprecionMouseClicked

    private void jMenuItem11clientesadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11clientesadActionPerformed
        // TODO add your handling code here:
        //clerinets
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
    }//GEN-LAST:event_jMenuItem11clientesadActionPerformed

    private void jMenuItem12ProductosadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ProductosadActionPerformed
        // TODO add your handling code here:
        //producto
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
    }//GEN-LAST:event_jMenuItem12ProductosadActionPerformed

    private void jMenuItem15ReinprecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ReinprecionActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jMenuItem15ReinprecionActionPerformed

    private void adusmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adusmenuActionPerformed
        // TODO add your handling code here:
        Registrar_Usuario rc = new Registrar_Usuario();
        int x = (jDesktopPane1.getWidth() / 2) - (rc.getWidth() / 2);
        int y = (jDesktopPane1.getHeight() / 2) - (rc.getHeight() / 2);
        if (rc.isShowing()) {
            rc.setLocation(x, y);
        } else {
            jDesktopPane1.add(rc);
            rc.setLocation(x, y);
            rc.show();
        }
    }//GEN-LAST:event_adusmenuActionPerformed

    private void jMenuItem11Clientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11Clientes1ActionPerformed
        // TODO add your handling code here:
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
                                                       

    }//GEN-LAST:event_jMenuItem11Clientes1ActionPerformed

    private void jMenuItem12Productos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12Productos1ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jMenuItem12Productos1ActionPerformed

    private void CajeromenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajeromenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CajeromenuActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
            try {
            corte_ccccc rc = new  corte_ccccc();
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
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private Timer timer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu ADMINMEN;
    public static javax.swing.JMenu Cajeromenu;
    public static javax.swing.JMenu Clientes;
    public static javax.swing.JMenu Consultas;
    public static javax.swing.JMenu ExitMenu;
    private javax.swing.JLabel JLB_Fecha;
    public static javax.swing.JMenu Productos;
    public static javax.swing.JMenuBar Salir;
    public static javax.swing.JMenu Ventas;
    public static javax.swing.JMenu acercade_Menu;
    private javax.swing.JMenuItem adusmenu;
    public static javax.swing.JMenuItem camusuario1;
    private javax.swing.JLabel hr1;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu1Consultas;
    private javax.swing.JMenu jMenu1Consultas1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11Clientes;
    private javax.swing.JMenuItem jMenuItem11Clientes1;
    private javax.swing.JMenuItem jMenuItem11clientesad;
    private javax.swing.JMenuItem jMenuItem12Productos;
    private javax.swing.JMenuItem jMenuItem12Productos1;
    private javax.swing.JMenuItem jMenuItem12Productosad;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15Reinprecion;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lbltiempo;
    private javax.swing.JLabel state1;
    private javax.swing.JLabel titulohora;
    private javax.swing.JLabel titulohora1;
    public static javax.swing.JMenu vendedor;
    // End of variables declaration//GEN-END:variables
}
