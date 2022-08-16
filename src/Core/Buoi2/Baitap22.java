package Core.Buoi2;

import java.util.Scanner;
// Nhập số từ bàn phím tính n + nn + nnn
public class Baitap22 {
    public static void main(String[] args) {
        //Nhập số n từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n = ");
        int n = scanner.nextInt();
        //Bắt đầu tính toán
        int output_ = n + n * n + n * n * n;
        System.out.println("Kết quả = " + output_);
    }
}
