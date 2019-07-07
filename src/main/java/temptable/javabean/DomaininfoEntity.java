package temptable.javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "domaininfo", schema = "objectdetect", catalog = "")
public class DomaininfoEntity {
    private String domain;
    private String ip;
    private String subdomain;
    private String parentdomain;
    private String email;
    private int id;

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "subdomain")
    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    @Basic
    @Column(name = "Parentdomain")
    public String getParentdomain() {
        return parentdomain;
    }

    public void setParentdomain(String parentdomain) {
        this.parentdomain = parentdomain;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomaininfoEntity that = (DomaininfoEntity) o;
        return id == that.id &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(subdomain, that.subdomain) &&
                Objects.equals(parentdomain, that.parentdomain) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, ip, subdomain, parentdomain, email, id);
    }
}
