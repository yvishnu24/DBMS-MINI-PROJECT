
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Block_insert extends javax.swing.JFrame {

    /**
     * Creates new form Block_insert
     */
    public Block_insert() {
        initComponents();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_block_id = new javax.swing.JTextField();
        JTF_block_name = new javax.swing.JTextField();
        JTF_college_id = new javax.swing.JTextField();
        JB_Block_insert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Block_view = new javax.swing.JTable();
        JB_Block_view = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmenu = new javax.swing.JMenu();
        Jmenu_insert = new javax.swing.JMenuItem();
        Campus_update = new javax.swing.JMenuItem();
        Campus_delete = new javax.swing.JMenuItem();
        Campus_view = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Block_insert = new javax.swing.JMenuItem();
        Block_update = new javax.swing.JMenuItem();
        Block_delete = new javax.swing.JMenuItem();
        BlockView = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Block Insertion");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Block Id       :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Block Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("College_id   :");

        JTF_block_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_block_nameActionPerformed(evt);
            }
        });

        JTF_college_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_college_idActionPerformed(evt);
            }
        });

        JB_Block_insert.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JB_Block_insert.setText("Insert");
        JB_Block_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Block_insertActionPerformed(evt);
            }
        });

        Block_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Block ID", "Block Name", "College_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Block_view);

        JB_Block_view.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JB_Block_view.setText("View");
        JB_Block_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Block_viewActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Enter the details to Insert");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Jmenu.setText("Campus");

        Jmenu_insert.setText("Insert");
        Jmenu_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmenu_insertActionPerformed(evt);
            }
        });
        Jmenu.add(Jmenu_insert);

        Campus_update.setText("Update");
        Jmenu.add(Campus_update);

        Campus_delete.setText("Delete");
        Jmenu.add(Campus_delete);

        Campus_view.setText("View");
        Campus_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campus_viewActionPerformed(evt);
            }
        });
        Jmenu.add(Campus_view);

        jMenuBar1.add(Jmenu);

        jMenu2.setText("Block");

        Block_insert.setText("Insert");
        jMenu2.add(Block_insert);

        Block_update.setText("Update");
        jMenu2.add(Block_update);

        Block_delete.setText("Delete");
        jMenu2.add(Block_delete);

        BlockView.setText("View");
        jMenu2.add(BlockView);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Parking Slot");

        jMenuItem9.setText("Insert");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Update");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Delete");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("View");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Slot");

        jMenuItem13.setText("Insert");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Update");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Delete");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("View");
        jMenu4.add(jMenuItem16);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_block_id)
                            .addComponent(JTF_block_name)
                            .addComponent(JTF_college_id, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(JB_Block_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_Block_view, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_block_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_block_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_college_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Block_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Block_view, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_block_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_block_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_block_nameActionPerformed

    private void Campus_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campus_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campus_viewActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void JB_Block_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Block_insertActionPerformed
        // TODO add your handling code here:
        Connection con =null;
        try
        {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vishnu", "vasavi");
            
            Statement stmt = con.createStatement();
            String query= "INSERT INTO block VALUES(" + "'"+JTF_block_id.getText() +"'" + ","+ "'" +JTF_block_name.getText() +"',"+ "'"+JTF_college_id.getText() +"')";
            int i = stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Inserted Succesfully !!!!");

            System .out.println("Inserted ....");
            
            stmt.close();
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_Block_insertActionPerformed

    private void JTF_college_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_college_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_college_idActionPerformed

    private void JB_Block_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Block_viewActionPerformed
        // TODO add your handling code here:
        Connection con =null;
        try
        {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vishnu", "vasavi");
            
            
            
            Statement stmt = con.createStatement();
            ResultSet Rs = stmt.executeQuery("select * from block");
            DefaultTableModel model = (DefaultTableModel)Block_view.getModel();

            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("block_id"), Rs.getString("block_Name"),Rs.getInt("College_id")});
            }

            System.out.println("Values retrived");
        
        //stmt.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_Block_viewActionPerformed

    private void Jmenu_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmenu_insertActionPerformed
        // TODO add your handling code here:
        Campus_insert ci=new Campus_insert();
        ci.show();
        dispose();
    }//GEN-LAST:event_Jmenu_insertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Campus c_b=new Campus();
        c_b.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Block_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Block_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Block_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Block_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Block_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BlockView;
    private javax.swing.JMenuItem Block_delete;
    private javax.swing.JMenuItem Block_insert;
    private javax.swing.JMenuItem Block_update;
    private javax.swing.JTable Block_view;
    private javax.swing.JMenuItem Campus_delete;
    private javax.swing.JMenuItem Campus_update;
    private javax.swing.JMenuItem Campus_view;
    private javax.swing.JButton JB_Block_insert;
    private javax.swing.JButton JB_Block_view;
    private javax.swing.JTextField JTF_block_id;
    private javax.swing.JTextField JTF_block_name;
    private javax.swing.JTextField JTF_college_id;
    private javax.swing.JMenu Jmenu;
    private javax.swing.JMenuItem Jmenu_insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
