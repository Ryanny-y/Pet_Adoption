package main.view;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        textFieldListener(email_field, "romeroryannymanjares@gmail.com");
        passFieldListener(pass_field, "some password");
        setVisible(true);
    }

    private void textFieldListener(JTextField field, String text) {
        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (field.getText().equals(text)) {
                    field.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (field.getText().isBlank()) {
                    field.setText(text);
                }
            }
        });
    }

    private void passFieldListener(JPasswordField field, String text) {
        field.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                String fieldVal = String.valueOf(field.getPassword());

                if (fieldVal.equals(text)) {
                    field.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String fieldVal = String.valueOf(field.getPassword());

                if (fieldVal.isBlank()) {
                    field.setText(text);
                    field.setEchoChar('*');
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBg1 = new main.swing.component.LoginBg();
        loginBg2 = new main.swing.component.LoginBg();
        login_Header = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        loginBtn1 = new main.swing.buttons.LoginBtn(email_field, pass_field);
        closeBtn1 = new main.swing.buttons.CloseBtn();

        javax.swing.GroupLayout loginBg1Layout = new javax.swing.GroupLayout(loginBg1);
        loginBg1.setLayout(loginBg1Layout);
        loginBg1Layout.setHorizontalGroup(
            loginBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        loginBg1Layout.setVerticalGroup(
            loginBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        login_Header.setFont(new java.awt.Font("Consolas", 1, 40)); // NOI18N
        login_Header.setForeground(new java.awt.Color(255, 255, 255));
        login_Header.setText("Login");

        email_label.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email");

        email_field.setBackground(new java.awt.Color(234, 234, 234));
        email_field.setText("romeroryannymanjares@gmail.com");
        email_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        password_label.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");

        pass_field.setBackground(new java.awt.Color(234, 234, 234));
        pass_field.setText("some password");
        pass_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        closeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBg2Layout = new javax.swing.GroupLayout(loginBg2);
        loginBg2.setLayout(loginBg2Layout);
        loginBg2Layout.setHorizontalGroup(
            loginBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBg2Layout.createSequentialGroup()
                .addGroup(loginBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginBg2Layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(login_Header))
                    .addGroup(loginBg2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(loginBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_label)
                            .addComponent(email_field, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(password_label)
                            .addComponent(pass_field)))
                    .addGroup(loginBg2Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBg2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        loginBg2Layout.setVerticalGroup(
            loginBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBg2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(login_Header)
                .addGap(18, 18, 18)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.swing.buttons.CloseBtn closeBtn1;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel email_label;
    private main.swing.component.LoginBg loginBg1;
    private main.swing.component.LoginBg loginBg2;
    private main.swing.buttons.LoginBtn loginBtn1;
    private javax.swing.JLabel login_Header;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JLabel password_label;
    // End of variables declaration//GEN-END:variables
}
