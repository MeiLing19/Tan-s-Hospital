/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Coba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class InfoPasien extends javax.swing.JFrame {

    /**
     * Creates new form InfoPasien
     */
    public InfoPasien() {
        initComponents();
        showTableData();
    }

    public void showTableData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rumahsakit", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM rumahsakit.datapasien");
            ResultSet rs = pst.executeQuery();
            Tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Koneksi gagal!");
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

        inputTglPeriksa = new javax.swing.JTextField();
        cbGoldar = new javax.swing.JComboBox<>();
        inputIDPasien = new javax.swing.JTextField();
        inputRiwayatPenyakit = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputUsia = new javax.swing.JTextField();
        cbJK = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        inputAlamat = new javax.swing.JTextField();
        inputKontak = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputTglPeriksa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputTglPeriksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, 190, -1));

        cbGoldar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbGoldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Golongan Darah", "A", "AB", "O", "B" }));
        getContentPane().add(cbGoldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 190, -1));

        inputIDPasien.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        getContentPane().add(inputIDPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 197, -1));

        inputRiwayatPenyakit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputRiwayatPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 190, -1));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCari.setForeground(new java.awt.Color(51, 153, 255));
        btnCari.setText("Cari");
        btnCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCari.setMaximumSize(new java.awt.Dimension(64, 36));
        btnCari.setMinimumSize(new java.awt.Dimension(64, 36));
        btnCari.setPreferredSize(new java.awt.Dimension(64, 36));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnCariKeyReleased(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 137, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA PASIEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 270, -1));

        btnKembali.setBackground(new java.awt.Color(255, 255, 255));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(51, 153, 255));
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/Back Button.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorder(null);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 160, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("ID Pasien");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        btnUbah.setBackground(new java.awt.Color(255, 255, 255));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(51, 153, 255));
        btnUbah.setText("Ubah Data");
        btnUbah.setMaximumSize(new java.awt.Dimension(140, 50));
        btnUbah.setMinimumSize(new java.awt.Dimension(140, 50));
        btnUbah.setPreferredSize(new java.awt.Dimension(140, 50));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 180, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(51, 153, 255));
        btnHapus.setText("Hapus Data");
        btnHapus.setMaximumSize(new java.awt.Dimension(140, 50));
        btnHapus.setMinimumSize(new java.awt.Dimension(140, 50));
        btnHapus.setPreferredSize(new java.awt.Dimension(140, 50));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 170, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Usia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 37, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 123, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Status Hubungan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 73, -1));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 1180, 190));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("No Hp/Telp");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 104, -1));

        inputNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 197, -1));

        inputUsia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputUsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 197, -1));

        cbJK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-laki", "Perempuan" }));
        getContentPane().add(cbJK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 197, -1));

        cbStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status Hubungan", "Belum Menikah", "Menikah", "Cerai" }));
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 197, -1));

        inputAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputAlamat.setToolTipText("");
        getContentPane().add(inputAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 197, -1));

        inputKontak.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(inputKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 200, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Riwayat Penyakit");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Tanggal Periksa");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Golongan Darah");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 142, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1180, 210));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setForeground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coba/DataBg.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rumahsakit", "root", "");
            PreparedStatement pst = conn.prepareStatement("Update datapasien set ID_Pasien= ?, Nama=?, Usia=?, Jenis_Kelamin=?, Status_Hubungan=?, Alamat=?, Telp=?, Golongan_Darah=?, Tanggal_Periksa=?, Riwayat_Penyakit=? where ID_Pasien=?");

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
            pst.setString(11, inputIDPasien.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah diubah!");

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukkan data sesuai format!");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rumahsakit", "root", "");
            PreparedStatement pst = conn.prepareStatement("Delete from datapasien where ID_Pasien = '" + inputIDPasien.getText() + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data telah dihapus!");

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukkan data sesuai format!");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeAdmin admin = new HomeAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table=(DefaultTableModel)Tabel.getModel();
        String cari=btnCari.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        Tabel.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(cari));
    }//GEN-LAST:event_btnCariKeyReleased

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try {
            String idPasien = inputIDPasien.getText();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rumahsakit", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM datapasien where ID_Pasien = '" + idPasien + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String Nama = rs.getString("Nama");
                inputNama.setText(Nama);
                String Usia = rs.getString("Usia");
                inputUsia.setText(Usia);
                String jk = rs.getString("Jenis_Kelamin");
                cbJK.setSelectedItem(jk);
                String sh = rs.getString("Status_Hubungan");
                cbStatus.setSelectedItem(sh);
                String Alamat = rs.getString("Alamat");
                inputAlamat.setText(Alamat);
                String Kontak = rs.getString("Telp");
                inputKontak.setText(Kontak);
                String goldar = rs.getString("Golongan_Darah");
                cbGoldar.setSelectedItem(goldar);
                String Periksa = rs.getString("Tanggal_Periksa");
                inputTglPeriksa.setText(Periksa);
                String rp = rs.getString("Riwayat_Penyakit");
                inputRiwayatPenyakit.setText(rp);
            } else {
                JOptionPane.showMessageDialog(null, "ID tidak ditemukan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukkan data sesuai format!");
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
        int SelectedRow = Tabel.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) Tabel.getModel();
        inputIDPasien.setText(table.getValueAt(SelectedRow, 0).toString());
        inputNama.setText(table.getValueAt(SelectedRow, 1).toString());
        inputUsia.setText(table.getValueAt(SelectedRow, 2).toString());
        cbJK.setSelectedItem(table.getValueAt(SelectedRow, 3).toString());
        cbStatus.setSelectedItem(table.getValueAt(SelectedRow, 4).toString());
        inputAlamat.setText(table.getValueAt(SelectedRow, 5).toString());
        inputKontak.setText(table.getValueAt(SelectedRow, 6).toString());
        cbGoldar.setSelectedItem(table.getValueAt(SelectedRow, 7).toString());
        inputTglPeriksa.setText(table.getValueAt(SelectedRow, 8).toString());
        inputRiwayatPenyakit.setText(table.getValueAt(SelectedRow, 9).toString());
    }//GEN-LAST:event_TabelMouseClicked

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
            java.util.logging.Logger.getLogger(InfoPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbGoldar;
    private javax.swing.JComboBox<String> cbJK;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputIDPasien;
    private javax.swing.JTextField inputKontak;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputRiwayatPenyakit;
    private javax.swing.JTextField inputTglPeriksa;
    private javax.swing.JTextField inputUsia;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}