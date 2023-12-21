import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:postgresql://localhost:5432/apHealthmonitoringapp";
    private static String user = "Raymond_Payne";
    private static String password = "JuliaHoggi31956";

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        // You can add initialization logic here if needed
    }

    public static void setConnectionParameters(String newUrl, String newUser, String newPassword) {
        // Allow dynamic changes to connection parameters
        url = newUrl;
        user = newUser;
        password = newPassword;
    }

    public static Connection getCon() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); // For Postgres
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
