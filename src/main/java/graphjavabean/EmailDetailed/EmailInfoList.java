package graphjavabean.EmailDetailed;

import java.util.ArrayList;

public class EmailInfoList {
    private String domain;
    private String source;
    private ArrayList<EmailDetailed> emailDetaileds;

    public EmailInfoList() {
    }

    public EmailInfoList(String domain, String source, ArrayList<EmailDetailed> emailDetaileds) {
        this.domain = domain;
        this.source = source;
        this.emailDetaileds = emailDetaileds;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<EmailDetailed> getEmailDetaileds() {
        return emailDetaileds;
    }

    public void setEmailDetaileds(ArrayList<EmailDetailed> emailDetaileds) {
        this.emailDetaileds = emailDetaileds;
    }
}
