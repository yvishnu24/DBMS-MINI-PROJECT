
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Percentage extends javax.swing.JFrame {

    
    public Percentage() {
        initComponents();
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_percent = new javax.swing.JTable();
        JB_viewPercent = new javax.swing.JButton();
        JB_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Percent_Calculation");

        JTable_percent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Block_ID", "Percentage Utilised"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable_percent);

        JB_viewPercent.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JB_viewPercent.setText("View Percentage");
        JB_viewPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_viewPercentActionPerformed(evt);
            }
        });

        JB_Back.setText("Back");
        JB_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JB_Back)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(JB_viewPercent)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(JB_viewPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_viewPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_viewPercentActionPerformed
        // TODO add your handling code here:
        Connection con =null;
        try
        {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vishnu", "vasavi");
            
            
            
            Statement stmt = con.createStatement();
            String sqlqry; 
            //String selectedvalue1 =percentCombobox.getSelectedItem().toString();            
             sqlqry= "select block_id,sum(two_wheeler+four_wheeler)/sum(total_capacity)*100 from slot group by block_id";
            ResultSet Rs = stmt.executeQuery(sqlqry);
            DefaultTableModel model = (DefaultTableModel)JTable_percent.getModel();

            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("Block_iD"), Rs.getFloat("sum(two_wheeler+four_wheeler)/sum(total_capacity)*100")});
            }

            System.out.println("Values retrived");
        
        //stmt.close();
        con.close();
        
            

        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_JB_viewPercentActionPerformed

    private void JB_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BackActionPerformed
        // TODO add your handling code here:
        Campus cb=new Campus();
        cb.show();
        dispose();
        
    }//GEN-LAST:event_JB_BackActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Percentage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Back;
    private javax.swing.JButton JB_viewPercent;
    private javax.swing.JTable JTable_percent;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
