package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_USER = "bhl77";
    private static final String DB_PASS = "71771";

    private Connection connection;

    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            //System.out.println("Connection OK");

        } catch (SQLException e) {
            System.out.println("Connection ERROR" + e.getMessage());
        }
        return connection;
    }
}
