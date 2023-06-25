package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import models.Ad;
import Configs.Config;



public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<Ad> all()  {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM ads");
            while (resultSet.next()) {
                ads.add(createAdFromResults(resultSet));
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(ads);
        return ads;
    }

    private Ad createAdFromResults(ResultSet adData) throws SQLException {
        return new Ad(
                adData.getLong("id"),
                adData.getLong("user_id"),
                adData.getString("title"),
                adData.getString("description")
        );
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String testQuery = "INSERT INTO ads (title, user_id, description) VALUES (?,?,?);";

            PreparedStatement stmt = connection.prepareStatement(testQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, ad.getTitle());
            stmt.setLong(2, ad.getUserId());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
            return keys.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
