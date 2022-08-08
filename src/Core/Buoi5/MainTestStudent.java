package Homework.Buoi5;

import java.util.Scanner;

public class MainTestStudent {
    public static void main(String[] args) {
        // //STUDENT
        // //Tạo biến name
        // Scanner scr1 = new Scanner(System.in);
        // System.out.print("Tên của bạn là ");
        // String name = scr1.nextLine();
        // //Tạo biến gpa
        // Scanner scr2 = new Scanner(System.in);
        // System.out.print("Điểm của bạn = ");
        // float point = scr2.nextFloat();

        // Student Duc = new Student(name, point);
        // System.out.println(Duc.checkPass());
        // System.out.println("Thông tin của bạn là " + Duc.printInformation());


        //STUDENT MANAGEMENT
        StudentManagement lop1 = new StudentManagement(3);
        System.out.println(lop1.getStudents());
        System.out.println("Số sinh viên đậu là " + lop1.totalStudentPass());
        System.out.println("Số sinh viên rớt là " + lop1.totalStudentFail());
        System.out.println("Sinh viên điểm cao nhất là " + lop1.studentHighPoint().getNameStudent());
        System.out.println("Sinh viên điểm thấp nhất là " + lop1.studentLowPoint().getNameStudent());
    }
}
