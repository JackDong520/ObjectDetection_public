package graphjavabean.TopologyOfDomain;

public class GraphIpInfo {
    private String ip;//ip的信息
    private String hostname;//主机名
    private String location;//ip地址
    private String country;//ip所在的国家
    private String city;//ip所在的城市
    private String org;//ip所属于的组织

    public GraphIpInfo(String ip, String hostname, String location, String country, String city, String org) {
        this.ip = ip;
        this.hostname = hostname;
        this.location = location;
        this.country = country;
        this.city = city;
        this.org = org;
    }


    public GraphIpInfo() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }
}
