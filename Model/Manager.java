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
public class Manager {
    private int manager_id;
    private String fullname;
    private String role;
    private String email;
    private String password;

    public Manager() {
    }

    public Manager(int manager_id, String fullname, String role, String email, String password) {
        this.manager_id = manager_id;
        this.fullname = fullname;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

  
    
}
