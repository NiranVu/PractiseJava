package Core.Buoi4;

import java.util.Scanner;

public class Baitap41{

    // Write a Java program to merge two given sorted array of integers and create a new sorted array
    // Input:
    // array1 = [1,2,3,4]
    // array2 = [2,5,7, 8]
    // Expect output:
    // result = [1,2,2,3,4,5,7,8]


    static int[] addValueArray (int[] a) {
        //Add value into array
        for (int i = 0; i < a.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Value: ");
            int val = scr.nextInt();
            a[i] = val;
        }
        return a;
    }

    static int[] mergeArray (int[] a1, int[] a2, int[] a3) {
        //merge two array
        int flagIndexNewArr = 0;
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
            flagIndexNewArr++;
        }
        for (int j = 0; j < a2.length; j++) {
            a3[flagIndexNewArr] = a2[j];
            flagIndexNewArr++;
        }
        return a3;
    }


    static int[] bubbleSort (int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a.length; c++) {
                int temp = a[c];
                if (a[i] < a[c]) {
                    a[c] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        //Create array 1
        Scanner scr1 = new Scanner(System.in);
        System.out.print("A number of value in array 1 = ");
        int lengthArray1 = scr1.nextInt();
        int[] array1 = new int[lengthArray1]; //create array1
        addValueArray(array1);
        
        //Tạo mảng 2
        Scanner scr2 = new Scanner(System.in);
        System.out.print("A number of value in array 2 = ");
        int lengthArray2 = scr2.nextInt();
        int[] array2 = new int[lengthArray2]; //create array2
        addValueArray(array2);
        
        //Merge array
        int array3 [] = new int[array1.length + array2.length]; //create array3
        mergeArray(array1, array2, array3);

        //Sort array
        bubbleSort(array3);

        //Check result
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + ", ");
        }
    }
}