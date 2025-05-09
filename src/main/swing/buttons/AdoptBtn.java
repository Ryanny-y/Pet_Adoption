package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.model.User_Model;
import main.util.SessionManager;
import main.view.LoginPage;

public class AdoptBtn extends JButton{
    
    public AdoptBtn(String name) {
        super("Adopt " + name);
        setFont(new java.awt.Font("Cmic Sans Ms", Font.BOLD, 16)); 
        setBorder(null);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(200, 35));
        setBackground(new Color(0,117,163));
        setForeground(Color.WHITE);
        
        addActionListener((ActionEvent e) -> {
            User_Model user = SessionManager.getCurrentUser();
            
            if(!SessionManager.isLoggedIn()) {
                JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(AdoptBtn.this);
                topFrame.dispose();
                new LoginPage();
            }
        });
    }
    
    public AdoptBtn() {
        super("Adopt");
    }
    
    
}
