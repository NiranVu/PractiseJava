package Core.Buoi2;

import java.util.Scanner;
// Viết chương trình tính tích không được dùng dấu nhân
public class Baitap25 {
    public static void main(String[] args) {
        //Nhập số a và b từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a = ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b = ");
        int b = scanner.nextInt();
        //Bắt đầu tính
        //Luôn để số b dương để chạy vòng for nhưng đổi dấu b phải đổi dấu cả a mới hợp lý
        int sum = 0;
        if (b < 0) {
            b = -b;
            a = -a;
        }

        for (int i = 1; i <= b; i += 1){
            sum += a;
        }
        System.out.println(sum);
    }
}
