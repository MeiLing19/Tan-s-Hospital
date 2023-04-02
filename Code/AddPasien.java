/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Coba;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class AddPasien extends javax.swing.JFrame {

    /**
     * Creates new form AddPasien
     */
    public AddPasien() {
        initComponents();
    }
    String s;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputUsia = new javax.swing.JTextField();
        cbJK = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        inputAlamat = new javax.swing.JTextField();
        inputKontak = new javax.swing.JTextField();
        inputTglPeriksa = new javax.swing.JTextField();
        cbGoldar = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        inputIDPasien = new javax.swing.JTextField();
        fotoPasien = new javax.swing.JLabel();
        btnPilihFoto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        inputRiwayatPenyakit = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("DATA PASIEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 300, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("ID Pasien");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Usia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Status Hubungan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 73, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("No Hp/Telp");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Golongan Darah");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 160, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Tanggal Periksa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 150, -1));

        inputNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 197, 30));

        inputUsia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputUsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 197, 30));

        cbJK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-laki", "Perempuan" }));
        getContentPane().add(cbJK, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 197, -1));

        cbStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status Hubungan", "Belum Menikah", "Menikah", "Cerai" }));
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 197, -1));

        inputAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputAlamat.setToolTipText("");
        getContentPane().add(inputAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 197, 30));

        inputKontak.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 200, -1));

        inputTglPeriksa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputTglPeriksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 200, -1));

        cbGoldar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbGoldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Golongan Darah", "A", "AB", "O", "B" }));
        getContentPane().add(cbGoldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 200, -1));

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(51, 102, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/Add Icon.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 155, 60));

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(51, 102, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/Delete Icon.png"))); // NOI18N
        btnHapus.setText("Reset");
        btnHapus.setMaximumSize(new java.awt.Dimension(150, 60));
        btnHapus.setMinimumSize(new java.awt.Dimension(150, 60));
        btnHapus.setPreferredSize(new java.awt.Dimension(150, 60));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 164, -1));

        btnKembali.setBackground(new java.awt.Color(255, 255, 255));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(51, 102, 255));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/Back Button.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setMaximumSize(new java.awt.Dimension(150, 60));
        btnKembali.setMinimumSize(new java.awt.Dimension(150, 60));
        btnKembali.setPreferredSize(new java.awt.Dimension(150, 60));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 163, -1));

        inputIDPasien.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        inputIDPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDPasienActionPerformed(evt);
            }
        });
        getContentPane().add(inputIDPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 197, -1));

        fotoPasien.setBackground(new java.awt.Color(255, 255, 255));
        fotoPasien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(fotoPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 280, 273));

        btnPilihFoto.setBackground(new java.awt.Color(255, 255, 255));
        btnPilihFoto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPilihFoto.setForeground(new java.awt.Color(51, 153, 255));
        btnPilihFoto.setText("Pilih Foto");
        btnPilihFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPilihFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Riwayat Penyakit");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 150, -1));

        inputRiwayatPenyakit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputRiwayatPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 200, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1250, 380));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/Group 3.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rumahsakit", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into datapasien" + "(ID_Pasien, Nama, Usia, Jenis_Kelamin, Status_Hubungan, Alamat, Telp, Golongan_Darah, Tanggal_Periksa, Riwayat_Penyakit, FotoPasien)" + " values(?,?,?,?,?,?,?,?,?,?,?)");
            FileInputStream is = new FileInputStream(new File(s));

            pst.setString(1, inputIDPasien.getText());
            pst.setString(2, inputNama.getText());
            pst.setString(3, inputUsia.getText());
            pst.setString(4, (String) cbJK.getSelectedItem());
            pst.setString(5, (String) cbStatus.getSelectedItem());
            pst.setString(6, inputAlamat.getText());
            pst.setString(7, inputKontak.getText());
            pst.setString(8, (String) cbGoldar.getSelectedItem());
            pst.setString(9, inputTglPeriksa.getText());
            pst.setString(10, inputRiwayatPenyakit.getText());
            pst.setBinaryStream(11, is, (int) s.length());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah ditambahkan!");

            inputIDPasien.setText(null);
            inputNama.setText(null);
            inputUsia.setText(null);
            cbJK.setSelectedIndex(0);
            cbStatus.setSelectedIndex(0);
            inputAlamat.setText(null);
            inputKontak.setText(null);
            cbGoldar.setSelectedIndex(0);
            inputTglPeriksa.setText(null);
            inputRiwayatPenyakit.setText(null);
            fotoPasien.setIcon(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukkan data dengan lengkap dan benar!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        inputIDPasien.setText(null);
        inputNama.setText(null);
        inputUsia.setText(null);
        cbJK.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);
        inputAlamat.setText(null);
        inputKontak.setText(null);
        cbGoldar.setSelectedIndex(0);
        inputTglPeriksa.setText(null);
        inputRiwayatPenyakit.setText(null);
        fotoPasien.setIcon(null);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeAdmin admin = new HomeAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnPilihFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            fotoPasien.setIcon(ResizeImage(path));
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
        }
    }//GEN-LAST:event_btnPilihFotoActionPerformed

    private void inputIDPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDPasienActionPerformed

    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(fotoPasien.getWidth(), fotoPasien.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
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
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPilihFoto;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbGoldar;
    private javax.swing.JComboBox<String> cbJK;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel fotoPasien;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputIDPasien;
    private javax.swing.JTextField inputKontak;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputRiwayatPenyakit;
    private javax.swing.JTextField inputTglPeriksa;
    private javax.swing.JTextField inputUsia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
