/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenUI;

import CartUI.Cart;
import HomeUI.Home;
import LoginUi.Login;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class Men extends javax.swing.JFrame {
private Cart CartForm;
    public Men() {
        initComponents();
        CartForm = new Cart();
    }
    private void incrementQuantity(JSpinner spinner, JLabel idLabel, JLabel nameLabel, JLabel priceLabel) {
    int Qty = (int) spinner.getValue();
   
   String id = idLabel.getText();
    String name = nameLabel.getText();
    String priceText = priceLabel.getText();
    
    // Remove currency symbols and additional characters from price
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
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idlabel1 = new javax.swing.JLabel();
        namelabel1 = new javax.swing.JLabel();
        pricelabel1 = new javax.swing.JLabel();
        q3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        q1 = new javax.swing.JSpinner();
        productIdLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        priceelabel = new javax.swing.JLabel();
        q2 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        iidlabel2 = new javax.swing.JLabel();
        namelabel2 = new javax.swing.JLabel();
        pricelabel2 = new javax.swing.JLabel();
        q4 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        namelabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        idlabel6 = new javax.swing.JLabel();
        pricelabel6 = new javax.swing.JLabel();
        q8 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        namelabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idlabel5 = new javax.swing.JLabel();
        pricelabel5 = new javax.swing.JLabel();
        q7 = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        namelabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pricelabel4 = new javax.swing.JLabel();
        idlabel4 = new javax.swing.JLabel();
        q6 = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        namelabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idlabel3 = new javax.swing.JLabel();
        pricelabel3 = new javax.swing.JLabel();
        q5 = new javax.swing.JSpinner();

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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/images (5).jpeg"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 180));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        idlabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idlabel1.setText("305");
        jPanel3.add(idlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        namelabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel1.setText("Men's White Shirt");
        jPanel3.add(namelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 207, -1, 20));

        pricelabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel1.setText("Rs 1789");
        jPanel3.add(pricelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));
        jPanel3.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 260, 290));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Jeans");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Shirts");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/stylish-black-t-shirt-with-floral-prints-navy-blue-t-shirt-on-a-transparent-background-bodyless-blue-t-shirt-image-for-personal-use-men-s-fashion-wear-apparel-image-free-png (1).png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 180));
        jPanel4.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, -1));

        productIdLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productIdLabel.setText("303");
        jPanel4.add(productIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        productNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productNameLabel.setText("Floral Shirt");
        jPanel4.add(productNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        priceLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priceLabel.setText("Rs 1499.9");
        jPanel4.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 20));

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/images (3).jpeg"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 220, 180));

        idLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idLabel.setText("304");
        jPanel6.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("Black T-Shirt");
        jPanel6.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        priceelabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        priceelabel.setText("Rs 1600");
        jPanel6.add(priceelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));
        jPanel6.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, -1));

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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/shirt (1).jpg"))); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 180));

        iidlabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        iidlabel2.setText("306");
        jPanel7.add(iidlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        namelabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel2.setText("Check Shirt");
        jPanel7.add(namelabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        pricelabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel2.setText("Rs 1682.3");
        jPanel7.add(pricelabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        jPanel7.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, -1));

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

        namelabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel6.setText("Men's Blue Jeans ");
        jPanel8.add(namelabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/images (6).jpeg"))); // NOI18N
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 140));

        idlabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idlabel6.setText("310");
        jPanel8.add(idlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        pricelabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel6.setText("Rs 2600");
        jPanel8.add(pricelabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        jPanel8.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

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

        namelabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel5.setText("Men's Navy Jeans ");
        jPanel9.add(namelabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/images (7).jpeg"))); // NOI18N
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 140));

        idlabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idlabel5.setText("309");
        jPanel9.add(idlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        pricelabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel5.setText("Rs 2500");
        jPanel9.add(pricelabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));
        jPanel9.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 50, -1));

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

        namelabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel4.setText("Men's Denim Jeans ");
        jPanel10.add(namelabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/images (8).jpeg"))); // NOI18N
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 160));

        pricelabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel4.setText("Rs 2000");
        jPanel10.add(pricelabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 20));

        idlabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idlabel4.setText("308");
        jPanel10.add(idlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel10.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

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

        namelabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        namelabel3.setText("Men's Black Jeans");
        jPanel11.add(namelabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenUI/230077091-915-p__jeans__all.png"))); // NOI18N
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 130));

        idlabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idlabel3.setText("307");
        jPanel11.add(idlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, -1));

        pricelabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pricelabel3.setText("Rs 1900");
        jPanel11.add(pricelabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        jPanel11.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 260, 250));

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
     incrementQuantity(q3, idlabel1, namelabel1, pricelabel1);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        incrementQuantity(q1, productIdLabel, productNameLabel, priceLabel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         incrementQuantity(q2, idLabel, nameLabel, priceelabel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        incrementQuantity(q4, iidlabel2, namelabel2, pricelabel2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        incrementQuantity(q8, idlabel6, namelabel6, pricelabel6);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
        incrementQuantity(q7, idlabel5, namelabel5, pricelabel5);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        incrementQuantity(q6, idlabel4, namelabel4, pricelabel4);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        incrementQuantity(q5, idlabel3, namelabel3, pricelabel3);
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
            java.util.logging.Logger.getLogger(Men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Men().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idlabel1;
    private javax.swing.JLabel idlabel3;
    private javax.swing.JLabel idlabel4;
    private javax.swing.JLabel idlabel5;
    private javax.swing.JLabel idlabel6;
    private javax.swing.JLabel iidlabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel namelabel1;
    private javax.swing.JLabel namelabel2;
    private javax.swing.JLabel namelabel3;
    private javax.swing.JLabel namelabel4;
    private javax.swing.JLabel namelabel5;
    private javax.swing.JLabel namelabel6;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceelabel;
    private javax.swing.JLabel pricelabel1;
    private javax.swing.JLabel pricelabel2;
    private javax.swing.JLabel pricelabel3;
    private javax.swing.JLabel pricelabel4;
    private javax.swing.JLabel pricelabel5;
    private javax.swing.JLabel pricelabel6;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JSpinner q1;
    private javax.swing.JSpinner q2;
    private javax.swing.JSpinner q3;
    private javax.swing.JSpinner q4;
    private javax.swing.JSpinner q5;
    private javax.swing.JSpinner q6;
    private javax.swing.JSpinner q7;
    private javax.swing.JSpinner q8;
    // End of variables declaration//GEN-END:variables
}
