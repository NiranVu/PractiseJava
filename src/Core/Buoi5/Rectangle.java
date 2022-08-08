package Homework.Buoi5;

public class Rectangle {

    //Các thuộc tính
    private int width;
    private int height;

    //Getter, setter
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    //Khởi tạo
    public Rectangle() {
    }
    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    //Tính chu vi
    public int perimeter() {
        return 2 * (width + height);
    }
    //Tính diện tích
    public int area() {
        return width * height;
    }

    //Kiểm tra phải hình vuông không
    // public Boolean checkSquare() {
    //     return width == height;
    // }

    public String checkSquare() {
        if (width == height) {
            return "Đây là hình vuông";
        } else {
            return "Đây không phải hình vuông";
        }
    }
    //Xem kết quả
    public String toPrint() {
        return "retangle have" + "[width = " + width + ", height = " + height + "]";
    }
}
