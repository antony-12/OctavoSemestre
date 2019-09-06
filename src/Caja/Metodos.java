/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

import Conexion.Conexion;
import Controlador.operaciones_clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {
 
private PreparedStatement ps = null;
    Conexion bd = new Conexion();
     Connection cn = Conexion.ConectarOracle();
    DefaultTableModel campos;

   

    
public int Guardar(String Alias, String Caso, String Tipo_us, String Hora, 
                   String Fecha, Double Total){



String SSQL = "INSERT INTO  public.Registro_corte_caja(Alias, Accion, Tipo_usuario_corte, Fecha_corte, Hora_corte, Total_corte)"
            + "VALUES (?, ?, ?, ?, ?, ?)";
    
try {
            Conexion.ConectarOracle();
            ps = cn.prepareStatement(SSQL);

            ps.setString(1, Alias);
             ps.setString(2, Caso);
              ps.setString(3, Tipo_us);
               ps.setString(4, Hora);
                ps.setString(5, Fecha);
                 ps.setDouble(6, Total);


            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (SQLException ex) {
            Logger.getLogger(operaciones_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
}






    
    
    

   