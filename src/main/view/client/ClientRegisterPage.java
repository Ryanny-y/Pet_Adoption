package main.view.client;

import java.awt.Color;
import main.view.LoginPage;

public class ClientRegisterPage extends javax.swing.JFrame {

    public ClientRegisterPage() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBg1 = new main.swing.component.RegisterBg();
        closeBtn1 = new main.swing.buttons.CloseBtn(this);
        registerLabel = new javax.swing.JLabel();
        fname_lbl = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        mname_lbl = new javax.swing.JLabel();
        mname_field = new javax.swing.JTextField();
        lname_field = new javax.swing.JTextField();
        lname_lbl = new javax.swing.JLabel();
        email_lbl1 = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        pass_lbl = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        confirm_lbl = new javax.swing.JLabel();
        confirmPass_field = new javax.swing.JPasswordField();
        signupBtn1 = new main.swing.buttons.SignupBtn(fname_field, mname_field, lname_field, email_field, pass_field, confirmPass_field);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        registerLabel.setFont(new java.awt.Font("Consolas", 1, 40)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setText("SIGNUP");

        fname_lbl.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        fname_lbl.setForeground(new java.awt.Color(255, 255, 255));
        fname_lbl.setText("First Name");

        fname_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname_field.setText("Ryanny");
        fname_field.setToolTipText("");
        fname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        mname_lbl.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        mname_lbl.setForeground(new java.awt.Color(255, 255, 255));
        mname_lbl.setText("Middle Name");

        mname_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mname_field.setText("Manjares");
        mname_field.setToolTipText("");
        mname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        lname_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname_field.setText("Romero");
        lname_field.setToolTipText("");
        lname_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        lname_lbl.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        lname_lbl.setForeground(new java.awt.Color(255, 255, 255));
        lname_lbl.setText("Last Name");

        email_lbl1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        email_lbl1.setForeground(new java.awt.Color(255, 255, 255));
        email_lbl1.setText("Email");

        email_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_field.setText("ryanny@gmail.com");
        email_field.setToolTipText("");
        email_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        pass_lbl.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        pass_lbl.setForeground(new java.awt.Color(255, 255, 255));
        pass_lbl.setText("Password");

        pass_field.setText("passwordhere");
        pass_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        confirm_lbl.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        confirm_lbl.setForeground(new java.awt.Color(255, 255, 255));
        confirm_lbl.setText("Confirm Password");

        confirmPass_field.setText("passwordhere");
        confirmPass_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Already have an account?");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login Here");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerBg1Layout = new javax.swing.GroupLayout(registerBg1);
        registerBg1.setLayout(registerBg1Layout);
        registerBg1Layout.setHorizontalGroup(
            registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerBg1Layout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addGroup(registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confirmPass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirm_lbl)
                        .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pass_lbl)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_lbl1)
                        .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lname_lbl)
                        .addComponent(mname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mname_lbl)
                        .addComponent(fname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerBg1Layout.createSequentialGroup()
                                .addComponent(registerLabel)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerBg1Layout.createSequentialGroup()
                                .addComponent(fname_lbl)
                                .addGap(387, 387, 387))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerBg1Layout.createSequentialGroup()
                        .addGroup(registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerBg1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))
                            .addComponent(signupBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        registerBg1Layout.setVerticalGroup(
            registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerBg1Layout.createSequentialGroup()
                .addGroup(registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerBg1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerBg1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(registerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pass_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signupBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerBg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerBg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginPage();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.swing.buttons.CloseBtn closeBtn1;
    private javax.swing.JPasswordField confirmPass_field;
    private javax.swing.JLabel confirm_lbl;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel email_lbl1;
    private javax.swing.JTextField fname_field;
    private javax.swing.JLabel fname_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lname_field;
    private javax.swing.JLabel lname_lbl;
    private javax.swing.JTextField mname_field;
    private javax.swing.JLabel mname_lbl;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JLabel pass_lbl;
    private main.swing.component.RegisterBg registerBg1;
    private javax.swing.JLabel registerLabel;
    private main.swing.buttons.SignupBtn signupBtn1;
    // End of variables declaration//GEN-END:variables
}
