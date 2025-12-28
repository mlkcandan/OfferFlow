package com.offerflow.ui;

import com.offerflow.manager.DataManager;
import com.offerflow.manager.InputManager;
import com.offerflow.model.Customer;
import com.offerflow.model.Provider;
import com.offerflow.model.User;
import com.offerflow.model.UserProfile;
import java.util.ArrayList;

public class RegisterPanel3 extends javax.swing.JPanel {

    User pUser;

    public RegisterPanel3() {
        initComponents();
        this.setBackground(ThemeColors.DARK_BG);
        this.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBiography = new javax.swing.JTextArea();
        jButtonKayıt = new javax.swing.JButton();
        jToggleButtonProvider = new javax.swing.JToggleButton();
        jToggleButtonClient = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(36, 34, 85));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(22, 21, 61));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Role Selection");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Biography");

        jTextAreaBiography.setBackground(new java.awt.Color(22, 21, 61));
        jTextAreaBiography.setColumns(20);
        jTextAreaBiography.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jTextAreaBiography.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaBiography.setRows(5);
        jTextAreaBiography.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextAreaBiography.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextAreaBiography);

        jButtonKayıt.setBackground(new java.awt.Color(0, 102, 204));
        jButtonKayıt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButtonKayıt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKayıt.setText("Complete Registration");
        jButtonKayıt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonKayıt.setBorderPainted(false);
        jButtonKayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKayıtActionPerformed(evt);
            }
        });

        jToggleButtonProvider.setBackground(new java.awt.Color(22, 21, 61));
        buttonGroup1.add(jToggleButtonProvider);
        jToggleButtonProvider.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jToggleButtonProvider.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonProvider.setText("Provider");
        jToggleButtonProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonProviderActionPerformed(evt);
            }
        });

        jToggleButtonClient.setBackground(new java.awt.Color(22, 21, 61));
        buttonGroup1.add(jToggleButtonClient);
        jToggleButtonClient.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jToggleButtonClient.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonClient.setText("Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButtonClient, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(jToggleButtonProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButtonKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonClient, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButtonKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(177, 150, 94, 150);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void clearFields() {
        jTextAreaBiography.setText("");
        jToggleButtonClient.setSelected(false);
        jToggleButtonProvider.setSelected(false);
    }

    private void jButtonKayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKayıtActionPerformed

        String biography = jTextAreaBiography.getText();
        if (InputManager.isValidBio(this, biography)) {

            if ((!jToggleButtonClient.isSelected() && !jToggleButtonProvider.isSelected())) {
                javax.swing.JOptionPane.showMessageDialog(this, "Please select your profile type.");
                return;
            } else {
                RegisterPanel.userInfo[5] = biography;
                UserProfile profile = new UserProfile(RegisterPanel.userInfo[0], RegisterPanel.userInfo[3], RegisterPanel.userInfo[4], RegisterPanel.userInfo[5]);
                if (jToggleButtonProvider.isSelected()) {
                    pUser = new Provider(RegisterPanel.userInfo[1], RegisterPanel.userInfo[2], profile);
                } else if (jToggleButtonClient.isSelected()) {
                    pUser = new Customer(RegisterPanel.userInfo[1], RegisterPanel.userInfo[2], profile);
                }
                DataManager.registerUser(pUser);
                MainFrame.showCard("loginPanelCard");
                RegisterPanel.instance.clearFields();
                RegisterPanel2.instance.clearFields();
                clearFields();
                LoginPanel.instance.clearFields();
            }
        } else {
            return;
        }
    }//GEN-LAST:event_jButtonKayıtActionPerformed

    private void jToggleButtonProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonProviderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonKayıt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBiography;
    private javax.swing.JToggleButton jToggleButtonClient;
    private javax.swing.JToggleButton jToggleButtonProvider;
    // End of variables declaration//GEN-END:variables
}
