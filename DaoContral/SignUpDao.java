/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoContral;

import Model.CustomerModel;
import Model.Manager;
import Model.SignUp;
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
public class SignUpDao {
      
    private static String dburl="jdbc:mysql://localhost:3306/car_woshing_management_system_db";
    private static   String username="root";
    private  static  String password="";
    
    
   public String Searchingdadata(SignUp sg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select national_id,type from worker where national_id=? AND type=?)";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, sg.getNational_id());
            work.setString(2, "Staff");
            ResultSet result=work.executeQuery();
            if(result.next()){
                SignUp data=new SignUp();
                data.setNational_id(result.getString("national_id"));
            }else{
                return null;
            }
            
       } catch (Exception e) {
           e.printStackTrace();
           return "server Error"+e.getMessage();
       }
       return "";
       
   }
    
    ////////////////////Insert 
   
   
   public String insertdata(SignUp CM){
        try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Insert into signup values(?,?,?)";
            PreparedStatement sign=con.prepareStatement(sql);
           sign.setString(1,CM.getNational_id());
           sign.setString(2, CM.getUsername());
           sign.setString(3, CM.getPassword());
            
            int datainsert=sign.executeUpdate();
            con.close();
            if(datainsert>=1){
                return"Account Created Successdful";
                
            }else{
                return" Create Account Fail";
            }  
        } catch (Exception e) {
            e.printStackTrace();
             return "Server Error"+e.getMessage();
        }   
    }
   /////////////////////////////////////////////////////////////////
   
     public String Searchingdadatafromsignuptable(SignUp sg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select national_id from signup where national_id=?)";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, sg.getNational_id());
            ResultSet result=work.executeQuery();
            if(result.next()){
                SignUp data=new SignUp();
                data.setNational_id(result.getString("national_id"));
            }else{
                return null;
            }
            
       } catch (Exception e) {
           e.printStackTrace();
           return "server Error"+e.getMessage();
       }
       return "";
       
   }
    /////////////////////////////login form
     
    public List<SignUp> logindata(SignUp sg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select * from signup where email=? AND password=?)";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, sg.getUsername());
             work.setString(2, sg.getPassword());
            ResultSet result=work.executeQuery();
            boolean cond=false;
            List<SignUp> listdat= new ArrayList<>();
            if(result.next()){
                SignUp data=new SignUp();
                data.setNational_id(result.getString("national_id"));
                data.setUsername(result.getString("email"));
                data.setPassword(result.getString("password"));
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
    
    ///////////////////////////select manager
    
    
    public List<Manager> logindatamanager(Manager mg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select * from manager where email=? AND password=?)";
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
    //////////////manager Data 
    public String Searchingdadatafromsemail(SignUp sg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select email from signup where email=?)";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, sg.getUsername());
            ResultSet result=work.executeQuery();
            if(result.next()){
                SignUp data=new SignUp();
                data.setNational_id(result.getString("email"));
            }else{
                return null;
            }
            
       } catch (Exception e) {
           e.printStackTrace();
           return "server Error"+e.getMessage();
       }
       return "";
       
   }
}
