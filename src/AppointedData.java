/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class AppointedData {
    private int appointment_id;
    private int patient_id;
    private String patient_name;
    private String patient_phone;
    private String patient_address;
    private String patient_disease;

    /**
     * @return the appointment_id
     */
    
    public int getAppointment_id() {
        return appointment_id;
    }

    /**
     * @param appointment_id the appointment_id to set
     */
    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }
    
    /**
     * @return the patient_id
     */
    
    public int getPatient_id() {
        return patient_id;
    }

    /**
     * @param patient_id the patient_id to set
     */
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    /**
     * @return the patient_name
     */
    public String getPatient_name() {
        return patient_name;
    }

    /**
     * @param patient_name the patient_name to set
     */
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    /**
     * @return the patient_phone
     */
    public String getPatient_phone() {
        return patient_phone;
    }

    /**
     * @param patient_phone the patient_phone to set
     */
    public void setPatient_phone(String patient_phone) {
        this.patient_phone = patient_phone;
    }

    /**
     * @return the patient_address
     */
    public String getPatient_address() {
        return patient_address;
    }

    /**
     * @param patient_address the patient_address to set
     */
    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    /**
     * @return the patient_disease
     */
    public String getPatient_disease() {
        return patient_disease;
    }

    /**
     * @param patient_disease the patient_disease to set
     */
    public void setPatient_disease(String patient_disease) {
        this.patient_disease = patient_disease;
    }
}
