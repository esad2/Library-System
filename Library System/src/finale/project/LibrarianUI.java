/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finale.project;

import java.io.*;
import java.util.*;

/**
 *
 * @author salih
 */
public class LibrarianUI extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianUI
     */
    public LibrarianUI() {
        initComponents();
        loadBooksAvaliable();
        loadRegisteredPeople();
        loadReservedBooks();
        loadLateBooks();
        booksAvaliableTextArea.setEditable(false);
        registeredPeopleTextArea.setEditable(false);
        reservedBookListTextArea.setEditable(false);
        lateBookListTextArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        booksAvaliableLabel = new javax.swing.JLabel();
        registeredPeopleLabel = new javax.swing.JLabel();
        reservedBookListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksAvaliableTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        registeredPeopleTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservedBookListTextArea = new javax.swing.JTextArea();
        finesAndPaymentButton = new javax.swing.JButton();
        previousPageButton = new javax.swing.JButton();
        addPersonOrBookButton = new javax.swing.JButton();
        lateBookListLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lateBookListTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        booksAvaliableLabel.setText("Books Avaliable");

        registeredPeopleLabel.setText("Registered People");

        reservedBookListLabel.setText("Reserved Book List");

        booksAvaliableTextArea.setColumns(20);
        booksAvaliableTextArea.setRows(5);
        jScrollPane1.setViewportView(booksAvaliableTextArea);

        registeredPeopleTextArea.setColumns(20);
        registeredPeopleTextArea.setRows(5);
        jScrollPane2.setViewportView(registeredPeopleTextArea);

        reservedBookListTextArea.setColumns(20);
        reservedBookListTextArea.setRows(5);
        jScrollPane3.setViewportView(reservedBookListTextArea);

        finesAndPaymentButton.setText("Fines & Payment");
        finesAndPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finesAndPaymentButtonActionPerformed(evt);
            }
        });

        previousPageButton.setText("Back To Previous Page Button");
        previousPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageButtonActionPerformed(evt);
            }
        });

        addPersonOrBookButton.setText("Add Person/Book");
        addPersonOrBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonOrBookButtonActionPerformed(evt);
            }
        });

        lateBookListLabel.setText("Late Book List");

        lateBookListTextArea.setColumns(20);
        lateBookListTextArea.setRows(5);
        jScrollPane4.setViewportView(lateBookListTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(finesAndPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksAvaliableLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registeredPeopleLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservedBookListLabel)
                        .addGap(183, 183, 183)
                        .addComponent(lateBookListLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addPersonOrBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(previousPageButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booksAvaliableLabel)
                    .addComponent(registeredPeopleLabel)
                    .addComponent(reservedBookListLabel)
                    .addComponent(lateBookListLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finesAndPaymentButton)
                    .addComponent(previousPageButton)
                    .addComponent(addPersonOrBookButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finesAndPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finesAndPaymentButtonActionPerformed
        FinesAndPaymentUI jf2 = new FinesAndPaymentUI();

        jf2.show();
        dispose();     }//GEN-LAST:event_finesAndPaymentButtonActionPerformed

    private void previousPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageButtonActionPerformed
        LibrarianLoginUI jf1 = new LibrarianLoginUI();

        jf1.show();
        dispose();     }//GEN-LAST:event_previousPageButtonActionPerformed

    private void addPersonOrBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonOrBookButtonActionPerformed
        PeopleAndBooks jf3 = new PeopleAndBooks();

        jf3.show();
        dispose();     }//GEN-LAST:event_addPersonOrBookButtonActionPerformed

    // Method to load available books from a file and display them in the text area
    private void loadBooksAvaliable() {
        try (BufferedReader br = new BufferedReader(new FileReader("BookListAvaliable.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                booksAvaliableTextArea.append(line.replaceAll("\\d", "") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load registered people from a file and display them in the text area
    private void loadRegisteredPeople() {
        try (BufferedReader br = new BufferedReader(new FileReader("CustomerList.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                registeredPeopleTextArea.append(line.replaceAll("\\d", "") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load reserved books from a file and display them in the text area
    private void loadReservedBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader("BookListUnavailable.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                reservedBookListTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("LateBooks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                reservedBookListTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Method to load late books from a file and display them in the text area
    private void loadLateBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader("LateBooks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lateBookListTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(LibrarianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton addPersonOrBookButton;
    javax.swing.JLabel booksAvaliableLabel;
    javax.swing.JTextArea booksAvaliableTextArea;
    javax.swing.JButton finesAndPaymentButton;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JLabel lateBookListLabel;
    javax.swing.JTextArea lateBookListTextArea;
    javax.swing.JButton previousPageButton;
    javax.swing.JLabel registeredPeopleLabel;
    javax.swing.JTextArea registeredPeopleTextArea;
    javax.swing.JLabel reservedBookListLabel;
    javax.swing.JTextArea reservedBookListTextArea;
    // End of variables declaration//GEN-END:variables
}
