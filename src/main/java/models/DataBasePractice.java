package models;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBasePractice {
    public static final String URL="jdbc:mysql://localhost:3306/mysql";
    public static final String USER="christhomas1990";
    public static final String PASS="Bronson1";

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
    public static void main(String[] args) {
        Connection connection = DataBasePractice.getConnection();
    }
}

