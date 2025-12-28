package com.offerflow.ui;

import com.offerflow.manager.DataManager;
import com.offerflow.model.Customer;
import com.offerflow.model.JobPosting;
import com.offerflow.model.Offer;
import com.offerflow.model.User;
import java.awt.Color;

public class OfferCardPanel extends javax.swing.JPanel {

    public Offer offer;

    public OfferCardPanel(Offer offer) {
        initComponents();
        this.offer = offer;
        jLblTitle.setText(offer.getJobPosting().getTitle());
        jLblName.setText(offer.getProvider().getProfile().getFullName());
        jLblPrice.setText("Price: " + offer.getAmount() + " ₺");
        jLblDelTime.setText("Delivery Time: " + offer.getDelTime() + " Day");
        jTextFieldStatus.setText(offer.getStatus());

        if (offer.getStatus().equals("ACCEPTED")) {
            jTextFieldStatus.setBackground(Color.GREEN);
        } else if (offer.getStatus().equals("PENDING")) {
            jTextFieldStatus.setBackground(Color.BLUE);
        } else if (offer.getStatus().equals("REJECTED")) {
            jTextFieldStatus.setBackground(Color.RED);
        } else if (offer.getStatus().equals("CANCELLED")) {
            jTextFieldStatus.setBackground(Color.PINK);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblDelTime = new javax.swing.JLabel();
        jLblName = new javax.swing.JLabel();
        jLblTitle = new javax.swing.JLabel();
        jBtnEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLblPrice = new javax.swing.JLabel();
        jLblPrice2 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();

        setBackground(new java.awt.Color(22, 21, 61));

        jLblDelTime.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLblDelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLblDelTime.setText("Teslim Süresi: 30 Gün");

        jLblName.setBackground(new java.awt.Color(204, 204, 204));
        jLblName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLblName.setForeground(new java.awt.Color(204, 204, 204));
        jLblName.setText("Emirhan Erbay");

        jLblTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 30)); // NOI18N
        jLblTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitle.setText("Web Designer");
        jLblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jBtnEdit.setBackground(new java.awt.Color(255, 165, 0));
        jBtnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jBtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEdit.setText("Cancel Offer");
        jBtnEdit.setBorderPainted(false);
        jBtnEdit.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLblPrice.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Tutar: 1200 £");

        jLblPrice2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 22)); // NOI18N
        jLblPrice2.setForeground(new java.awt.Color(204, 204, 204));
        jLblPrice2.setText("Offered");

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setBackground(new java.awt.Color(51, 153, 0));
        jTextFieldStatus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextFieldStatus.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldStatus.setText("ONAYLANDI");
        jTextFieldStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblName)
                    .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblDelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldStatus)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblPrice2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblDelTime)))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed

        Customer customer = (Customer) User.currentUser;
        if (customer.cancelOffer(offer)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Offer cancelled successfully.");
            CustomerOffersPanel.instance.loadListings();
            MainFrame.showCard("customerOffersPanelCard");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cancelling offer is failed.");
        }

    }//GEN-LAST:event_jBtnEditActionPerformed

    private void jTextFieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JLabel jLblDelTime;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblPrice2;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldStatus;
    // End of variables declaration//GEN-END:variables
}
