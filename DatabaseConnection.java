import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // private static final String url = "jdbc:postgresql://localhost:5432/APHealthMonitoringApp";
    private static final String url = "jdbc:postgresql://localhost:5432/aphealthmonitoringapp";
    private static final String user = "Raymond_Payne";
    private static final String password = "JuliaHoggi31956";

    private DatabaseConnection() {
        // private constructor to prevent instantiation
    }

    public static Connection getCon() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); // For Postgres
//          Class.forName("com.mysql.jdbc.Driver");  // For MySQL
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
