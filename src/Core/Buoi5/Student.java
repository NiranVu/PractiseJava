package Core.Buoi5;

public class Student {

    // - Các thuộc tính:
    // + name
    // + gpa

    // - Các phương thức"
    // + Khởi tạo, getters/setters.
    // + Kiểm tra đỗ/trượt (gpa >=1.5 thì đỗ, ngược lại thì trượt).
    // + In ra thông tin name, gpa.

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
    
    //Constructor
    public Student() {}
    public Student(String nameStudent, float gpa) {
        this.nameStudent = nameStudent;
        this.gpa = gpa;
    }

    //check pass/fail
    public Boolean checkPass() {
        return gpa >= 1.5f;
    }
    
    @Override
    public String toString() {
        return "your name: " + nameStudent + 
                ", your GPA: " + gpa;
    }
}
