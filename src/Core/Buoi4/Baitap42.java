package Core.Buoi4;

import java.util.Scanner;

public class Baitap42 {

    // Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
    // Input: [20, 20, 30, 40, 50, 50, 50]
    // Expect Output:
    // After removing the duplicate elements the program should return 4 as the new length of the array

    static int[] addValueArray(int[] a) {
        //Add value into array
        for (int i = 0; i < a.length; i++) {

            Scanner scr = new Scanner(System.in);
            System.out.print("Input value = ");
            int val = scr.nextInt();

            a[i] = val;
        }
        return a;
    }

    static int[] bubbleSort(int [] a) {
        //Sort array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp = a[i];
                if (a[i] < a[j]) {
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static int[] removeDuplicate(int[] a, int n) {
        int [] b = new int[n];
        int j = 0;
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            if (b[j] != a[i]) {
                j++;
                b[j] = a[i];
            }
        }

        int[] c = new int[j + 1];
        for (int i = 0; i <= j; i++) {
            c[i] = b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        //Input the length of array
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Length of array = ");
        int n = scr1.nextInt();

        //Add value into array
        int[] array1 = new int[n];
        addValueArray(array1);


        //Sort array
        bubbleSort(array1);

        //remove duplicate in array
        int[] array2 = removeDuplicate(array1, array1.length);

        //Check result
        System.out.println("Original array");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Result array");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("length of result array: " + array2.length);
    }
}
