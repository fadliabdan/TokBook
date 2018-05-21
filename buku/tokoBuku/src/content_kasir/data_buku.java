/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content_kasir;

import inc.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Fadli Abdan Syakur
 */
public class data_buku extends javax.swing.JInternalFrame {
    
    Connection conn= config.Conn();
    Statement st;
    ResultSet rs;
     
    private void tampil(){
         DefaultTableModel model= new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Judul");
        model.addColumn("No. Isbn");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun");
        model.addColumn("Harga Pokok");
        model.addColumn("Harga JUal");
        model.addColumn("PPN");
        model.addColumn("Diskon");
        try{
            String sql="select * from buku";
            st= conn.createStatement();
            rs= st.executeQuery(sql);
            
            int no=0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_buku"), rs.getString("judul"), rs.getString("noisbn"), rs.getString("penulis"), rs.getString("penerbit"), rs.getString("tahun"), rs.getString("harga_pokok"), rs.getString("harga_jual"), rs.getString("ppn"), rs.getString("diskon")
                });
            }tData.setModel(model);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
        private void bersih(){
            tId.setText("");
            tJudul.setText("");
            tIsbn.setText("");
            tPenulis.setText("");
            tPenerbit.setText("");
            tTahun.setText("");
            tHarpok.setText("");
            tHarjul.setText("");
            tPpn.setText("");
            tDiskon.setText("");
            tId.setEditable(true);
    }
    /**
     * Creates new form data_buku
     */
    public data_buku() {
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
        jLabel11 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tJudul = new javax.swing.JTextField();
        tIsbn = new javax.swing.JTextField();
        tPenulis = new javax.swing.JTextField();
        tPenerbit = new javax.swing.JTextField();
        tTahun = new javax.swing.JTextField();
        tHarpok = new javax.swing.JTextField();
        tHarjul = new javax.swing.JTextField();
        tPpn = new javax.swing.JTextField();
        tDiskon = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Downloads\\icons8-literature-64.png")); // NOI18N
        jLabel1.setText("Data Buku");

        jLabel2.setText("Id");

        jLabel3.setText("Judul");

        jLabel4.setText("No.Isbn");

        jLabel5.setText("Penulis");

        jLabel6.setText("Penerbit");

        jLabel7.setText("Tahun");

        jLabel8.setText("Harga Pokok");

        jLabel9.setText("Harga Jual");

        jLabel10.setText("PPN");

        jLabel11.setText("Diskon");

        tId.setEditable(false);

        bSimpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Downloads\\icons8-save-as-10.png")); // NOI18N
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bUbah.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Downloads\\icons8-edit-property-10 (1).png")); // NOI18N
        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Downloads\\icons8-trash-10.png")); // NOI18N
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Downloads\\icons8-synchronize-filled-10.png")); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Id", "Judul", "No.Isbn", "Penulis", "Penerbit", "Tahun", "Harga Pokok", "Harga Jual", "PPN", "Diskon"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tData);

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tCariKeyPressed(evt);
            }
        });

        jLabel12.setText("Pencarian");

        jLabel13.setText("Stok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(bUbah))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bHapus)
                                .addGap(18, 18, 18)
                                .addComponent(bReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(tIsbn)
                                    .addComponent(tPenulis)
                                    .addComponent(tPenerbit)
                                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(tPpn)
                                    .addComponent(tHarjul)
                                    .addComponent(tHarpok)
                                    .addComponent(tTahun))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(63, 63, 63)
                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tHarpok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tHarjul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tPpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSimpan)
                            .addComponent(bUbah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bHapus)
                            .addComponent(bReset)))
                    .addComponent(jScrollPane1))
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql= "insert into buku values(NULL, '"+tJudul.getText()+"', '"+tIsbn.getText()+"', '"+tPenulis.getText()+"', '"+tPenerbit.getText()+"', '"+tTahun.getText()+"', '"+stok.getText()+"', '"+tHarpok.getText()+"', '"+tHarjul.getText()+"', '"+tPpn.getText()+"', '"+tDiskon.getText()+"')";
            st= conn.createStatement();
            st.executeUpdate(sql);
            
              bersih();
              tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bResetActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        // TODO add your handling code here:
        int baris= tData.getSelectedRow();
        tId.setText(tData.getModel().getValueAt(baris, 1).toString());
        tJudul.setText(tData.getModel().getValueAt(baris, 2).toString());
        tIsbn.setText(tData.getModel().getValueAt(baris, 3).toString());
        tPenulis.setText(tData.getModel().getValueAt(baris, 4).toString());
        tPenerbit.setText(tData.getModel().getValueAt(baris, 5).toString());
        tTahun.setText(tData.getModel().getValueAt(baris, 6).toString());
        tHarpok.setText(tData.getModel().getValueAt(baris, 7).toString());
        tHarjul.setText(tData.getModel().getValueAt(baris, 8).toString());
        tPpn.setText(tData.getModel().getValueAt(baris, 9).toString());
        tDiskon.setText(tData.getModel().getValueAt(baris, 10).toString());
    }//GEN-LAST:event_tDataMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_formInternalFrameOpened

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        try{
            String sql= "update buku set judul= '"+tJudul.getText()+"', noisbn='"+tIsbn.getText()+"', penulis='"+tPenulis.getText()+"', penerbit='"+tPenerbit.getText()+"', tahun='"+tTahun.getText()+"', harga_pokok='"+tHarpok.getText()+"', harga_jual='"+tHarjul.getText()+"', ppn='"+tPpn.getText()+"', diskon='"+tDiskon.getText()+"' where id_buku='"+ tId.getText()+"'";
            st= conn.createStatement(); 
            st.executeUpdate(sql);
            
              bersih();
              tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql= "delete from buku where id_buku='"+ tId.getText()+"'";
            st= conn.createStatement();
            st.executeUpdate(sql);
            
              bersih();
              tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void tCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyPressed
        // TODO add your handling code here:
         DefaultTableModel model= new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Judul");
        model.addColumn("No. Isbn");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun");
        model.addColumn("Harga Pokok");
        model.addColumn("Harga JUal");
        model.addColumn("PPN");
        model.addColumn("Diskon");
        
        try{
            String sql="select * from buku where id_buku like '%"+tCari.getText()+"%' or judul like '%"+tCari.getText()+"%' or noisbn like '%"+tCari.getText()+"%' or penulis like '%"+tCari.getText()+"%' or penerbit like '%"+tCari.getText()+"%'or tahun like '%"+tCari.getText()+"%'or stok like '%"+tCari.getText()+"%'or harga_pokok like '%"+tCari.getText()+"%'or harga_jual like '%"+tCari.getText()+"%'or ppn like '%"+tCari.getText()+"%'or diskon like '%"+tCari.getText()+"%'";
            st= conn.createStatement();
            rs= st.executeQuery(sql);
            
            int no=0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_buku"), rs.getString("judul"), rs.getString("noisbn"), rs.getString("penulis"), rs.getString("penerbit"), rs.getString("tahun"), rs.getString("stok"), rs.getString("harga_pokok"), rs.getString("harga_jual"), rs.getString("ppn"), rs.getString("diskon")
                });
            }
            tData.setModel(model);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tCariKeyPressed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stok;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tDiskon;
    private javax.swing.JTextField tHarjul;
    private javax.swing.JTextField tHarpok;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tIsbn;
    private javax.swing.JTextField tJudul;
    private javax.swing.JTextField tPenerbit;
    private javax.swing.JTextField tPenulis;
    private javax.swing.JTextField tPpn;
    private javax.swing.JTextField tTahun;
    // End of variables declaration//GEN-END:variables
}
