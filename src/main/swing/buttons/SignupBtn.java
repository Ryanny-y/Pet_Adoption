package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.controller.UserController;
import main.view.LoginPage;

public class SignupBtn extends JButton{
    
    private UserController userController = new UserController();
    
    public SignupBtn(JTextField fnameField, JTextField mnameField, JTextField lnameField, JTextField emailField, JPasswordField passField, JPasswordField confirmField) {
        super("Sign Up");
        setFont(new java.awt.Font("Cmic Sans Ms", Font.BOLD, 20)); 
        setBorder(null);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(200, 35));
        setBackground(new Color(0,117,163));
        setForeground(Color.WHITE);
        
        addActionListener((ActionEvent e) -> {
            String fName = fnameField.getText();
            String mName = mnameField.getText();
            String lName = lnameField.getText();
            String email = emailField.getText();
            String pass = String.valueOf(passField.getPassword());
            String confirmPass = String.valueOf(confirmField.getPassword());
            
            if(fName.isBlank() || mName.isBlank() || lName.isBlank() || email.isBlank() || pass.isBlank() || confirmPass.isBlank()) {
                JOptionPane.showMessageDialog(null, "All Fields Are Required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(!pass.equals(confirmPass)) {
                JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            boolean userCreated = userController.registerUser(fName, mName, lName, email, pass);
            
            if(userCreated) {
                JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(SignupBtn.this);
                topFrame.dispose();
                new LoginPage();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to create new user", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        });
    }
    
    public SignupBtn() {
        super("Sign Up");
    }
}
