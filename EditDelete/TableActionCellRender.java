/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditDelete;
import java.awt.Color;
import java.awt.Component;
import java.awt.Component;
import javax.swing.DefaultButtonModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author M NJERIC
 */
public class TableActionCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isselect, boolean bln1, int row, int i1) {
        Component com=super.getTableCellRendererComponent(jtable, o, isselect, bln1, row, i1); //To change body of generated methods, choose Tools | Templates.
    
    
   PanalAction action=new PanalAction();
   if(isselect==false && row%2==0){
       action.setBackground(Color.WHITE);
       
   }else{
   
   action.setBackground(com.getBackground());
   }
   return action;
   
    }   
}
