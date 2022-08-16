package Core.Buoi6;

import java.util.Scanner;

public class StoreManagement extends Store {
    int totalStore; //tổng số cửa hàng cần quản lý
    Store[] stores; //danh sách cửa hàng

    public StoreManagement() {};

    public StoreManagement(int totalStore) {
        this.totalStore = totalStore;
        stores = new Store[totalStore];
    }

    public int getTotalStore() {
        return totalStore;
    }

    public void setTotalStore(int totalStore) {
        this.totalStore = totalStore;
    }

    public Store[] addStores() {
        for (int i = 0; i < stores.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập tên cửa hàng: ");
            String nameStore = scr.nextLine();

            System.out.print("Nhập địa chỉ cửa hàng: ");
            String addressStore = scr.nextLine();

            System.out.print("tổng số loại điện thoại: ");
            int totalPhone = scr.nextInt();

            scr.nextLine();

            Store store = new Store(nameStore, addressStore, totalPhone);
            stores[i] = store;
        }
        return stores;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }


    @Override
    public String toString() {
        return "Information of Stores{" +
        "Name='" + getNameStore() + '\'' +
        ", Address=" + getAddressStore() +
        ", TotalPhone=" + getTotalPhone() +
        '}';
    }


    public int totalPhoneHighTech() {
        int totalHas = 0;
        for (Store i : stores) {
            for (SmartPhone j : i.phones) {
                if(j.isHasBuetooth() == true && j.isHas5G() == true && j.isHasWifi() == true) {
                    totalHas++;
                }
            }
        }
        return totalHas;
    }
}
