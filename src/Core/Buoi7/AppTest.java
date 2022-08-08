package Homework.Buoi7;

public class AppTest {
    public static void main(String[] args) {
        EmployeeManagement employeeCongTyA = new EmployeeManagement(2);
        System.out.println(employeeCongTyA.getEmployees().length);
        employeeCongTyA.addEmployee();

//        for (int i = 0; i < employeeCongTyA.getEmployees().length; i++) {
//            if (employeeCongTyA.getEmployees()[i] instanceof FulltimeEmployee) {
//                System.out.println("Employee full time " + (i + 1) +
//                        ", name: " + employeeCongTyA.getEmployees()[i].getName() +
//                        ", age: " + employeeCongTyA.getEmployees()[i].getAge() +
//                        ", identification number: " + employeeCongTyA.getEmployees()[i].getIdenficationNumber() +
//                        ", meat allowance: " + employeeCongTyA.getEmployees()[i].getMealAllowance() +
//                        ", salary rate: " + employeeCongTyA.getEmployees()[i].getSalaryRate() +
//                        ", working day: " + employeeCongTyA.getEmployees()[i].getWorkingCount());
//            } else {
//                System.out.println("Employee part time " + (i + 2) +
//                        ", name: " + employeeCongTyA.getEmployees()[i].getName() +
//                        ", age: " + employeeCongTyA.getEmployees()[i].getAge() +
//                        ", identification number: " + employeeCongTyA.getEmployees()[i].getIdenficationNumber() +
//                        ", meat allowance: " + employeeCongTyA.getEmployees()[i].getMealAllowance() +
//                        ", salary rate: " + employeeCongTyA.getEmployees()[i].getSalaryRate() +
//                        ", working shift: " + employeeCongTyA.getEmployees()[i].getWorkingCount());
//            }
//        }
//
//        System.out.println(employeeCongTyA.highSalary());
//        System.out.println(employeeCongTyA.lowSalary());
    }
}