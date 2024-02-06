package classes;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConection {

    public Connection dbConn() {
        Connection con = null;
        String database = "student_management_system";
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database + "?autoReconnect=false&useSSL=false", "root", "");
//            JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Not Connected, Check your server");
        }
        return con;
    }
    
}
