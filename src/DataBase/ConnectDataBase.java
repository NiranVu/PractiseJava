package DataBase;

import DataBase.Buoi3.Laptop;
import DataBase.Buoi3.LaptopFeature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class ConnectDataBase {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/store_cms_plusplus", "root", "987412365Azxc"
            // here store_cms_plusplus is database name, root is username and 987412365Azxc is password
            );

            //Homework 32
            LaptopFeature laptopFeature = new LaptopFeature(con);
            List<Laptop> testCase = laptopFeature.findByFeature("ASUS", null, null, Long.parseLong("8000000"), null, null);
            System.out.println(testCase);

            //Homework

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
