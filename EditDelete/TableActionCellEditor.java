/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditDelete;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author M NJERIC
 */
public class TableActionCellEditor  extends DefaultCellEditor{
    
    private TableActionEvent event;
    
    
    public TableActionCellEditor( TableActionEvent event) {
        super(new JCheckBox());
        this.event=event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        PanalAction action=new PanalAction();
        action.intevent(event, row);
        return action;
    }
    
    
    
    
    
}
