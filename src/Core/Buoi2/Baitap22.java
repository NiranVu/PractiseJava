package Core.Buoi2;

import java.util.Scanner;
// Nhập số từ bàn phím tính n + nn + nnn
public class Baitap22 {

    // Write a Java program that accepts an integer (n) and computes the value of n + nn + nnn
    // Input: User input a number n
    // Output: Print result of operation: n + nn + nnn = ?

    public static void main(String[] args) {
        //Input n and a
        Scanner scr = new Scanner(System.in);
        System.out.println("Input n = ");
        int n = scr.nextInt();

        //Calculate
        int output_ = n + n * n + n * n * n;
        System.out.println("Result = " + output_);
    }
}
