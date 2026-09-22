import java.sql.*;

public class Exp1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/college";
        String user = "root";
        String password = "P@resh123!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, password);
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {

                System.out.println("Student Records:");

                while (rs.next()) {
                    System.out.println(
                        "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Course: " + rs.getString("course")
                    );
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

