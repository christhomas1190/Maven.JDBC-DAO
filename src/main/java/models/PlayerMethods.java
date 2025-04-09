package models;

import daos.CRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerMethods implements CRUD<PlayerModel> {
    private static final String URL = "jdbc:mysql://localhost:3306/SoccerPlayers"; // Database URL
    private static final String USER = "root";
    private static final String PASS = "Bronson1!";

    // Method to establish a connection with the database
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Create a new player
    @Override
    public void create(PlayerModel entity) {
        String sql = "INSERT INTO SoccerPlayers (PlayerID, FirstName, LastName, Position, Salary, Nationality, RemYearsOnContract) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, entity.getPlayerID());
            stmt.setString(2, entity.getFirstName());
            stmt.setString(3, entity.getLastName());
            stmt.setString(4, entity.getPosition());
            stmt.setInt(5, entity.getSalary());
            stmt.setString(6, entity.getNationality());
            stmt.setInt(7, entity.getRemYearsOnContract());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read player by ID
    @Override
    public PlayerModel findById(int id) {
        String sql = "SELECT * FROM SoccerPlayers WHERE PlayerID = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new PlayerModel(
                        rs.getInt("PlayerID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("Position"),
                        rs.getInt("Salary"),
                        rs.getString("Nationality"),
                        rs.getInt("RemYearsOnContract")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // return null if not found
    }

    // Update a player's data
    @Override
    public PlayerModel update(PlayerModel entity) {
        String sql = "UPDATE SoccerPlayers SET FirstName = ?, LastName = ?, Position = ?, Salary = ?, Nationality = ?, RemYearsOnContract = ? WHERE PlayerID = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getFirstName());
            stmt.setString(2, entity.getLastName());
            stmt.setString(3, entity.getPosition());
            stmt.setInt(4, entity.getSalary());
            stmt.setString(5, entity.getNationality());
            stmt.setInt(6, entity.getRemYearsOnContract());
            stmt.setInt(7, entity.getPlayerID());

            stmt.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Delete a player by ID
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM SoccerPlayers WHERE PlayerID = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Find all players
    @Override
    public List<PlayerModel> findAll() {
        List<PlayerModel> players = new ArrayList<>();
        String sql = "SELECT * FROM SoccerPlayers";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                players.add(new PlayerModel(
                        rs.getInt("PlayerID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("Position"),
                        rs.getInt("Salary"),
                        rs.getString("Nationality"),
                        rs.getInt("RemYearsOnContract")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return players;
    }
}
