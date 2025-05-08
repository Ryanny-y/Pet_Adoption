package main.swing.common;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import main.model.Pet_Model;
import main.view.client.ClientPetInfo;

public class PetCard extends javax.swing.JPanel {

    Pet_Model pet;
    ImageIcon img;
    public PetCard(Pet_Model pet) {
        initComponents();
        this.pet = pet;
        name.setText(pet.getName());

        scaleImage(pet, 173, 169);
        image.setIcon(img);
        scaleHover();
        clickListener();
    }
    
    private void scaleImage(Pet_Model pet, int d1, int d2) {
        image.setPreferredSize(new java.awt.Dimension(173, 169));
        image.setMinimumSize(new java.awt.Dimension(173, 169));
        image.setMaximumSize(new java.awt.Dimension(173, 169));
        image.setSize(new java.awt.Dimension(173, 169)); // Optional

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        ImageIcon icon = new ImageIcon("D:\\apache workspace\\Pet_Adoption\\src\\resources\\images\\pets\\" + pet.getImage());

        Image scaledImage = icon.getImage().getScaledInstance(d1, d2, Image.SCALE_SMOOTH);
        img = new ImageIcon(scaledImage);
    }
    
    private void scaleHover() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                scaleImage(pet, 200, 200);
                image.setIcon(img);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                scaleImage(pet, 173, 169);
                image.setIcon(img);
            }
        });
    }
    
    private void clickListener() {
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(PetCard.this);

                if (topFrame != null) {
                    topFrame.dispose(); // Close the frame 
                    new ClientPetInfo(pet);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setOpaque(false);

        image.setBackground(new java.awt.Color(51, 0, 255));
        image.setForeground(new java.awt.Color(255, 204, 0));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        name.setBackground(new java.awt.Color(153, 0, 255));
        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
