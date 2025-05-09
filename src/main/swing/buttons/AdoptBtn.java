package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.controller.AdoptController;
import main.controller.PetController;
import main.model.User_Model;
import main.util.SessionManager;
import main.view.LoginPage;

public class AdoptBtn extends JButton{
    
    public AdoptBtn() {
        super("Adopt");
    }
    
    public AdoptBtn(String name, int petId) {
        super("Adopt " + name);
        setFont(new java.awt.Font("Cmic Sans Ms", Font.BOLD, 16)); 
        setBorder(null);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(200, 35));
        setBackground(new Color(0,117,163));
        setForeground(Color.WHITE);
        
        adoptLogic(petId);
    }
    
    
    
    private void adoptLogic(int petId) {
        addActionListener((ActionEvent e) -> {
            User_Model user = SessionManager.getCurrentUser();
            AdoptController adoptController = new AdoptController();
            
            if(!SessionManager.isLoggedIn()) {
                JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(AdoptBtn.this);
                topFrame.dispose();
                new LoginPage();
                return;
            }
            
            String note = JOptionPane.showInputDialog(null, "Add Note", "Note", JOptionPane.PLAIN_MESSAGE);
            boolean result = adoptController.requestAdoption(user.getId(), petId, note);
            
            if(result) {
                JOptionPane.showMessageDialog(null, "Pet Adoption Requested", "Adopt Status", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Pet Adoption Faileld", "Adopt Status", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
