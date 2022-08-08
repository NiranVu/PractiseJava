package Homework.Buoi8.bai8_1;

import javax.security.sasl.AuthorizeCallback;

public class Book extends Document {
    String author;  //Tác giả
    int numPage;  //Số trang

    public Book() {}
    public Book(String id, String publisher, int releaseNum, String author, int numPage) {
        super.id = id;
        super.publisher = publisher;
        super.releaseNum = releaseNum;
        this.author = author;
        this.numPage = numPage;
    }

    //Getter, setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

}
