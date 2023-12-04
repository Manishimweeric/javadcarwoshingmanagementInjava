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
public class SignUp {
    
    private String National_id;
    private String username;
    private String password;

    public SignUp() {
    }

    public SignUp(String National_id, String username, String password) {
        this.National_id = National_id;
        this.username = username;
        this.password = password;
    }

    public String getNational_id() {
        return National_id;
    }

    public void setNational_id(String National_id) {
        this.National_id = National_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
}
