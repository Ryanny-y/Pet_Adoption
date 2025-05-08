package main.view.client;
import java.awt.Color;

public class ClientPetInfo extends javax.swing.JFrame {

    public ClientPetInfo() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borderPanel1 = new main.swing.common.BorderPanel();
        jLabel1 = new javax.swing.JLabel();
        pet_name = new javax.swing.JLabel();
        pet_age = new javax.swing.JLabel();
        pet_sexx = new javax.swing.JLabel();
        pet_desc = new javax.swing.JLabel();
        adoptBtn1 = new main.swing.buttons.AdoptBtn("Owen");
        clientHeader1 = new main.swing.common.ClientHeader(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Pet_Info"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pet_name.setFont(new java.awt.Font("Eras Demi ITC", 1, 35)); // NOI18N
        pet_name.setText("Name: Owenn");

        pet_age.setFont(new java.awt.Font("Comic Sans MS", 1, 25)); // NOI18N
        pet_age.setText("Sex:");

        pet_sexx.setFont(new java.awt.Font("Comic Sans MS", 1, 25)); // NOI18N
        pet_sexx.setText("Age:");

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
            .addGroup(borderPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pet_name, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_age, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_sexx, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adoptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        borderPanel1Layout.setVerticalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                        .addComponent(pet_name)
                        .addGap(20, 20, 20)
                        .addComponent(pet_sexx)
                        .addGap(20, 20, 20)
                        .addComponent(pet_age)
                        .addGap(20, 20, 20)
                        .addComponent(pet_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(adoptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(clientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(clientHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel pet_sexx;
    // End of variables declaration//GEN-END:variables
}
