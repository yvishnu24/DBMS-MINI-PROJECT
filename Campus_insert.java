

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Campus_insert extends javax.swing.JFrame {

    
    public Campus_insert() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_Collegeid = new javax.swing.JTextField();
        JTF_College_Name = new javax.swing.JTextField();
        JTF_address = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campus_view = new javax.swing.JTable();
        JB_View = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CI_back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Campus_insert = new javax.swing.JMenuItem();
        Campus_update = new javax.swing.JMenuItem();
        Campus_delete = new javax.swing.JMenuItem();
        Campus_View = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Block_insert = new javax.swing.JMenuItem();
        Campus_Update = new javax.swing.JMenuItem();
        Block_Delete = new javax.swing.JMenuItem();
        Block_view = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Insert = new javax.swing.JMenuItem();
        PL_update = new javax.swing.JMenuItem();
        PL_delete = new javax.swing.JMenuItem();
        PL_view = new javax.swing.JMenuItem();
        Slot_menu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Campus Details");
        setBackground(new java.awt.Color(3, 252, 236));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("College Id        :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("College Name  :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Address           :");

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Campus_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "College Name", "Address", "College Id "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Campus_view);
        if (Campus_view.getColumnModel().getColumnCount() > 0) {
            Campus_view.getColumnModel().getColumn(0).setResizable(false);
            Campus_view.getColumnModel().getColumn(1).setResizable(false);
            Campus_view.getColumnModel().getColumn(2).setResizable(false);
        }

        JB_View.setText("View");
        JB_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ViewActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Insert  the College Details");
        jLabel4.setToolTipText("");

        CI_back.setText("Back");
        CI_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CI_backActionPerformed(evt);
            }
        });

        jMenu1.setText("Campus");

        Campus_insert.setText("Insert");
        Campus_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campus_insertActionPerformed(evt);
            }
        });
        jMenu1.add(Campus_insert);

        Campus_update.setText("Update");
        Campus_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campus_updateActionPerformed(evt);
            }
        });
        jMenu1.add(Campus_update);

        Campus_delete.setText("Delete");
        Campus_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campus_deleteActionPerformed(evt);
            }
        });
        jMenu1.add(Campus_delete);

        Campus_View.setText("View");
        Campus_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campus_ViewActionPerformed(evt);
            }
        });
        jMenu1.add(Campus_View);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Block");

        Block_insert.setText("Insert");
        Block_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_insertActionPerformed(evt);
            }
        });
        jMenu2.add(Block_insert);

        Campus_Update.setText("Update");
        jMenu2.add(Campus_Update);

        Block_Delete.setText("Delete");
        jMenu2.add(Block_Delete);

        Block_view.setText("View");
        jMenu2.add(Block_view);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Parking_lot");

        Insert.setText("Insert");
        jMenu3.add(Insert);

        PL_update.setText("Update");
        jMenu3.add(PL_update);

        PL_delete.setText("Delete");
        jMenu3.add(PL_delete);

        PL_view.setText("View");
        jMenu3.add(PL_view);

        jMenuBar1.add(jMenu3);

        Slot_menu.setText("Slot");

        jMenuItem13.setText("Insert");
        Slot_menu.add(jMenuItem13);

        jMenuItem14.setText("Update");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        Slot_menu.add(jMenuItem14);

        jMenuItem15.setText("jMenuItem15");
        Slot_menu.add(jMenuItem15);

        jMenuBar1.add(Slot_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_View, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_Collegeid)
                    .addComponent(JTF_College_Name)
                    .addComponent(JTF_address, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CI_back)
                .addGap(75, 75, 75)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CI_back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Collegeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_College_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_View, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con =null;
        try
        {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vishnu", "vasavi");
            
            Statement stmt = con.createStatement();
            String query= "INSERT INTO campus VALUES(" + JTF_Collegeid.getText() + ","+ "'" +JTF_College_Name.getText() +"',"+ "'"+JTF_address.getText() +"')";
            int i = stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Inserted Suucesfully !!!");
            System .out.println("Inserted ....");
            
            stmt.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ViewActionPerformed
        // TODO add your handling code here:
          Connection con =null;
        try
        {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vishnu", "vasavi");
            
            
            
            Statement stmt = con.createStatement();
            ResultSet Rs = stmt.executeQuery("select * from Campus");
            DefaultTableModel model = (DefaultTableModel)Campus_view.getModel();

            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt("College_id"), Rs.getString("College_Name"),Rs.getString("Address")});
            }

            System.out.println("Values retrived");
        
        //stmt.close();
        con.close();
        
            

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_ViewActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void Campus_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campus_insertActionPerformed
        // TODO add your handling code here:
        Campus_insert ci=new Campus_insert();
        ci.show();
        
        dispose();
    }//GEN-LAST:event_Campus_insertActionPerformed

    private void Campus_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campus_updateActionPerformed
        // TODO add your handling code here:
        Campus_Update cu=new Campus_Update();
        cu.show();
        dispose();
    }//GEN-LAST:event_Campus_updateActionPerformed

    private void Campus_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campus_deleteActionPerformed
        // TODO add your handling code here:
        Campus_Delete cd= new Campus_Delete();
        cd.show();
        dispose();
    }//GEN-LAST:event_Campus_deleteActionPerformed

    private void Campus_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campus_ViewActionPerformed
        // TODO add your handling code here:
        Campus_view cv=new Campus_view();
        cv.show();
        dispose();
        
    }//GEN-LAST:event_Campus_ViewActionPerformed

    private void Block_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_insertActionPerformed
        // TODO add your handling code here:
        Block_insert bi=new Block_insert();
        bi.show();
        dispose();
    }//GEN-LAST:event_Block_insertActionPerformed

    private void CI_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CI_backActionPerformed
        // TODO add your handling code here:
        Campus c_b=new Campus();
        c_b.show();
        dispose();
        
    }//GEN-LAST:event_CI_backActionPerformed

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
                if ("com.formdev.flatlaf.FlatDarkLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Campus_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campus_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campus_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campus_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campus_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Block_Delete;
    private javax.swing.JMenuItem Block_insert;
    private javax.swing.JMenuItem Block_view;
    private javax.swing.JButton CI_back;
    private javax.swing.JMenuItem Campus_Update;
    private javax.swing.JMenuItem Campus_View;
    private javax.swing.JMenuItem Campus_delete;
    private javax.swing.JMenuItem Campus_insert;
    private javax.swing.JMenuItem Campus_update;
    private javax.swing.JTable Campus_view;
    private javax.swing.JMenuItem Insert;
    private javax.swing.JButton JB_View;
    private javax.swing.JTextField JTF_College_Name;
    private javax.swing.JTextField JTF_Collegeid;
    private javax.swing.JTextField JTF_address;
    private javax.swing.JMenuItem PL_delete;
    private javax.swing.JMenuItem PL_update;
    private javax.swing.JMenuItem PL_view;
    private javax.swing.JMenu Slot_menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
