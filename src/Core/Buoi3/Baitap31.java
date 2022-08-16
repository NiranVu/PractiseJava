package Core.Buoi3;
//Viết dãy số fibonanci

import java.util.Scanner;

public class Baitap31 {
    public static void main(String[] args) {
        //Nhập số lượng fibo mong muốn
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng fibo mong muốn = ");
        int n = scr.nextInt();
        //Bắt đầu tính
        int a = 1;
        int b = 1;
        if (n == 0){
            System.out.println("Không có số fibo nào");
        }
        else{
            for (int i =1; i < n; i++){
                switch (i){
                    case 2:
                        System.out.println(b);
                        break;
                    default:
                        a += b;
                        System.out.println(a);
                        b += a;
                        System.out.println(b);
                }
            }
        }

    }
}
