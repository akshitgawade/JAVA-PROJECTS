import java.sql.*;

public class Exp1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company2",
                "root",
                "P@resh123!"
            );

            Statement stmt = con.createStatement();

            // CREATE - Insert employee
            stmt.executeUpdate(
                "INSERT INTO employee VALUES (247, 'Akshit', 'Finance', 68500)"
            );
            System.out.println("Employee inserted successfully.");

            // UPDATE - Update salary
            stmt.executeUpdate(
                "UPDATE employee SET salary = 73200 WHERE emp_id = 247"
            );
            System.out.println("Employee updated successfully.");

            // READ - Display employee
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM employee"
            );

            System.out.println("\nEmployee Records:");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("emp_id") +
                    ", Name: " + rs.getString("name") +
                    ", Department: " + rs.getString("department") +
                    ", Salary: " + rs.getDouble("salary")
                );
            }

            // DELETE - Delete employee
            stmt.executeUpdate(
                "DELETE FROM employee WHERE emp_id = 247"
            );
            System.out.println("Employee deleted successfully.");

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}