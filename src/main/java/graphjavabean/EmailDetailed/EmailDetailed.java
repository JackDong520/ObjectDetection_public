package graphjavabean.EmailDetailed;

import java.net.URI;

public class EmailDetailed {
    private String email;
    private String domain;
    private String uri;
    private String type;
    private String first_name ;
    private String last_name;
    private String position;
    private String seniority;
    private String department;
    private String linkedin;
    private String twitter;
    private String phone_number;

    public EmailDetailed(String email, String domain, String uri, String type, String first_name, String last_name, String position, String seniority, String department, String linkedin, String twitter, String phone_number) {
        this.email = email;
        this.domain = domain;
        this.uri = uri;
        this.type = type;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.seniority = seniority;
        this.department = department;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.phone_number = phone_number;
    }

    public EmailDetailed() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
