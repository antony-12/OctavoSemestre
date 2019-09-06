/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class RowsRenderer extends DefaultTableCellRenderer {
private int columna ;

public RowsRenderer(int Colpatron)
{
    this.columna = Colpatron;
}

@Override
public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
{        
    setBackground(Color.white);
    table.setForeground(Color.black);
    super.getTableCellRendererComponent(table, value, selected, focused, row, column);
    if(table.getValueAt(row,columna).equals("0"))
    {
        this.setForeground(Color.RED);
    }else if(table.getValueAt(row,columna).equals("5")){
        this.setForeground(Color.BLUE);
    }else if(table.getValueAt(row, columna).equals("30")){
        this.setForeground(Color.GREEN);
    }
    return this;
  }
  }