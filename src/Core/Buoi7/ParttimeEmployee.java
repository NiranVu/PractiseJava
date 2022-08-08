package Homework.Buoi7;

public class ParttimeEmployee extends Employee {
    long MEAL_ALLOWANCE = 0;
    int totalWorkingShift;
    long baseSalary;

    public ParttimeEmployee() {}

    public ParttimeEmployee(String name, int age, String identificationNumberString, int totalWorkingShift, long baseSalary) {
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
        super.name = name;
        super.age = age;
        super.identificationNumber = identificationNumberString;
    }

    //Implement từ abstract
    long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    long getSalaryRate() {
        return baseSalary;
    }

    int getWorkingCount() {
        return totalWorkingShift;
    }

}