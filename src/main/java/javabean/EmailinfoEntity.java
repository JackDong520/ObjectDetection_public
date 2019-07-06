package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emailinfo", schema = "objectdetect", catalog = "")
public class EmailinfoEntity {
    private String email;
    private String domain;
    private int id;
    private String owner;

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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailinfoEntity that = (EmailinfoEntity) o;
        return id == that.id &&
                Objects.equals(email, that.email) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, domain, id, owner);
    }
}
