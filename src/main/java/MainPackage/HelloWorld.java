package MainPackage;

import Data.DatabaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            ResultSet resultSet = DatabaseConnector.getInstance().getStatement().executeQuery("SELECT * FROM user_table");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
