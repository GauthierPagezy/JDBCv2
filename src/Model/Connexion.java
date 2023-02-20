package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Connexion {

    public static Connection getConnection(String url, Properties props) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,props);
        } catch(SQLException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return con;
        }
    }



