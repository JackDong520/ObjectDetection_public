package temptable.temp;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "http_emaildata", schema = "objectdetect", catalog = "")
public class HttpEmaildataEntity {
    private int id;
    private String domain;
    private String organization;
    private String emails;

    public HttpEmaildataEntity() {
    }

    public HttpEmaildataEntity(int id, String domain, String organization, String emails) {
        this.id = id;
        this.domain = domain;
        this.organization = organization;
        this.emails = emails;
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
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "emails")
    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpEmaildataEntity that = (HttpEmaildataEntity) o;
        return id == that.id &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(organization, that.organization) &&
                Objects.equals(emails, that.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domain, organization, emails);
    }
}
