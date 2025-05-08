package main.swing.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JPanel;
import main.controller.PetController;
import main.model.Pet_Model;
import main.swing.common.PetCard;

public class PetScrollContainer extends javax.swing.JPanel {
    
    private ArrayList<Pet_Model> pets_list = new ArrayList<>();
    
    public PetScrollContainer(ArrayList<Pet_Model> pets) {
        initComponents();
        this.pets_list = (pets != null) ? pets : new ArrayList<>();
        addComponent();
        setBackground(new Color(0,0,0,0));
    }
    
    public PetScrollContainer() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }
    
//    private void addComponent() {
//        for(Pet_Model pet : pets_list) {
//            PetCard card = new PetCard(pet);
//            this.add(card);
//        }
//    }
    
   private void addComponent() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.weighty = 0;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;  // Allow horizontal stretching

    int row = 0;
    int column = 0;

    for (int i = 0; i < pets_list.size(); i++) {
        if (column == 6) {
            column = 0;
            row++;
        }

        gbc.gridx = column;
        gbc.gridy = row;
        gbc.weightx = 1;  // Equal horizontal space for each column

        Pet_Model model = pets_list.get(i);
        PetCard card = new PetCard(model);
        // card.setPreferredSize(new Dimension(140, 200)); // Optional
        add(card, gbc);

        column++;
    }

    // Fill remaining space in the last row (optional, aesthetic)
    if (column > 0 && column < 6) {
        gbc.gridx = column;
        gbc.gridy = row;
        gbc.gridwidth = 6 - column; 
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JPanel(), gbc);
    }
}


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
