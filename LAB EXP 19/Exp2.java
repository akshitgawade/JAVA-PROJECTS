import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/shop";
        String user = "root";
        String password = "P@resh123!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, password);
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM product")) {

                System.out.println("Product Details:");

                while (rs.next()) {
                    System.out.println(
                        "Product ID: " + rs.getInt("product_id") +
                        ", Name: " + rs.getString("product_name") +
                        ", Quantity: " + rs.getInt("quantity") +
                        ", Price: " + rs.getDouble("price")
                    );
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}