package com.offerflow.ui;

import java.awt.CardLayout;

public class MainFrame extends javax.swing.JFrame {

    private static javax.swing.JPanel containerRef;

    public MainFrame() {
        initComponents();

        containerRef = this.mainContainerPanel;

        CardLayout cl = (CardLayout) (containerRef.getLayout());
        cl.show(containerRef, "loginPanelCard");

        mainContainerPanel.revalidate();
        mainContainerPanel.repaint();
    }

    public static void showCard(String cardName) {

        CardLayout cl = (CardLayout) (containerRef.getLayout());

        cl.show(containerRef, cardName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerHomePanel1 = new com.offerflow.ui.CustomerHomePanel();
        customerHomePanel2 = new com.offerflow.ui.CustomerHomePanel();
        mainContainerPanel = new javax.swing.JPanel();
        advertsPanel1 = new com.offerflow.ui.AdvertsPanel();
        customerHomePanel4 = new com.offerflow.ui.CustomerHomePanel();
        dashboardPanel1 = new com.offerflow.ui.DashboardPanel();
        makeOfferPanel1 = new com.offerflow.ui.MakeOfferPanel();
        newAdd1 = new com.offerflow.ui.NewAdd();
        profile1 = new com.offerflow.ui.ProviderProfilePanel();
        registerPanel2 = new com.offerflow.ui.RegisterPanel2();
        registerPanel31 = new com.offerflow.ui.RegisterPanel3();
        registerPanel1 = new com.offerflow.ui.RegisterPanel();
        loginPanel1 = new com.offerflow.ui.LoginPanel();
        editAd1 = new com.offerflow.ui.EditAd();
        changePasswordPanel1 = new com.offerflow.ui.ChangePasswordPanel();
        editProfilePanel1 = new com.offerflow.ui.EditProfilePanel();
        addDetail2 = new com.offerflow.ui.AdDetail();
        adDetail1 = new com.offerflow.ui.AdDetail();
        customerOffersPanel1 = new com.offerflow.ui.CustomerOffersPanel();
        customerProfilePanel1 = new com.offerflow.ui.CustomerProfilePanel();
        offersPanel1 = new com.offerflow.ui.OffersPanel();

        javax.swing.GroupLayout customerHomePanel1Layout = new javax.swing.GroupLayout(customerHomePanel1);
        customerHomePanel1.setLayout(customerHomePanel1Layout);
        customerHomePanel1Layout.setHorizontalGroup(
            customerHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        customerHomePanel1Layout.setVerticalGroup(
            customerHomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout customerHomePanel2Layout = new javax.swing.GroupLayout(customerHomePanel2);
        customerHomePanel2.setLayout(customerHomePanel2Layout);
        customerHomePanel2Layout.setHorizontalGroup(
            customerHomePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        customerHomePanel2Layout.setVerticalGroup(
            customerHomePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OfferFlow - Hizmet Pazaryeri");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainContainerPanel.setLayout(new java.awt.CardLayout());
        mainContainerPanel.add(advertsPanel1, "advertsPanelCard");
        mainContainerPanel.add(customerHomePanel4, "customerHomePanelCard");
        mainContainerPanel.add(dashboardPanel1, "dashboardPanelCard");
        mainContainerPanel.add(makeOfferPanel1, "makeOfferPanelCard");
        mainContainerPanel.add(newAdd1, "newAddCard");
        mainContainerPanel.add(profile1, "providerProfileCard");
        mainContainerPanel.add(registerPanel2, "registerPanel2Card");
        mainContainerPanel.add(registerPanel31, "registerPanel3Card");
        mainContainerPanel.add(registerPanel1, "registerPanel1Card");
        mainContainerPanel.add(loginPanel1, "loginPanelCard");
        mainContainerPanel.add(editAd1, "editPanelCard");
        mainContainerPanel.add(changePasswordPanel1, "changePasswordPanelCard");
        mainContainerPanel.add(editProfilePanel1, "editProfilePanelCard");
        mainContainerPanel.add(addDetail2, "adDetailPanelCard");
        mainContainerPanel.add(adDetail1, "adDetailPanelCard");
        mainContainerPanel.add(customerOffersPanel1, "customerOffersPanelCard");
        mainContainerPanel.add(customerProfilePanel1, "customerProfileCard");
        mainContainerPanel.add(offersPanel1, "offersPanelCard");

        getContentPane().add(mainContainerPanel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                MainFrame mf = new MainFrame();
                mf.pack();
                mf.setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.offerflow.ui.AdDetail adDetail1;
    private com.offerflow.ui.AdDetail addDetail2;
    private com.offerflow.ui.AdvertsPanel advertsPanel1;
    private com.offerflow.ui.ChangePasswordPanel changePasswordPanel1;
    private com.offerflow.ui.CustomerHomePanel customerHomePanel1;
    private com.offerflow.ui.CustomerHomePanel customerHomePanel2;
    private com.offerflow.ui.CustomerHomePanel customerHomePanel4;
    private com.offerflow.ui.CustomerOffersPanel customerOffersPanel1;
    private com.offerflow.ui.CustomerProfilePanel customerProfilePanel1;
    private com.offerflow.ui.DashboardPanel dashboardPanel1;
    private com.offerflow.ui.EditAd editAd1;
    private com.offerflow.ui.EditProfilePanel editProfilePanel1;
    private com.offerflow.ui.LoginPanel loginPanel1;
    private javax.swing.JPanel mainContainerPanel;
    private com.offerflow.ui.MakeOfferPanel makeOfferPanel1;
    private com.offerflow.ui.NewAdd newAdd1;
    private com.offerflow.ui.OffersPanel offersPanel1;
    private com.offerflow.ui.ProviderProfilePanel profile1;
    private com.offerflow.ui.RegisterPanel registerPanel1;
    private com.offerflow.ui.RegisterPanel2 registerPanel2;
    private com.offerflow.ui.RegisterPanel3 registerPanel31;
    // End of variables declaration//GEN-END:variables
}
