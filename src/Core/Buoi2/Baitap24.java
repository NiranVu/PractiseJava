package Core.Buoi2;

import java.util.Scanner;
public class Baitap24 {

    // Write a Java program to input a number n, print to screen the sum and average of 1-n.
    // int sum = 1+2+...+n;
    // float avg = (float)(1+2+...+n)/n;

    public static void main(String[] args) {
        //Input n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();

        //Calculation following formula
        int sumStackValue = (n * (1 + n)) / 2; //formula follow arithmetic progression
        System.out.println(sumStackValue);
        float averageSumVal = (float) sumStackValue / n;  //changing type of value
        System.out.println("Average value = " + averageSumVal);
    }
}
