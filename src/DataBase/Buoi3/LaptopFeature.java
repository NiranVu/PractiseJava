package DataBase.Buoi3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LaptopFeature {

    Connection con;

    public LaptopFeature(Connection con) {
        this.con = con;
    }

    public List<Laptop> findByFeature(String maker, String type, String screenResolution, Long minPrice, Long maxPrice, Boolean checkConditionInAdvance){
        List<Laptop> laptops = new ArrayList<>();

        try {
            Statement stmt = con.createStatement();
            //Build query
            String querySQL = "SELECT * FROM `laptop` WHERE 1 = 1";
            if (maker != null) {
                querySQL += " AND `maker` = '" + maker + "'";
            }
            if (type != null) {
                querySQL += " AND `type` = '" + type + "'";
            }
            if (screenResolution != null) {
                querySQL += " AND `screen_resolution` = '" + screenResolution + "'";
            }
            if (minPrice != null) {
                querySQL += " AND `price` >= '" + minPrice + "'";
            }
            if (maxPrice != null) {
                querySQL += " AND `price` <= '" + maxPrice + "'";
            }
            if (checkConditionInAdvance != null) {
                querySQL += " AND `price` > " +  10000000 + " AND `sold` >= " + 30;
            }
            ResultSet rs = stmt.executeQuery(querySQL);

            System.out.println(querySQL);

            //Add into list
            while (rs.next()) {
                Laptop item = new Laptop();
                item.setName(rs.getString("name"));
                item.setMaker(rs.getString("maker"));
                item.setPrice(rs.getLong("price"));
                item.setScreenResolution(rs.getString("screen_resolution"));
                item.setSold(rs.getInt("sold"));
                laptops.add(item);
            }
            return laptops;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
