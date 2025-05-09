package main.swing.common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import main.model.User_Model;
import main.util.SessionManager;
import main.view.LoginPage;
import main.view.client.ClientHomePage;
import main.view.client.ClientPetsPage;

public class ClientHeader extends javax.swing.JPanel {

    JFrame frame;
    
    public ClientHeader(JFrame frame) {
        setOpaque(false);
        this.frame = frame;
        initComponents();
        
        if(SessionManager.isLoggedIn()) {
           login_btn.setVisible(false);
        }
    }
    
    public ClientHeader() {
        setOpaque(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        home_btn = new javax.swing.JButton();
        aboutus_btn = new javax.swing.JButton();
        closeBtn1 = new main.swing.buttons.CloseBtn(frame);
        pets_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1200, 70));

        logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logo.setText("FurHeaven");
        logo.setFocusTraversalPolicyProvider(true);

        nav.setOpaque(false);

        home_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        home_btn.setText("Home");
        home_btn.setBorder(null);
        home_btn.setBorderPainted(false);
        home_btn.setContentAreaFilled(false);
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        home_btn.setFocusPainted(false);
        home_btn.setFocusable(false);
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        aboutus_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aboutus_btn.setText("About Us");
        aboutus_btn.setBorder(null);
        aboutus_btn.setBorderPainted(false);
        aboutus_btn.setContentAreaFilled(false);
        aboutus_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aboutus_btn.setFocusPainted(false);
        aboutus_btn.setFocusable(false);
        aboutus_btn.setPreferredSize(new java.awt.Dimension(58, 25));
        aboutus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutus_btnActionPerformed(evt);
            }
        });

        pets_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pets_btn.setText("Pets");
        pets_btn.setBorder(null);
        pets_btn.setBorderPainted(false);
        pets_btn.setContentAreaFilled(false);
        pets_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pets_btn.setFocusPainted(false);
        pets_btn.setFocusable(false);
        pets_btn.setPreferredSize(new java.awt.Dimension(58, 25));
        pets_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pets_btnActionPerformed(evt);
            }
        });

        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_btn.setText("Login");
        login_btn.setBorder(null);
        login_btn.setBorderPainted(false);
        login_btn.setContentAreaFilled(false);
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login_btn.setFocusPainted(false);
        login_btn.setFocusable(false);
        login_btn.setPreferredSize(new java.awt.Dimension(58, 25));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(aboutus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pets_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pets_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aboutus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        frame.dispose();
        new ClientHomePage();
    }//GEN-LAST:event_home_btnActionPerformed

    private void aboutus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutus_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutus_btnActionPerformed

    private void pets_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pets_btnActionPerformed
        frame.dispose();
        new ClientPetsPage();
    }//GEN-LAST:event_pets_btnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        frame.dispose();
        new LoginPage();
    }//GEN-LAST:event_login_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus_btn;
    private main.swing.buttons.CloseBtn closeBtn1;
    private javax.swing.JButton home_btn;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel nav;
    private javax.swing.JButton pets_btn;
    // End of variables declaration//GEN-END:variables
}
