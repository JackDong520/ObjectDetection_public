package temptable.temp;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "http_emailsource", schema = "objectdetect", catalog = "")
public class HttpEmailsourceEntity {
    private int id;
    private String email;
    private String domain;
    private String uri;
    private Integer stillOnPage;

    public HttpEmailsourceEntity() {
    }

    public HttpEmailsourceEntity(int id, String email, String domain, String uri, Integer stillOnPage) {
        this.id = id;
        this.email = email;
        this.domain = domain;
        this.uri = uri;
        this.stillOnPage = stillOnPage;
    }


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "uri")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Basic
    @Column(name = "still_on_page")
    public Integer getStillOnPage() {
        return stillOnPage;
    }

    public void setStillOnPage(Integer stillOnPage) {
        this.stillOnPage = stillOnPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpEmailsourceEntity that = (HttpEmailsourceEntity) o;
        return id == that.id &&
                Objects.equals(email, that.email) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(uri, that.uri) &&
                Objects.equals(stillOnPage, that.stillOnPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, domain, uri, stillOnPage);
    }
}
