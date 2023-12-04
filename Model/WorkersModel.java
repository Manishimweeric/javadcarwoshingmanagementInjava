/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author M NJERIC
 */
public class WorkersModel {
    
    private String National_id;
    private String fist_name;
    private String last_name;
    private String Address;
    private String Phone_number;
    private String gender;
    private String start_Date;
    private String type;

    public WorkersModel() {
    }

    public WorkersModel(String National_id, String fist_name, String last_name, String Address, String Phone_number, String gender, String start_Date, String type) {
        this.National_id = National_id;
        this.fist_name = fist_name;
        this.last_name = last_name;
        this.Address = Address;
        this.Phone_number = Phone_number;
        this.gender = gender;
        this.start_Date = start_Date;
        this.type = type;
    }

    public String getNational_id() {
        return National_id;
    }

    public void setNational_id(String National_id) {
        this.National_id = National_id;
    }

    public String getFist_name() {
        return fist_name;
    }

    public void setFist_name(String fist_name) {
        this.fist_name = fist_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 
}