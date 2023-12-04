/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoContral;

import Model.Manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public class ManagerDao {
    private static String dburl="jdbc:mysql://localhost:3306/car_woshing_management_system_db";
    private static   String username="root";
    private  static  String password="";
    
    
    public List<Manager> logindatamanagerdata(Manager mg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="select * from manager where email=? AND password=?";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, mg.getEmail());
            work.setString(2, mg.getPassword());
            ResultSet result=work.executeQuery();
            boolean cond=false;
            List<Manager> listdat= new ArrayList<>();
            if(result.next()){
                Manager data=new Manager();
                data.setManager_id(result.getInt("manager_id"));
                data.setEmail(result.getString("email"));
                data.setPassword(result.getString("password"));
                data.setFullname(result.getString("fullname"));
                data.setRole(result.getString("role"));
                listdat.add(data);
                cond=true;
            }
            
            if(cond==true){
               return listdat; 
            }else{
                return null;
            }
            
       } catch (Exception e) {
           e.printStackTrace();
          
       }
       
       return null;
   }
}
