import Data.Database.DatabaseConnector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLTests {

    @Test
    public void connectionTest () {
        try {
            ResultSet rs = DatabaseConnector.getStatement().executeQuery("select * from inventory_view;");

//            while (rs.next()) {
//                System.out.println(rs.getString(1) + " " +
//                        rs.getString(2) + " " +
//                        rs.getString(3) + " " +
//                        rs.getString(4) + " " +
//                        rs.getString(5)
//                );
//            }

            Assertions.assertTrue(rs.next());

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void countingTest_usingSelect() {
        try {
            ResultSet rs = DatabaseConnector.getStatement().executeQuery("select count(username) from user_table");

            while (rs.next()) {
                //System.out.println(rs.getString(1)); // should return 7
                Assertions.assertEquals("7", rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }
}
