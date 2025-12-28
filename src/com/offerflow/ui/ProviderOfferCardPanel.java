package com.offerflow.ui;

import com.offerflow.model.Offer;

import java.awt.Color;

public class ProviderOfferCardPanel extends javax.swing.JPanel {

    public Offer offer;

    public ProviderOfferCardPanel(Offer offer) {
        initComponents();
        this.offer = offer;
        jLblTitle.setText(offer.getJobPosting().getTitle());
        jLblName.setText(offer.getProvider().getProfile().getFullName());
        jLblPrice.setText("Price: " + offer.getAmount() + " $");
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
        jBtnReject = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLblPrice = new javax.swing.JLabel();
        jLblPrice2 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextArea1 = new javax.swing.JTextArea();
        jBtnAccept = new javax.swing.JButton();

        setBackground(new java.awt.Color(22, 21, 61));
        setPreferredSize(new java.awt.Dimension(1000, 195));

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

        jBtnReject.setBackground(new java.awt.Color(204, 0, 0));
        jBtnReject.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jBtnReject.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReject.setText("Reject Offer");
        jBtnReject.setBorderPainted(false);
        jBtnReject.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRejectActionPerformed(evt);
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

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(22, 21, 61));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("adsasdasd");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);

        jBtnAccept.setBackground(new java.awt.Color(0, 153, 0));
        jBtnAccept.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jBtnAccept.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAccept.setText("Accept Offer");
        jBtnAccept.setBorderPainted(false);
        jBtnAccept.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblName)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblDelTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblPrice2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblDelTime)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jBtnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRejectActionPerformed
        if (offer.getStatus().equals("CANCELLED")) {
            javax.swing.JOptionPane.showMessageDialog(this, "This offer is cancelled by Customer.");
            return;
        }

        offer.updateStatus("REJECTED");
        jTextFieldStatus.setText("REJECTED");
        offer.getProvider().rejectOffer(offer);
        jTextFieldStatus.setBackground(Color.red);

    }//GEN-LAST:event_jBtnRejectActionPerformed

    private void jBtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcceptActionPerformed
        if (offer.getStatus().equals("CANCELLED")) {
            javax.swing.JOptionPane.showMessageDialog(this, "This offer is cancelled by Customer.");
            return;
        }

        offer.updateStatus("ACCEPTED");
        offer.getProvider().acceptOffer(offer);
        jTextFieldStatus.setText("ACCEPTED");
        jTextFieldStatus.setBackground(Color.green);
    }//GEN-LAST:event_jBtnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAccept;
    private javax.swing.JButton jBtnReject;
    private javax.swing.JLabel jLblDelTime;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblPrice2;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldStatus;
    // End of variables declaration//GEN-END:variables
}
