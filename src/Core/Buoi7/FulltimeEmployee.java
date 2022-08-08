package Homework.Buoi7;

public class FulltimeEmployee extends Employee {
    long MEAL_ALLOWANCE = 2000000;  //Nhân viên chính thức được trợ cấp 2tr tiền ăn trưa
    int totalWorkingDay;
    long dailySalary;

    public FulltimeEmployee() {}

    public FulltimeEmployee(String name, int age, String identificationNumberString, int totalWorkingDay, long dailySalary) {
        this.totalWorkingDay = totalWorkingDay;
        this.dailySalary = dailySalary;
        super.name = name;
        super.age = age;
        super.identificationNumber = identificationNumberString;
    }

    //Implement từ abstract
    long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    long getSalaryRate() {
        return dailySalary;
    }

    int getWorkingCount() {
        return totalWorkingDay;
    }
}