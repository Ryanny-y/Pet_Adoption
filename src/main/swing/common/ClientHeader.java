package main.swing.common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class ClientHeader extends javax.swing.JPanel {

    JFrame frame;
    
    public ClientHeader(JFrame frame) {
        setOpaque(false);
        this.frame = frame;
        initComponents();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

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
        aboutus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutus_btnActionPerformed(evt);
            }
        });

        closeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutus_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_home_btnActionPerformed

    private void aboutus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutus_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutus_btnActionPerformed

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus_btn;
    private main.swing.buttons.CloseBtn closeBtn1;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel nav;
    // End of variables declaration//GEN-END:variables
}
