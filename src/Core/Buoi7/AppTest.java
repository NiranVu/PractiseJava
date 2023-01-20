package Core.Buoi7;

public class AppTest {
    public static void main(String[] args) {

        // In ra danh sách nhân viên và tiền lương tương ứng.

        EmployeeManagement employeeCongTyA = new EmployeeManagement(2);
        System.out.println(employeeCongTyA.getEmployees().length);
        employeeCongTyA.addEmployee();

        for (int i = 0; i < employeeCongTyA.getEmployees().length; i++) {
            if (employeeCongTyA.getEmployees()[i] instanceof FulltimeEmployee) {
                System.out.println(employeeCongTyA.getEmployees()[i].toString());

            } else {
                System.out.println(employeeCongTyA.getEmployees()[i].toString());  
                }
        }
    }
}