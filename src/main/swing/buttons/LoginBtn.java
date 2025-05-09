package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.controller.UserController;
import main.model.User_Model;
import main.util.SessionManager;
import main.view.LoginPage;
import main.view.client.ClientHomePage;

public class LoginBtn extends JButton{
    
    private UserController userController = new UserController();
    
    public LoginBtn(JTextField emailField, JPasswordField passField) {
        super("Login");
        setFont(new java.awt.Font("Cmic Sans Ms", Font.BOLD, 20)); 
        setBorder(null);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(200, 35));
        setBackground(new Color(0,117,163));
        setForeground(Color.WHITE);
        
        addActionListener((ActionEvent e) -> {
            String email = emailField.getText();
            String password = String.valueOf(passField.getPassword());
            userController.loginUser(email, password);
            
            if(SessionManager.isLoggedIn()) {
                JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(LoginBtn.this);
                topFrame.dispose();
                new ClientHomePage();
            } else {
                JOptionPane.showMessageDialog(null, "Email or Password is incorrect.", "Login", JOptionPane.WARNING_MESSAGE);
            }
            
        });
    }
    
    public LoginBtn() {
        super("Login");
    }
}
