package Core.BuoiBonus.BaiTap1;

public class People {
    private String name;
    private String age;
    
    public People(){};
    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }
}
