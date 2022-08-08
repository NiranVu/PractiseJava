package Homework.Buoi4;

import java.util.Scanner;

public class Baitap42 {
    static int[] addValueArray(int[] a) {
        //Thêm giá trị vào mảng
        for (int i = 0; i < a.length; i++) {

            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập giá trị = ");
            int u = scr.nextInt();

            a[i] = u;
        }
        return a;
    }

    static int[] bubbleSort(int [] a) {
        //sắp xếp mảng bubbleSort
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
        int j = 0;
        int [] b = new int[n];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i +1]) {
                b[j] = a[i];
                j++;
            }
        }

        if (b[j] != a[a.length - 1]) {
            b[j] = a[a.length - 1];
            j++;
        }

        int[] c = new int[j];
        for (int i = 0; i < j; i++) {
            c[i] = b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        //Nhập độ lớn của mảng
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Nhập số giá trị mong muốn = ");
        int n = scr1.nextInt();

        //Tạo mảng
        int[] array1 = new int[n];
        addValueArray(array1);

        //Sắp xếp mảng
        bubbleSort(array1);

        //Loại bỏ duplicate
        int[] array2 = removeDuplicate(array1, n);

        //Kiểm tra mảng
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(array2.length);
    }
}
