/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoContral;

import Model.SignUp;
import Model.WorkersModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/**
 *
 * @author M NJERIC
 */
public class WorkerDao {
    private static String dburl="jdbc:mysql://localhost:3306/car_woshing_management_system_db";
    private static   String username="root";
    private  static  String password="";
    
    ///////////////////////Inserting Workers 
    public String insertdata(WorkersModel wrk){
        try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Insert into worker(national_id,first_name,last_name,type,address,phone_number,gender,Date) values(?,?,?,?,?,?,?,?)";
            PreparedStatement worker=con.prepareStatement(sql);
            worker.setString(1,wrk.getNational_id());
            worker.setString(2, wrk.getFist_name());
            worker.setString(3, wrk.getLast_name());
            worker.setString(4, wrk.getType());
            worker.setString(5, wrk.getAddress());
            worker.setString(6, wrk.getPhone_number());
            worker.setString(7, wrk.getGender());
            worker.setString(8,  wrk.getStart_Date());
            int datainsert=worker.executeUpdate();
            con.close();
            if(datainsert>=1){
                return"Worker Registered Successdful";
                
            }else{
                return"Worker Registered Fail";
            }  
        } catch (Exception e) {
            e.printStackTrace();
             return "Server Error"+e.getMessage();
        }   
    }
    ///////////////////////////////////////////update workers
    public String updatedata(WorkersModel wrk){
        try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="UPDATE worker SET first_name=?,last_name=?,type=?,address=?,phone_number=?,gender=?,Date=? where national_id=?";
            PreparedStatement worker=con.prepareStatement(sql);
            worker.setString(1, wrk.getFist_name());
            worker.setString(2, wrk.getLast_name());
            worker.setString(3, wrk.getType());
            worker.setString(4, wrk.getAddress());
            worker.setString(5, wrk.getPhone_number());
            worker.setString(6, wrk.getGender());
            worker.setString(7,  wrk.getStart_Date());
            worker.setString(8,wrk.getNational_id());
            int datainsert=worker.executeUpdate();
            con.close();
            if(datainsert>=1){
                return"Updated Successdful";
            }else{
                return"Updated Fail";
            }  
        } catch (Exception e) {
            e.printStackTrace();
             return "Server Error"+e.getMessage();
        }   
    }
    /////////////////////////////delete data//////////////////
    public String deletedata(WorkersModel wrk){
        try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Delete from worker where national_id=?";
            PreparedStatement worker=con.prepareStatement(sql);
            worker.setString(1,wrk.getNational_id());
            int datainsert=worker.executeUpdate();
            con.close();
            if(datainsert>=1){
                return"Data Deleted Successdful";
            }else{
                return"Data Fail to Delete";
            }  
        } catch (Exception e) {
            e.printStackTrace();
             return "Server Error"+e.getMessage();
        }   
    }
    
    
    /////////////////////////retrive workes data///////////////////
    
     public List<WorkersModel> workerdisplaydata(WorkersModel wk){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select * from worker where type=?";
            PreparedStatement eric=con.prepareStatement(sql);
            eric.setString(1, wk.getType());
            ResultSet result=eric.executeQuery();
            boolean cond=false;
            List<WorkersModel> studentList= new ArrayList<>();
            while(result.next()){
                WorkersModel worker=new WorkersModel();
                worker.setNational_id(result.getString("national_id"));
                worker.setFist_name(result.getString("first_Name"));
                worker.setLast_name(result.getString("last_Name"));
                worker.setType(result.getString("type"));
                worker.setAddress(result.getString("address"));
                worker.setPhone_number(result.getString("phone_number"));
                worker.setGender(result.getString("gender"));
                worker.setStart_Date(result.getString("date"));
                studentList.add(worker);
                cond=true;
            }
            con.close();
            if(cond==true){
            return studentList;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
          
    }
     
     /////////////////////////retrive workes name///////////////////
    
     public List<WorkersModel> workerNames(){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select * from worker where type='Wosher'";
            PreparedStatement eric=con.prepareStatement(sql);
            ResultSet result=eric.executeQuery();
            List<WorkersModel> studentList= new ArrayList<>();
            while(result.next()){
                WorkersModel worker=new WorkersModel();
                worker.setNational_id(result.getString("national_id"));
                worker.setFist_name(result.getString("first_Name"));
                worker.setLast_name(result.getString("last_Name"));
                studentList.add(worker);
            }
            con.close();
            return studentList; 
        } catch (Exception e) {
        }
          return null;
    }  
     
     ///////////////////////////////////////data
     public List<WorkersModel> workerdisplaydatatostaff(WorkersModel wm){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select * from worker where national_id=?";
            
            PreparedStatement eric=con.prepareStatement(sql);
            eric.setString(1, wm.getNational_id());
            ResultSet result=eric.executeQuery();
            List<WorkersModel> studentList= new ArrayList<>();
            while(result.next()){
                WorkersModel worker=new WorkersModel();
                worker.setNational_id(result.getString("national_id"));
                worker.setFist_name(result.getString("first_Name"));
                worker.setLast_name(result.getString("last_Name"));
                worker.setType(result.getString("type"));
                worker.setAddress(result.getString("address"));
                worker.setPhone_number(result.getString("phone_number"));
                worker.setGender(result.getString("gender"));
                worker.setStart_Date(result.getString("date"));
                studentList.add(worker);
            }
            con.close();
            return studentList; 
        } catch (Exception e) {
        }
          return null;
    }
     
    
     //////////////////check natioanl_id///////////////////
     public List<WorkersModel> checkeddate(WorkersModel wm){
         try {
             Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select * from worker national_id=? ";
            PreparedStatement eric=con.prepareStatement(sql);
            eric.setString(1, wm.getNational_id());
            ResultSet result=eric.executeQuery();
            List<WorkersModel> studentList= new ArrayList<>();
            while(result.next()){
                WorkersModel worker=new WorkersModel();
                worker.setNational_id(result.getString("national_id"));
                worker.setFist_name(result.getString("first_Name"));
                worker.setLast_name(result.getString("last_Name"));
                worker.setType(result.getString("type"));
                worker.setAddress(result.getString("address"));
                worker.setPhone_number(result.getString("phone_number"));
                worker.setGender(result.getString("gender"));
                worker.setStart_Date(result.getString("date"));
                studentList.add(worker);
            }
            con.close();
            return studentList; 
        } catch (Exception e) {
        }
          return null;
    }
    //////////////////////////////////////////////////////////////////
     
     public String Searchingdadatafromsignuptable(WorkersModel sg){
   
       try {
           Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="(select national_id from worker where national_id=?)";
            PreparedStatement  work=con.prepareStatement(sql);
            work.setString(1, sg.getNational_id());
            ResultSet result=work.executeQuery();
            if(result.next()){
               WorkersModel data=new WorkersModel();
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
     //////////////////////////////////////////////
 public List<WorkersModel> logindata(WorkersModel wm){
         try {
            Connection con=DriverManager.getConnection(dburl, username, password);
            String sql="Select * from worker where national_id=?";
            PreparedStatement eric=con.prepareStatement(sql);
            eric.setString(1, wm.getNational_id());
            ResultSet result=eric.executeQuery();
            boolean condition=false;
            List<WorkersModel> studentList= new ArrayList<>();
            while(result.next()){
                WorkersModel worker=new WorkersModel();
                worker.setNational_id(result.getString("national_id"));
                worker.setFist_name(result.getString("first_Name"));
                worker.setLast_name(result.getString("last_Name"));
                worker.setType(result.getString("type"));
                worker.setAddress(result.getString("address"));
                worker.setPhone_number(result.getString("phone_number"));
                worker.setGender(result.getString("gender"));
                worker.setStart_Date(result.getString("date"));
                studentList.add(worker);
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
