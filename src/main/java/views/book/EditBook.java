/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.book;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.time.format.DateTimeFormatter;
import models.Author;

import models.Book;
import models.Category;
import models.Supplier;
import view.HomePage;

/**
 *
 * @author Admin
 */
public class EditBook extends javax.swing.JFrame {
    private HomePage home;
    /**
     * Creates new form EditBook
     */
    
    Book bif;
    
    public EditBook(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null);
        home = (HomePage) parent;
        
        comboBookCate.removeAllItems();
        for (Category  cate : home.category_list) {
            comboBookCate.addItem(cate.getName());
        }
        
        comboBookSupplier.removeAllItems();
        for (Supplier  supplier : home.supplier_list) {
            comboBookSupplier.addItem(supplier.getName());
        }
        
        comboBookAuthor.removeAllItems();
        for (Author author : home.author_list) {
            comboBookAuthor.addItem(author.getName());
        }
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBookEditName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnHuyBo = new javax.swing.JButton();
        booknumberOfPagesEdit = new javax.swing.JTextField();
        txtBookEditDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBookEditPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBookCate = new javax.swing.JComboBox<>();
        comboBookSupplier = new javax.swing.JComboBox<>();
        comboBookAuthor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtBookEditISBN = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("Danh mục:");

        jLabel3.setText("Tên sách:");

        txtBookEditName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBookEditNameFocusGained(evt);
            }
        });
        txtBookEditName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookEditNameActionPerformed(evt);
            }
        });

        jLabel11.setText("NCC:");

        btnThem.setText("Sửa");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel4.setText("Tác giả:");

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        booknumberOfPagesEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknumberOfPagesEditActionPerformed(evt);
            }
        });

        txtBookEditDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookEditDateActionPerformed(evt);
            }
        });

        jLabel7.setText("Số trang:");

        jLabel6.setText("Năm xuất bản:");

        txtBookEditPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookEditPriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("SỬA THÔNG TIN SÁCH");

        jLabel8.setText("Giá bán:");

        jLabel2.setText("Mã ISBN:");

        comboBookCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truyện ngắn", "Truyện dài" }));

        comboBookSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahasa" }));

        comboBookAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nguyễn Nhật Ánh" }));

        txtBookEditISBN.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(87, 87, 87)
                        .addComponent(btnHuyBo))
                    .addComponent(txtBookEditPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(booknumberOfPagesEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBookEditDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBookCate, 0, 269, Short.MAX_VALUE)
                    .addComponent(comboBookSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBookAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBookEditISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBookEditName))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtBookEditISBN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBookEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtBookEditDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(comboBookSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(booknumberOfPagesEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboBookCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookEditPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnHuyBo))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookEditNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookEditNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookEditNameActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // Retrieve and trim input values
            String title = txtBookEditName.getText();
            String author = String.valueOf(comboBookAuthor.getSelectedItem());
            String supplier = String.valueOf(comboBookSupplier.getSelectedItem());
            String category = String.valueOf(comboBookCate.getSelectedItem());

            // Parse integer values with exception handling
            int publicationYear = Integer.parseInt(txtBookEditDate.getText());
            int numberOfPages = Integer.parseInt(booknumberOfPagesEdit.getText());
            int price = Integer.parseInt(txtBookEditPrice.getText());

            // Retrieve ISBN and quantity in stock
            String ISBN = txtBookEditISBN.getText();
            int quantityInStock = bif.getQuantityInStock(); // Ensure bif is properly defined and accessible

            // Create a new Book object
            Book b = new Book(ISBN, title, author, "", publicationYear, numberOfPages, price, quantityInStock, category);

            // Handle the update of the book
            home.updateBook(b);

            // Show a success message after the book is updated
            JOptionPane.showMessageDialog(null, "Book updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Handle invalid number format
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for publication year, number of pages, and price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            // Handle null selection in combo boxes
            JOptionPane.showMessageDialog(null, "Please make sure all fields are filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Handle any other exceptions
            JOptionPane.showMessageDialog(null, "An error occurred while updating the book: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void booknumberOfPagesEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknumberOfPagesEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknumberOfPagesEditActionPerformed

    private void txtBookEditDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookEditDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookEditDateActionPerformed

    private void txtBookEditPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookEditPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookEditPriceActionPerformed

    private void txtBookEditNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBookEditNameFocusGained
        txtBookEditDate.setCaretPosition(txtBookEditDate.getText().length());
    }//GEN-LAST:event_txtBookEditNameFocusGained

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
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBook(null, false).setVisible(true);
            }
        });
    }
    
    public void setEditData(Book x) {
        bif = x;
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        txtBookEditISBN.setText(x.getISBN());
        txtBookEditName.setText(x.getTitle());
        comboBookAuthor.setSelectedItem(x.getAuthor());
        txtBookEditDate.setText(String.valueOf(x.getPublicationYear()));
        comboBookSupplier.setSelectedItem(x.getPublisher());
        booknumberOfPagesEdit.setText(String.valueOf(x.getNumberOfPages()));
        double price = x.getPrice();
        String priceString = String.format("%.0f", price); // Format giá trị thành số nguyên
        txtBookEditPrice.setText(priceString);
        
//        txtID.setText(x.getMaChamSoc() + "");
//        txtID.setEditable(false);
//        txtID.setBorder(null);
//        txtID.setBackground(null);
//        txtID.setForeground(Color.BLACK);
//        txtID.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//        txtID.setCaretColor(txtID.getBackground());
//        
//        txtBSX.setText(x.getBienSoXe());
//        comboLoaiXe.setSelectedItem(x.getLoaiXe());
//        txtChuSoHuu.setText(x.getChuSoHuu().getHoTen());
//        txtSDT.setText(x.getChuSoHuu().getSdt());
//        txtSuaChua.setText(x.getVatPham().getTenVatPham());
//        txtNgaySua.setText(x.getNgaySua().format(dateFormatter));
//        txtSoLuong.setText(x.getVatPham().getSoLuong() + "");
//        txtDonGia.setText(x.getVatPham().getDonGia() + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField booknumberOfPagesEdit;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> comboBookAuthor;
    private javax.swing.JComboBox<String> comboBookCate;
    private javax.swing.JComboBox<String> comboBookSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtBookEditDate;
    private javax.swing.JLabel txtBookEditISBN;
    private javax.swing.JTextField txtBookEditName;
    private javax.swing.JTextField txtBookEditPrice;
    // End of variables declaration//GEN-END:variables
}
