/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroceryUI;

import CartUI.Cart;
import HomeUI.Home;
import LoginUi.Login;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author DEll
 */
public class Grocery extends javax.swing.JFrame {
 private Cart CartForm;
    /**
     * Creates new form Grocery
     */
    public Grocery() {
       
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        pname2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pprice2 = new javax.swing.JLabel();
        pid2 = new javax.swing.JLabel();
        s3 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pname = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        pprice = new javax.swing.JLabel();
        s1 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pname1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pid1 = new javax.swing.JLabel();
        pprice1 = new javax.swing.JLabel();
        s2 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        pname3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pprice3 = new javax.swing.JLabel();
        pid3 = new javax.swing.JLabel();
        s4 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        pname7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        s7 = new javax.swing.JSpinner();
        pid7 = new javax.swing.JLabel();
        pprice7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        pname6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pprice6 = new javax.swing.JLabel();
        pid6 = new javax.swing.JLabel();
        s6 = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        pname5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        s5 = new javax.swing.JSpinner();
        pprice5 = new javax.swing.JLabel();
        pid5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        pname4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pprice4 = new javax.swing.JLabel();
        pid4 = new javax.swing.JLabel();
        s8 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        pname2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname2.setText("Onion 1 Kg ");
        jPanel3.add(pname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Onion.jpg"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pprice2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice2.setText("Rs 40");
        jPanel3.add(pprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        pid2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid2.setText("103");
        jPanel3.add(pid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel3.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 50, -1));

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

        pname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname.setText("Tomato 1 Kg ");
        jPanel4.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Tomato.jpg"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid.setText("101");
        jPanel4.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        pprice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice.setText("Rs 140");
        jPanel4.add(pprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        jPanel4.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, -1));

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

        pname1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname1.setText("Potato 1 Kg ");
        jPanel6.add(pname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Potato.jpg"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pid1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid1.setText("102");
        jPanel6.add(pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        pprice1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice1.setText("Rs 180");
        jPanel6.add(pprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        jPanel6.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, -1));

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

        pname3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname3.setText("Capiscum 1 ");
        jPanel7.add(pname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Capsicum.jpg"))); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pprice3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice3.setText("Rs 30");
        jPanel7.add(pprice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        pid3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid3.setText("104");
        jPanel7.add(pid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel7.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 50, -1));

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

        pname7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname7.setText("Peach 1kg ");
        jPanel8.add(pname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Peach.jpg"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 140));
        jPanel8.add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, 20));

        pid7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid7.setText("108");
        jPanel8.add(pid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        pprice7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice7.setText("Rs 300");
        jPanel8.add(pprice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 50, -1));

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

        pname6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname6.setText("Mango 1 Kg ");
        jPanel9.add(pname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Mango.jpg"))); // NOI18N
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 150));

        pprice6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice6.setText("Rs 250");
        jPanel9.add(pprice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        pid6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid6.setText("107");
        jPanel9.add(pid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel9.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, -1));

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

        pname5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname5.setText("Red Cherry 1 Kg ");
        jPanel10.add(pname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Cherry.jpg"))); // NOI18N
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 170));
        jPanel10.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        pprice5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice5.setText("Rs 400");
        jPanel10.add(pprice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 180, 50, -1));

        pid5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid5.setText("106");
        jPanel10.add(pid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

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

        pname4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pname4.setText("Banana 1 Dozen ");
        jPanel11.add(pname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WomenUI/Banana.jpg"))); // NOI18N
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 150));

        pprice4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pprice4.setText("Rs 180");
        jPanel11.add(pprice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 60, -1));

        pid4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pid4.setText("205");
        jPanel11.add(pid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));
        jPanel11.add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 50, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 260, 250));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Fresh Fruits");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fresh Vegetables");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

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
  incrementQuantity(s3, pid2, pname2, pprice2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              incrementQuantity(s1, pid, pname, pprice);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         incrementQuantity(s2, pid1, pname1, pprice1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  incrementQuantity(s4, pid3, pname3, pprice3);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          incrementQuantity(s8, pid7, pname7, pprice7);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          incrementQuantity(s7, pid6, pname6, pprice6);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  incrementQuantity(s6, pid5, pname5, pprice5);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  incrementQuantity(s5, pid4, pname4, pprice4);
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
            java.util.logging.Logger.getLogger(Grocery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grocery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grocery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grocery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grocery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel pid;
    private javax.swing.JLabel pid1;
    private javax.swing.JLabel pid2;
    private javax.swing.JLabel pid3;
    private javax.swing.JLabel pid4;
    private javax.swing.JLabel pid5;
    private javax.swing.JLabel pid6;
    private javax.swing.JLabel pid7;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel pname1;
    private javax.swing.JLabel pname2;
    private javax.swing.JLabel pname3;
    private javax.swing.JLabel pname4;
    private javax.swing.JLabel pname5;
    private javax.swing.JLabel pname6;
    private javax.swing.JLabel pname7;
    private javax.swing.JLabel pprice;
    private javax.swing.JLabel pprice1;
    private javax.swing.JLabel pprice2;
    private javax.swing.JLabel pprice3;
    private javax.swing.JLabel pprice4;
    private javax.swing.JLabel pprice5;
    private javax.swing.JLabel pprice6;
    private javax.swing.JLabel pprice7;
    private javax.swing.JSpinner s1;
    private javax.swing.JSpinner s2;
    private javax.swing.JSpinner s3;
    private javax.swing.JSpinner s4;
    private javax.swing.JSpinner s5;
    private javax.swing.JSpinner s6;
    private javax.swing.JSpinner s7;
    private javax.swing.JSpinner s8;
    // End of variables declaration//GEN-END:variables

    private String getProductFromGrocery() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
