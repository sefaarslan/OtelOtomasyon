/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Gui;


import com.erenresortmvn.Dal.tblozellikDAO;
import com.erenresortmvn.Models.tblozellik;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author cesur
 */
public class frmOdaOzellikTanimlama extends javax.swing.JFrame {

    /**
     * Creates new form frmodaozellik
     */
   public static int secilenid;
   public static int secilenid1;
   
    List<tblozellik> odaozellik= new ArrayList<tblozellik>();
   
    tblozellikDAO db= new tblozellikDAO();
    public frmOdaOzellikTanimlama() {
        initComponents();
        
        tblodaozellik.setDefaultEditor(Object.class, null);
       
        odaozellik=db.listele(new tblozellik());
         tabloyukle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuduzenle = new javax.swing.JMenuItem();
        menusil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txticerik = new javax.swing.JTextArea();
        btniptal = new javax.swing.JButton();
        btnyenikayit = new javax.swing.JButton();
        btnkayit = new javax.swing.JButton();
        btnguncelle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblodaozellik = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        menuduzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Update_50px.png"))); // NOI18N
        menuduzenle.setText("menuduzenle");
        menuduzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuduzenleActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuduzenle);

        menusil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Delet.png"))); // NOI18N
        menusil.setText("menusil");
        menusil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menusil);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 131, 215));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("İçerik");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtad.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, -1));

        txticerik.setBackground(new java.awt.Color(153, 153, 153));
        txticerik.setColumns(20);
        txticerik.setRows(5);
        jScrollPane1.setViewportView(txticerik);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 190, 60));

        btniptal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Cancel_50px.png"))); // NOI18N
        btniptal.setText("İptal");
        btniptal.setEnabled(false);
        btniptal.setMaximumSize(new java.awt.Dimension(133, 59));
        btniptal.setMinimumSize(new java.awt.Dimension(133, 59));
        btniptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniptalActionPerformed(evt);
            }
        });
        jPanel1.add(btniptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 60));

        btnyenikayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/New_50px.png"))); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnyenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 60));

        btnkayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Save_50px.png"))); // NOI18N
        btnkayit.setText("Kaydet");
        btnkayit.setEnabled(false);
        btnkayit.setMaximumSize(new java.awt.Dimension(133, 59));
        btnkayit.setMinimumSize(new java.awt.Dimension(133, 59));
        btnkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnkayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 60));

        btnguncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Update_50px.png"))); // NOI18N
        btnguncelle.setText("Güncelle");
        btnguncelle.setEnabled(false);
        btnguncelle.setMaximumSize(new java.awt.Dimension(133, 59));
        btnguncelle.setMinimumSize(new java.awt.Dimension(133, 59));
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });
        jPanel1.add(btnguncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 290, 490));

        tblodaozellik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Ad", "İcerik"
            }
        ));
        tblodaozellik.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tblodaozellik);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 560, 330));

        jPanel2.setBackground(new java.awt.Color(65, 131, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 0, 50, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Odalar İçin Özellik Tanımlama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 570, 50));

        jPanel3.setBackground(new java.awt.Color(75, 119, 190));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/erenresortmvn/Media/Add Database_64px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 80, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("Odaya Özellik Atama  --->");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
        tblozellik temp= new  tblozellik();
     
       temp.setAd(txtad.getText());
         temp.setIcerik(txticerik.getText());
       
       temp.setId(secilenid);
      odaozellik.set(secilenid1, temp);
        db.duzenle(temp);
       tabloyukle();
       btnyenikayit.setEnabled(true);
        btnguncelle.setEnabled(false);
        btniptal.setEnabled(false);
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void menuduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuduzenleActionPerformed
       int secilen = tblodaozellik.getSelectedRow();
       secilenid1=secilen;
         secilenid = Integer.parseInt(tblodaozellik.getValueAt(secilen, 0).toString());
        txtad.setText(tblodaozellik.getValueAt(secilen, 1).toString());
         txticerik.setText(tblodaozellik.getValueAt(secilen,2).toString());
           
        btnkayit.setEnabled(false);
        btnyenikayit.setEnabled(false);
        btnguncelle.setEnabled(true);
        btniptal.setEnabled(true);
    }//GEN-LAST:event_menuduzenleActionPerformed

     public void tablotemizle(){
     DefaultTableModel dmt = (DefaultTableModel)this.tblodaozellik.getModel();
     dmt.getDataVector().removeAllElements();
      this.tblodaozellik.repaint();
    }
     public void satirekle(){
            DefaultTableModel dmt = (DefaultTableModel)this.tblodaozellik.getModel();
            dmt.setRowCount(dmt.getRowCount()+1);
            this.tblodaozellik.repaint();
  }
    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
        btnyenikayit.setEnabled(false);
        btnkayit.setEnabled(true);
        btniptal.setEnabled(true);
        txtac();
    }//GEN-LAST:event_btnyenikayitActionPerformed
public void tabloyukle(){
         int i =0;
        tablotemizle();
       for(tblozellik mst: odaozellik){
        satirekle();
        tblodaozellik.setValueAt(mst.getId(),0+i ,0 );
        tblodaozellik.setValueAt(mst.getAd(),0+i ,1 );
        tblodaozellik.setValueAt(mst.getIcerik(),0+i ,2 );
        
        
        i++;    
       
       }
}
public void txtac()
{
    txtad.setEditable(true);
    txticerik.setEditable(true);
   
  
    
      txtad.setBackground(new java.awt.Color(255, 255, 255));
      txticerik.setBackground(new java.awt.Color(255, 255, 255));
    
    
}
public void txtkapat()
{
    
     txtad.setEditable(false);
    txticerik.setEditable(false);
   
  
    
      txtad.setBackground(new java.awt.Color(153, 153, 153));
      txticerik.setBackground(new java.awt.Color(153, 153, 153));
    
}
    private void btnkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkayitActionPerformed
          if(txtad.getText().equals("")|| txticerik.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Boş alanları doldurun");
       }
       else
       {
            tblozellik tbl= new tblozellik();
           
           tbl.setAd(txtad.getText());
           tbl.setIcerik((txticerik.getText()));
           
           try {
             db.kaydet(tbl);
               odaozellik = db.listele(new tblozellik());
               tabloyukle();
         
             JOptionPane.showMessageDialog(null, "Kayıt Başarı ile Yapıldı");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "bir hata ile karşılaşıldı....:"+ e.toString());
        }
 
           
          
        
       
        
          
       }
    }//GEN-LAST:event_btnkayitActionPerformed

    private void menusilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusilActionPerformed
         int secilen = tblodaozellik.getSelectedRow();
        secilenid = Integer.parseInt(tblodaozellik.getValueAt(secilen, 0).toString());
        int reply = JOptionPane.showConfirmDialog(null, "İlgili Kaydı silmek istiyor musunuz?",
              "UYARI", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try{
            tblozellik oz = db.bul(secilenid, new tblozellik());
            db.sil(oz);
            odaozellik = db.listele(new tblozellik());
            tabloyukle();
            
            JOptionPane.showMessageDialog(null, "Kayıt Başarı ile silinmiştir.");
            
            }catch(Exception ex){
                System.out.println("Hata...:"+ex.toString());
            }
            
        }
        else{
            System.out.println("Silme İşlemi İptal Edilmilştir.");
        }
    }//GEN-LAST:event_menusilActionPerformed
      public void temizle()
      {
          
          txtad.setText("");
          txticerik.setText("");
      }
    private void btniptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniptalActionPerformed
        temizle();
    btnyenikayit.setEnabled(true);
    btnkayit.setEnabled(false);
    btnguncelle.setEnabled(false);
    btniptal.setEnabled(false);
    }//GEN-LAST:event_btniptalActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       frmOdaOzellikAtama frmatama = new frmOdaOzellikAtama();
       frmatama.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(frmOdaOzellikTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOdaOzellikTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOdaOzellikTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOdaOzellikTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOdaOzellikTanimlama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btniptal;
    private javax.swing.JButton btnkayit;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuduzenle;
    private javax.swing.JMenuItem menusil;
    private javax.swing.JTable tblodaozellik;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextArea txticerik;
    // End of variables declaration//GEN-END:variables
}