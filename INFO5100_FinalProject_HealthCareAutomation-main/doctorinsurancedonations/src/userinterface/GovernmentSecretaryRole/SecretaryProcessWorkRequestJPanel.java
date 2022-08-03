/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentSecretaryRole;

import Business.Enterprise.Enterprise;
import Business.Org.Organization;
import Business.Org.OrgTreasurer;
import Business.SystemUserAccount.SystemUsers;
import Business.WorkQueue.GovFundReq;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pratik
 */
public class SecretaryProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecretaryProcessWorkRequestJPanel
     */
    private JPanel jPanel;
    private Enterprise enterprise;
    private SystemUsers userAccount;
    private GovFundReq governmentFundRequest;

    public SecretaryProcessWorkRequestJPanel(JPanel jPanel, SystemUsers userAccount, GovFundReq fundRequest, Enterprise enterprise) {
        initComponents();

        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.governmentFundRequest = fundRequest;
        txtAmt.setText(String.valueOf(governmentFundRequest.getAmountRequested()));
        txtLoc.setText(governmentFundRequest.getLoc());
        txtPop.setText(String.valueOf(governmentFundRequest.getPopulation()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSecReqProcessArea = new javax.swing.JLabel();
        btnSndReqToTreas = new javax.swing.JButton();
        lblLocation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtLoc = new javax.swing.JTextField();
        txtPop = new javax.swing.JTextField();
        lblPop = new javax.swing.JLabel();
        txtAmt = new javax.swing.JTextField();
        lblAmt = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        btnRej = new javax.swing.JButton();
        imgSecReqProcessArea = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblSecReqProcessArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSecReqProcessArea.setText("Secretary Request Process area ");

        btnSndReqToTreas.setBackground(new java.awt.Color(0, 102, 102));
        btnSndReqToTreas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSndReqToTreas.setText("Send Request to Treasurer to disburse funds");
        btnSndReqToTreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSndReqToTreasActionPerformed(evt);
            }
        });

        lblLocation.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLocation.setText("Location");

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtLoc.setBackground(new java.awt.Color(204, 204, 204));
        txtLoc.setEnabled(false);

        txtPop.setBackground(new java.awt.Color(204, 204, 204));
        txtPop.setEnabled(false);

        lblPop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPop.setText("Population");

        txtAmt.setBackground(new java.awt.Color(204, 204, 204));
        txtAmt.setEnabled(false);

        lblAmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAmt.setText("Amount");

        lblMsg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMsg.setText("Message");

        txtMsg.setBackground(new java.awt.Color(204, 204, 204));
        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });

        btnRej.setBackground(new java.awt.Color(0, 102, 102));
        btnRej.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRej.setText("Reject");
        btnRej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejActionPerformed(evt);
            }
        });

        imgSecReqProcessArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSecReqProcessArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gov.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblSecReqProcessArea))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAmt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMsg)
                                        .addComponent(lblPop))
                                    .addGap(38, 38, 38)
                                    .addComponent(txtPop, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgSecReqProcessArea, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSndReqToTreas)
                                .addGap(33, 33, 33)
                                .addComponent(btnRej, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblSecReqProcessArea)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLocation)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPop))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMsg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSndReqToTreas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRej, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgSecReqProcessArea, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSndReqToTreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSndReqToTreasActionPerformed
        // TODO add your handling code here:

        String message = txtMsg.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        }
        else{
        governmentFundRequest.setWrkMsg(message);
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
         if (dialogResult == JOptionPane.YES_OPTION) {
        governmentFundRequest.setSndr(userAccount);
        governmentFundRequest.setReqStatus("Sent to Treasurer");

        Organization org = null;
        for (Organization organization : enterprise.getOrgDir().getOrganizations()) {
            if (organization instanceof OrgTreasurer) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWrkQ().getWrkReqs().add(governmentFundRequest);
            userAccount.getWorkQ().getWrkReqs().add(governmentFundRequest);
        }
        JOptionPane.showMessageDialog(null, "Request to Treasurer Successful!!!");
        txtMsg.setText("");
            btnRej.setEnabled(false);
            btnSndReqToTreas.setEnabled(false);
        }

        txtMsg.setText("");
        }
    }//GEN-LAST:event_btnSndReqToTreasActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SecretaryWorkAreaJPanel swjp = (SecretaryWorkAreaJPanel) component;
        swjp.ppltTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgActionPerformed

    private void btnRejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejActionPerformed
        String message = txtMsg.getText();
         if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
        governmentFundRequest.setWrkMsg(message);
        
         int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                governmentFundRequest.setReqStatus("Rejected");
                txtMsg.setText("");
            btnRej.setEnabled(false);
            btnSndReqToTreas.setEnabled(false);
            }
            txtMsg.setText("");
         }
    }//GEN-LAST:event_btnRejActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRej;
    private javax.swing.JButton btnSndReqToTreas;
    private javax.swing.JLabel imgSecReqProcessArea;
    private javax.swing.JLabel lblAmt;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPop;
    private javax.swing.JLabel lblSecReqProcessArea;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtPop;
    // End of variables declaration//GEN-END:variables
}
