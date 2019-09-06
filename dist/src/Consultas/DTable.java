
package Consultas;

import java.awt.Color;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Ryeventh
 */
public class DTable extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex){
        Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
        
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);
        if ((Float.class.equals(this.getColumnClass(columnIndex))) && (getValueAt(rowIndex, columnIndex)!=null)){
        float val = Float.parseFloat(getValueAt(rowIndex, columnIndex).toString());
                if (val<=0) {
                    component.setBackground(Color.YELLOW);
                    component.setForeground(Color.RED);
                    
                }
        }
        return component;
    }
}
