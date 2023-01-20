package Core.Buoi6;

import java.util.Scanner;

public class StoreManagement extends Store {

    // 3.1 Các thuộc tính:
    // - int n; (Tổng số cửa hàng cần quản lý).
    // - Store[] stores; (Danh sách các cửa hàng).
    // 3.2 Các phương thức:
    // - Khởi tạo.
    // - Ghi đè lại toString để trả về thông tin chi tiết các cửa hàng.
    // - Tính tổng tất cả các điện thoại có Bluetooth/5G/Wifi.

    int totalStore; //Total the number of store
    Store[] stores; //List of store

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
            System.out.print("Input the name of store: ");
            String nameStore = scr.nextLine();

            System.out.print("Input the address of store: ");
            String addressStore = scr.nextLine();

            System.out.print("Input total phones: ");
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
                if(j.getHasBluetooth() == true && j.getHas5G() == true && j.getHasWifi() == true) {
                    totalHas++;
                }
            }
        }
        return totalHas;
    }
}
