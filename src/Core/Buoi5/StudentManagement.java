package Core.Buoi5;

import java.util.Scanner;

public class StudentManagement {

    // - Các thuộc tính"
    // + Tổng số sinh viên n.
    // + Danh sách sinh viên (Student[] students).

    // - Các phương thức:
    // + Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
    // + Đếm tổng số sinh viên đỗ.
    // + Đếm tổng số sinh viên trượt.
    // + Tìm sinh viên có điểm gpa cao nhất.
    // + Tìm sinh viên có điểm gpa thấp nhất.
    
    private int totalStudent;
    private Student[] students;

    //Constructor
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
        return students;
    }
    public void setStudents(Student[] Students) {
        
    }

    public Student[] inputStudent() {
        for (int i = 0; i < students.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Name of student " + (i + 1) + " is ");
            String name = scr.nextLine();

            System.out.print("GPA of student " + (i + 1) + " is ");
            float point = scr.nextFloat();

            scr.nextLine();

            Student student = new Student(name, point);
            students[i] = student;
        }
        return students;
    }

    //Finding the student pass the exam
    public int totalStudentPass() {
        int numPass = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].checkPass()) {
                numPass++;
            }
        }
        return numPass;
    } 

    //Finding the student fail the exam
    public int totalStudentFail() {
        int numFail = 0;
        for (int i = 0; i < students.length; i++) {
            if(!students[i].checkPass()) {
                numFail++;
            }
        }
        return numFail;
    }

    //Student own the highest point
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

    //Student own the lowest point
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
