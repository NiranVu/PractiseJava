package Core.Buoi5;

import java.util.Scanner;

public class StudentManagement {
    int totalStudent;
    Student[] students;

    //Khởi tạo
    public StudentManagement() {}
    public StudentManagement(int totalStudent) {
        this.totalStudent = totalStudent;
        students = new Student[this.totalStudent];
    }

    //Getter, Setter
    public int getTotalStudent() {
        return totalStudent;
    }
    public void setTotalStudent(int totalStudent) {

    }

    public Student[] getStudents() {
        for (int i = 0; i < students.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập tên học sinh số " + (i + 1) + " là ");
            String name = scr.nextLine();

            System.out.print("Nhập GPA học sinh số " + (i + 1) + " là ");
            float point = scr.nextFloat();

            scr.nextLine();

            Student student = new Student(name, point);
            students[i] = student;
        }
        return students;
    }
    public void setStudents(Student[] Students) {

    }

    //Tìm số người qua
    public int totalStudentPass() {
        int numPass = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].checkPass()) {
                numPass++;
            }
        }
        return numPass;
    } 

    //Tìm số người rớt
    //Dấu chấm than trước student để nó hiểu là ngược lại  (False)
    public int totalStudentFail() {
        int numFail = 0;
        for (int i = 0; i < students.length; i++) {
            if(!students[i].checkPass()) {
                numFail++;
            }
        }
        return numFail;
    }

    //Tìm sinh viên có điểm cao nhất
    public Student studentHighPoint() {
        float curHighPoint = 0f;
        int indexHighPoint = 0;
        for (int i = 0; i < students.length; i++) {
            float studentGpa = students[i].getGpa();
            if (studentGpa > curHighPoint) {
                curHighPoint = studentGpa;
                indexHighPoint = i;
            }
        }
        return students[indexHighPoint];
    }

    //Tìm sinh viên có điểm thấp nhất
    public Student studentLowPoint() {
        float curLowPoint = 9999999f;
        int indexLowPoint = 0;
        for (int i = 0; i < students.length; i++) {
            float studentGpa = students[i].getGpa();
            if (studentGpa < curLowPoint) {
                curLowPoint = studentGpa;
                indexLowPoint = i;
            }
        }
        return students[indexLowPoint];
    }
}
