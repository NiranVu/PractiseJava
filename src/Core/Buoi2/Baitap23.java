package Core.Buoi2;

import java.util.Scanner;
//Nhập n từ bàn phím. Tính bảng n * từ 1 đến 10
public class Baitap23 {
    public static void main(String[] args) {
//        //Nhập số n từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số =");
        int n = scanner.nextInt();
        //Bắt đầu tính
        for (int i = 1; i <= 10; i++){
            int a = n;
            a *= i;
            System.out.println(a);
        }

    }

}
