/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.Client;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class New_client extends javax.swing.JPanel {

        /**
         * Creates new form New_client
         */
        public New_client() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form. WARNING: Do NOT
         * modify this code. The content of this method is always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jTextFieldName = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jTextFieldlocation = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jTextFieldtelephone = new javax.swing.JTextField();

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
                        public void componentAdded(java.awt.event.ContainerEvent evt) {
                                jPanel1formComponentAdded(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(0, 204, 102));
                jButton1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jButton1.setForeground(new java.awt.Color(0, 51, 51));
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sauvegarder.gif"))); // NOI18N
                jButton1.setText("Save");
                jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                jButton1KeyPressed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 102, 102));
                jButton2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jButton2.setForeground(new java.awt.Color(51, 51, 0));
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fermer_32.png"))); // NOI18N
                jButton2.setText("Clear");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray), "Field", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("MV Boli", 0, 24), new java.awt.Color(0, 153, 153))); // NOI18N

                jLabel1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jLabel1.setText("Name");

                jTextFieldName.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jTextFieldName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
                jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextFieldNameActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jLabel2.setText("Location");

                jTextFieldlocation.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jTextFieldlocation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));

                jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jLabel3.setText("Telephone");

                jTextFieldtelephone.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
                jTextFieldtelephone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldlocation, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldName)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldtelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldtelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextFieldNameActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
                if(!this.jTextFieldName.getText().equals("") &&
                        !this.jTextFieldlocation.getText().equals("")){

                        try{
                                Client a = new Client();
                                a.SetName(this.jTextFieldName.getText());
                                a.SetLocation(this.jTextFieldlocation.getText());
                                a.SetTelephone(this.jTextFieldtelephone.getText());

                                if (a.Save() == 1){
                                        JOptionPane.showMessageDialog(null,"Save succesfully","Save",JOptionPane.INFORMATION_MESSAGE);
                                        this.jTextFieldName.setText("");
                                        this.jTextFieldlocation.setText("");
                                        this.jTextFieldtelephone.setText("");
                                }else
                                JOptionPane.showMessageDialog(null,"Operation fail","ERROR #008",JOptionPane.ERROR_MESSAGE);

                        }catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(null,"Invalide Integer","ERROR #008",JOptionPane.ERROR_MESSAGE);
                        }
                }else
                JOptionPane.showMessageDialog(null, "field the form well","ERROR #010",JOptionPane.ERROR_MESSAGE);
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton1KeyPressed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
                this.jTextFieldName.setText("");
                this.jTextFieldlocation.setText("");
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jPanel1formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1formComponentAdded
                // TODO add your handling code here:
        }//GEN-LAST:event_jPanel1formComponentAdded


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField jTextFieldName;
        private javax.swing.JTextField jTextFieldlocation;
        private javax.swing.JTextField jTextFieldtelephone;
        // End of variables declaration//GEN-END:variables
}