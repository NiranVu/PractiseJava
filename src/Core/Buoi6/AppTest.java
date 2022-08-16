package Core.Buoi6;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        // Scanner scr = new Scanner(System.in);
        // System.out.print("Nhập tổng số cửa hàng: ");
        // int n = scr.nextInt();

        StoreManagement mainManagement = new StoreManagement(2);

        System.out.println(mainManagement.addStores());
        
        for (int i = 0; i < mainManagement.getTotalStore(); i++) {
            System.out.println(mainManagement.getStores()[i].toString());
            System.out.println(mainManagement.getStores()[i].addPhones());
        }

        int highSold = 0;
        int lowSold = Integer.MAX_VALUE;
        for (int i = 0; i < mainManagement.getTotalStore(); i++) {
            int a = mainManagement.getStores()[i].allPhonesSold();
            if ( a > highSold) {
                highSold = a;
            }
            if (a < lowSold) {
                lowSold = a;
            }
        }
        System.out.println("Cửa hàng bán được nhiều điện thoại nhất: " + highSold);
        System.out.println("Cửa hàng bán được ít điện thoại nhất: " + lowSold);

        long highPriceSold = 0;
        long lowPriceSold = Long.MAX_VALUE;
        for (int i = 0; i < mainManagement.getTotalStore(); i++) {
            long a = mainManagement.getStores()[i].totalTurnOver();
            if ( a > highPriceSold) {
                highPriceSold = a;
            }
            if (a < lowPriceSold) {
                lowPriceSold = a;
            }
        }
        System.out.println("Cửa hàng doanh thu cao nhất: " + highPriceSold);
        System.out.println("Cửa hàng doanh thu thấp nhất: " + lowPriceSold);



        System.out.println(mainManagement.totalPhoneHighTech());
    }
}
