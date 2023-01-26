/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Enterprise.ProviderEnterprise;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalindjoshi
 */

public class AddPharmacyPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AddPharmacyJPanel
     */
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    public AddPharmacyPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) pharmacyTable.getModel();
        dtm.setRowCount(0);
        for(Pharmacy pharmacy : providerEnterprise.getPharmacyDirectory().getPharmacyDirectory()){
            Object[] row = new Object[3];
            row[0] = pharmacy;
            row[1] = pharmacy.getPharmacyID();
            row[2] = pharmacy.getPharmacyAddress();
            dtm.addRow(row);
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

        titleJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        hospitalNameLabel = new javax.swing.JLabel();
        hospitalAddressLabel = new javax.swing.JLabel();
        pharmacyNameTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pharmacyAddressTextArea = new javax.swing.JTextArea();
        addPharmacyButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("Add Pharmacy");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 22, -1, -1));

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pharmacy Name", "Pharmacy ID", "Pharmacy Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pharmacyTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 69, 909, 142));

        hospitalNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalNameLabel.setText("Pharmacy Name :");
        add(hospitalNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 247, -1, -1));

        hospitalAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalAddressLabel.setText("Pharmacy Address :");
        add(hospitalAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 299, -1, -1));

        pharmacyNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(pharmacyNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 314, -1));

        pharmacyAddressTextArea.setColumns(20);
        pharmacyAddressTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pharmacyAddressTextArea.setRows(5);
        jScrollPane2.setViewportView(pharmacyAddressTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        addPharmacyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPharmacyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterHospital.jpg"))); // NOI18N
        addPharmacyButton.setText("Add Pharmacy");
        addPharmacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyButtonActionPerformed(evt);
            }
        });
        add(addPharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 457, 250, 50));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-angle-view-white-blue-candy-capsules-green-background_23-2147877557.jpg-2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void addPharmacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyButtonActionPerformed
        
        String pharmacyName = pharmacyNameTextField.getText();
        String pharmacyAddress = pharmacyAddressTextArea.getText();
        
        Pharmacy pharmacy = providerEnterprise.getPharmacyDirectory().createNewPharmacy();
        pharmacy.setPharmacyName(pharmacyName);
        pharmacy.setPharmacyAddress(pharmacyAddress);
        
        populateTable();
    }//GEN-LAST:event_addPharmacyButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPharmacyButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel hospitalAddressLabel;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pharmacyAddressTextArea;
    private javax.swing.JTextField pharmacyNameTextField;
    private javax.swing.JTable pharmacyTable;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}