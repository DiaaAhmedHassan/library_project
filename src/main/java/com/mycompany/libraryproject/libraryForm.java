/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libraryproject;
import java.lang.String;
/**
 *
 * @author DELL
 */
public class libraryForm extends javax.swing.JFrame {
    /**
     * Creates new form libraryForm
     */
    //creating arrays
    String[][] books = new String[20][5];
    int booksNumbers[] = new int[20];
    boolean isFound = false;
   
    
    
    public libraryForm() {
        initComponents();
        
        //initialising columns
        books[0][0] = "id";
        books[0][1] = "book name";
        books[0][2] = "Author name";
        books[0][3] = "Category";
        books[0][4] = "Status";
        
        //first book data
        //books ids
        int idStr = 1000;
        for(int i = 1; i<=10; i++){    
            ++idStr;
            String id = String.valueOf(idStr);
            books[i][0] = id;
        }
        
       //book 1
       //name
       books[1][1] = "A tale of two citys";
       //author name
       books[1][2] = "charles dickens";
       //category 
       books[1][3] = "Novels";
       //status
       books[1][4] = "not borrowd";
       
       //book 2
       //name
       books[2][1] = "Hamlet";
       //author name
       books[2][2] = "William Shakespeare";
       //category 
       books[2][3] = "Novels";
       //status
       books[2][4] = "not borrowd";
       
       //book 3
       //name
       books[3][1] = "behind the nature";
       //author name
       books[3][2] = "Ahmed Khaled tawfik";
       //category 
       books[3][3] = "Novels";
       //status
       books[3][4] = "not borrowd";
       //book 4
       //name
       books[4][1] = "LOLITA";
       //author name
       books[4][2] = "Vladimir Nabokov";
       //category 
       books[4][3] = "Novels";
       //status
       books[4][4] = "not borrowd";
       
       //book 5
       //name
       books[5][1] = "THE GRAPES OF WRATH";
       //author name
       books[5][2] = "John Steinbeck";
       //category 
       books[5][3] = "Novels";
       
       //book 6
       //name
       books[6][1] = "Gone";
       //author name
       books[6][2] = "James Patterson";
       //category 
       books[6][3] = "Fiction";
       //status
       books[6][4] = "not borrowd";
       
       //book 7
       //name
       books[7][1] = "Harry Potter and The Philosopher's Stone";
       //author name
       books[7][2] = "J. K. Rowling";
       //category 
       books[7][3] = "Children Books";
       //status
       books[7][4] = "not borrowd";
       
       //book 8
       //name
       books[8][1] = "Death on The Nile";
       //author name
       books[8][2] = "Agatha Christie";
       //category 
       books[8][3] = "Fiction";
       //status
       books[8][4] = "not borrowd";
       
       //book 9
       //name
       books[9][1] = "Tron: Legacy";
       //author name
       books[9][2] = "James Ponti ";
       //category 
       books[9][3] = "Fiction";
       //status
       books[9][4] = "not borrowd";
       
       //book 10
       //name
       books[10][1] = "Atomic Habits";
       //author name
       books[10][2] = "James Clear";
       //category 
       books[10][3] = "self improvement";
       //status
       books[10][4] = "not borrowd";
       
       for(int i = 0; i<=10; i++){
           for(int j = 0; j<4; j++){
               System.out.print(books[i][j]+" | ");
           }
           System.out.println("\n");
       }
        
      
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookId = new javax.swing.JTextField();
        foundLabel = new javax.swing.JLabel();
        bookName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookAuthor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bookCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bookStatuse = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library mangement system");

        bookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        foundLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        foundLabel.setForeground(new java.awt.Color(255, 0, 0));
        foundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("book name");

        bookAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Author name");

        bookCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("category");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("display book status");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Add new book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("check out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delet the book");

        jButton5.setText("Search by id");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Search by author");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Statuse");

        bookStatuse.setEditable(false);
        bookStatuse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Borrow ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("book id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bookCategory)
                            .addComponent(bookAuthor)
                            .addComponent(bookName)
                            .addComponent(bookId)
                            .addComponent(bookStatuse))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(854, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookStatuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(bookId.getText().equals("")||bookName.getText().equals("")||bookAuthor.getText().equals("")
               ||bookCategory.getText().equals(""))
           foundLabel.setText("Fill the text fields first");
       else{
        foundLabel.setText("");
        for(int i=1;i<books.length;i++){
            if(books[i][0]==null){
                books [i][0]=bookId.getText();
                books [i][1]=bookName.getText();
                books [i][2]=bookAuthor.getText();
                books [i][3]=bookCategory.getText();
                break;
            }
        }
       }
        bookId.setText("");
        bookName.setText("");
        bookAuthor.setText("");
        bookCategory.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        foundLabel.setText("");
        for(int i = 1; i<20;i++){
            if(books[i][1] == null){
                foundLabel.setText("Not found !");
                break;
            }
            if(bookName.getText().toLowerCase().equals(books[i][1].toLowerCase())){
                isFound = true;
                bookId.setText(books[i][0]);
                bookName.setText(books[i][1]);
                bookAuthor.setText(books[i][2]);
                bookCategory.setText(books[i][3]);
                bookStatuse.setText(books[i][4]);
                break;
            }
            
           
        }
        
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        bookId.setText("");
        bookName.setText("");
        bookAuthor.setText("");
        bookCategory.setText("");
        bookStatuse.setText("");
        foundLabel.setText("");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        foundLabel.setText("");
        for(int i = 1; i<20;i++){
            if(books[i][1] == null){
                foundLabel.setText("Not found !");
                break;
            }
            if(bookId.getText().toLowerCase().equals(books[i][0].toLowerCase())){
                isFound = true;
                bookId.setText(books[i][0]);
                bookName.setText(books[i][1]);
                bookAuthor.setText(books[i][2]);
                bookCategory.setText(books[i][3]);
                bookStatuse.setText(books[i][4]);
                break;
            }else{
                foundLabel.setText("Not found !");
                break;
            }
            
           
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        foundLabel.setText("");
        
        System.out.println(bookAuthor.getText());
        
        for(int i = 1; i < books.length; i++){
            //check
            if(books[i][2] == null){
                foundLabel.setText("Not found !");
                break;
            }
            
            if(bookAuthor.getText().toLowerCase().equals(books[i][2].toLowerCase())){
                isFound = true;
                bookId.setText(books[i][0]);
                bookName.setText(books[i][1]);
                bookAuthor.setText(books[i][2]);
                bookCategory.setText(books[i][3]);
                bookStatuse.setText(books[i][4]);
                break;
            }
//            else{
//                foundLabel.setText("Not found !");
//                break;
//            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed
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
            java.util.logging.Logger.getLogger(libraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(libraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(libraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libraryForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookAuthor;
    private javax.swing.JTextField bookCategory;
    private javax.swing.JTextField bookId;
    private javax.swing.JTextField bookName;
    private javax.swing.JTextField bookStatuse;
    private javax.swing.JLabel foundLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}