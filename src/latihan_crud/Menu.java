package latihan_crud;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    // membuat objek baru dari class Login yang sudah terkoneksi dengan database
    Login login = new Login();

    /**
     * Creates new form Menu
     */
    public Menu() {
        // mengecek sudah login atau belum
        // jika belum login akan di redirect ke form login
        if (Session.getStatusLogin() == "AKTIF") {
            initComponents();
            setSessionNama();
        } else {
            // menutup menu tanpa keluar dari aplikasi
            dispose();
            // memanggil form login
            LoginForm form = new LoginForm();
            form.setVisible(true);
        }
    }

    private void setSessionNama() {
        label_nama.setText("Hai " + Session.getNama());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        label_nama = new javax.swing.JLabel();
        label_keterangan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuAplikasiBar = new javax.swing.JMenuBar();
        jMenuAplikasi = new javax.swing.JMenu();
        jMenuKeluar = new javax.swing.JMenuItem();
        jMenuCRUD = new javax.swing.JMenu();
        jMenuCRUDSiswa = new javax.swing.JMenuItem();
        jMenuPolimorfisme = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        label_nama.setText("Hai User");

        label_keterangan.setText("Selamat datang di Aplikasi Praktikum PBO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat.png"))); // NOI18N

        jMenuAplikasi.setText("Aplikasi");

        jMenuKeluar.setText("Keluar");
        jMenuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKeluarActionPerformed(evt);
            }
        });
        jMenuAplikasi.add(jMenuKeluar);

        jMenuAplikasiBar.add(jMenuAplikasi);

        jMenuCRUD.setText("CRUD");

        jMenuCRUDSiswa.setText("CRUD Siswa");
        jMenuCRUDSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCRUDSiswaActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuCRUDSiswa);

        jMenuAplikasiBar.add(jMenuCRUD);

        jMenuPolimorfisme.setText("Polimorfisme");
        jMenuAplikasiBar.add(jMenuPolimorfisme);

        setJMenuBar(jMenuAplikasiBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nama)
                            .addComponent(label_keterangan)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label_nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_keterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKeluarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            login.Logout(Session.getUserID());
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuKeluarActionPerformed

    private void jMenuCRUDSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCRUDSiswaActionPerformed
        // TODO add your handling code here:
        try {
            // memanggil form siswa
            Form_Siswa form = new Form_Siswa();
            form.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jMenuCRUDSiswaActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenuAplikasi;
    private javax.swing.JMenuBar jMenuAplikasiBar;
    private javax.swing.JMenu jMenuCRUD;
    private javax.swing.JMenuItem jMenuCRUDSiswa;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuKeluar;
    private javax.swing.JMenu jMenuPolimorfisme;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel label_keterangan;
    private javax.swing.JLabel label_nama;
    // End of variables declaration//GEN-END:variables
}
