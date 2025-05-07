package main.swing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CloseBtn extends JButton{
 
   public CloseBtn(JFrame frame) {
       super("\u00D7");
       customize(frame);
   }
   
   public CloseBtn() {
       super("\u00D7");
       customize(null);
   }
   
   private void customize(JFrame frame) {
       setOpaque(false);
       setBackground(new Color(0, 0, 0, 0));
       setForeground(Color.BLACK);
       setFocusPainted(false);
       setFont(new Font("Segoe UI", Font.BOLD, 24));
       setBorder(null);
       setContentAreaFilled(false);
       
       addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               frame.dispose();
           }
       });
   }

}
