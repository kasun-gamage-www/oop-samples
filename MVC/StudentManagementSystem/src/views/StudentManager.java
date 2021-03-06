/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.StudentController;
import daos.DBConnection;
import daos.StudentDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Student;

/**
 *
 * @author Kasun Gamage
 */
public class StudentManager extends javax.swing.JFrame {

    /**
     * Creates new form StudentManager
     */
    public StudentManager() {
        initComponents();
        txtTotal.setEditable(false);
        /*To center the JFrame*/
        setLocationRelativeTo(this);
    }

    private void resetAllFields() {
        txtRegNum.setEditable(true);
        txtRegNum.setText("");
        txtName.setText("");
        txtTMA1.setText("0");
        txtTMA2.setText("0");
        txtTMA3.setText("0");
        txtTotal.setText("0");

        btnAdd.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegNum = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtRegNum = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtTMA1 = new javax.swing.JTextField();
        lblTMA1 = new javax.swing.JLabel();
        lblTMA2 = new javax.swing.JLabel();
        txtTMA2 = new javax.swing.JTextField();
        lblTMA3 = new javax.swing.JLabel();
        txtTMA3 = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblRegNum.setText("Registration Number");

        lblName.setText("Name");

        txtRegNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalc.setText("CALCULATE TOTAL");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtTMA1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTMA1.setText("0");
        txtTMA1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTMA1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTMA1FocusLost(evt);
            }
        });

        lblTMA1.setText("TMA 1 Marks");

        lblTMA2.setText("TMA 2 Marks");

        txtTMA2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTMA2.setText("0");
        txtTMA2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTMA2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTMA2FocusLost(evt);
            }
        });

        lblTMA3.setText("TMA 3 Marks");

        txtTMA3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTMA3.setText("0");
        txtTMA3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTMA3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTMA3FocusLost(evt);
            }
        });

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0");

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblSearch.setText("Search By Registration Number :");

        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setToolTipText("Registration Number");

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTMA3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTMA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTMA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRegNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))
                            .addComponent(btnCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txtRegNum)
                            .addComponent(txtName)
                            .addComponent(txtTMA1)
                            .addComponent(txtTMA2)
                            .addComponent(txtTotal)
                            .addComponent(txtTMA3)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegNum, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblRegNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTMA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTMA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTMA2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTMA2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTMA3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTMA3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetAllFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Student student = new Student(Long.parseLong(txtRegNum.getText()));
            student.setName(txtName.getText());
            student.setTma1(Integer.parseInt(txtTMA1.getText()));
            student.setTma2(Integer.parseInt(txtTMA2.getText()));
            student.setTma3(Integer.parseInt(txtTMA3.getText()));

            if (StudentDAO.insertStudent(student) > 0) {
                JOptionPane.showMessageDialog(this, "New Student Record Created!", "Success", JOptionPane.INFORMATION_MESSAGE, null);
                txtRegNum.setEditable(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex, "Database Error", JOptionPane.ERROR_MESSAGE, null);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Registration Number or marks. Please Enter a valid registration number and marks in numeric form.", "Invalid Number", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int total = StudentController.calcTotal(Integer.parseInt(txtTMA1.getText()), Integer.parseInt(txtTMA2.getText()), Integer.parseInt(txtTMA3.getText()));
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            Student student = StudentDAO.findStudent(Long.parseLong(txtSearch.getText()));

            if (null != student) {
                txtRegNum.setText(txtSearch.getText());
                txtName.setText(student.getName());
                txtTMA1.setText(String.valueOf(student.getTma1()));
                txtTMA2.setText(String.valueOf(student.getTma2()));
                txtTMA3.setText(String.valueOf(student.getTma3()));

                txtRegNum.setEditable(false);
                btnAdd.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "No records matching the given ID was found", "No Records", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex, "Database Error", JOptionPane.ERROR_MESSAGE, null);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Registration Number or marks. Please Enter a valid registration number and marks in numeric form.", "Invalid Number", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Student student = new Student(Long.parseLong(txtRegNum.getText()));

            student.setName(txtName.getText());
            student.setTma1(Integer.parseInt(txtTMA1.getText()));
            student.setTma2(Integer.parseInt(txtTMA2.getText()));
            student.setTma3(Integer.parseInt(txtTMA3.getText()));

            int rowsAffected = StudentDAO.updateStudent(Integer.parseInt(txtRegNum.getText()), student);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student Record Updated", "Success", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "No records matching the given ID was found", "No Records", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex, "Database Error", JOptionPane.ERROR_MESSAGE, null);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Registration Number. Please Enter a number ", "Invalid ID", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            long regNum = Long.parseLong(txtRegNum.getText());

            int userOption = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the student record " + txtRegNum.getText(), "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

            if (JOptionPane.YES_OPTION == userOption) {
                int rowsAffected = StudentDAO.deleteStudent(regNum);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Student Record Deleted", "Success", JOptionPane.INFORMATION_MESSAGE, null);
                    resetAllFields();
                } else {
                    JOptionPane.showMessageDialog(this, "No records matching the given ID was found", "No Records", JOptionPane.ERROR_MESSAGE, null);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex, "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Registration Number. Please Enter a number ", "Invalid ID", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtTMA1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA1FocusGained
        if ("0".equals(txtTMA1.getText())) {
            txtTMA1.setText("");
        }
    }//GEN-LAST:event_txtTMA1FocusGained

    private void txtTMA2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA2FocusGained
        if ("0".equals(txtTMA2.getText())) {
            txtTMA2.setText("");
        }
    }//GEN-LAST:event_txtTMA2FocusGained

    private void txtTMA3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA3FocusGained
        if ("0".equals(txtTMA3.getText())) {
            txtTMA3.setText("");
        }
    }//GEN-LAST:event_txtTMA3FocusGained

    private void txtTMA1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA1FocusLost
        if ("".equals(txtTMA1.getText())) {
            txtTMA1.setText("0");
        }
    }//GEN-LAST:event_txtTMA1FocusLost

    private void txtTMA2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA2FocusLost
        if ("".equals(txtTMA2.getText())) {
            txtTMA2.setText("0");
        }
    }//GEN-LAST:event_txtTMA2FocusLost

    private void txtTMA3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTMA3FocusLost
        if ("".equals(txtTMA3.getText())) {
            txtTMA3.setText("0");
        }
    }//GEN-LAST:event_txtTMA3FocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int userOption = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if (JOptionPane.YES_OPTION == userOption) {
            try {
                DBConnection.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(StudentManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRegNum;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTMA1;
    private javax.swing.JLabel lblTMA2;
    private javax.swing.JLabel lblTMA3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegNum;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTMA1;
    private javax.swing.JTextField txtTMA2;
    private javax.swing.JTextField txtTMA3;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
