package Core.Buoi7;

public class FulltimeEmployee extends Employee {

    // 2.1 Hằng số MEAL_ALLOWANCE = 2.000.000; Với ý nghĩa nhân viên fulltime sẽ đc trợ cấp 2tr tiền ăn.
    // 2.2 Các thuộc tính:
    // int totalWorkingDays; (Số ngày làm việc)
    // long dailySalary; (Lương theo ngày)
    // 2.3 Định nghĩa các phương thức trừu tượng từ lớp cha:
    // long getMealAllowance(); // trả về số tiền ăn đc trợ cấp
    // int getWorkingCount(); // trả về số ngày làm việc
    // long getSalaryRate(); // trả về lương theo ngày
    // 2.4 Các phương thức bình thường
    // Khởi tạo.

    long MEAL_ALLOWANCE = 2000000;  //The staff has 2000000VND for eating lunch
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

    //Implement from abstract
    long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    long getSalaryRate() {
        return dailySalary;
    }

    int getWorkingCount() {
        return totalWorkingDay;
    }

    @Override
    public String toString() {
        return "Employee: " + name +
                ", age: " + age +
                ", identification number:" +identificationNumber +
                ", daily salary: " + dailySalary +
                ", total working day: " + totalWorkingDay +
                ", meal allowance: " + MEAL_ALLOWANCE
        ;
    }
}