/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class Pharmacist {
       public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    private int id;
    private String name;
    private String password;
    private String email;
    private String location;
    private String phone;
    
    public Pharmacist(int id, String name,  String email, String password, String location, String phone)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.location = location;
        this.phone = phone;
    }
    public Pharmacist(){};
}
