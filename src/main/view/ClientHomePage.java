package main.view;

import java.util.ArrayList;
import main.model.Pet_Model;
import main.swing.component.Home_ScrollBar;

public class ClientHomePage extends javax.swing.JFrame {

    private ArrayList<Pet_Model> pets_list = new ArrayList<>();
    
    public ClientHomePage() {
        
        initComponents();
        petInit();
        setVisible(true);
        
    }
    
    private void petInit() {
        pets_list.add(new Pet_Model("Owenn", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen1", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen2", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen3", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen4", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen5", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen2", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen3", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen4", 4, "Male", "Some New Cat"));
        pets_list.add(new Pet_Model("Owen5", 4, "Male", "Some New Cat"));
        
        Home_ScrollBar petContainer = new Home_ScrollBar(pets_list);
            jScrollPane1.setViewportView(petContainer);
            jScrollPane1.getViewport().addChangeListener(e -> {
                // Revalidate and repaint after the viewport changes (when scrolling)
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
            });
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borderPanel1 = new main.swing.common.BorderPanel();
        clientHeader1 = new main.swing.common.ClientHeader(this);
        hero_Bg1 = new main.swing.component.HeroBg();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Adopt A Pet");

        jScrollPane1.setBorder(null);

        javax.swing.GroupLayout borderPanel1Layout = new javax.swing.GroupLayout(borderPanel1);
        borderPanel1.setLayout(borderPanel1Layout);
        borderPanel1Layout.setHorizontalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hero_Bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clientHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(505, 505, 505))
            .addComponent(jScrollPane1)
        );
        borderPanel1Layout.setVerticalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel1Layout.createSequentialGroup()
                .addComponent(clientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hero_Bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.swing.common.BorderPanel borderPanel1;
    private main.swing.common.ClientHeader clientHeader1;
    private main.swing.component.HeroBg hero_Bg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
