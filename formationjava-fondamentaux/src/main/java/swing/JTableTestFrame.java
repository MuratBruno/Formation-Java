/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class JTableTestFrame extends JFrame {

    JTable table;

    public JTableTestFrame() {
        table = new JTable(new MyTableModel());
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        this.getContentPane().add(scrollPane);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    //Creation du Table Model Spécifique...
    class MyTableModel extends AbstractTableModel {
        private String[] columnNames = {"First Name",
                                        "Last Name",
                                        "Sport",
                                        "# of Years",
                                        "Vegetarian"};
        private Object[][] data = {
	    {"Kathy", "Smith",
	     "Snowboarding", new Integer(5), new Boolean(false)},
	    {"John", "Doe",
	     "Rowing", new Integer(3), new Boolean(true)},
	    {"Sue", "Black",
	     "Knitting", new Integer(2), new Boolean(false)},
	    {"Jane", "White",
	     "Speed reading", new Integer(20), new Boolean(true)},
	    {"Joe", "Brown",
	     "Pool", new Integer(10), new Boolean(false)}
        };

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }
        @Override
        public int getRowCount() {
            return data.length;
        }
        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }
        @Override
        public Object getValueAt(int row, int col) {
            return data[row][col];
        }
        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
        @Override
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame mainFrame = new JTableTestFrame();
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
}
