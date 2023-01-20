package Core.Buoi8.bai8_1;

public class Newspaper extends Document {
    int dayIssue;  //Ngày xuất bản

    public Newspaper() {}
    public Newspaper(String id, String publisher, int releaseNum, int dayIssue) {
        super.id = id;
        super.publisher = publisher;
        super.releaseNum = releaseNum;
        this.dayIssue = dayIssue;
    }

    //Getter, setter
    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", publisher: " + publisher +
                ", release number: " + releaseNum +
                ", daily number: " + dayIssue
        ;
    }
}
