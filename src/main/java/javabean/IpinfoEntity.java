package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ipinfo", schema = "objectdetect", catalog = "")
public class IpinfoEntity {
    private String ip;
    private String domain;
    private String location;
    private String country;
    private String hostname;
    private String org;
    private String city;
    private int id;

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "hostname")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Basic
    @Column(name = "org")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        IpinfoEntity that = (IpinfoEntity) o;
        return id == that.id &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(location, that.location) &&
                Objects.equals(country, that.country) &&
                Objects.equals(hostname, that.hostname) &&
                Objects.equals(org, that.org) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, domain, location, country, hostname, org, city, id);
    }

    public IpinfoEntity(String ip, String domain, String location, String country, String hostname, String org, String city, int id) {
        this.ip = ip;
        this.domain = domain;
        this.location = location;
        this.country = country;
        this.hostname = hostname;
        this.org = org;
        this.city = city;
        this.id = id;
    }

    public IpinfoEntity() {
    }
}
