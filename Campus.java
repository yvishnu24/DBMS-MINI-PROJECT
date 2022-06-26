/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Campus extends javax.swing.JFrame {

    /**
     * Creates new form Campus
     */
    public Campus() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        c_insert = new javax.swing.JMenuItem();
        C_update = new javax.swing.JMenuItem();
        c_delete = new javax.swing.JMenuItem();
        c_view = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Block_insert = new javax.swing.JMenuItem();
        Block_update = new javax.swing.JMenuItem();
        Block_delete = new javax.swing.JMenuItem();
        Block_view = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        s_insert = new javax.swing.JMenuItem();
        slot_update = new javax.swing.JMenuItem();
        s_View = new javax.swing.JMenuItem();
        percent = new javax.swing.JMenu();
        Percentage = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setText("   Select from Menu Bar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainPage");

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel4.setText("CAMPUS DATABASE FOR PARKING MANAGMENT\n");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 80, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Y.VISHNU TEJA\\Downloads\\campus2_1.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 400);

        jMenu1.setText("Campus");

        c_insert.setText("Insert");
        c_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_insertActionPerformed(evt);
            }
        });
        jMenu1.add(c_insert);

        C_update.setText("Update");
        C_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_updateActionPerformed(evt);
            }
        });
        jMenu1.add(C_update);

        c_delete.setText("Delete");
        c_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_deleteActionPerformed(evt);
            }
        });
        jMenu1.add(c_delete);

        c_view.setText("View");
        c_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_viewActionPerformed(evt);
            }
        });
        jMenu1.add(c_view);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Block");

        Block_insert.setText("Insert");
        Block_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_insertActionPerformed(evt);
            }
        });
        jMenu2.add(Block_insert);

        Block_update.setText("Update");
        Block_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_updateActionPerformed(evt);
            }
        });
        jMenu2.add(Block_update);

        Block_delete.setText("Delete");
        Block_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_deleteActionPerformed(evt);
            }
        });
        jMenu2.add(Block_delete);

        Block_view.setText("View");
        Block_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_viewActionPerformed(evt);
            }
        });
        jMenu2.add(Block_view);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Slot");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        s_insert.setText("Insert");
        s_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_insertActionPerformed(evt);
            }
        });
        jMenu4.add(s_insert);

        slot_update.setText("update");
        slot_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot_updateActionPerformed(evt);
            }
        });
        jMenu4.add(slot_update);

        s_View.setText("View");
        s_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_ViewActionPerformed(evt);
            }
        });
        jMenu4.add(s_View);

        jMenuBar1.add(jMenu4);

        percent.setText("Percentage");

        Percentage.setText("Percentage");
        Percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentageActionPerformed(evt);
            }
        });
        percent.add(Percentage);

        jMenuBar1.add(percent);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_insertActionPerformed
        // TODO add your handling code here:
        Campus_insert ci=new Campus_insert();
        ci.show();
        
        dispose();
    }//GEN-LAST:event_c_insertActionPerformed

    private void Block_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_updateActionPerformed
        // TODO add your handling code here:
        Block_Update bu=new Block_Update();
        bu.show();
        dispose();
        
    }//GEN-LAST:event_Block_updateActionPerformed

    private void Block_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_insertActionPerformed
        // TODO add your handling code here:
        Block_insert bi=new Block_insert();
        bi.show();
        
        dispose();
        
        
    }//GEN-LAST:event_Block_insertActionPerformed

    private void C_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_updateActionPerformed
        // TODO add your handling code here:
        Campus_Update cu=new Campus_Update();
        cu.show();
        
        dispose();
    }//GEN-LAST:event_C_updateActionPerformed

    private void c_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_deleteActionPerformed
        // TODO add your handling code here:
        Campus_Delete cd=new Campus_Delete();
        cd.show();
        
        dispose();
    }//GEN-LAST:event_c_deleteActionPerformed

    private void c_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_viewActionPerformed
        // TODO add your handling code here:
        Campus_view cv=new Campus_view();
        cv.show();
        
        dispose();
    }//GEN-LAST:event_c_viewActionPerformed

    private void PercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentageActionPerformed
        // TODO add your handling code here:
        Percentage p=new Percentage();
        p.show();
        dispose();        
    }//GEN-LAST:event_PercentageActionPerformed

    private void Block_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_viewActionPerformed
        // TODO add your handling code here:
        Block_View b_v=new Block_View();
        b_v.show();
        dispose();
        
        
        
    }//GEN-LAST:event_Block_viewActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void s_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_insertActionPerformed
        // TODO add your handling code here:
        Slot_insert si=new Slot_insert();
        si.show();
        dispose();
    }//GEN-LAST:event_s_insertActionPerformed

    private void slot_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot_updateActionPerformed
        // TODO add your handling code here:
        Slot_update su=new Slot_update();
        su.show();
        dispose();
    }//GEN-LAST:event_slot_updateActionPerformed

    private void s_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_ViewActionPerformed
        // TODO add your handling code here:
        Slot_view sv=new Slot_view();
        sv.show();
        dispose();
    }//GEN-LAST:event_s_ViewActionPerformed

    private void Block_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_deleteActionPerformed
        // TODO add your handling code here:
        Block_Delete b_d=new Block_Delete();
        b_d.show();
        dispose();
        
        
    }//GEN-LAST:event_Block_deleteActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("com.formdev.flatlaf.FlatDarkLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Block_delete;
    private javax.swing.JMenuItem Block_insert;
    private javax.swing.JMenuItem Block_update;
    private javax.swing.JMenuItem Block_view;
    private javax.swing.JMenuItem C_update;
    private javax.swing.JMenuItem Percentage;
    private javax.swing.JMenuItem c_delete;
    private javax.swing.JMenuItem c_insert;
    private javax.swing.JMenuItem c_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu percent;
    private javax.swing.JMenuItem s_View;
    private javax.swing.JMenuItem s_insert;
    private javax.swing.JMenuItem slot_update;
    // End of variables declaration//GEN-END:variables
}
