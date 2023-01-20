package Core.Buoi3;

import java.util.Scanner;

public class Baitap32 {

    // Write a Java program to convert a decimal number to binary number
    // Input Data: User input a decimal number
    // Output: Print result of that number in binary

    // Example:
    // Input a Decimal Number : 5
    // Expected Output
    // Binary number is: 101

    public static void main(String[] args) {
        //Input
        Scanner scr = new Scanner(System.in);
        System.out.print("Input value wanna change = ");
        int val = scr.nextInt();
        
        //Calculate
        int binaryVal;
        while (val > 0) {
            binaryVal = val % 2;
            System.out.print(binaryVal);
            val /= 2;
        }
    }
}
