import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import static javafx.application.Application.launch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.undo.UndoManager;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emma
 */
public class AppointedList extends javax.swing.JFrame {

    String driver ="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db";
    String user = "root";
    String pass = "immanual";
    /**
     * Creates new form AppointedList
     */
    Doctor doc;
    public AppointedList() {
            initComponents();
            showAppointments();
        }

    AppointedList(Doctor doc) {
        initComponents();
        this.doc=doc;
        showAppointments();
        //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<AppointedData> getAppointedList() {
        ArrayList<AppointedData> appointed_list=new ArrayList<AppointedData> ();
        try{
//            Preferences userPreferences = Preferences.userRoot();
//            int authId = Integer.parseInt(userPreferences.get("authId",null));
            
             Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,pass);
            String sql="select appointedDoctor.id as AID,appointedDoctor.patientID as PID,patients.pname as PNAME,patients.mobileno as PHONE,patients.address as Address,appointedDoctor.disease as Disease from appointedDoctor join patients on appointedDoctor.patientID=patients.pid where appointedDoctor.doctorID="+doc.getId();
            ResultSet rs;
            rs=con.prepareStatement(sql).executeQuery();
            while(rs.next())
            {
            
                int appointment_id=rs.getInt("AID");
                int patient_id=rs.getInt("PID");
                String patient_name=rs.getString("PNAME");
                String patient_phone=rs.getString("PHONE");
                String patient_address=rs.getString("Address");
                String patient_disease=rs.getString("Disease");
                
                AppointedData appointedData = new AppointedData();
                appointedData.setAppointment_id(appointment_id);
                appointedData.setPatient_id(patient_id);
                appointedData.setPatient_name(patient_name);
                appointedData.setPatient_phone(patient_phone);
                appointedData.setPatient_address(patient_address);
                appointedData.setPatient_disease(patient_disease);
                
                appointed_list.add(appointedData);
                
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Not working","Alert",JOptionPane.WARNING_MESSAGE);
            
        }
        return appointed_list;
    }
    
    public void showAppointments() {
        ArrayList<AppointedData> appointedList= getAppointedList();
     
      DefaultTableModel model = (DefaultTableModel) appointed_table.getModel();
        Object[] row = new Object[6];
        for(int i = 0;i<appointedList.size();i++)
        {
            row[0] = appointedList.get(i).getAppointment_id();
            row[1] = appointedList.get(i).getPatient_id();
            row[2] = appointedList.get(i).getPatient_name();
            row[3] = appointedList.get(i).getPatient_phone();
            row[4] = appointedList.get(i).getPatient_address();
            row[5] = appointedList.get(i).getPatient_disease();
            model.addRow(row);
        }  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        appointed_table = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel3 = new javax.swing.JLabel();
        sendPrescription = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        presLink = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pdisease = new javax.swing.JTextField();
        uploadPDF = new javax.swing.JButton();
        prescriptionPath = new javax.swing.JTextField();
        writePrescription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appointed_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Patient ID", "Patient Name", "Patient Phone", "Patient Address", "Disease Name"
            }
        ));
        jScrollPane1.setViewportView(appointed_table);

        jLabel3.setText("Patient ID: ");

        sendPrescription.setText("Send Prescription");
        sendPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrescriptionActionPerformed(evt);
            }
        });

        jLabel4.setText("Prescription Link:");

        jLabel1.setText("Disease:");

        uploadPDF.setText("UploadPrescription");
        uploadPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPDFActionPerformed(evt);
            }
        });

        writePrescription.setText("Write Prescription");
        writePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writePrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                                .addGap(66, 66, 66))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 174, Short.MAX_VALUE)))
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(presLink, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(prescriptionPath)
                                    .addComponent(pdisease))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(writePrescription)
                            .addComponent(sendPrescription))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pdisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadPDF)
                    .addComponent(prescriptionPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(writePrescription)
                .addGap(43, 43, 43)
                .addComponent(sendPrescription)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrescriptionActionPerformed
        // TODO add your handling code here:
        try{
            String patientID=pid.getText();
            String prescriptionLink=presLink.getText();
            String disease=pdisease.getText();
//            System.out.println(patientID);
//            System.out.println(prescriptionLink);
            File pdfFile = new File(prescriptionPath.getText());
            byte[] pdfData = new byte[(int) pdfFile.length()];
            DataInputStream dis = null;
            try {
            dis = new DataInputStream(new FileInputStream(pdfFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dis.readFully(pdfData);  // read from file into byte[] array
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dis.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            
            String sql = "insert into PrescriptionTable(patientID,prescriptionLink,disease,prescription) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,patientID);
            pst.setString(2,prescriptionLink);
            pst.setString(3,disease);
            pst.setBytes(4,pdfData);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Congratulation. You have send Prescription Successfully");
            pid.setText("");
            presLink.setText("");
            pdisease.setText("");
            prescriptionPath.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
                
    }//GEN-LAST:event_sendPrescriptionActionPerformed

    private void uploadPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPDFActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filepath = f.getAbsolutePath();
            File pdfFile = new File(filepath);
            prescriptionPath.setText(filepath);
    }//GEN-LAST:event_uploadPDFActionPerformed

    private void writePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writePrescriptionActionPerformed
        // TODO add your handling code here:
        new WritePrescriptionBox(doc).setVisible(true);
    }//GEN-LAST:event_writePrescriptionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointedList().setVisible(true);
            }
        });
        
    }
 
public void addTo(JTextField presLink){
        JPopupMenu popup = new JPopupMenu();
        UndoManager undoManager = new UndoManager();
        presLink.getDocument().addUndoableEditListener(undoManager);

        Action undoAction;
        undoAction = new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "Undoable: " + undoManager.canUndo() ,
                            "Undo Status", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

            
        };

       Action copyAction = new AbstractAction("Copy") {
            @Override
            public void actionPerformed(ActionEvent ae) {
                presLink.copy();
            }
        };

        Action cutAction = new AbstractAction("Cut") {
            @Override
            public void actionPerformed(ActionEvent ae) {
                presLink.cut();
            }
        };

        Action pasteAction = new AbstractAction("Paste") {
            @Override
            public void actionPerformed(ActionEvent ae) {
                presLink.paste();
            }
        };

        Action selectAllAction = new AbstractAction("Select All") {
            @Override
            public void actionPerformed(ActionEvent ae) {
                presLink.selectAll();
            }
        };

        popup.add (undoAction);
        popup.addSeparator();
        popup.add (cutAction);
        popup.add (copyAction);
        popup.add (pasteAction);
        popup.addSeparator();
        popup.add (selectAllAction);

       presLink.setComponentPopupMenu(popup);
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointed_table;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pdisease;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField presLink;
    private javax.swing.JTextField prescriptionPath;
    private javax.swing.JButton sendPrescription;
    private javax.swing.JButton uploadPDF;
    private javax.swing.JButton writePrescription;
    // End of variables declaration//GEN-END:variables
}
