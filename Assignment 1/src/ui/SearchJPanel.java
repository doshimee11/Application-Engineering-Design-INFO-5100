/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author meetdoshi
 */
public class SearchJPanel extends javax.swing.JPanel {
    
    EmployeeHistory history;
    
    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel() {
        initComponents();
    }
    
    public SearchJPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        inpCriteriaText1 = new javax.swing.JTextField();
        inpCriteriaFilter1 = new javax.swing.JComboBox<>();
        inpStartDateText = new javax.swing.JTextField();
        inpLevelText = new javax.swing.JTextField();
        inpTeamInfoText = new javax.swing.JTextField();
        inpPositionTitleText = new javax.swing.JTextField();
        inpCellPhoneText = new javax.swing.JTextField();
        inpGender = new javax.swing.JTextField();
        inpEmailText = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblCellPhoneNumber = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        inpNameText = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        inpEmpIDText = new javax.swing.JTextField();
        lblPhotoIcon = new javax.swing.JLabel();
        inpAgeText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnView = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Employee Record");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        inpCriteriaFilter1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "EmployeeID", "Age", "Gender", "StartDate", "Level", "TeamInfo", "PositionTitle", "CellPhoneNumber", "EmailAddress" }));

        inpEmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpEmailTextActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender :");

        lblStartDate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStartDate.setText("Start Date :");

        lblLevel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLevel.setText("Level :");

        lblTeamInfo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTeamInfo.setText("Team Info :");

        lblPositionTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPositionTitle.setText("Position Title :");

        lblContactInfo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContactInfo.setText("Contact Info");

        lblCellPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCellPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCellPhoneNumber.setText("Cell Phone Number :");

        lblEmailAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailAddress.setText("Email Address :");

        lblPhoto.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoto.setText("Photo :");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name :");

        lblEmployeeID.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmployeeID.setText("Employee ID :");

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age :");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "EmployeeID", "Gender", "StartDate"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(inpCriteriaFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(inpCriteriaText1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inpEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpCellPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpPositionTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpTeamInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpLevelText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpEmpIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhotoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpCriteriaText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpCriteriaFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpEmpIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpLevelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpTeamInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpPositionTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpCellPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhotoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        HashMap<String, Integer> filterKeys = new HashMap<String, Integer>();
        filterKeys.put("Name", 0);
        filterKeys.put("EmployeeID", 1);
        filterKeys.put("Age", 2);
        filterKeys.put("Gender", 3);
        filterKeys.put("StartDate", 4);
        filterKeys.put("Level", 5);
        filterKeys.put("TeamInfo", 6);
        filterKeys.put("PositionTitle", 7);
        filterKeys.put("CellPhoneNumber", 8);
        filterKeys.put("EmailAddress", 9);
        
        ArrayList<Employee> emplist = history.getHistory();
        String criteriaFilter1 = inpCriteriaFilter1.getSelectedItem().toString();
        String inpCriteria1 = inpCriteriaText1.getText().toString();
        Object row[] = new Object[11];
        String criteriaCheck = null;
        ArrayList<Employee> data = new ArrayList<Employee>();
        
        for (int i=0; i<emplist.size(); i++){
            if(criteriaFilter1 == "Name"){
                criteriaCheck = String.valueOf(emplist.get(i).getName());
            }
            if(criteriaFilter1 == "EmployeeID"){
                criteriaCheck = String.valueOf(emplist.get(i).getEmployeeID());
            }
            if(criteriaFilter1 == "Age"){
                criteriaCheck = String.valueOf(emplist.get(i).getAge());
            }
            if(criteriaFilter1 == "Gender"){
                criteriaCheck = String.valueOf(emplist.get(i).getGender());
            }
            if(criteriaFilter1 == "StartDate"){
                criteriaCheck = String.valueOf(emplist.get(i).getStartDate());
            }
            if(criteriaFilter1 == "Level"){
                criteriaCheck = String.valueOf(emplist.get(i).getLevel());
            }
            if(criteriaFilter1 == "TeamInfo"){
                criteriaCheck = String.valueOf(emplist.get(i).getTeamInfo());
            }
            if(criteriaFilter1 == "PositionTitle"){
                criteriaCheck = String.valueOf(emplist.get(i).getPositionTitle());
            }
            if(criteriaFilter1 == "CellPhoneNumber"){
                criteriaCheck = String.valueOf(emplist.get(i).getCellPhoneNumber());
            }
            if(criteriaFilter1 == "EmailAddress"){
                criteriaCheck = String.valueOf(emplist.get(i).getEmailAddress());
            }
            if(criteriaCheck.equals(inpCriteria1.toString())){
                data.add(emplist.get(i));
            }
        }
        for(Employee i: emplist){
            if(criteriaCheck.equals(inpCriteria1)){
                row[0] = i.getName();
                row[1] = i.getEmployeeID();
                row[2] = i.getAge();
                row[3] = i.getGender();
                row[4] = i.getStartDate();
                row[5] = i.getLevel();
                row[6] = i.getTeamInfo();
                row[7] = i.getPositionTitle();
                row[8] = i.getCellPhoneNumber();
                row[9] = i.getEmailAddress();
            }
        }
        populateTable(data);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void inpEmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpEmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpEmailTextActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployee.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        inpNameText.setText(String.valueOf(selectedEmployee.getName()));
        inpEmpIDText.setText(String.valueOf(selectedEmployee.getEmployeeID()));
        inpAgeText.setText(String.valueOf(selectedEmployee.getAge()));
        inpGender.setText(String.valueOf(selectedEmployee.getGender()));
        inpStartDateText.setText(String.valueOf(selectedEmployee.getStartDate()));
        inpLevelText.setText(String.valueOf(selectedEmployee.getLevel()));
        inpTeamInfoText.setText(String.valueOf(selectedEmployee.getTeamInfo()));
        inpPositionTitleText.setText(String.valueOf(selectedEmployee.getPositionTitle()));
        inpCellPhoneText.setText(String.valueOf((long) selectedEmployee.getCellPhoneNumber()));
        inpEmailText.setText(String.valueOf(selectedEmployee.getEmailAddress()));
        
        String imgPath = String.valueOf(selectedEmployee.getPhoto());
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpeg", "jpg");
        JFileChooser browseFile = new JFileChooser();
        ImageIcon img = new ImageIcon(imgPath);
        
        Image image = img.getImage().getScaledInstance(lblPhotoIcon.getWidth(), lblPhotoIcon.getHeight(), Image.SCALE_SMOOTH);
        lblPhotoIcon.setIcon(new ImageIcon(image));
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField inpAgeText;
    private javax.swing.JTextField inpCellPhoneText;
    private javax.swing.JComboBox<String> inpCriteriaFilter1;
    private javax.swing.JTextField inpCriteriaText1;
    private javax.swing.JTextField inpEmailText;
    private javax.swing.JTextField inpEmpIDText;
    private javax.swing.JTextField inpGender;
    private javax.swing.JTextField inpLevelText;
    private javax.swing.JTextField inpNameText;
    private javax.swing.JTextField inpPositionTitleText;
    private javax.swing.JTextField inpStartDateText;
    private javax.swing.JTextField inpTeamInfoText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNumber;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoIcon;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables

    private void populateTable( ArrayList<Employee> data) {
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for(Employee emp : data){
            Object[] col = new Object[4];
            col[0] = emp;
            col[1] = emp.getEmployeeID();
            col[2] = emp.getGender();
            col[3] = emp.getStartDate();
            model.addRow(col);
        }
    }
}