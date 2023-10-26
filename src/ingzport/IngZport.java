package ingzport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego Escobedo
 */

public class IngZport {
    
    static Connection con;
    public static void main(String[] args) {
    }
    public static void StartConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ingzport", "root", "");
            System.out.println("Connection succesful");
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
}
