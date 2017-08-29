/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import views.StudentManager;

/**
 *
 * @author Kasun Gamage
 */
public class Driver {

    /**
     * @param args the command line arguments. This is where the program starts
     * execution.
     */
    public static void main(String[] args) {
        /*Optional Look and Feel*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /*Instantiate the JFrame and make it visible*/
        new StudentManager().setVisible(true);
    }

}
