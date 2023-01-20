package Core.Buoi5;

import java.util.Scanner;

public class MainRectangle {
    // - Viết lớp Test để test thử. (width và height nhập từ bàn phím)
    public static void main(String[] args) {
        //Input the height
        Scanner scr = new Scanner(System.in);
        System.out.print("Input the height = ");
        int h = scr.nextInt();

        //input the width
        System.out.print("input the width = ");
        int w = scr.nextInt();

        Rectangle test1 = new Rectangle(w, h);

        System.out.println("Show the result" + test1.toPrint());
        System.out.println("Area = " + test1.area());
        System.out.println("perimeter = " + test1.perimeter());
        System.out.println("Check the square = " + test1.checkSquare());

    }
    
}
