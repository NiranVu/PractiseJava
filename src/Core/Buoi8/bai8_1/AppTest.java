package Core.Buoi8.bai8_1;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        DocumentManagement library1 = new DocumentManagement();
        int yourCommand = -1;
        
        while (yourCommand != 5) {
            System.out.println("Your have 4 option: \n 1) add document \n 2) Detail of document \n 3) remove document \n 4) search document following type \n 5) quit");
            Scanner scr = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Input your command: ");
                    yourCommand = scr.nextInt();
                    if (yourCommand == 5) {
                        break;
                    }
                } catch (Exception e) {
                        System.out.println("Your input is wrong, repeating input ");
                        scr.nextLine();
                }
                switch (yourCommand) {
                    case 1:
                        System.out.println(library1.addDocuments());
                        break;
                    case 2:
                        library1.informationOfDocument();
                        break;
                    case 3:
                        System.out.println(library1.deleteDocument());
                        break;
                    case 4:
                        library1.searchType();
                        break;
                }
            }
        }
    }
}
