package netflix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try {
           //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:ucanaccess://Netflix.accdb";
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
