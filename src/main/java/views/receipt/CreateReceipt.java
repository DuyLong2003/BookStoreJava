/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.receipt;
import models.Receipt;
import view.HomePage;
/**
 *
 * @author Admin
 */
public class CreateReceipt extends javax.swing.JFrame {

    /**
     * Creates new form CreateReceipt
     */
    private HomePage home;
    public CreateReceipt(java.awt.Frame parent, boolean modal) {
        this.setLocationRelativeTo(null);
        home = (HomePage) parent;
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHuyBo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtReceiptQuantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboReceiptBook = new javax.swing.JComboBox<>();
        comboReceiptEmployee = new javax.swing.JComboBox<>();
        comboReceiptSupplier = new javax.swing.JComboBox<>();
        txtReceiptQuantity1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        jLabel2.setText("Sách:");

        jLabel3.setText("Số lượng:");

        jLabel6.setText("Nhà cung cấp:");

        txtReceiptQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiptQuantityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("NHẬP KHO");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel4.setText("Phụ trách:");

        comboReceiptBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboReceiptEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nguyễn Văn An", "Đặng Ngọc Mai" }));

        comboReceiptSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahasa", "Sách mới"}));
        comboReceiptSupplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboReceiptSupplierItemStateChanged(evt);
            }
        });
        comboReceiptSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReceiptSupplierActionPerformed(evt);
            }
        });

        txtReceiptQuantity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiptQuantity1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Giá nhập:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtReceiptQuantity1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(87, 87, 87)
                        .addComponent(btnHuyBo))
                    .addComponent(txtReceiptQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboReceiptEmployee, javax.swing.GroupLayout.Alignment.LEADING, 0, 352, Short.MAX_VALUE)
                    .addComponent(comboReceiptSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboReceiptBook, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboReceiptBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtReceiptQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtReceiptQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboReceiptEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboReceiptSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnHuyBo))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void txtReceiptQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiptQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiptQuantityActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String book, employee, supplier, quantity;
        
        book = (String)comboReceiptBook.getSelectedItem();
        employee = (String)comboReceiptEmployee.getSelectedItem();
        supplier = (String)comboReceiptEmployee.getSelectedItem();
        quantity = txtReceiptQuantity.getText();
        
        Receipt b = new Receipt("1","10/10/2023",supplier, book,quantity, employee, "1000000");
        
        home.handleCreateReceipt(b);        
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtReceiptQuantity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiptQuantity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiptQuantity1ActionPerformed

    private void comboReceiptSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboReceiptSupplierItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReceiptSupplierItemStateChanged

    private void comboReceiptSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReceiptSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReceiptSupplierActionPerformed

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
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateReceipt(null, false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> comboReceiptBook;
    private javax.swing.JComboBox<String> comboReceiptEmployee;
    private javax.swing.JComboBox<String> comboReceiptSupplier;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtReceiptQuantity;
    private javax.swing.JTextField txtReceiptQuantity1;
    // End of variables declaration//GEN-END:variables
}
