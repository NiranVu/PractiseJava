package Homework.Buoi9;

public class User {
    int id;
    String username;
    String password;
    String displayName;
    String email;

    //Khởi tạo
    public User() {}
    public User(int id, String username, String password, String displayName, String email) {
        this.id = id;
        this.username = username;
        this.displayName = displayName;
        this.email = email;
    }

    //Getter, setter
    public int getId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void SetUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void SetDisplayName(String displayName) {
        this.displayName = displayName;
    }

    
    public String getEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }
}
