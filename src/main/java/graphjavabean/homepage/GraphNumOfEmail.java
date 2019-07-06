package graphjavabean.homepage;

public class GraphNumOfEmail {
    private int numOfGmail;
    private int numOfIcloud;
    private int numOf163;
    private int numOfqq;
    private int numOfOtherEmail;

    public GraphNumOfEmail(int numOfGmail, int numOfIcloud, int numOf163, int numOfqq, int numOfOtherEmail) {
        this.numOfGmail = numOfGmail;
        this.numOfIcloud = numOfIcloud;
        this.numOf163 = numOf163;
        this.numOfqq = numOfqq;
        this.numOfOtherEmail = numOfOtherEmail;
    }

    public int getNumOfGmail() {
        return numOfGmail;
    }

    public void setNumOfGmail(int numOfGmail) {
        this.numOfGmail = numOfGmail;
    }

    public int getNumOfIcloud() {
        return numOfIcloud;
    }

    public void setNumOfIcloud(int numOfIcloud) {
        this.numOfIcloud = numOfIcloud;
    }

    public int getNumOf163() {
        return numOf163;
    }

    public void setNumOf163(int numOf163) {
        this.numOf163 = numOf163;
    }

    public int getNumOfqq() {
        return numOfqq;
    }

    public void setNumOfqq(int numOfqq) {
        this.numOfqq = numOfqq;
    }

    public int getNumOfOtherEmail() {
        return numOfOtherEmail;
    }

    public void setNumOfOtherEmail(int numOfOtherEmail) {
        this.numOfOtherEmail = numOfOtherEmail;
    }
}
