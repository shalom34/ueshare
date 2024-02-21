package swing.Mainpage.components.Models.jTableModel;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setShowVerticalLines(false);
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;

            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean selected, boolean bl1, int i, int i1) {
                if (i1 != 4) {
                    Component comp = super.getTableCellRendererComponent(table, o, bl1, bl1, i, i1);
                    comp.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(selected){
                        comp.setForeground(new Color(15,89,140));
                        comp.setBackground(new Color(0,0,0,20));
                    }else{
                        comp.setForeground(new Color(102,102,102));
                    }
                    return comp;
                }else{
                    StatusType type= (StatusType)o;
                    CellStatus cell= new CellStatus(type);
                    return cell;
                }
            
            }

        });
    }
public void addRow(Object[] row){
    DefaultTableModel model= (DefaultTableModel)getModel();
    model.addRow(row);
}
}
