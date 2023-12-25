/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WomenUI;

import CartUI.Cart;
import HomeUI.Home;
import LoginUi.Login;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author DEll
 */
public class Women extends javax.swing.JFrame {
private Cart CartForm;
    public Women() {
        initComponents();
         CartForm = new Cart();
    }
   
public void incrementQuantity(JSpinner spinner, JLabel idLabel, JLabel nameLabel, JLabel priceLabel) {
    int Qty = (int) spinner.getValue();
   
   String id = idLabel.getText();
    String name = nameLabel.getText();
    String priceText = priceLabel.getText();
    
    // Remove currency symbols and additional characters from label
    String numericPrice = priceText.replaceAll("[^\\d.]", "");
    numericPrice = numericPrice.replaceFirst("\\.(?=.*\\.)", "");
    
    
    double price = Double.parseDouble(numericPrice);
    
    CartForm.addtable(Integer.parseInt(id), name, Qty, price);
    CartForm.cal();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        name3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        r3 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        r1 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        name2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        r2 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        r4 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        name8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        price8 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        r8 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        name7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        price7 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        r7 = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        name6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();
        r6 = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        name5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        r5 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 216, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 2, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 196, 15));
        jLabel1.setText("S");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 55, 71));
        jLabel2.setText("hopCart");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 100, -1));

        jButton13.setBackground(new java.awt.Color(216, 216, 216));
        jButton13.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(40, 55, 71));
        jButton13.setText("Home");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jButton14.setBackground(new java.awt.Color(216, 216, 216));
        jButton14.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(40, 55, 71));
        jButton14.setText("Cart");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 50, 30));

        jButton12.setBackground(new java.awt.Color(216, 216, 216));
        jButton12.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(40, 55, 71));
        jButton12.setText("Logout");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 80, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(40, 55, 71));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add To Cart");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 40));

        name3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name3.setText("Women's Trouser ");
        jPanel3.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/kurti3.jpg"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        price3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price3.setText("Rs 2800");
        jPanel3.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("103");
        jPanel3.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel3.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 50, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 260, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(40, 55, 71));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add To Cart");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 40));

        name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name1.setText("Women's Kurti ");
        jPanel4.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/kurti.jpg"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        price1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price1.setText("Rs 3200");
        jPanel4.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setText("101");
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel4.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 260, 290));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(40, 55, 71));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add To Cart");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 40));

        name2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name2.setText("White Kurti ");
        jPanel6.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/kurti2.jpg"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        price2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price2.setText("Rs 4200");
        jPanel6.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("102");
        jPanel6.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel6.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 260, 290));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(40, 55, 71));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add To Cart");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/kurti4.jpg"))); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        name4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name4.setText("Mahroon Kurti ");
        jPanel7.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        price4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price4.setText("Rs 5000");
        jPanel7.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        id3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id3.setText("104");
        jPanel7.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel7.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 50, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 260, 290));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(40, 55, 71));
        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add To Cart");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        name8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name8.setText("Women's Sandal ");
        jPanel8.add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Sandal4.jpg"))); // NOI18N
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 170));

        price8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price8.setText("Rs 1500");
        jPanel8.add(price8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        id7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id7.setText("108");
        jPanel8.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel8.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 260, 250));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(40, 55, 71));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add To Cart");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        name7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name7.setText("White Heels ");
        jPanel9.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Sandal3.jpg"))); // NOI18N
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 170));

        price7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price7.setText("Rs 3000");
        jPanel9.add(price7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        id6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id6.setText("107");
        jPanel9.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel9.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 50, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 260, 250));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(40, 55, 71));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add To Cart");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        name6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name6.setText("Flat Sandal ");
        jPanel10.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Sandal2.jpg"))); // NOI18N
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 170));

        id5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id5.setText("106");
        jPanel10.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        price6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price6.setText("Rs 1800");
        jPanel10.add(price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));
        jPanel10.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 40, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 260, 250));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(40, 55, 71));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add To Cart");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        name5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name5.setText("Black Sandal ");
        jPanel11.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Sandal1.jpg"))); // NOI18N
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 170));

        id4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id4.setText("105");
        jPanel11.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        price5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        price5.setText("Rs 1200");
        jPanel11.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        jPanel11.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 50, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 260, 250));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Sandals");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("kurtis");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Home homeForm = new Home();
        homeForm.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
          
        CartForm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Login LoginForm = new Login();
        LoginForm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  incrementQuantity(r3, id2, name3, price3);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         incrementQuantity(r1, id, name1, price1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

          incrementQuantity(r2, id1, name2, price2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         incrementQuantity(r4, id3, name4, price4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          incrementQuantity(r8, id7, name8, price8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        incrementQuantity(r7, id6, name7, price7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  incrementQuantity(r6, id5, name6, price6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          incrementQuantity(r5, id4, name5, price5);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Women.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Women().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name8;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    private javax.swing.JLabel price7;
    private javax.swing.JLabel price8;
    private javax.swing.JSpinner r1;
    private javax.swing.JSpinner r2;
    private javax.swing.JSpinner r3;
    private javax.swing.JSpinner r4;
    private javax.swing.JSpinner r5;
    private javax.swing.JSpinner r6;
    private javax.swing.JSpinner r7;
    private javax.swing.JSpinner r8;
    // End of variables declaration//GEN-END:variables

}