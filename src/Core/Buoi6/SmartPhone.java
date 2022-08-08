package Homework.Buoi6;

import java.util.Scanner;

public class SmartPhone {
    private String branch;
    private boolean hasBuetooth;
    private boolean has5G;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold; //tổng số bản được

    public SmartPhone() {}

    public SmartPhone(String branch, boolean hasBuetooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price, int totalSold) {
        this.branch = branch;
        this.hasBuetooth = hasBuetooth;
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

    public boolean isHasBuetooth() {
        return hasBuetooth;
    }

    public void setHasBuetooth(boolean hasBuetooth) {
        this.hasBuetooth = hasBuetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
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
                "branch='" + getBranch() + '\'' +
                ", hasBuetooth=" + isHasBuetooth() +
                ", has5G=" + isHas5G() +
                ", hasWWifi=" + isHasWifi() +
                ", os='" + getOs() + '\'' +
                ", memory=" + getMemory() +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", totalSold=" + getTotalSold() +
                '}';
    }
}
