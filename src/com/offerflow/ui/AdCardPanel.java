package com.offerflow.ui;

import com.offerflow.model.JobPosting;

public class AdCardPanel extends javax.swing.JPanel {

    public JobPosting listing;

    public AdCardPanel(JobPosting listing) {
        initComponents();
        this.listing = listing;
        jLblTitle.setText(listing.getTitle());
        jLblCategory.setText("Provider: " + listing.getProvider().getProfile().getFullName());
        jLblPrice.setText("Price: " + listing.getPrice());

        String category = listing.getCategory();
        java.net.URL logoUrl;
        switch (category) {
            case "Cleaning" ->
                logoUrl = getClass().getResource("/com/offerflow/components/cleaning.png");

            case "Repair" ->

                logoUrl = getClass().getResource("/com/offerflow/components/repair.png");
            case "Software" ->

                logoUrl = getClass().getResource("/com/offerflow/components/software.png");
            case "Design" ->

                logoUrl = getClass().getResource("/com/offerflow/components/design.png");
            case "Transport" ->

                logoUrl = getClass().getResource("/com/offerflow/components/transport.png");
            case "Education" ->

                logoUrl = getClass().getResource("/com/offerflow/components/education.png");
            case "Pet Services" ->

                logoUrl = getClass().getResource("/com/offerflow/components/petServices.png");
            case "Health" ->

                logoUrl = getClass().getResource("/com/offerflow/components/health.png");
            case "Organizations" ->

                logoUrl = getClass().getResource("/com/offerflow/components/organizations.png");
            case "Child Care" ->

                logoUrl = getClass().getResource("/com/offerflow/components/childCare.png");
            default ->
                throw new AssertionError();
        }
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(logoUrl);
        java.awt.Image img = icon.getImage().getScaledInstance(150, -1, java.awt.Image.SCALE_SMOOTH);
        jImage.setIcon(new javax.swing.ImageIcon(img));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImage = new javax.swing.JLabel();
        jLblPrice = new javax.swing.JLabel();
        jLblCategory = new javax.swing.JLabel();
        jLblTitle = new javax.swing.JLabel();
        jBtnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(41, 39, 99));

        jImage.setBackground(new java.awt.Color(204, 204, 204));
        jImage.setForeground(new java.awt.Color(255, 255, 255));
        jImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImage.setText("IMG");
        jImage.setOpaque(true);
        jImage.setPreferredSize(new java.awt.Dimension(150, 135));

        jLblPrice.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Price: ");

        jLblCategory.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLblCategory.setForeground(new java.awt.Color(255, 255, 255));
        jLblCategory.setText("Provider:");

        jLblTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 30)); // NOI18N
        jLblTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitle.setText("Web Designer");
        jLblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jBtnEdit.setBackground(new java.awt.Color(255, 165, 0));
        jBtnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jBtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEdit.setText("View Details");
        jBtnEdit.setBorderPainted(false);
        jBtnEdit.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblPrice)
                            .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(557, 557, 557))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLblTitle)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCategory)
                            .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLblPrice)))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        AdDetail.instance.setInfos(listing);
        MainFrame.showCard("adDetailPanelCard");
    }//GEN-LAST:event_jBtnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JLabel jImage;
    private javax.swing.JLabel jLblCategory;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblTitle;
    // End of variables declaration//GEN-END:variables
}
