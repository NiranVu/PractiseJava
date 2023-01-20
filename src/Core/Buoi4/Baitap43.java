package Core.Buoi4;

import java.util.Scanner;

public class Baitap43 {

    // Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
    // Input: [49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10]
    // The longest consecutive elements sequence is [2, 3, 4, 5], therefore the program will return its length 4
    // Advanced: Print above array result.

    static int[] addValueArray(int[] a) {
        //Input value into array
        for (int i = 0; i < a.length - 1; i++) {  //With the method 1, needing to change a.length - 1 = a.length
            Scanner scr = new Scanner(System.in);
            System.out.print("Input value " + (i + 1) + " = ");
            int val = scr.nextInt();
            a[i] = val;
        }
        return a;
    }

    //C1
    // static int[] arraySequency(int[] a) {
    //     //Find the longest array
    //     int starts = 0;
    //     int ends = 0;
    //     int results = 0;
    //     int longestOfStart = 0;
    //     int longestOfEnd = 0;
    //     int currentMax = 0;
    //     for (int i = 1; i < a.length; i++) {
    //         starts = i - 1;
    //         while (i < a.length && a[i] - a[i - 1] == 1) {
    //             i++;
    //             ends = i;
    //         }
    //         results = ends - starts;
    //         if (results > currentMax) {
    //             currentMax = results;
    //             longestOfEnd = ends;
    //             longestOfStart = starts;
    //         }
    //     }
    //     int[] b = new int[currentMax];
    //     for (int j = 0; j < b.length; j++) {
    //         b[j] = a[longestOfStart + j];
    //     }
    //     return b;
    // }

    // static int lengthOfLongest(int[] a) {    
    //     //Finding the longest length
    //     int count = 1;
    //     int flag = 0;
    //     while (count < (a.length - 1)) {
    //         int tempCount = 0;
    //         for (int i = count; i < a.length; i++) {
    //             if (a[i] - a[i - 1] == 1) {
    //                 tempCount++;
    //                 count++;
    //             } 
    //             else {
    //                 if (tempCount > flag) {
    //                     flag = count;
    //                 }
    //                 count++;
    //                 break;
    //             }
    //         }
    //     }
    //     return flag + 1;
    // }

    //C2: 
    static int[] resultProblem(int[] a) {
    //Creating array storing value of starting point of consecutive number and its length
        int[] arrayStoreVal = new int[a.length * 2];
        int indexArr = 0;
        int flagStart = 0;
        int flagEnd = 0;
        int longestLength = 0;
        int flagMaxLength = 0;
        int maxArr = 0;
        int[] storeMaxValue = new int[2];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] - 1 && i != a.length - 1) {
                flagEnd++;
            } else {
                longestLength = flagEnd - flagStart;
                arrayStoreVal[indexArr] = flagStart;
                indexArr++;
                arrayStoreVal[indexArr] = longestLength;
                indexArr++;
                flagStart = i + 1;
                flagEnd = i + 1;
            }
            if (longestLength > maxArr) {
                maxArr = longestLength;
                flagMaxLength = flagStart - longestLength - 1;
                storeMaxValue[0] = flagMaxLength;
                storeMaxValue[1] = maxArr;
            }
        }
    return storeMaxValue;
    }

    static int[] showArr(int[] root, int[] resultProblem) {
        int[] resultArr = new int[resultProblem[1] + 1];
        int indexArr = 0;
        for (int i = resultProblem[0]; i <= (resultProblem[0] + resultProblem[1]); i++) {
            resultArr[indexArr] = root[i];
            indexArr++;
        }
        return resultArr;
    }


    public static void main(String[] args) {
        //Create array
        Scanner scr = new Scanner(System.in);
        System.out.print("length of array = ");
        int n = scr.nextInt();

        // //Test C1:
        // int[] array1 = new int[n];
        // addValueArray(array1);
        // for (int i : array1) {
        //     System.out.print(i + " ");
        // }
        // System.out.println(" ");

        // //Calculate
        // //The longest length
        // int x = lengthOfLongest(array1);
        // System.out.print(x);
        // System.out.println("");

        // //The longest array
        // int[] array2 = resultProblem(array1);
        // for (int i : array2) {
        //     System.out.print(i + " ");
        // }

        //Test C2:
        int[] array1 = new int[n + 1];
        addValueArray(array1);

        //Calculate
        int[] subResult = resultProblem(array1);
        for (int i = 0; i < subResult.length; i++) {
            System.out.print(subResult[i] + " ");
        }
        System.out.println(" ");
        System.out.print("The longest array: ");

        //show the result
        int[] result = showArr(array1, subResult);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(" ");
        System.out.print("The longest length: " +  result.length);
    }
    
}