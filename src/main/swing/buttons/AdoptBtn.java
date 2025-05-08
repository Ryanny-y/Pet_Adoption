package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class AdoptBtn extends JButton{
    
    public AdoptBtn(String name) {
        super("Adopt " + name);
        setFont(new java.awt.Font("Segoe UI", Font.BOLD, 16)); 
        setBorder(null);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(200, 35));
        setBackground(new Color(0,117,163));
        setForeground(Color.WHITE);
    }
    
    public AdoptBtn() {
        super("Adopt");
    }
}
