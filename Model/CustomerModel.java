/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author M NJERIC
 */
public class CustomerModel {
     
    private String Placket_number;
    private String type;
    private String Phone_number;
    private float  price;    
    private String Wosher_name;
    private String Date;
    private Integer service_id;
    private String Date1;

    public CustomerModel() {
    }

    public CustomerModel(String Placket_number, String type, String Phone_number, float price, String Wosher_name, String Date, Integer service_id, String Date1) {
        this.Placket_number = Placket_number;
        this.type = type;
        this.Phone_number = Phone_number;
        this.price = price;
        this.Wosher_name = Wosher_name;
        this.Date = Date;
        this.service_id = service_id;
        this.Date1 = Date1;
    }

    public String getPlacket_number() {
        return Placket_number;
    }

    public void setPlacket_number(String Placket_number) {
        this.Placket_number = Placket_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWosher_name() {
        return Wosher_name;
    }

    public void setWosher_name(String Wosher_name) {
        this.Wosher_name = Wosher_name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getDate1() {
        return Date1;
    }

    public void setDate1(String Date1) {
        this.Date1 = Date1;
    }

   

    
    
    
    
}
