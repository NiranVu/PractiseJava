package Core.Buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement {

    // 2. Lớp UserManagement gồm có:
    // 2.1 Các thuộc tính:
    // - int totalUser; (Tổng số user cần quản lý)
    // - User[] users; (Mảng danh sách các user)
    // 2.2 Các phương thức:
    // - Khởi tạo ko đối số (Khi khởi tạo bắt người dùng nhập vào thông tin chi tiết user. Khi nhập thông tin cho từng user lưu ý nếu người dùng nhập vào thông tin username đã tồn tại thì bắt người dùng nhập lại)
    // - Viết phương thức findUserByUsername với đối số truyền vào là username, kết quả trả về User nếu tìm thấy, nếu ko trả về null.
    // - Viết hàm login với đối số truyền vào là username, password, tìm kiếm và so sánh username/password nếu tìm thấy trả về User, nếu ko ném ra 1 exception (ngoại lệ)

    private int totalUser;
    private List<User> users = new ArrayList<>();
    

    // Constructor
    public UserManagement() {

    }

    //getter, setter
    public int getTotalUser() {
        return totalUser;
    }
    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    //Input user
    public void createUser() {
        Scanner scr = new Scanner(System.in);
    
        System.out.print("Input ID: " );
        int id = scr.nextInt();
        scr.nextLine();

        //xử lí exceptopn số ở ID vì ng dùng có thể nhập chữ

        String userName = "";
        while (true) {
            System.out.print("Input username: ");
            userName = scr.nextLine();
            
            int flag = 0;
            for (int i = 0; i < users.size(); i++) {
                if (userName.equals(users.get(i).getUsername())) {
                    flag++;
                }
            }
            if (flag == 0) {
                break;
            } else {
                System.out.println("Username has already existed");
            }
        }

        System.out.print("Input password: ");
        String password = scr.nextLine();

        System.out.print("Input display name: ");
        String displayName = scr.nextLine();

        System.out.print("Input email: ");
        String email = scr.nextLine();

        User user = new User(id, userName, password, displayName, email);
        System.out.println(user.toString());
    }

    //find user follow username
    public String findUserByUsername(String userName) {
        String result = null;
        for (int i = 0; i < users.size(); i++) {
            if (userName.equals(users.get(i).getUsername())) {
                result = users.get(i).toString();
            }
        }
        return result;
    }

    //login
    public void loginProgram(String checkUsername, String checkPassword) {
        int flagUsername = 0;
        for (int i = 0; i < users.size(); i++) {
            if (checkUsername.equals(users.get(i).getUsername())) {
                flagUsername++;
            }
        }
        if (flagUsername == 1) {

            int flagPassword = 0;
            for (int i = 0; i < users.size(); i++) {
                if (checkPassword.equals(users.get(i).getPassword())) {
                    flagPassword++;
                }
            }
            if (flagPassword == 1) {
                System.out.println("Successful login");
            } else {
                System.out.println("Password is wrong");
            }
        } else {
            System.out.println("username is wrong");
        }

    }


}
