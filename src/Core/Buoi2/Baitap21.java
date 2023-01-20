package Core.Buoi2;

import java.util.Scanner;
//Nhập số từ bàn phím tính tổng hiệu chia phần nguyên, chia phần dư nha
public class Baitap21 {
<<<<<<< HEAD
    
    //  Write a simple program to read two number (a, b) from the keyboard and display the result of below operations on the screen:
    // 1. a+b
    // 2. a-b
    // 3. a*b
    // 4. a/b
    // 5. a%b
=======
    public static void main(String[] args) {
        //Nhập 2 số a và b
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b = ");
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
>>>>>>> 0d2c87715db6ab6f536197988acdc859c512ffa9

    public static void main(String[] args) {
        //Input two number:
        Scanner scr = new Scanner(System.in);
        System.out.print("Input A: ");
        int numA = scr.nextInt();
        System.out.print("Input B: ");
        int numB = scr.nextInt();

        //calculate:
        int sum = numA + numB;
        System.out.println("Sum of two numbers: " + sum);
        int subs = Math.abs(numA - numB);
        System.out.println("Substraction of two numbers: " + subs);
        int mul = numA * numB;
        System.out.println("multiplication of two numbers: " + mul);
        int divideByInteger = numA / numB;
        System.out.println("Divide with integer of two numbers: " + divideByInteger);
        int divideByRemainder = numA % numB;
        System.out.println("Divide with remainder of two numbers: " + divideByRemainder);
    }
}
