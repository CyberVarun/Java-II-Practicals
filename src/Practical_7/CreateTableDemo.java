// Program to create a table in a database using JDBC
package Practical_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            // Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "Db@098user");
            // Create a statement
            stmt = con.createStatement();
            // Execute the query
            String query = "create table student(rollno int, name varchar(20), marks int)";
            stmt.executeUpdate(query);
            System.out.println("Table created successfully");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                // Close the connection
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
