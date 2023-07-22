package DataBase.Buoi3;

public class Laptop {
       /*Viết hàm tìm kiếm laptop theo các tiêu chí sau:

    1. Theo maker nhập vào.
    2. Theo type.
    3. Theo screen_resolution.
    4. Theo giá > 10000000 và số lượng đã bán phải >= 30
    5. Theo khoảng giá từ x đến y.
    Yêu cầu: Viết hàm, build câu SQL phù hợp với từng trường hợp, thực hiện tìm kiếm và trả ra List<Laptop>*/

    private String name;
    private String maker;
    private String type;
    private String screenResolution;
    private long price;
    private int sold;

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", type='" + type + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", price=" + price +
                ", sold=" + sold +
                '}';
    }
}
