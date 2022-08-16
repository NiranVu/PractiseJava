package Core.BuoiBonus.ExtraExcercise.BaiTap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitap1 {
    // public static void main(String[] args) {
    //     int choice = -1;
    //     Scanner input = new Scanner(System.in);
    //     while (choice != 0) {
    //         System.out.println("Menu");
    //         System.out.println("1. draw the trigangle");
    //         System.out.println("2. draw the square");
    //         System.out.println("0. exit");
    //         choice = input.nextInt();
    //         switch (choice) {
    //             case 1:
    //                 System.out.println("Draw the triangle");
    //                 System.out.println("****");
    //                 System.out.println("***");
    //                 System.out.println("**");
    //                 System.out.println("*");
    //                 break;
    //             case 2:
    //                 System.out.println("draw the square");
    //                 System.out.println("* * * *");
    //                 System.out.println("* * * *");
    //                 System.out.println("* * * *");
    //                 System.out.println("* * * *");

    //         }
    //     }
    // }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(9, "Duc", "22"));
        studentList.add(new Student(8, "Hoang", "18"));
        studentList.add(new Student(9, "Anh", "7"));

        int choice = -1;

        Scanner scr = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sinh viên");
            System.out.println("2. Thêm sinh viên vào");
            System.out.println("3. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("4. Tính điểm trung bình của lớp");
            System.out.println("5. Tìm và sửa điểm sinh viên theo tên");
            System.out.println("0. exit");

            System.out.print("Chọn menu: ");
            int check = 0;
            while (check == 0) {
                try {
                    choice = scr.nextInt();
                    check = 1;
                } catch (Exception e) {
                    System.out.print("Vui lòng nhập số: ");
                    scr.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                    break;

                case 2:
                    String age;
                    String name;
                    int point;
                    System.out.print("Nhập điểm: ");
                    point = scr.nextInt();
                    scr.nextLine();
                    System.out.print("Nhấp tên: ");
                    name = scr.nextLine();
                    System.out.print("Nhập tuổi: ");
                    age = scr.nextLine();
                    studentList.add(new Student(point, name, age));
                    System.out.println("Thêm thành công");
                    break;
                
                case 3:
                    int highestPoint = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getPoint() > highestPoint) {
                            highestPoint = studentList.get(i).getPoint();
                        }
                    }
                    List<Student> studentMax = new ArrayList<>();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getPoint() == highestPoint) {
                            studentMax.add(studentList.get(i));
                        }
                    }
                    for (int i = 0; i < studentMax.size(); i++) {
                        System.out.println(studentMax.get(i));
                    }
                    break;

                case 4:
                    double averageClass = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        averageClass += studentList.get(i).getPoint();
                    }
                    averageClass /= studentList.size();
                    System.out.println("Điểm trung bình lớp: " + averageClass);
                    break;

                case 5:
                    String nameFind;
                    scr.nextLine();
                    System.out.print("Nhập tên cần sửa: ");
                    nameFind = scr.nextLine();
                    int flag = 0;

                    for(int i = 0; i < studentList.size(); i++) {
                        if (nameFind.equalsIgnoreCase(studentList.get(i).getName())) {
                            System.out.println("Đã tìm thấy bạn đó");
                            flag = 1;
                            System.out.println(studentList.get(i));
                            System.out.print("Nhập điểm muốn đổi: ");
                            int fixPoint = scr.nextInt();
                            studentList.get(i).setPoint(fixPoint);
                            System.out.println(studentList.get(i));
                        }
                    }

                    if (flag != 1) {
                        System.out.println("Không tìm thấy bạn đó");
                    }
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice");
            }
        }
    }
    
}