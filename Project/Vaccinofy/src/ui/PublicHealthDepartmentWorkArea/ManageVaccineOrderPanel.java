/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PublicHealthDepartmentWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.PublicHealthEnterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class ManageVaccineOrderPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageVaccineOrderJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem system;
    private PublicHealthEnterprise publicHealthEnterprise;
    
    public ManageVaccineOrderPanel(JPanel userProcessContainer, UserAccount userAccount, Ecosystem system, PublicHealthEnterprise publicHealthEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.publicHealthEnterprise = publicHealthEnterprise;
        
        populateProviderComboBox();
    }
    
    public void populateProviderComboBox(){
        providerJComboBox.removeAllItems();
        providerJComboBox.addItem("Hospital");
        providerJComboBox.addItem("Pharmacy");
    }
    
    public void populateHospitalVaccineTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineRequestJTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest request : publicHealthEnterprise.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().equalsIgnoreCase("Hospital Vaccine Request")){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getHospital().getHospitalName();
                row[2] = request.getSender();
                row[3] = request.getReceiver() == null? null : request.getReceiver();
                row[4] = request.getStatus();
                dtm.addRow(row);
            }
        }
    }
    
    public void populatePharmacyVaccineTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineRequestJTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest request : publicHealthEnterprise.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().equalsIgnoreCase("Pharmacy Vaccine Request")){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getPharmacy().getPharmacyName();
                row[2] = request.getSender();
                row[3] = request.getReceiver() == null? null : request.getReceiver();
                row[4] = request.getStatus();
                dtm.addRow(row);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineRequestJTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        forwardJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineTableJTable = new javax.swing.JTable();
        providerJComboBox = new javax.swing.JComboBox();
        assignJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Vaccine Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        vaccineRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Provider Name", "Employee Name", "Sales Specialist Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 107, 730, 122));

        viewJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View.jpg"))); // NOI18N
        viewJButton.setText("View Order");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });
        add(viewJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 40));

        forwardJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forwardJButton.setText("Forward to CDC");
        forwardJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardJButtonActionPerformed(evt);
            }
        });
        add(forwardJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, 40));

        rejectJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rejectJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove (1).jpg"))); // NOI18N
        rejectJButton.setText("Reject");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 120, 40));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 486, 130, 50));

        vaccineTableJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccineTableJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 306, 730, 133));

        providerJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        providerJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerJComboBoxActionPerformed(evt);
            }
        });
        add(providerJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 67, 171, -1));

        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Assign.jpg"))); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -16, 1210, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        try{
            int selectedRow = vaccineRequestJTable.getSelectedRow();
            if(selectedRow >= 0){
                VaccineRequest request = (VaccineRequest) vaccineRequestJTable.getValueAt(selectedRow, 0);
                DefaultTableModel dtm = (DefaultTableModel) vaccineTableJTable.getModel();
                dtm.setRowCount(0);
                UserAccount userAccount = (UserAccount) request.getSender();
                Employee employee = (Employee) userAccount.getEmployee();
                Order orderI = null;
                for(Order order : employee.getOrderCatalog().getOrderList()){
                    if(request.getOrderID() == order.getOrderID()){
                        orderI = order;
                    }
                }
                for(OrderItem orderItem : orderI.getOrderItemList()){
                    Object[] row = new Object[2];
                    row[0] = orderItem;
                    row[1] = orderItem.getItemQuantity();
                    dtm.addRow(row);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void forwardJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardJButtonActionPerformed
        try{
            int selectedRow = vaccineRequestJTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(vaccineRequestJTable.getValueAt(selectedRow, 4) == "Approved"){
                JOptionPane.showMessageDialog(null, "This request is Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(vaccineRequestJTable.getValueAt(selectedRow, 4) == "Rejected"){
                JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            VaccineRequest request = (VaccineRequest) vaccineRequestJTable.getValueAt(selectedRow, 0);
            if(vaccineRequestJTable.getValueAt(selectedRow, 3) == null){
                JOptionPane.showMessageDialog(null, "This request is yet to be assigned to Health Department", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            request.setStatus("Approved");
            request.setVaccineRequest("Approved");
            UserAccount userAccount = (UserAccount) request.getSender();
            Employee person = (Employee) userAccount.getEmployee();
            for(Order order : person.getOrderCatalog().getOrderList()){
                if(request.getOrderID() == order.getOrderID()){
                    order.setOrderStatus("Approved by State public Health Department");
                }
            }
            VaccineRequest vaccineRequest = new VaccineRequest();
            if(person.getCheck().equalsIgnoreCase("Hospital")){
                vaccineRequest.setRequestType("Hospital Vaccine Request");
            } else if(person.getCheck().equalsIgnoreCase("Pharmacy")){
                vaccineRequest.setRequestType("Pharmacy Vaccine Request");
            }
            vaccineRequest.setStatus("waiting");
            vaccineRequest.setSender(request.getSender());
            vaccineRequest.setOrderID(request.getOrderID());
            vaccineRequest.setReceiver(null);
            system.getWorkQueue().getWorkRequestList().add(vaccineRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(vaccineRequest);

            if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                populateHospitalVaccineTable();
            } else if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
                populatePharmacyVaccineTable();
            }
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_forwardJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        try{
            int selectedRow = vaccineRequestJTable.getSelectedRow();
            int quantity = 0;
            int orginalQuantity = 0;
            
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(vaccineRequestJTable.getValueAt(selectedRow, 4) == "Rejected"){
                JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(vaccineRequestJTable.getValueAt(selectedRow, 4) == "Approved"){
                JOptionPane.showMessageDialog(null, "This request is approved", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            VaccineRequest request = (VaccineRequest) vaccineRequestJTable.getValueAt(selectedRow, 0);
            if(vaccineRequestJTable.getValueAt(selectedRow, 3) == null){
                JOptionPane.showMessageDialog(null, "This request is yet to be assigned to health dept", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirm reject?", "warning", dialogButton);
            if(result == JOptionPane.YES_OPTION){
                UserAccount userAccount = (UserAccount) request.getSender();
                Employee employee = (Employee) userAccount.getEmployee();
                for(Order order : employee.getOrderCatalog().getOrderList()){
                    if(request.getOrderID() == order.getOrderID()){
                        order.setOrderStatus("Order rejected by State public health department");
                        request.setStatus("Rejected");
                        request.setVaccineRequest("Rejected");
                        for (OrderItem oi : order.getOrderItemList()) {
                            quantity = oi.getVaccine().getAvailablity();
                            orginalQuantity = quantity + oi.getItemQuantity();
                            oi.getVaccine().setAvailablity(orginalQuantity);
                        }
                    }
                }
            }
            if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                populateHospitalVaccineTable();
            } else if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
                populatePharmacyVaccineTable();
            }
            JOptionPane.showMessageDialog(null, "This request is rejected", "Shipping Request", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try{
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.remove(this);
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void providerJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerJComboBoxActionPerformed
        String provider = (String) providerJComboBox.getSelectedItem();
        if(provider != null){
            if(provider.equalsIgnoreCase("Hospital")){
                populateHospitalVaccineTable();
            } else if(provider.equalsIgnoreCase("Pharmacy")){
                populatePharmacyVaccineTable();
            }
        }
    }//GEN-LAST:event_providerJComboBoxActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        try{
            int selectedRow = vaccineRequestJTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(vaccineRequestJTable.getValueAt(selectedRow, 3) != null){
                JOptionPane.showMessageDialog(null, "This request is assigned", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            VaccineRequest request = (VaccineRequest) vaccineRequestJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            UserAccount userAccount = (UserAccount) request.getSender();
            Employee employee = (Employee) userAccount.getEmployee();
            for(Order order : employee.getOrderCatalog().getOrderList()){
                if(request.getOrderID() == order.getOrderID()){
                    order.setOrderStatus("Waiting for Approval");
                }
            }
            if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                populateHospitalVaccineTable();
            }
            else if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
                populatePharmacyVaccineTable();
            }
            JOptionPane.showMessageDialog(null, "This request is assigned to " + request.getReceiver());
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton forwardJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox providerJComboBox;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JTable vaccineRequestJTable;
    private javax.swing.JTable vaccineTableJTable;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}