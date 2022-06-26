
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Campus_view extends javax.swing.JFrame {

    
    public Campus_view() {
        initComponents();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampusView = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        C_V = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        campus = new javax.swing.JMenu();
        C_insert = new javax.swing.JMenuItem();
        C_update = new javax.swing.JMenuItem();
        C_D = new javax.swing.JMenuItem();
        C_v = new javax.swing.JMenuItem();
        block = new javax.swing.JMenu();
        B_i = new javax.swing.JMenuItem();
        B_U = new javax.swing.JMenuItem();
        B_D = new javax.swing.JMenuItem();
        B_V = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Slot = new javax.swing.JMenu();
        S_I = new javax.swing.JMenuItem();
        S_u = new javax.swing.JMenuItem();
        S_d = new javax.swing.JMenuItem();
        S_V = new javax.swing.JMenuItem();
        percentage = new javax.swing.JMenu();
        P_v = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campus View");

        CampusView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "College Id", "College Name", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CampusView);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        C_V.setText("Back");
        C_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_VActionPerformed(evt);
            }
        });

        campus.setText("Campus");

        C_insert.setText("Insert");
        C_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_insertActionPerformed(evt);
            }
        });
        campus.add(C_insert);

        C_update.setText("Update");
        campus.add(C_update);

        C_D.setText("Delete");
        campus.add(C_D);

        C_v.setText("View");
        campus.add(C_v);

        jMenuBar1.add(campus);

        block.setText("Block");

        B_i.setText("Insert");
        block.add(B_i);

        B_U.setText("Update");
        block.add(B_U);

        B_D.setText("Delete");
        block.add(B_D);

        B_V.setText("View");
        block.add(B_V);

        jMenuBar1.add(block);

        jMenu3.setText("Parking_lot");
        jMenuBar1.add(jMenu3);

        Slot.setText("Slot");

        S_I.setText("Insert");
        Slot.add(S_I);

        S_u.setText("Update");
        Slot.add(S_u);

        S_d.setText("Delete");
        S_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_dActionPerformed(evt);
            }
        });
        Slot.add(S_d);

        S_V.setText("View");
        S_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_VActionPerformed(evt);
            }
        });
        Slot.add(S_V);

        jMenuBar1.add(Slot);

        percentage.setText("Percentage");

        P_v.setText("Percentage");
        P_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_vActionPerformed(evt);
            }
        });
        percentage.add(P_v);

        jMenuBar1.add(percentage);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(C_V, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(C_V)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
            ResultSet Rs = stmt.executeQuery("select * from Campus");
            DefaultTableModel model = (DefaultTableModel)CampusView.getModel();

            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt("College_id"), Rs.getString("College_Name"),Rs.getString("Address")});
            }

            System.out.println("Values retrived");
        
        
        con.close();
        
            

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void S_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_dActionPerformed

    private void S_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_VActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_VActionPerformed

    private void P_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_vActionPerformed
        // TODO add your handling code here:
        Percentage p_v=new Percentage();
        p_v.show();
        dispose();
        
    }//GEN-LAST:event_P_vActionPerformed

    private void C_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_insertActionPerformed

    private void C_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_VActionPerformed
        // TODO add your handling code here:
        Campus c_b=new Campus();
        c_b.show();
        dispose();  
    }//GEN-LAST:event_C_VActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campus_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem B_D;
    private javax.swing.JMenuItem B_U;
    private javax.swing.JMenuItem B_V;
    private javax.swing.JMenuItem B_i;
    private javax.swing.JMenuItem C_D;
    private javax.swing.JButton C_V;
    private javax.swing.JMenuItem C_insert;
    private javax.swing.JMenuItem C_update;
    private javax.swing.JMenuItem C_v;
    private javax.swing.JTable CampusView;
    private javax.swing.JMenuItem P_v;
    private javax.swing.JMenuItem S_I;
    private javax.swing.JMenuItem S_V;
    private javax.swing.JMenuItem S_d;
    private javax.swing.JMenuItem S_u;
    private javax.swing.JMenu Slot;
    private javax.swing.JMenu block;
    private javax.swing.JMenu campus;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu percentage;
    // End of variables declaration//GEN-END:variables
}
