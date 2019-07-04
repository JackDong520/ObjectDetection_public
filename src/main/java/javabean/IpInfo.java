package javabean;

public class IpInfo {
    public String Ip;
    public String Domain;
    public String Email;
    public String Location;

    public IpInfo(String ip, String domain, String email, String location) {
        Ip = ip;
        Domain = domain;
        Email = email;
        Location = location;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
