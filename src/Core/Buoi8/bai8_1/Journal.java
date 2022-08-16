package Core.Buoi8.bai8_1;

public class Journal extends Document {
    int issueNum;  // Số phát hành
    int monthIssue;  //Tháng phát hành

    public Journal() {}
    public Journal(String id, String publisher, int releaseNum, int issueNum, int monthIssue) {
        super.id = id;
        super.publisher = publisher;
        super.releaseNum = releaseNum;
        this.issueNum = issueNum;
        this.monthIssue = monthIssue;
    }

    //Getter, setter
    public int getIssueNum() {
        return issueNum;
    }

    public void setAuthor(int issueNum) {
        this.issueNum = issueNum;
    }
    
    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }
}
