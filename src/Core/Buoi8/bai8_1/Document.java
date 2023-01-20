package Core.Buoi8.bai8_1;


public abstract class Document {

    // - Một thư viện cần quản lý các tài liệu bao gồm: Sách, Tạp chí, Báo. Mỗi tài liệu gồm có các thuộc tính sau: 
    // //Mã tài liệu(Mã tài liệu là duy nhất)(String id), 
    // //Tên nhà xuất bản(String publisher), 
    // //Số bản phát hành(int number).
    // + Các loại sách cần quản lý thêm các thuộc tính: tên tác giả(String author), số trang(int numberPage).
    // + Các tạp chí cần quản lý thêm: Số phát hành(int issueNumber), tháng phát hành(int monthIssue).
    // + Các báo cần quản lý thêm: Ngày phát hành(int dayIssue).

    String id;
    String publisher;
    int releaseNum;

    public Document() {}
    public Document(String id, String publisher, int releaseNum) {
        this.id = id;
        this.publisher = publisher;
        this.releaseNum = releaseNum;
    }

    //Getter, setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseNum() {
        return releaseNum;
    }
    public void setReleaseNum(int releaseNum) {
        this.releaseNum = releaseNum;
    }
}
