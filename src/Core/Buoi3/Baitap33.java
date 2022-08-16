package Core.Buoi3;
// Thiết kế chương trình tính tiền điện

import java.util.Scanner;

public class Baitap33 {
    public static void main(String[] args) {
        //Biến ghi tiền điện
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập số tiền điện nhà bạn = ");
        int n = scr.nextInt();

        //Bắt đầu tính số tiền điện
        float sum = 0;
        float cost_e;
        // int cost_e;
        for (int i = 1; i <= 6; i++) {
            if (n > 400) {
                cost_e = (n - 400) * 2.399f;
                sum += cost_e;
                n -= (n - 400);
                continue;
            }
            else if (n <= 400) {
                cost_e = (n - 300) * 2.324f;
                sum += cost_e;
                n -= (n - 300);
                continue;
            }
            else if (n <= 300) {
                cost_e = (n - 200) * 2.082f;
                sum += cost_e;
                n -= (n - 200);
                continue;
            }
            else if (n <= 200) {
                cost_e = (n - 100) * 1.660f;
                sum += cost_e;
                n -= (n - 100);
                continue;
            }
            else if (n <= 100) {
                cost_e = (n - 50) * 1.433f;
                sum += cost_e;
                n -= (n - 50);
                continue;
            }
            else if (n  <= 50) {
                cost_e = n * 1.388f;
                sum += cost_e;
                break;
            }

        }
        System.out.println("Số tiền cần đóng là " + sum);


    }
}
