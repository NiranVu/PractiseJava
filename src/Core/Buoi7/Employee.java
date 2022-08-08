package Homework.Buoi7;

import java.util.Scanner;

public abstract class Employee {
    String name;  // tên
    int age;   // tuổi
    String identificationNumber;  // số CMND

    // setter, getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdenficationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    // tính lương cho nhân viên
    public long calculateSalary(long moneyLunch, long moneySalary, int dayWorking) {
        long salary = dayWorking * moneyLunch + moneyLunch;
        return salary;
    }

    //Viết phương thức trừu tượng
    abstract long getMealAllowance();  // Trả về số tiền trợ cập ăn trưa

    abstract long getSalaryRate();  // Trả về số tiền lương theo ngày đối với nhân viên fulltime hoặc ca làm việc đối với nhân viên parttime.

    abstract int getWorkingCount();  // Trả về tổng số ngày làm việc đối với nhân viên fulltime hoặc tổng số ca làm việc đối với nhân viên parttime.
}