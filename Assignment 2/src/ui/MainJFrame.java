/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ui;

import Parser.Parser;
import java.time.LocalDate;
import java.util.ArrayList;
import model.City;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.House;
import model.NewSystem;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author meetdoshi
 */

public class MainJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainJFrame
     */
    
    City city;
    String[] communityList;
    PatientDirectory patientDirectory;
    Hospital newHospital;
    HospitalDirectory hospitalDirectory;
    EncounterHistory encounterDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    NewSystem newSystem;
    
    public MainJFrame() {
        initComponents();
        hospitalDirectory = new HospitalDirectory();
        patientDirectory = new PatientDirectory();
        encounterDirectory = new EncounterHistory();
        personDirectory = new PersonDirectory();
        doctorDirectory = new DoctorDirectory();
        newSystem = new NewSystem();
        
        String DOB1 = "11-Nov-1998";
        String DOB2 = "21-Jun-1998";
        Parser parser = new Parser();
        LocalDate date1 = parser.convertToDate(DOB1);
        LocalDate date2 = parser.convertToDate(DOB2);
        
        Person person1 = personDirectory.createNewPerson("Meet", date1, 01234567443, "Beacon Hill");//doctor
        Person person2 = personDirectory.createNewPerson("Jay", date2, 1919191919, "Suffolk"); //patient
        Person person3 = personDirectory.createNewPerson("Nayan", date1, 1678634878, "Back Bay"); //patient
        
        Person person4 = personDirectory.createNewPerson("Kalind", date2, 1456752387, "Suffolk");  //doctor
        Person person5 = personDirectory.createNewPerson("Isha", date2, 0136475674, "Beacon Hill"); //patient
        Person person6 = personDirectory.createNewPerson("Harsh", date1, 1037827478, "Back Bay"); //doctor
        Person person7 = personDirectory.createNewPerson("Aakash", date1, 1094787433, "Back Bay"); //Neither Doctor nor Patient
        Person person8 = personDirectory.createNewPerson("JanamJay", date2, 1094488434, "Beacon Hill"); //patient
        
        patientDirectory.createPatient(person2);
        patientDirectory.createPatient(person3);
        patientDirectory.createPatient(person5);
        patientDirectory.createPatient(person8);
        
        System.out.println("Patients List: ");
        ArrayList<Patient> ptt = patientDirectory.getPatientList();
        for(Patient i: ptt){
            System.out.println(i.getPatientID());
            System.out.println(i.getPerson().getPersonName());
        }
        
        Doctor doctor1 = new Doctor(person1);
        Doctor doctor2 = new Doctor(person4);
        Doctor doctor3 = new Doctor(person6);
        
        doctorDirectory.addNewDoctor(doctor1);
        doctorDirectory.addNewDoctor(doctor2);
        doctorDirectory.addNewDoctor(doctor3);
        
        city = new City("Boston");
        newSystem.getCityList().add(city);
        
        Community communitySuffolk = city.newCommunity("Suffolk");
        Community communityBeaconHill = city.newCommunity("Beacon Hill");
        Community communityBackBay = city.newCommunity("Back Bay");
        
        House house1 = communitySuffolk.createNewHouse(1,6, "886 Huntington Avenue", "Suffolk", "Boston");
        House house2 = communityBeaconHill.createNewHouse(2, 27, "Beacon Street", "Beacon Hill", "Boston");
        House house3 = communityBackBay.createNewHouse(3, 39, "Dudley Street", "Back Bay", "Boston");
        
        house1.addPersonToHouse(person2);
        house2.addPersonToHouse(person1);
        house1.addPersonToHouse(person4);
        house3.addPersonToHouse(person3);
        house2.addPersonToHouse(person5);
        house3.addPersonToHouse(person6);
        house3.addPersonToHouse(person7);
        house2.addPersonToHouse(person8);
        
        newHospital = communitySuffolk.createNewHospital(1, "881 Huntington Avenue", "Suffolk", "Boston");
        hospitalDirectory.addNewHospital(newHospital);
        newHospital.addDoctorToHospital(doctor2);
        
        newHospital = communityBeaconHill.createNewHospital(2, "Beacon Street", "Beacon Hill", "Boston");
        hospitalDirectory.addNewHospital(newHospital);
        newHospital.addDoctorToHospital(doctor1);
        
        newHospital = communityBackBay.createNewHospital(3, "Calumet Street", "Back Bay", "Boston");
        hospitalDirectory.addNewHospital(newHospital);
        newHospital.addDoctorToHospital(doctor3);
        
        ArrayList<Community> communList = new ArrayList<Community>();
        communList = city.getCommunityList();
        
        int size = communList.size();
        communityList = new String[size + 1];
        
        communList = city.getCommunityList();
        communityList[0]=" ";
        
        for(int i = 0; i < communList.size(); i++){
            communityList[i+1]= communList.get(i).getCommunityName();
        }
        
        System.out.println("All Entries added !!!");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        patientButton = new javax.swing.JButton();
        doctorButton = new javax.swing.JButton();
        comAdminButton = new javax.swing.JButton();
        hospitalButton = new javax.swing.JButton();
        systemButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setBackground(new java.awt.Color(255, 255, 255));

        leftPanel.setBackground(new java.awt.Color(179, 118, 118));
        leftPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        patientButton.setText("Patient");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });

        doctorButton.setText("Doctor");
        doctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorButtonActionPerformed(evt);
            }
        });

        comAdminButton.setText("Community - Admin");
        comAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comAdminButtonActionPerformed(evt);
            }
        });

        hospitalButton.setText("Hospital - Admin");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });

        systemButton.setText("System - Admin");
        systemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Profile");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(hospitalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(systemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(comAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(patientButton)
                .addGap(18, 18, 18)
                .addComponent(doctorButton)
                .addGap(18, 18, 18)
                .addComponent(comAdminButton)
                .addGap(18, 18, 18)
                .addComponent(hospitalButton)
                .addGap(18, 18, 18)
                .addComponent(systemButton)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(235, 195, 164));
        rightPanel.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
        PatientJPanel patientPanel = new PatientJPanel(doctorDirectory, communityList, patientDirectory, newHospital, city, hospitalDirectory);
        splitPane.setRightComponent(patientPanel);
    }//GEN-LAST:event_patientButtonActionPerformed

    private void doctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorButtonActionPerformed
        // TODO add your handling code here:
        DoctorJPanel doctorPanel = new DoctorJPanel(patientDirectory, doctorDirectory);
        splitPane.setRightComponent(doctorPanel);
    }//GEN-LAST:event_doctorButtonActionPerformed

    private void comAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comAdminButtonActionPerformed
        // TODO add your handling code here:
        CommunityJPanel communityPanel = new CommunityJPanel(city, communityList, patientDirectory, hospitalDirectory, personDirectory, doctorDirectory);
        splitPane.setRightComponent(communityPanel);
    }//GEN-LAST:event_comAdminButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        HospitalJPanel hospitalPanel = new HospitalJPanel(doctorDirectory, newSystem, communityList, patientDirectory, newHospital, city, hospitalDirectory, personDirectory);
        splitPane.setRightComponent(hospitalPanel);
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void systemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemButtonActionPerformed
        // TODO add your handling code here:
        SystemJPanel systemPanel = new SystemJPanel(city, communityList, patientDirectory, hospitalDirectory,personDirectory, doctorDirectory, newSystem);
        splitPane.setRightComponent(systemPanel);
    }//GEN-LAST:event_systemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comAdminButton;
    private javax.swing.JButton doctorButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton patientButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton systemButton;
    // End of variables declaration//GEN-END:variables
}