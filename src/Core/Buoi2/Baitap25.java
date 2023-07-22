package Core.Buoi2;

import java.util.Scanner;

public class Baitap25 {

    // Write a Java program to multiply two given integer numbers without using the multiply operator(*)
    // - First number = 5
    // - Second number = 9
    // - result = 45

    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        int a = scanner.nextInt();

        System.out.print("Input b = ");
        int b = scanner.nextInt();


        //Calculate
        int sum = 0;
        if (b < 0) {
            b = -b;
            a = -a;
        } // the type of b and a is always positive value

        for (int i = 1; i <= b; i += 1){
            sum += a;
        }

        System.out.println(a + " * " + b + " = " + sum);
    }
}
