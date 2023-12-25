package CartUI;
import HomeUI.Home;
import LoginUi.Login;
import MenUI.Men;


import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
//import java.util.HashMap;


import java.util.LinkedList;
//import java.util.Map;
import java.util.Queue;

public class Cart extends javax.swing.JFrame {
private Queue<Integer> record;
    
    public Cart() {
        initComponents();
record = new LinkedList<>();
    }

    public void addtable(int id, String Name, int Qty, Double Price) {
  DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

  
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Double.valueOf(Qty);
        String TotalPrice = df.format(totPrice);

        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Name.equals(jTable1.getValueAt(row, 1))) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
                record.remove(); // Remove the corresponding record from the queue
            }
        }

        
        Object[] rowData = {id, Name, Qty, TotalPrice};
        dt.addRow(rowData);
        record.add(id); // Add the record ID to the queue
    }
    

    public void cal() {
        // Total Table Values
    int numOfRow = jTable1.getRowCount();
    double tot = 0.0;

    
    for (int i = 0; i < numOfRow; i++) {
        double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
        tot += value;
    }

    DecimalFormat df = new DecimalFormat("00.00");
    total.setText(df.format(tot));  
    }
    
public void deleteRecord() {
    if (!record.isEmpty()) {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        int lastRecordId = record.remove();

        
        // Find the last row index in jTable1
        int lastRowIndex = jTable1.getRowCount() - 1;
        while (lastRowIndex >= 0) {
            if ((int) jTable1.getValueAt(lastRowIndex, 0) == lastRecordId) {
                break;
            }
            lastRowIndex--;
        }

        
        if (lastRowIndex >= 0) {
            // Remove the row from jTable1 by shifting the remaining rows up
            for (int row = lastRowIndex; row < jTable1.getRowCount() - 1; row++) {
                for (int col = 0; col < jTable1.getColumnCount(); col++) {
                    jTable1.setValueAt(jTable1.getValueAt(row + 1, col), row, col);
                }
            }

            // Remove the last row
            dt.removeRow(jTable1.getRowCount() - 1);
             // Update the total
            cal();
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        deleteRecord = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        patBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(32767, 32767));

        jPanel1.setBackground(new java.awt.Color(216, 216, 216));
        jPanel1.setPreferredSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 2, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 196, 15));
        jLabel1.setText("S");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 55, 71));
        jLabel2.setText("hopCart");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 100, -1));

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
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, -1, -1));

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
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cart Items...");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 669, 400));

        b.setColumns(20);
        b.setRows(5);
        jScrollPane1.setViewportView(b);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 6, 383, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total : ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setText("00");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        deleteRecord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteRecord.setText("Delete");
        deleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordActionPerformed(evt);
            }
        });
        jPanel3.add(deleteRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, 80));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.setName("CloseBtn"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 80));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Print");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, 80));

        patBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        patBtn.setText("Pay");
        patBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patBtnActionPerformed(evt);
            }
        });
        jPanel3.add(patBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1050, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 1070, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Home homeForm = new Home();
        homeForm.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Login LoginForm = new Login();
        LoginForm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordActionPerformed
        deleteRecord(); 
    }//GEN-LAST:event_deleteRecordActionPerformed

    private void patBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patBtnActionPerformed
             // Bill Print

    try {
        b.setText(b.getText() + "                                               CASH RECEIPT\n");
        b.setText(b.getText() + "                                                  SHOP CART\n");
        b.setText(b.getText() + "    __________________________________________________\n");
        b.setText(b.getText() + "\n"+"       ID \tItem      \t    Qty \tPrice" + "\n");

        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        // get table Product Details

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String id = df.getValueAt(i, 0).toString();
            String Name = df.getValueAt(i, 1).toString();
            String Qty = df.getValueAt(i, 2).toString();
            String Price = df.getValueAt(i, 3).toString();

            b.setText(b.getText() + "\n"+"       " + id + "\t" + Name + "\t     " + Qty + "\t" + Price + "\n");
        }
            b.setText(b.getText() + "    __________________________________________________\n");
        b.setText(b.getText() + "\n"+"      Sub Total : " + total.getText() + "\n");
        b.setText(b.getText() + "    __________________________________________________\n");
        b.setText(b.getText() + "\n"+"                          Thank You For Shopping From Shop Cart\n");
        b.setText(b.getText() + "    __________________________________________________\n");

    } catch (Exception e) {
        // Handle any exceptions that occur during bill printing
    }

    }//GEN-LAST:event_patBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JButton deleteRecord;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton patBtn;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

}
