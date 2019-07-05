package graphjavabean;

public class GraphEmailInfo {
    private String EmailName;//邮箱的名字
    private String owner;//邮箱的拥有者

    public GraphEmailInfo() {
    }

    public GraphEmailInfo(String emailName, String owner) {
        EmailName = emailName;
        this.owner = owner;
    }

    public String getEmailName() {
        return EmailName;
    }

    public void setEmailName(String emailName) {
        EmailName = emailName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
