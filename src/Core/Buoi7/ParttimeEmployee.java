package Core.Buoi7;

public class ParttimeEmployee extends Employee {

    // 3. Viết lớp ParttimeEmployee (Nhân viên part time) kế thừa từ lớp Employee gồm có:
    // 3.1 Hằng số MEAL_ALLOWANCE = 0; Với ý nghĩa nhân viên parttime sẽ ko có trợ cấp tiền ăn.
    // 3.2 Các thuộc tính:
    // int totalWorkingShift; (Số ca làm việc)
    // long baseSalary; (Lương theo ca làm việc)
    // 3.3 Định nghĩa các phương thức trừu tượng từ lớp cha tương tự với lớp FulltimeEmployee.
    // 3.4 Các phương thức bình thường khác:
    // Khởi tạo

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

    //Implement from abstract
    long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    long getSalaryRate() {
        return baseSalary;
    }

    int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public String toString() {
        return "Employee: " + name +
                ", age: " + age +
                ", identification number:" +identificationNumber +
                ", Base salary: " + baseSalary +
                ", total working shift: " + totalWorkingShift +
                ", meal allowance: " + MEAL_ALLOWANCE
        ;
    }
}