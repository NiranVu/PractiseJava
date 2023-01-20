package Core.Buoi3;
import java.util.Scanner;

public class Baitap31 {

    // Print fibonacci with max length from user input
    // Input fibonacci length: 5
    // Expect output:
    // 1, 1, 2, 3, 5

    public static void main(String[] args) {
        //Input
        Scanner scr = new Scanner(System.in);
        System.out.print("Input the length of fibonacci = ");
        int lengthFibonacci = scr.nextInt();

        //Calculate
        int previousNum = 0;
        int laterNum = 1;
        if (lengthFibonacci == 0){
            System.out.println("Do not have fibonacci's number");
        }
        else{
            System.out.print("1, ");
            for (int i = 0; i < lengthFibonacci / 2; i++){
                previousNum += laterNum;
                System.out.print(previousNum + ", ");
                laterNum += previousNum;
                System.out.print(laterNum + ", ");
            }
        }
    }
}
