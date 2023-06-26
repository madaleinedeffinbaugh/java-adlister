package com.codeup.adlister.dao;

import com.codeup.adlister.Configs.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public User findByUsername(String username) {
        try {
            String findUserQuery = "SELECT * FROM users WHERE username = ?";
            PreparedStatement stmt = connection.prepareStatement(findUserQuery);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            rs.next();
            return createUserFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error finding user.", e);
        }
//        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            String testQuery = "INSERT INTO users (username, email, password) VALUES (?,?,?);";

            PreparedStatement stmt = connection.prepareStatement(testQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
            return keys.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    private User createUserFromResults(ResultSet resultSet) throws SQLException {
        return new User(
                resultSet.getLong("id"),
                resultSet.getString("username"),
                resultSet.getString("email"),
                resultSet.getString("password")
        );
    }
}
