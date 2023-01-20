package Core.Buoi3;
// Thiết kế chương trình tính tiền điện

import java.util.Scanner;

public class Baitap33 {

    // Write a program to calculate the amount of electricity used

    public static void main(String[] args) {
        //Input electricity usage
        Scanner scr = new Scanner(System.in);
        System.out.print("Input electricity usage = ");
        int EleUsage = scr.nextInt();

        //Calculate
        float sum = 0;
        
        if (EleUsage <= 50 && EleUsage >= 0) {
            sum = 50 * 1388;
        }
        else if (EleUsage >= 51 && EleUsage <= 100) {
            sum = 50 * 1388 + (EleUsage - 50) * 1433;
        }
        else if (EleUsage >= 101 && EleUsage <= 200) {
            sum = 50 * 1388 + 50 * 1433 + (EleUsage - 100) * 1660;
        }
        else if (EleUsage >= 201 && EleUsage <= 300) {
            sum = 50 * 1388 + 50 * 1433 + 50 * 1660 + (EleUsage - 200) * 2082;
        }
        else if (EleUsage >= 301 && EleUsage <= 400) {
            sum = 50 * 1388 + 50 * 1433 + 50 * 1660 + 500 * 2082 + (EleUsage - 300) * 2324;
        }
        else if (EleUsage > 400) {
            sum = 50 * 1388 + 50 * 1433 + 50 * 1660 + 500 * 2082 + 50 * 2324 + (EleUsage - 400) * 2399;
        }

        System.out.println("Your electricity bill = " + sum);
    }
}
