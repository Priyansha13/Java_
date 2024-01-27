package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MysqlConnect {
    
    private static final String username="root";
    private static final String password="Piyu@1304";
    private static final String dataConn = "jdbc:mysql://localhost:3306/atm";
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            MysqlConnect.con = DriverManager.getConnection(dataConn, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}







