/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoContral;

import Model.CustomerModel;
import Model.WorkersModel;
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
public class CustomerDao {
    
    private static String dburl="jdbc:mysql://localhost:3306/car_woshing_management_system_db";
    private static   String username="root";
    private  static  String password="";
    
    
    /////////////////Inserting A customer
    public String insertdata(CustomerModel CM){
        try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Insert into customer(type,placket_number,phone_number,price,worsher_name,date) values(?,?,?,?,?,?)";
            PreparedStatement customer=con.prepareStatement(sql);
            customer.setString(1,CM.getType());
            customer.setString(2,CM.getPlacket_number());
            customer.setString(3,CM.getPhone_number());
            customer.setFloat(4,CM.getPrice());
            customer.setString(5,CM.getWosher_name());
            customer.setString(6,CM.getDate());
            int datainsert=customer.executeUpdate();
            con.close();
            if(datainsert>=1){
                return"Registered Customer Successdful";
                
            }else{
                return" Registered Customer Fail";
            }  
        } catch (Exception e) {
            e.printStackTrace();
             return "Server Error"+e.getMessage();
        }   
    }
    
    ////////////////////////////////////////display data 
    
    public List<CustomerModel> customerisplaydata( CustomerModel cm){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select type,placket_number,phone_number,price,worsher_name,date from customer where date=?";
            PreparedStatement eric=con.prepareStatement(sql);
             eric.setString(1, cm.getDate());
            ResultSet result=eric.executeQuery();
            List<CustomerModel> studentList= new ArrayList<>();
            boolean condition=false;
            while(result.next()){
                CustomerModel customer=new CustomerModel();
                customer.setType(result.getString("type"));
                customer.setPlacket_number(result.getString("placket_number"));
                customer.setPhone_number(result.getString("phone_number"));
                customer.setPrice(result.getFloat("price"));
                customer.setWosher_name(result.getString("worsher_name"));
                customer.setDate(result.getString("date"));
                studentList.add(customer);
                condition=true;
            }
            con.close();
            if(condition==true){
                return studentList; 
            }else{
             return null;
         }
            
        } catch (Exception e) {
        }
          return null;
    }
    
    ///////////////////////////////
    public List<CustomerModel> customerisplaydatapermothlyday( CustomerModel cm){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select type,placket_number,phone_number,price,worsher_name,date from customer where date>=? AND date<=?";
            PreparedStatement eric=con.prepareStatement(sql);
             eric.setString(1, cm.getDate());
             eric.setString(2, cm.getDate1());
            ResultSet result=eric.executeQuery();
            List<CustomerModel> studentList= new ArrayList<>();
            boolean condition=false;
            while(result.next()){
                CustomerModel customer=new CustomerModel();
                customer.setType(result.getString("type"));
                customer.setPlacket_number(result.getString("placket_number"));
                customer.setPhone_number(result.getString("phone_number"));
                customer.setPrice(result.getFloat("price"));
                customer.setWosher_name(result.getString("worsher_name"));
                customer.setDate(result.getString("date"));
                studentList.add(customer);
                condition=true;
            }
            con.close();
            if(condition==true){
                return studentList; 
            }else{
             return null;
         }
            
        } catch (Exception e) {
        }
          return null;
    }
    
   
    
}
