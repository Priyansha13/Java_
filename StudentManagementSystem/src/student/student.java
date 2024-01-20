
package student;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class student {
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    
//    public int getMax(){
//        int ID = 0;
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery("select ID from student");
//            while (rs.next()){
//                ID=rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return ID +1;
//    }
    
    //insert data into student table
    public void insert(String Name, String Email, String Contact, String Country){
        String sql = "insert into student values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, ID);
            ps.setString(1, Name);
            ps.setString(2, Email);
            ps.setString(3, Contact);
            ps.setString(4, Country);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "New Student added successfully");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
