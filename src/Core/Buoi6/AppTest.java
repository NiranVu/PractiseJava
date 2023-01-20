package Core.Buoi6;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

    // - Nhập vào thông tin các cửa hàng, cũng như thông tin chi tiết các điện thoại có trong cửa hàng đó.
    // - In ra thông tin chi tiết các cửa hàng vừa nhập.
    // - In cửa hàng bán được nhiều/ít điện thoại nhất.
    // - In ra cửa hàng có doanh thu cao/thấp nhất.
    // - In ra số lượng tất cả điện thoại của tất cả các cửa hàng mà có Bluetooth/5G/Wifi.

        Scanner scr = new Scanner(System.in);
        System.out.print("Input the number of stores: ");
        int n = scr.nextInt();
        StoreManagement mainManagement = new StoreManagement(n);
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
        System.out.println("The store sold the highest: " + highSold);
        System.out.println("The store sold the lowest: " + lowSold);

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
        System.out.println("The store has the highest revenue: " + highPriceSold);
        System.out.println("The store has the lowest revenue: " + lowPriceSold);
        
        System.out.println("The number of phone has bluetooth, 5G, wifi" + mainManagement.totalPhoneHighTech());
    }
}
