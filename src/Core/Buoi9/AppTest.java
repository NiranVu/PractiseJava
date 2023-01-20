package Core.Buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        // 3. Viết lớp AppTest để test lại code vừa viết
        // - Khi nhập username:
        // + Nếu sai => in ra người dùng ko tồn tại
        // + Nếu đúng => Lặp lại hỏi password
        // × Nếu password sai => In ra mật khẩu ko hợp lệ
        // x Nếu password đúng => In ra đăng nhập thành công và in ra thông tin chi tiết user đó.

        UserManagement company1 = new UserManagement();
        User user1 = new User(1, "duc123az", "123456789az", "nufadfadll", "fjdiofjdo");
        User user2 = new User(2, "duc123azxc", "123456789Az", "f1ad2f1d", "v,dlsvsva");
        company1.getUsers().add(user1);
        company1.getUsers().add(user2);

        //Test create and find account
        // company1.createUser();
        // for (int i = 0; i < company1.getUsers().size(); i++) {
        //     System.out.println(company1.getUsers().get(i));
        // }
        // System.out.println(company1.findUserByUsername("vsdfgf"));

        //Login
        Scanner scr = new Scanner(System.in);
        System.out.print("Input username: ");
        String usernameInput = scr.nextLine();

        System.out.print("Input password: ");
        String passwordInput = scr.nextLine();

        company1.loginProgram(usernameInput, passwordInput);
    }
}
