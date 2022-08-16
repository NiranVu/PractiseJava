package Core.Buoi2;

import java.util.Scanner;
// Nhập n từ bàn phím. Tính tổng từ 1 đến n sau đó tính trung bình
public class Baitap24 {
    public static void main(String[] args) {
        //Nhập số n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n");
        int n = scanner.nextInt();
        //Bắt đầu tính tổng các số cần xài for đỡ phải xài công thức
        int a = (n * (1 + n)) / 2;
        System.out.println(a);
        //tính trung bình
        float b = (float) a / n;
        System.out.println("trung bình = " +b);
    }
}
