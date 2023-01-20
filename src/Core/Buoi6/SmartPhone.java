package Core.Buoi6;

import java.util.Scanner;

public class SmartPhone {

    // 1.1 Các thuộc tính:
    // - String brand (Thương hiệu Samsung, Apple, Sony...)
    // - boolean hasBluetooth (Có Bluetooth hay ko)
    // - boolean has5G (Có 5G hay ko)
    // - boolean hasWifi (Có wifi hay ko)
    // - String os (Hệ điều hành)
    // - float memory (Bộ nhớ GB)
    // - String color (Màu)
    // - long price (Giá bán)
    // - int totalSold (Tổng số đã bán được)
    // 1.2 Các phương thức
    // - Khởi tạo, getter/setters
    // - Ghi đè lại toString để trả về thông tin chi tiết các thuộc tính.

    private String branch;
    private boolean hasBluetooth;
    private boolean has5G;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold; //tổng số bản được

    //Constructor
    public SmartPhone() {}
    public SmartPhone(String branch, boolean hasBluetooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price, int totalSold) {
        this.branch = branch;
        this.hasBluetooth = hasBluetooth;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean getHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWWifi) {
        this.hasWifi = hasWWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {this.totalSold = totalSold;}

    @Override
    public String toString() {
        return "smartPhone{" +
                "branch='" + branch + '\'' +
                ", hasBuetooth=" + hasBluetooth +
                ", has5G=" + has5G +
                ", hasWWifi=" + hasWifi +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
}
