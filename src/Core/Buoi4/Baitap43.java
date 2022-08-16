package Core.Buoi4;

import java.util.Scanner;

public class Baitap43 {
    static int[] addValueArray(int[] a) {
        //Nhập giá trị vào mảng
        for (int i = 0; i < a.length; i++) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Nhập giá trị = ");
            int u = scr.nextInt();
            a[i] = u;
        }
        return a;
    }

    static int[] arraySequency(int[] a) {
        //Tìm chuỗi có độ dài liên tiếp dài nhất
        int starts = 0;
        int ends = 0;
        int results = 0;
        int longestOfStart = 0;
        int longestOfEnd = 0;
        int currentMax = 0;
        for (int i = 1; i < a.length; i++) {
            starts = i - 1;
            while (i < a.length && a[i] - a[i - 1] == 1) {
                i++;
                ends = i;
            }
            results = ends - starts;
            if (results > currentMax) {
                currentMax = results;
                longestOfEnd = ends;
                longestOfStart = starts;
            }
        }
        int[] b = new int[currentMax];
        for (int j = 0; j < b.length; j++) {
            b[j] = a[longestOfStart + j];
        }
        return b;
    }

    static int lengthOfLongest(int[] a) {    
        //Tìm độ dài nhất của chuỗi
        int count = 1;
        int flag = 0;
        while (count < (a.length - 1)) {
            int tempCount = 0;
            for (int i = count; i < a.length; i++) {
                if (a[i] - a[i - 1] == 1) {
                    tempCount++;
                    count++;
                } 
                else {
                    if (tempCount > flag) {
                        flag = count;
                    }
                    count++;
                    break;
                }
            }
        }
        return flag + 1;
    }
    public static void main(String[] args) {
        //Tạo mảng, nhập giá trị
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập số lượng trong mảng = ");
        int n = scr.nextInt();

        int[] array1 = new int[n];

        addValueArray(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Độ dài nhất
        int x = lengthOfLongest(array1);
        System.out.println(x);

        System.out.println(" ");

        //In ra chuỗi dài nhất
        int[] array2 = arraySequency(array1);
        for (int i : array2) {
            System.out.print(i + " ");
        }

    }
    
}
