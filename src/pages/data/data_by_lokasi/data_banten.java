/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.data.data_by_lokasi;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import pages.home_pemilu;

/**
 *
 * @author ilham
 */
public class data_banten extends javax.swing.JFrame {

    /**
     * Creates new form data_banten
     */
    public data_banten() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelcd = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA PENDUDUK BERDASARKAN LOKASI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BANTEN");

        jButton5.setText("KEMBALI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(265, 265, 265))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setText("KOTA TANGERANG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelcd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelcd);

        jButton2.setText("KOTA CILEGON");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KOTA SERANG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("KABUPATEN PANDEGLANG");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("LIHAT GRAFIK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new home_pemilu().setVisible(true);
        dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultTableModel tb= new DefaultTableModel();
            // Memberi nama pada setiap kolom tabel
            tb.addColumn("Nama");
            tb.addColumn("TTL");
            tb.addColumn("Pendidikan");
            tb.addColumn("Kota");
            tb.addColumn("Provinsi");
            tb.addColumn("Tahun Pemilu");
            tb.addColumn("partai");

            tabelcd.setModel(tb);

            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String query = "SELECT * FROM peserta where kota like'%KOTA TANGERANG%'";
            ResultSet rs = s.executeQuery(query);

            while(rs.next()){
                // Mengambil data dari database berdasarkan nama kolom pada tabel
                // Lalu di tampilkan ke dalam JTable
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("ttl"),
                    rs.getString("pendidikan"),
                    rs.getString("kota"),
                    rs.getString("provinsi"),
                    rs.getString("tahun_pemilu"),
                    rs.getString("partai"),

                });;

            }
            rs.close();
            s.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel tb= new DefaultTableModel();
            // Memberi nama pada setiap kolom tabel
            tb.addColumn("Nama");
            tb.addColumn("TTL");
            tb.addColumn("Pendidikan");
            tb.addColumn("Kota");
            tb.addColumn("Provinsi");
            tb.addColumn("Tahun Pemilu");
            tb.addColumn("partai");

            tabelcd.setModel(tb);

            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String query = "SELECT * FROM peserta where kota like'%KOTA CILEGON%'";
            ResultSet rs = s.executeQuery(query);

            while(rs.next()){
                // Mengambil data dari database berdasarkan nama kolom pada tabel
                // Lalu di tampilkan ke dalam JTable
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("ttl"),
                    rs.getString("pendidikan"),
                    rs.getString("kota"),
                    rs.getString("provinsi"),
                    rs.getString("tahun_pemilu"),
                    rs.getString("partai"),

                });;

            }
            rs.close();
            s.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel tb= new DefaultTableModel();
            // Memberi nama pada setiap kolom tabel
            tb.addColumn("Nama");
            tb.addColumn("TTL");
            tb.addColumn("Pendidikan");
            tb.addColumn("Kota");
            tb.addColumn("Provinsi");
            tb.addColumn("Tahun Pemilu");
            tb.addColumn("partai");

            tabelcd.setModel(tb);

            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String query = "SELECT * FROM peserta where kota like'%KOTA SERANG%'";
            ResultSet rs = s.executeQuery(query);

            while(rs.next()){
                // Mengambil data dari database berdasarkan nama kolom pada tabel
                // Lalu di tampilkan ke dalam JTable
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("ttl"),
                    rs.getString("pendidikan"),
                    rs.getString("kota"),
                    rs.getString("provinsi"),
                    rs.getString("tahun_pemilu"),
                    rs.getString("partai"),

                });;

            }
            rs.close();
            s.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel tb= new DefaultTableModel();
            // Memberi nama pada setiap kolom tabel
            tb.addColumn("Nama");
            tb.addColumn("TTL");
            tb.addColumn("Pendidikan");
            tb.addColumn("Kota");
            tb.addColumn("Provinsi");
            tb.addColumn("Tahun Pemilu");
            tb.addColumn("partai");

            tabelcd.setModel(tb);

            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String query = "SELECT * FROM peserta where kota like'%KABUPATEN PANDEGLANG%'";
            ResultSet rs = s.executeQuery(query);

            while(rs.next()){
                // Mengambil data dari database berdasarkan nama kolom pada tabel
                // Lalu di tampilkan ke dalam JTable
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("ttl"),
                    rs.getString("pendidikan"),
                    rs.getString("kota"),
                    rs.getString("provinsi"),
                    rs.getString("tahun_pemilu"),
                    rs.getString("partai"),

                });;

            }
            rs.close();
            s.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
           String kotTangerang= "0";
           String kotCilegon= "0";
           String kotSerang= "0";
           String kabPandeglang= "0";
           
           Connection c = koneksi.getKoneksi();
           Statement s = c.createStatement();
           
           
           String query = "SELECT COUNT(*) AS total FROM peserta WHERE kota LIKE '%KOTA TANGERANG%'";
           ResultSet rs = s.executeQuery(query);

           if(rs.next()) {
           kotTangerang = rs.getString("total");
           }
           
           Statement s2 = c.createStatement();
           String query2 = "SELECT COUNT(*) AS total2 FROM peserta WHERE kota LIKE '%KOTA CILEGON%'";
           ResultSet rs2 = s2.executeQuery(query2);
           
            if(rs2.next()) {
           kotCilegon = rs2.getString("total2");
           }
           
           Statement s3 = c.createStatement();
           String query3 = "SELECT COUNT(*) AS total3 FROM peserta WHERE kota LIKE '%KOTA SERANG%'";
           ResultSet rs3 = s3.executeQuery(query3);
           
            if(rs3.next()) {
           kotSerang = rs3.getString("total3");
           }
            
           Statement s4 = c.createStatement();
           String query4 = "SELECT COUNT(*) AS total4 FROM peserta WHERE kota LIKE '%KABUPATEN PANDEGLANG%'";
           ResultSet rs4 = s4.executeQuery(query4);
           
            if(rs4.next()) {
           kabPandeglang = rs4.getString("total4");
           }
           
           
           DefaultCategoryDataset obj = new DefaultCategoryDataset();
            obj.setValue(parseInt(kotTangerang),"BANTEN","TANGERANG");
            obj.setValue(parseInt(kotCilegon),"BANTEN","CILEGON");
            obj.setValue(parseInt(kotSerang),"BANTEN","SERANG");
            obj.setValue(parseInt(kabPandeglang),"BANTEN","PANDEGLANG");

            JFreeChart chart = ChartFactory.createBarChart("BANTEN", null, null, obj, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            CategoryPlot objPlot = chart.getCategoryPlot();
            objPlot.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Grafik batang",chart);
            frame.setSize(800,500);
            frame.setVisible(true);
           
       } 
       catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(data_banten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_banten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_banten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_banten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_banten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelcd;
    // End of variables declaration//GEN-END:variables
}
