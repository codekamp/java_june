package codekamp;

import org.sqlite.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cerebro on 12/07/18.
 */
public class Demo {
//    https://www.w3schools.com/sql/

    public static void main(String[] args) {
        JDBC j1 = new JDBC();

        try {
            DriverManager.registerDriver(j1);
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }
}
