package Core.Buoi5;

import java.util.Scanner;

public class MainTestStudent {
    public static void main(String[] args) {

    // + Nhập vào thông tin sinh viên.
    // + In ra tổng số sinh viên đỗ.
    // + In ra tổng số sinh viên trượt.
    // + In ra thông tin sinh viên có điểm GPA cao nhất.
    // + In ra thông tin sinh viên có điểm GPA thấp nhất.

        StudentManagement lop1 = new StudentManagement(3);
        System.out.println("The number of student: " + lop1.totalStudentPass());
        System.out.println("A number of fail student: " + lop1.totalStudentFail());
        System.out.println("The highest point's student: " + lop1.studentHighPoint().toString());
        System.out.println("The lowest point's student: " + lop1.studentLowPoint().toString());
    }
}
