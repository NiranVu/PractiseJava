package Core.Buoi5;

public class Rectangle {
    // Viết lớp Rectangle có:
    // - Các thuộc tính:
    // + width
    // + height
    // - Các phương thức:
    // + Khởi tạo
    // + Getters/Setters
    // + Tính chu vi
    // + Tính hiện tích
    // + In ra width, height
    // + Kiểm tra xem có là hình vuông không.


    //Attribute
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

    //Construction
    public Rectangle() {
    }
    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    //method
    //Calculate the perimeter
    public int perimeter() {
        return 2 * (width + height);
    }
    //calculate the area
    public int area() {
        return width * height;
    }

    //Check the square
    // public Boolean checkSquare() {
    //     return width == height;
    // }

    public String checkSquare() {
        if (width == height) {
            return "This is the square";
        } else {
            return "This is not the square";
        }
    }
    //
    public String toPrint() {
        return "retangle have" + 
                "[ " + 
                "width = " + width + 
                ", height = " + height + 
                " ]";
    }
}
