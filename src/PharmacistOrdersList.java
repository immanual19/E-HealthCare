/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class PharmacistOrdersList {
    private int order_id;
    private int ph_id;
    private String customer_name;
    private String customer_phone_number;
    private String customer_address;
    private String medicine_name;
    private int unit_ordered;
    
    public int getOrder_id() {
        return order_id;
    }
        public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    
       public int getPh_id() {
        return ph_id;
    }
        public void setPh_id(int ph_id) {
        this.ph_id = ph_id;
    }
        
        public String getCustomerName() {
        return customer_name;
    }
        public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }
    
       public String getPhoneNumber() {
        return customer_phone_number;
    }
        public void setPhoneNumber(String customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }
        
           public String getAddress() {
        return customer_address;
    }
        public void setCustomerAddress(String customer_address) {
        this.customer_address = customer_address;
    } 
    
               public String getMedicineName() {
        return medicine_name;
    }
        public void setMedicineName(String medicine_name) {
        this.medicine_name = medicine_name;
    } 
      public int getUnitedOrdered() {
        return unit_ordered;
    }
        public void setUnitedOrdered(int unit_ordered) {
        this.unit_ordered = unit_ordered;
    }
        
    public PharmacistOrdersList(int order_id,int ph_id,String customer_name,String customer_phone_number,String customer_address,String medicine_name,int unit_ordered){

        this.order_id=order_id;
        this.ph_id=ph_id;
        this.customer_name=customer_name;
        this.customer_phone_number=customer_phone_number;
        this.customer_address=customer_address;
        this.medicine_name=medicine_name;
        this.unit_ordered=unit_ordered;
    }
    
    public PharmacistOrdersList(){};
}
