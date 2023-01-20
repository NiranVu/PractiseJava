package Core.Buoi2;

import java.util.Scanner;
//Nhập n từ bàn phím. Tính bảng n * từ 1 đến 10
public class Baitap23 {

    // Write a Java program that takes a number as input and prints its multiplication table upto 10
    // Input a number: 8
    // Expected Output :
    // 8 x 1 = 8
    // 8 x 2 = 16
    // 8 x 3 = 24
    // ...
    // 8 x 10 = 80

    public static void main(String[] args) {
        //Input n
        Scanner scr = new Scanner(System.in);
        System.out.print("Input expected value = ");
        int n = scr.nextInt();

        //Calculate
        for (int i = 1; i <= 10; i++){
            int a = n;
            a *= i;
            System.out.println(n + " * " + i + " = " + a);
        }
    }
}
