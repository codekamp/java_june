package codekamp;

import java.sql.*;

/**
 * Created by cerebro on 12/07/18.
 */
public class Demo {

    // 1. Class.forName is a dynamic way of importing classes.
    // 2. Importing using Class.forName also executes static code blocks

    public static void main(String[] args) {
        System.out.println("hello world!");

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("We need to download some extra stuff. ok/cancel");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/codekamp/mydb.sqlite");
//            Statement stmt = conn.createStatement();
//
//            ResultSet r = stmt.executeQuery("SELECT * FROM `students`");
//
//
//            while (r.next()) {
//                System.out.println(r.getString("name"));
//                System.out.println(r.getString("email"));
//                System.out.println(r.getInt("age"));
//                System.out.println("--------");
//            }

            Statement anotherStmt = conn.createStatement();

            anotherStmt.execute("INSERT INTO `students` (`email`,`age`) VALUES ('d@gmail.com',23)");

        } catch (SQLException e) {

        }
    }
}
