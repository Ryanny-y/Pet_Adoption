package main.view.client;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import main.model.Pet_Model;

public class ClientPetInfo extends javax.swing.JFrame {

    private Pet_Model pet;
    
    public ClientPetInfo(Pet_Model pet) {
        this.pet = pet;

        initComponents();
        initInfo();

        setBackground(new Color(0,0,0,0));
        setVisible(true);
    }
    
    private void initInfo() {
        pet_name.setText(pet.getName());
        pet_age.setText(pet.getAge());
        pet_sex.setText(pet.getSex());
        pet_desc.setText("<html>" +pet.getDescription() + "</html>");
        ImageIcon icon = new ImageIcon("D:\\apache workspace\\Pet_Adoption\\src\\resources\\images\\pets\\" + pet.getImage());

        Image scaledImage = icon.getImage().getScaledInstance(488, 450, Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(scaledImage));
    }
    
    public ClientPetInfo() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borderPanel1 = new main.swing.common.BorderPanel();
        clientHeader1 = new main.swing.common.ClientHeader(this);
        jLabel1 = new javax.swing.JLabel();
        pet_name = new javax.swing.JLabel();
        pet_age = new javax.swing.JLabel();
        pet_sex = new javax.swing.JLabel();
        pet_desc = new javax.swing.JLabel();
        adoptBtn1 = new main.swing.buttons.AdoptBtn(pet.getName(), pet.getId());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Pet_Info"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        borderPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        pet_name.setFont(new java.awt.Font("Eras Demi ITC", 1, 35)); // NOI18N
        pet_name.setText("Name: Owenn");

        pet_age.setFont(new java.awt.Font("Comic Sans MS", 1, 25)); // NOI18N
        pet_age.setText("Sex:");

        pet_sex.setFont(new java.awt.Font("Comic Sans MS", 1, 25)); // NOI18N
        pet_sex.setText("Age:");

        pet_desc.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        pet_desc.setText("<html>Seme Description Here</html>");
        pet_desc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pet_desc.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        adoptBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borderPanel1Layout = new javax.swing.GroupLayout(borderPanel1);
        borderPanel1.setLayout(borderPanel1Layout);
        borderPanel1Layout.setHorizontalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pet_name, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_age, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adoptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        borderPanel1Layout.setVerticalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                .addComponent(clientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                        .addComponent(pet_name)
                        .addGap(20, 20, 20)
                        .addComponent(pet_sex)
                        .addGap(20, 20, 20)
                        .addComponent(pet_age)
                        .addGap(20, 20, 20)
                        .addComponent(pet_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(adoptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adoptBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adoptBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.swing.buttons.AdoptBtn adoptBtn1;
    private main.swing.common.BorderPanel borderPanel1;
    private main.swing.common.ClientHeader clientHeader1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pet_age;
    private javax.swing.JLabel pet_desc;
    private javax.swing.JLabel pet_name;
    private javax.swing.JLabel pet_sex;
    // End of variables declaration//GEN-END:variables
}
