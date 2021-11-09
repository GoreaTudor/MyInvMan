package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnector {

    private static DatabaseConnector instance = new DatabaseConnector();

    private Connection connection;
    private Statement statement;


    private DatabaseConnector () {
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Data/DatabaseInfo.txt"));

            connection = DriverManager.getConnection(scanner.next(), scanner.next(), scanner.next());
            statement = connection.createStatement();

            System.out.println("Connection Successful!");

        } catch (FileNotFoundException e) {
            System.out.println("DatabaseInfo.txt file not found!\nConnection Failed!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection Failed!");
        }
    }


    public static DatabaseConnector getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
}
