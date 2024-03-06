// Program to perform CRUD operations on a table in a database using JDBC
package Practical_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CRUD_Demo {
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
            String query = "insert into student values(1, 'varun', 90)";
            stmt.executeUpdate(query);
            System.out.println("Record inserted successfully");
//            String query = "update student set marks = 95 where rollno = 1";
//            stmt.executeUpdate(query);
//            System.out.println("Record updated successfully");
//            String query = "delete from student where rollno = 1";
//            stmt.executeUpdate(query);
//            System.out.println("Record deleted successfully");
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
