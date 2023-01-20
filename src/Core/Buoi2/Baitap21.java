package Core.Buoi2;

import java.util.Scanner;
//Nhập số từ bàn phím tính tổng hiệu chia phần nguyên, chia phần dư nha
public class Baitap21 {
    
    //  Write a simple program to read two number (a, b) from the keyboard and display the result of below operations on the screen:
    // 1. a+b
    // 2. a-b
    // 3. a*b
    // 4. a/b
    // 5. a%b

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
