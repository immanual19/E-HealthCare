/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class Doctor {
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
        public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getFees(){
        return fees;
    }
    public void setFees(int fees){
        this.fees=fees;
    }
            public int getSlots() {
        return slots;
    }
    public void setSlots(int slots) {
        this.slots = slots;
    }


    public String getChamberAddress() {
        return chamberAddress;
    }
    public void setChamberAddress(String chamberAddress) {
        this.chamberAddress = chamberAddress;
    }
    
        public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
            public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    private int id;
    private String name;
    private String speciality;
    private String password;
    private String email;

    private String phone;
    private int fees;
    private int slots;
    
    private String chamberAddress;
    private String designation;
    private String qualification;
    public Doctor(int id, String name, String speciality,  String email, String password, String phone, int fees, int slots, String chamberAddress,String designation,String qualification)
    {
        this.id = id;
        this.name = name;
        this.speciality=speciality;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.fees=fees;
        this.slots=slots;
        
        this.chamberAddress=chamberAddress;
        this.designation=designation;
        this.qualification=qualification;
    }
    public Doctor(){};

}
