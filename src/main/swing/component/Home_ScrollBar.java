package main.swing.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JPanel;
import main.model.Pet_Model;
import main.swing.common.PetCard;

public class Home_ScrollBar extends javax.swing.JPanel {

    private ArrayList<Pet_Model> pets_list = new ArrayList<>();
    
    public Home_ScrollBar(ArrayList<Pet_Model> pets) {
        initComponents();
        this.pets_list = (pets != null) ? pets : new ArrayList<>();
        addComponent();
        setBackground(new Color(0,0,0,0));
    }
    
    public Home_ScrollBar() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }
    
    private void addComponent() {
        for(Pet_Model pet : pets_list) {
            PetCard card = new PetCard(pet);
            this.add(card);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(0, 6, 20, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
