package Core.Buoi8.bai8_1;


public abstract class Document {
    String id;  // Mã tài liệu
    String publisher;  // Tên nhà phát hành
    int releaseNum;  // Số bản phát hành

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
