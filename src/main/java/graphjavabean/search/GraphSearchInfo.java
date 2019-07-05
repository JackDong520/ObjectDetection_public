package graphjavabean.search;

public class GraphSearchInfo {
    private String ip;//搜索结果的IP地址
    private String domain;//搜索结果的域名
    private String port;//搜索结果的端口
    private String idc;//搜索结果的idc信息
    private String country;//搜索结果的国家
    private String time;//搜索结果时间信息
    private String detailedInfo;//搜索结果的详细信息

    public GraphSearchInfo(String ip, String domain, String port, String idc, String country, String time, String detailedInfo) {
        this.ip = ip;
        this.domain = domain;
        this.port = port;
        this.idc = idc;
        this.country = country;
        this.time = time;
        this.detailedInfo = detailedInfo;
    }

    public GraphSearchInfo() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(String detailedInfo) {
        this.detailedInfo = detailedInfo;
    }
}
