package Core.Buoi9;

public class User {

    // 1.1 Các thuộc tính:
    // - int id; (ID người dùng)
    // - String username; (Tên đăng nhập)
    // - String password; (Mật khẩu)
    // - String displayName; (Tên hiển thị)
    // - String email; (Địa chỉ email)
    // 1.2 Các phương thức:
    // - Khởi tạo ko đối và có đối số.
    // - Getters/setters

    private int id;
    private String username;
    private String password;
    private String displayName;
    private String email;

    //Khởi tạo
    public User() {}
    public User(int id, String username, String password, String displayName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }
    public void SetPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User information: " + 
        "id: " + id + 
        ", username: " + username + 
        ", password: " + password +
        ", display name: " + displayName + 
        ", email: " + email
        ;
    }
}
