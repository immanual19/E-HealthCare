/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class PrescriptionData {
    
    private int diseaseID;
    private int patientID;
    private String disease;
    private String prescriptionLink;  
    private String writtenPrescription;
    private String header;
    private String summary;
        public int getDiseaseID() {
        return diseaseID;
    }
    
        public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }
    public int getPatientID() {
        return patientID;
    }
    
        public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    public String getDisease() {
        return disease;
    }
    
        public void setDisease(String disease) {
        this.disease = disease;
    }
        
       public String getPrescriptionLink() {
        return prescriptionLink;
    }

    public String getHeader(){
        return header;
    }
        public void setHeader(String header){
        this.header=header;
    }
        
    
    public String getSummary(){
        return summary;
    }
        public void setSummary(String summary){
        this.summary=summary;
    }
    public void setPrescriptionLink(String prescriptionLink) {
        this.prescriptionLink = prescriptionLink;
    }
           public String getWrittenPrescription() {
        return writtenPrescription;
    }

    
    public void setWrittenPrescription(String writtenPrescription) {
        this.writtenPrescription = writtenPrescription;
    }
    
    public PrescriptionData(int diseaseID,int patientID,String disease, String prescriptionLink, String writtenPrescription,String header, String summary){
        this.diseaseID=diseaseID;
        this.patientID=patientID;
        this.disease=disease;
        this.prescriptionLink=prescriptionLink;
        this.writtenPrescription=writtenPrescription;
        this.header=header;
        this.summary=summary;
    }
    public PrescriptionData(){};
}
