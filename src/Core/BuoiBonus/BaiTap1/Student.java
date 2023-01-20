package Core.BuoiBonus.BaiTap1;

public class Student extends People{
    private int point;

    public Student() {
        super();
    }

    public Student(int point, String name, String age) {
        super(name, age);
        this.point = point;
    } 

    public int getPoint() {
        return point;
    }
    
    public void setPoint(int point) {
        this.point = point;
    }

    public String toString() {
        return "{" + 
                "point = " + getPoint() + 
                ", name = " + super.getName() + 
                ", age = " + super.getAge() + 
                "}";
    }
}
