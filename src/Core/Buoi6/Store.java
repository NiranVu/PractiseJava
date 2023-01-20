package Core.Buoi6;

import java.util.Scanner;

public class Store extends SmartPhone {

    // 2.1 Các thuộc tính:
    // - String name; (Tên cửa hàng).
    // - String address; (Địa chỉ cửa hàng).
    // - int n; (Tổng số điện thoại có trong của hàng).
    // - SmartPhone[] phones; (Mảng danh sách các điện thoại có trong cửa hàng).
    // 2.2 Các phương thức:
    // - Khởi tạo, getter/setters.
    // - Tính tổng số lượng điện thoại bán được.
    // - Tính tổng doanh thu.

    private String nameStore;
    private String addressStore;
    private int totalPhone; //Total the number of phones in store
    SmartPhone[] phones; //List of phones in store

    public Store() {};
    public Store(String nameStore, String addressStore, int totalPhone) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.totalPhone = totalPhone;
        this.phones = new SmartPhone[totalPhone];
    }

    public String getNameStore() {
        return nameStore;
    }
    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getAddressStore() {
        return addressStore;
    }
    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public int getTotalPhone() {return totalPhone;}
    public void setTotalPhone(int totalPhone) {

        this.totalPhone = totalPhone;
    }

    public SmartPhone[] addPhones() {
        for (int i = 0; i < totalPhone; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Input branch: ");
            String branch = scr.nextLine();

            System.out.print("Bluetooth (true/false): ");
            boolean hasBuetooth = scr.nextBoolean();
            if(hasBuetooth == true) {
                System.out.println("Has bluetooth");
            } else {
                System.out.println("No has bluetooth");
            }

            System.out.print("5G (true/false): ");
            boolean has5G = scr.nextBoolean();
            if(has5G == true) {
                System.out.println("Has 5G");
            } else {
                System.out.println("No has 5G");
            }

            System.out.print("Wifi (true/false): ");
            boolean hasWifi = scr.nextBoolean();
            if(hasWifi == true) {
                System.out.println("Has wifi");
            } else {
                System.out.println("No has wifi");
            }

            scr.nextLine();

            System.out.print("Os bao nhiêu (e.g.: Os15): ");
            String os = scr.nextLine();

            System.out.print("Memory: ");
            float memory = scr.nextFloat();

            scr.nextLine();

            System.out.print("Color: ");
            String color = scr.nextLine();

            System.out.print("Price: ");
            long price = scr.nextLong();

            System.out.print("A number of sold: ");
            int totalSold = scr.nextInt();

            scr.nextLine();

            SmartPhone phone = new SmartPhone(branch, hasBuetooth, has5G, hasWifi, os, memory, color, price, totalSold);
            phones[i] = phone;
        }
        return phones;
    }
    
    public SmartPhone[] getPhones() {
        return phones;
    }
    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int allPhonesSold() {
        int allPhoneSold = 0;
        for (int i = 0; i < phones.length; i++) {
            if(phones[i].getTotalSold() > 0) {
                allPhoneSold += phones[i].getTotalSold();
            }
        }
        return allPhoneSold;
    }

    public long totalTurnOver() {
        long totalPrice = 0;
        long eachPrice = 0;
        for (int i = 0; i < phones.length; i++) {
            if(phones[i].getTotalSold() > 0) {
                eachPrice = phones[i].getTotalSold() * phones[i].getPrice();
            }
            totalPrice += eachPrice;
        }
        return totalPrice;
    }

    @Override
    public String toString() {

        return "Information of Stores{" +
                "Name='" + nameStore + '\'' +
                ", Address=" + addressStore +
                ", TotalPhone=" + totalPhone +
                '}';
    }
}
