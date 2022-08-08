package Homework.Buoi5;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        //Nhập chiều dài
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Nhập chiều dài = ");
        int w = scr1.nextInt();

        //Nhập chiều rộng
        Scanner scr2 = new Scanner(System.in);
        System.out.print("Nhập chiều cao = ");
        int h = scr2.nextInt();

        Rectangle test1 = new Rectangle(w, h);

        System.out.println("Xuất ra kết quả hình" + test1.toPrint());
        System.out.println("diện tích = " + test1.area());
        System.out.println("Chi vi = " + test1.perimeter());
        System.out.println("Kiểm tra hình vuông = " + test1.checkSquare());

    }
    
}
