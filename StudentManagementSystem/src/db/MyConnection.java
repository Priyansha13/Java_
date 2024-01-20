
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    
    private static final String username="root";
    private static final String password="";
    private static final String dataConn = "jdbc:mysql://localhost:3307/student_management";
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            MyConnection.con = DriverManager.getConnection(dataConn, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
