import java.sql.*;

class DatabaseManager {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Modify as needed
    private static final String USER = "SYSTEM"; // Replace with actual username
    private static final String PASSWORD = "mysql"; // Replace with actual password

    // public static void main(String[] args) {
    //     createTableIfNotExists();
    // }

    public static void createTableIfNotExists() {
        String checkTableQuery = "SELECT table_name FROM user_tables WHERE table_name = 'AMS'";
        String createTableQuery = "CREATE TABLE AMS ("
                + " SEATNO NUMBER(5,0) PRIMARY KEY, "
                + " NAME VARCHAR2(25) NOT NULL, "
                + " AGE NUMBER(3,0) NOT NULL, "
                + " EMAIL VARCHAR2(30) NOT NULL, "
                + " SRC VARCHAR2(10) NOT NULL, "
                + " DEST VARCHAR2(10) NOT NULL)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(checkTableQuery)) {

            if (rs.next()) {
                //System.out.println("Table 'AMS' already exists.");
            } else {
                stmt.executeUpdate(createTableQuery);
                //System.out.println("Table 'AMS' created successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
