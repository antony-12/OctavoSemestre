
package Controlador;

import Conexion.Conexion;
import Conexion.Modelo;
import Controlador.operaciones_clientes;
import Entidades.proveedores;
import static Formularios.Registrar_proveedor.tblProveedores;
import static Formularios.Registro_Clientes.tbl_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class operaciones_proveedor implements Modelo<proveedores> {
    
     Conexion bd = new Conexion();
    Connection cn = bd.ConectarOracle();

    DefaultTableModel campos;
    private String insertar = "INSERT INTO public.cs(\n"
            + "     cod_co, alias_corte, caso_corte, tipo_usuario_corte, fecha_actual, total_corte)\n"
            + "    VALUES (?, ?, ?, ?, ?,?)";
    private String update = "UPDATE public.cs\n"
            + " SET alias_corte=?, caso_corte=?, tipo_usuario_corte=?, fecha_actual=?, total_corte=?\n"
            + " WHERE cod_co=?";
     private String delete = "DELETE FROM public.cs\n"
             + "WHERE cod_co=?";
    private PreparedStatement ps = null;
   

    @Override
    public void Registrar(proveedores dato) {
        try {
            ps = cn.prepareStatement(insertar);
            ps.setInt(1, dato.getCod_prove());//identificacin unica
            ps.setString(2, dato.getCed());
            ps.setString(3, dato.getNom());
            ps.setString(4, dato.getDireccion());
            ps.setString(5, dato.getTelf());
            ps.setString(6, dato.getCorreo_cedula());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Proveedor ya existe");
        }
    }
    @Override
    public void Modificar(proveedores dato) {
          try {
            ps = cn.prepareStatement(update);           
            ps.setInt(1, dato.getCod_prove());//identificacin unica
            ps.setString(2, dato.getCed());
            ps.setString(3, dato.getNom());
            ps.setString(4, dato.getDireccion());
            ps.setString(5, dato.getTelf());
            ps.setString(6, dato.getCorreo_cedula());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");

        } catch (SQLException ex) {
            Logger.getLogger(operaciones_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Eliminar(proveedores dato) {
        try {
        
            ps = cn.prepareStatement(delete);
            ps.setInt(1, dato.getCod_prove());//identificacin unica
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        } catch (SQLException e) {
            System.out.println(e);
        }       
    }

    public int codigo_Proveedor() {
        int c = 0;
        String SQL ="select max(cod_co) from public.cs";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                return 1;
            } else {

                return c + 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }

    //VISTAS
  /*  id_pro, ced_pro, nom_pro, direc_pro, telf_pro, correo_p*/
     public void mostrardatos_Provedores(String valor) {//Modificar
        String[] titulos = {"cod","Alias","Caso","Tipo Usuario", "Fecha","Total"};
        String[] Registros = new String[6];//Numero de columnas
        campos = new DefaultTableModel(null, titulos);
        String mostrar = " SELECT * FROM  public.cs WHERE CONCAT(alias_corte, fecha_actual) LIKE '%" + valor + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("cod_co"); 
                Registros[1] = rs.getString("alias_corte");
                Registros[2] = rs.getString("caso_corte");
                Registros[3] = rs.getString("tipo_usuario_corte");
                Registros[4] = rs.getString("fecha_actual");
                Registros[5] = rs.getString("total_corte");   
                
                campos.addRow(Registros);
            }
            tblProveedores.setModel(campos);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
