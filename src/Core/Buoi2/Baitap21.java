package Homework.Buoi2;

import java.util.Scanner;
//Nhập số từ bàn phím tính tổng hiệu chia phần nguyên, chia phần dư nha
public class Baitap21 {
    public static void main(String[] args) {
        //Nhập 2 số a và b
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a = ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b = ");
        int b = scanner.nextInt();
        //Bắt đầu tính
        int sum = a + b;
        System.out.println("tong 2 so = " + sum);
        int sub = a - b;
        System.out.println("hieu 2 so = " + sub);
        int add = a * b;
        System.out.println("tich 2 so = " + add);
        int divideByInteger = a / b;
        System.out.println("Chia lay phan nguyen = " + divideByInteger);
        int divideByRemainder = a % b;
        System.out.println("chia lay phan du = " + divideByRemainder);

    }
}
