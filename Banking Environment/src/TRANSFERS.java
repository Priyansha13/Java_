
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priyansha
 */
public class TRANSFERS extends javax.swing.JFrame {

    /**
     * Creates new form TRANSFERS
     */
    public TRANSFERS() {
        initComponents();
    }
    String pass;
    
     public TRANSFERS(String p) {
        initComponents();
        pass=p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Receiver's Username :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Amount:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Re-type Password:");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("TRANSFER");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("MAKE A TRANSACTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        int amount=Integer.parseInt(jTextField2.getText());
//        String amt1=jTextField2.getText();
//        String pass2=new String(jPassword.getPassword());
//        String username1=jTextField1.getText();
//            if(username1.isEmpty() && amt1.isEmpty() && pass2.isEmpty())
//             {
//                 JOptionPane.showMessageDialog(this,"ENTER \nUSER NAME\nAmount\nPassword");
//             }
//            else if(username1.isEmpty())
//            {
//                JOptionPane.showMessageDialog(null," ENTER Username");
//            }
//             else if(amt1.isEmpty())
//             {
//                 JOptionPane.showMessageDialog(null," ENTER AMOUNT");
//             }
//             else if(pass2.isEmpty())
//             {
//                 JOptionPane.showMessageDialog(null,"ENTER YOUR Password");
//             }
//            else
//             {
//        
//        if(pass2.equals(pass))
//        {
//         
//            try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = (Connection)
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Piyu@1304");
//            Statement stmt = null;
//            ResultSet rs = null;
//            
//             String SQL = "SELECT * FROM details WHERE password like '%"+(pass)+"%'";
//             //selext column name from table name where colomn name = text
//             stmt = con.createStatement();
//             rs = stmt.executeQuery(SQL);
//            
//                if (rs.next()!= rs.isAfterLast()) {
//                
//                String cuser = rs.getString("username");
//                String cpass = rs.getString("password");
//                int cbal = Integer.parseInt(rs.getString("balance"));
//                             if(cpass.equals(pass))
//                            {
//                        int temp=cbal-amount;
//                        user_transfer(username1,amount);
//                        
//                        System.out.println(temp);
//            
//            String SQL1 = "SELECT * FROM details";
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(SQL1);
//            
//            
//            
//            String strSQL = "Update details set balance = "+(temp)+" where password = " + (pass);
//            int rowsEffected = stmt.executeUpdate(strSQL);
//            if (rowsEffected == 0){
//                JOptionPane.showMessageDialog(this, "Transfer Unsuccessfull ");
//            }
//            else{
//                 JOptionPane.showMessageDialog(this,"Transaction Successfull");
//            }
//                    }
//               
//                 con.close();
//            stmt.close();
//            rs.close();
//                
//                }
//            }
//                catch(Exception e)
//                        {
//                                JOptionPane.showMessageDialog(this, e.getMessage());
//                        }
//            
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Incorrect Password");
//        }
//        
//             }
        
     int amount = Integer.parseInt(jTextField2.getText());
        String amt1 = jTextField2.getText();
        String pass2 = new String(jPassword.getPassword());
        String username1 = jTextField1.getText();
        if (username1.isEmpty() && amt1.isEmpty() && pass2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ENTER \nUSER NAME\nAmount\nPassword");
        } else if (username1.isEmpty()) {
            JOptionPane.showMessageDialog(null, " ENTER Username");
        } else if (amt1.isEmpty()) {
            JOptionPane.showMessageDialog(null, " ENTER AMOUNT");
        } else if (pass2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ENTER YOUR Password");
        } else {
            if (pass2.equals(pass)) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Piyu@1304");

                    // Check the password using a parameterized query
                    String SQL = "SELECT * FROM details WHERE password = ?";
                    try (PreparedStatement pstmt = con.prepareStatement(SQL)) {
                        pstmt.setString(1, pass);
                        ResultSet rs = pstmt.executeQuery();

                        if (rs.next()) {
                            String cuser = rs.getString("username");
                            String cpass = rs.getString("password");
                            int cbal = Integer.parseInt(rs.getString("balance"));
                            if (cpass.equals(pass)) {
                                int temp = cbal - amount;
                                user_transfer(username1, amount);

                                String strSQL = "UPDATE details SET balance = ? WHERE password = ?";
                                try (PreparedStatement pstmtUpdate = con.prepareStatement(strSQL)) {
                                    pstmtUpdate.setInt(1, temp);
                                    pstmtUpdate.setString(2, cpass);
                                    int rowsEffected = pstmtUpdate.executeUpdate();
                                    if (rowsEffected == 0) {
                                        JOptionPane.showMessageDialog(this, "Transfer Unsuccessful ");
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Transaction Successful");
                                    }
                                }
                            }
                        }
                    }
                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Password");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TRANSFERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSFERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSFERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSFERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSFERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void user_transfer(String user,int amt) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = (Connection)
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Piyu@1304");
//            Statement stmt = null;
//            
//            
//             String SQL = "SELECT * FROM details WHERE username like '%"+(user)+"%'";
//             //selext column name from table name where colomn name = text
//             stmt = con.createStatement();
//             rs = stmt.executeQuery(SQL);
//            
//                if (rs.next()!= rs.isAfterLast()) {
//                String cpass = rs.getString("password");
//                 String cuser = rs.getString("username");
//                int cbal = Integer.parseInt(rs.getString("balance"));
//                         if(cuser.equals(user))
//                            {
//                                int temp=cbal+amt;
//                        
//                                System.out.println(temp);
//            
//            String SQL1 = "SELECT * FROM details";
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(SQL1);
//            
//            
//            
//            String strSQL = "Update details set balance = "+(temp)+" where password = " +(cpass);
//            int rowsEffected = stmt.executeUpdate(strSQL);
//               
//                            }
//            con.close();
//            stmt.close();
//            rs.close();
//                }
//            }
//       
//            catch(Exception e){
//                  JOptionPane.showMessageDialog(this, e.getMessage());
//                
//            }
//        
//    }
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Piyu@1304");
            Statement stmt = null;

            String SQL = "SELECT * FROM details WHERE username = ?";
            try (PreparedStatement pstmt = con.prepareStatement(SQL)) {
                pstmt.setString(1, user);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String cpass = rs.getString("password");
                    String cuser = rs.getString("username");
                    int cbal = Integer.parseInt(rs.getString("balance"));
                    if (cuser.equals(user)) {
                        int temp = cbal + amt;
                        String strSQL = "UPDATE details SET balance = ? WHERE password = ?";
                        try (PreparedStatement pstmtUpdate = con.prepareStatement(strSQL)) {
                            pstmtUpdate.setInt(1, temp);
                            pstmtUpdate.setString(2, cpass);
                            int rowsEffected = pstmtUpdate.executeUpdate();
                        }
                    }
                }
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
