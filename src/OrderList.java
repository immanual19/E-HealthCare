/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class OrderList {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPharmacistId() {
        return pharmacistId;
    }
    public void setPharmacistId(int pharmacistId) {
        this.pharmacistId = pharmacistId;
    }
        public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress= customerAddress;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    
        public int getUnitOrdered() {
        return unitOrdered;
    }
    public void setUnitOrdered(int unitOrdered) {
        this.unitOrdered = unitOrdered;
    }
    
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
    private int id;
    private int pharmacistId;
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String medicineName;
    private int unitOrdered;
    private String orderStatus;
    private String deliveryTime;
    
    public OrderList(int id, int pharmacistId,int customerId, String customerName, String customerAddress, String medicineName,int unitOrdered, String orderStatus,String deliveryTime)
    {
    this.id=id;
    this.pharmacistId=pharmacistId;
    this.customerId=customerId;
    this.customerName=customerName;
    this.customerAddress=customerAddress;
    this.medicineName=medicineName;
    this.unitOrdered=unitOrdered;
    this.orderStatus=orderStatus;
    this.deliveryTime=deliveryTime;
    }
    public OrderList(){};
}
