package Core.Buoi7;

import java.util.Scanner;

public abstract class Employee {

    // 1.1: Thuộc tính
    // String name; (tên)
    // int age; (tuổi)
    // String identificationNunber; (Số CMT)
    // 1.2: Các phương thức
    // Khởi tạo, getters/setters
    // Phương thức trừu tượng getMealAllowance() sau này sẽ trả về số tiền (kiểu long) trợ cấp ăn trưa.
    // Phương thức trừu tượng getSalaryRate() sau này sẽ trả về số tiền lương theo ngày đối với nhân viên fulltime hoặc ca làm việc đối với nhân viên parttime.
    // Phương thức trừu tượng getWorkingCount() sau này sẽ trả về tổng số ngày làm việc đối với nhân viên fulltime hoặc tổng số ca làm việc đối với nhân viên parttime.
    // Phương thức calculateSalary() để tính lương cho nhân viên theo công thức: lương nhận đc = số ngày (ca) làm việc x lương ngày (ca) + trợ cấp ăn
    // Ví dụ long salary = getWorkingCount()*getSalaryRate() + getMealAllowance();

    String name;
    int age;
    String identificationNumber;

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

    // Calculate salary for staff
    public long calculateSalary(long moneyLunch, long moneySalary, int dayWorking) {
        long salary = dayWorking * moneyLunch + moneyLunch;
        return salary;
    }

    //Viết phương thức trừu tượng
    abstract long getMealAllowance();  // Trả về số tiền trợ cập ăn trưa

    abstract long getSalaryRate();  // Trả về số tiền lương theo ngày đối với nhân viên fulltime hoặc ca làm việc đối với nhân viên parttime.

    abstract int getWorkingCount();  // Trả về tổng số ngày làm việc đối với nhân viên fulltime hoặc tổng số ca làm việc đối với nhân viên parttime.
}