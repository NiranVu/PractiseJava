package Core.BuoiBonus.BaiTap2.Model;

public class Student extends People {
    private int pointMath;
    private int pointPhys;
    private int id = 0;

    public Student() {
        super();
    }
    
    public Student(int id, String name, int age , int pointMath, int pointPhys) {
        super(name, age);
        this.pointMath = pointMath;
        this.pointPhys = pointPhys;
        this.id = id;
    }

    public int getPointMath() {
        return pointMath;
    }

    public void setPointMath(int pointMath) {
        this.pointMath = pointMath;
    }

    
    public int getPointPhys() {
        return pointPhys;
    }

    public void setPointPhys(int pointPhys) {
        this.pointPhys = pointPhys;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "{" +
                "id: " + id +
                ", name: " + super.getName() +  
                ", age: " + super.getAge() +
                ", point math: " + pointMath +
                ", point physic: " + pointPhys +
                "}";
    }
}
