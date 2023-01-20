package Core.Buoi7;

import java.util.Scanner;

public class EmployeeManagement {

    // 4. Viết lớp EmployeeManagement để quản lý nhân viên. Lớp này gồm có:
    // 4.1 Các thuộc tính:
    // int n; (tổng số nhân viên)
    // Employee[] employees; (Mảng danh sách nhân viên)
    // 4.2 Các phương thức:
    // Khởi tạo với đối số truyền vào là tổng số nhân viên cần quản lý n
    // Nhập thông tin cho từng nhân viên (Khi nhập thì đưa ra lựa chọn để nhập nhân viên fulltime, parttime)
    // Tìm nhân viên có tiền lương cao nhất/thấp nhất.

    int totalEmployee;  // Tổng số nhân viên
    Employee[] employees;  //Danh sách nhân viên

    public EmployeeManagement() {}
    public EmployeeManagement(int totalEmployee) {
        this.totalEmployee = totalEmployee;
        employees = new Employee[totalEmployee];
    }

    public Employee[] addEmployee() {
        for (int i = 0; i < totalEmployee; i++) {
            System.out.println("emloyee number" + (i + 1));
            Scanner scr = new Scanner(System.in);
            System.out.print("Employee's name: ");
            String name = scr.nextLine();

            System.out.print("Employee's age: ");
            int age = scr.nextInt();

            scr.nextLine();

            System.out.print("Employee's identification Number : ");
            String identificationNumber = scr.nextLine();

            System.out.print("Employee's type (fulltime/ partime): ");
            String checkTypeEmployee = scr.nextLine();

            if (checkTypeEmployee.equalsIgnoreCase("fulltime")) {
                System.out.print("Employee's daily salary: ");
                long dailySalary = scr.nextLong();

                System.out.print("Employee's day: ");
                int totalWorkingDay = scr.nextInt();

                Employee fullTimeEmployee = new FulltimeEmployee(name, age, identificationNumber, totalWorkingDay, dailySalary);
                employees[i] = fullTimeEmployee;
            } else {
                System.out.print("Employee's daily salary: ");
                long baseSalary = scr.nextLong();

                System.out.print("Employee's shift: ");
                int totalWorkingShift = scr.nextInt();

                Employee partTimeEmployee = new ParttimeEmployee(name, age, identificationNumber, totalWorkingShift, baseSalary);
                employees[i] = partTimeEmployee;
            }
        }
        return employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String highSalary() {
        long highestSalary = 0;
        String nameHighestSalary = "";

        for (int i = 0; i < totalEmployee; i++) {
            // if (employees[i] instanceof FulltimeEmployee) {
            long salary = employees[i].calculateSalary(employees[i].getMealAllowance(), employees[i].getSalaryRate(), employees[i].getWorkingCount());
            // }
            if (salary > highestSalary) {
                highestSalary = salary;
                nameHighestSalary = employees[i].getName();
            }
        }
        return "Name of highest salary" + nameHighestSalary + ", Salary: " + highestSalary;
    }

    public String lowSalary() {
        long lowestSalary = Long.MAX_VALUE;
        String nameLowestSalary = "";

        for (int i = 0; i < totalEmployee; i++) {
            // if (employees[i] instanceof FulltimeEmployee) {
            long salary = employees[i].calculateSalary(employees[i].getMealAllowance(), employees[i].getSalaryRate(), employees[i].getWorkingCount());
            // }
            if (salary < lowestSalary) {
                lowestSalary = salary;
                nameLowestSalary = employees[i].getName();
            }
        }
        return "Name of highest salary" + nameLowestSalary + ", Salary: " + lowestSalary;
    }
}