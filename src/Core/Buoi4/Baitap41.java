package Core.Buoi4;

import java.util.Scanner;

public class Baitap41{

    static int[] addValueArray (int[] a) {
        //Thêm giá trị vào mảng
        for (int i = 0; i < a.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập phần tử mong muốn ");
            int u = scr.nextInt();
            a[i] = u;
        }
        return a;
    }

    static int[] mergeArray (int[] a1, int[] a2, int[] a3) {
        //Hàm gộp 2 array
        int i3 = 0;
        int i1 = 0;
        int i2 = 0;
        
        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] >= a2[i2]) {
                a3[i3] = a1[i1];
                i1++;
            }
            else {
                a3[i3] = a2[i2];
                i2++;
            }
            i3++;
        }
        while (i1 < a1.length) {
            a3[i3] = a1[i1];
            i1++;
            i3++;
        }

        while (i2 < a2.length) {
            a3[i3] = a2[i2];
            i2++;
            i3++;
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
        // int[] array1 = {1, 2, 3, 4};
        // int[] array2 = {2, 5, 7, 8};
        
        //Tạo mảng 1
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Nhập số phần tử mong muốn = ");
        int n = scr1.nextInt();

        int[] array1 = new int[n];
        addValueArray(array1);
        
        //Tạo mảng 2
        Scanner scr2 = new Scanner(System.in);
        System.out.print("Nhập số phần tử mong muốn = ");
        int m = scr2.nextInt();

        int[] array2 = new int[m];
        addValueArray(array2);
        
        //Tạo mảng 3
        int array3 [] = new int[array1.length + array2.length];
    
        //Gộp mảng
        mergeArray(array1, array2, array3);

        //Sắp xếp mảng
        bubbleSort(array3);

        //xem thử kết quả mảng
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " ");
        }
    }
}