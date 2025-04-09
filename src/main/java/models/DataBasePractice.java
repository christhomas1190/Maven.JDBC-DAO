package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBasePractice {
    public static final String URL = "jdbc:mysql://localhost:3306/SoccerPlayers";
    public static final String USER = "root";
    public static final String PASS = "Bronson1"; // your actual password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

    public static void main(String[] args) {
        Connection connection = DataBasePractice.getConnection();
        if (connection != null) {
            System.out.println("Connected to the database successfully, Sir.");
        }
    }
}

