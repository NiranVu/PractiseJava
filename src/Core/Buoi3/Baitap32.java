package Core.Buoi3;
//Viết chương trình chuyển số thập phân ra số nhị phân


import java.util.Scanner;

public class Baitap32 {
    public static void main(String[] args) {
        // Nhập giá trị
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập giá trị muốn đổi = ");
        int n = scr.nextInt();
        
        //Bắt đầu làm
        int bi;
        while (n > 0) {
            bi = n % 2;
            System.out.print(bi);
            n /= 2;
        }
    }
}
