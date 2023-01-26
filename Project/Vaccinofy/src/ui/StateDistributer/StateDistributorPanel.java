/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.StateDistributer;

import Business.Ecosystem;
import Business.Enterprise.DistributorEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author meetdoshi
 */
public class StateDistributorPanel extends javax.swing.JPanel {

    /**
     * Creates new form StateDistributorPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem ecoSystem;
    private DistributorEnterprise distributorEnterprise;
    
    public StateDistributorPanel(JPanel userProcessContainer, Ecosystem ecoSystem, UserAccount userAccount, DistributorEnterprise distributorEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.distributorEnterprise = distributorEnterprise;
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
        manageVaccineRequestButton = new javax.swing.JButton();
        manageDistributorOrgButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("State Distributor ");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 320, -1));

        manageVaccineRequestButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageVaccineRequestButton.setText("Manage Vaccine Request ");
        manageVaccineRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineRequestButtonActionPerformed(evt);
            }
        });
        add(manageVaccineRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 350, 60));

        manageDistributorOrgButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageDistributorOrgButton.setText("Manage Distributor Organization");
        manageDistributorOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDistributorOrgButtonActionPerformed(evt);
            }
        });
        add(manageDistributorOrgButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 350, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-angle-view-white-blue-candy-capsules-green-background_23-2147877557.jpg-2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccineRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineRequestButtonActionPerformed
        try{
            ManageVaccineOrderPanel manageVaccineOrderPanel = new ManageVaccineOrderPanel(userProcessContainer, ecoSystem, userAccount, distributorEnterprise);
        userProcessContainer.add("ManageVaccineOrdersPanel", manageVaccineOrderPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_manageVaccineRequestButtonActionPerformed

    private void manageDistributorOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDistributorOrgButtonActionPerformed
        try{
            ManageDistributorOrganizationPanel manageManufactureOrganizationPanel = new ManageDistributorOrganizationPanel(userProcessContainer, distributorEnterprise);
            userProcessContainer.add("ManageDistributorOrganizationPanel", manageManufactureOrganizationPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_manageDistributorOrgButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDistributorOrgButton;
    private javax.swing.JButton manageVaccineRequestButton;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}