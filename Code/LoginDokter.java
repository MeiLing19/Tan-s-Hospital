/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Coba;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginDokter extends javax.swing.JFrame {

    /**
     * Creates new form LoginDokter
     */
    public LoginDokter() {
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

        inputUsrnm = new javax.swing.JTextField();
        inputPass = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputUsrnm.setBackground(new java.awt.Color(255, 255, 255));
        inputUsrnm.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        inputUsrnm.setForeground(new java.awt.Color(0, 0, 0));
        inputUsrnm.setBorder(null);
        getContentPane().add(inputUsrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 350, 50));

        inputPass.setBackground(new java.awt.Color(255, 255, 255));
        inputPass.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        inputPass.setForeground(new java.awt.Color(0, 0, 0));
        inputPass.setBorder(null);
        getContentPane().add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 443, 350, 48));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 153, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 134, 45));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 153, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 135, 45));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/LoginDokter.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String user;
        String pass;
        user = inputUsrnm.getText();
        pass = inputPass.getText();
        CatatanPasien catatan = new CatatanPasien();
        if (user.equals("dokter") && pass.equals("dokter")) {
            this.dispose();
            catatan.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Username atau Password yang Anda masukkan salah!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUsrnm;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
