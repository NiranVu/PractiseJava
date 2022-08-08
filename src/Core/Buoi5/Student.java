package Homework.Buoi5;

public class Student {
    private String nameStudent;
    private float gpa;
    
    //getter, setter
    public String getNameStudent() {
        return nameStudent;
    }
    public void setNameStudent(String nameString) {

    }

    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {

    }
    
    //Khởi tạo
    public Student() {}
    public Student(String nameStudent, float gpa) {
        this.nameStudent = nameStudent;
        this.gpa = gpa;
    }

    //check đỗ/rớt
    public Boolean checkPass() {
        return gpa >= 1.5f;
    }
    
    //In ra thông tin
    public String printInformation() {
        return "Bạn là " + nameStudent + " có điểm = " + gpa;
    }
    
    
}
