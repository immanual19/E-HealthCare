/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class MedicineData {
    private int pharmacistId;
    private String medicinename;
    private float unitprice;
    private int medcount;
    private String location;
    private String pharmacyname;

    
    public int getPharmacistId(){
        return pharmacistId;
    }
    
    public void setPharmacistId(int pharmacistId){
        this.pharmacistId=pharmacistId;
    }
    public String getMedicineName(){
        return medicinename;
    }
    
    public void setMedicineName(String medicinename){
        this.medicinename=medicinename;
    }
    
    public float getUnitPrice(){
        return unitprice;
    }
    
    public void setUnitPrice(float unitprice){
        this.unitprice=unitprice;
    }
    
    public int getMedCount(){
        return medcount;
    }
    
    public void setMedCount(int medcount){
        this.medcount=medcount;
    }
    
     public String getLocation(){
        return location;
    }
    
    public void setLocation(String location){
        this.location=location;
    }
        public String getPharmacyName(){
        return pharmacyname;
    }
    
    public void setPharmacyName(String pharmacyname){
        this.pharmacyname=pharmacyname;
    }
    
    public MedicineData(int pharmacistId,String medicinename,float unitprice,int medcount,String location,String pharmacyname){
        this.pharmacistId=pharmacistId;
        this.medicinename=medicinename;
        this.unitprice=unitprice;
        this.medcount=medcount;
        this.location=location;
        this.pharmacyname=pharmacyname;
    }
    
    public MedicineData(){};
}
