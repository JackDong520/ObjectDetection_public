package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ipdetailedinfo", schema = "objectdetect", catalog = "")
public class IpdetailedinfoEntity {
    private String ip;
    private Integer geoinfoAsn;
    private String geoinfoCity;
    private String geoinfoCountryCode;
    private String geoinfoCountryName;
    private String geoinfoContinentCode;
    private String geoinfoContinentName;
    private Double geoinfoLocationLatitude;
    private Double geoinfoLocationLongitude;
    private Integer port;
    private String banner;
    private String portinfoApp;
    private String portinfoHostname;
    private String portinfoOs;
    private String portinfoVersion;
    private String portinfoInfo;
    private String portinfoDevice;

    @Id
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "geoinfo.asn")
    public Integer getGeoinfoAsn() {
        return geoinfoAsn;
    }

    public void setGeoinfoAsn(Integer geoinfoAsn) {
        this.geoinfoAsn = geoinfoAsn;
    }

    @Basic
    @Column(name = "geoinfo.city")
    public String getGeoinfoCity() {
        return geoinfoCity;
    }

    public void setGeoinfoCity(String geoinfoCity) {
        this.geoinfoCity = geoinfoCity;
    }

    @Basic
    @Column(name = "geoinfo.country.code")
    public String getGeoinfoCountryCode() {
        return geoinfoCountryCode;
    }

    public void setGeoinfoCountryCode(String geoinfoCountryCode) {
        this.geoinfoCountryCode = geoinfoCountryCode;
    }

    @Basic
    @Column(name = "geoinfo.country.name")
    public String getGeoinfoCountryName() {
        return geoinfoCountryName;
    }

    public void setGeoinfoCountryName(String geoinfoCountryName) {
        this.geoinfoCountryName = geoinfoCountryName;
    }

    @Basic
    @Column(name = "geoinfo.continent.code")
    public String getGeoinfoContinentCode() {
        return geoinfoContinentCode;
    }

    public void setGeoinfoContinentCode(String geoinfoContinentCode) {
        this.geoinfoContinentCode = geoinfoContinentCode;
    }

    @Basic
    @Column(name = "geoinfo.continent.name")
    public String getGeoinfoContinentName() {
        return geoinfoContinentName;
    }

    public void setGeoinfoContinentName(String geoinfoContinentName) {
        this.geoinfoContinentName = geoinfoContinentName;
    }

    @Basic
    @Column(name = "geoinfo.location.latitude")
    public Double getGeoinfoLocationLatitude() {
        return geoinfoLocationLatitude;
    }

    public void setGeoinfoLocationLatitude(Double geoinfoLocationLatitude) {
        this.geoinfoLocationLatitude = geoinfoLocationLatitude;
    }

    @Basic
    @Column(name = "geoinfo.location.longitude")
    public Double getGeoinfoLocationLongitude() {
        return geoinfoLocationLongitude;
    }

    public void setGeoinfoLocationLongitude(Double geoinfoLocationLongitude) {
        this.geoinfoLocationLongitude = geoinfoLocationLongitude;
    }

    @Basic
    @Column(name = "port")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Basic
    @Column(name = "banner")
    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Basic
    @Column(name = "portinfo.app")
    public String getPortinfoApp() {
        return portinfoApp;
    }

    public void setPortinfoApp(String portinfoApp) {
        this.portinfoApp = portinfoApp;
    }

    @Basic
    @Column(name = "portinfo.hostname")
    public String getPortinfoHostname() {
        return portinfoHostname;
    }

    public void setPortinfoHostname(String portinfoHostname) {
        this.portinfoHostname = portinfoHostname;
    }

    @Basic
    @Column(name = "portinfo.os")
    public String getPortinfoOs() {
        return portinfoOs;
    }

    public void setPortinfoOs(String portinfoOs) {
        this.portinfoOs = portinfoOs;
    }

    @Basic
    @Column(name = "portinfo.version")
    public String getPortinfoVersion() {
        return portinfoVersion;
    }

    public void setPortinfoVersion(String portinfoVersion) {
        this.portinfoVersion = portinfoVersion;
    }

    @Basic
    @Column(name = "portinfo.info")
    public String getPortinfoInfo() {
        return portinfoInfo;
    }

    public void setPortinfoInfo(String portinfoInfo) {
        this.portinfoInfo = portinfoInfo;
    }

    @Basic
    @Column(name = "portinfo.device")
    public String getPortinfoDevice() {
        return portinfoDevice;
    }

    public void setPortinfoDevice(String portinfoDevice) {
        this.portinfoDevice = portinfoDevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IpdetailedinfoEntity that = (IpdetailedinfoEntity) o;
        return Objects.equals(ip, that.ip) &&
                Objects.equals(geoinfoAsn, that.geoinfoAsn) &&
                Objects.equals(geoinfoCity, that.geoinfoCity) &&
                Objects.equals(geoinfoCountryCode, that.geoinfoCountryCode) &&
                Objects.equals(geoinfoCountryName, that.geoinfoCountryName) &&
                Objects.equals(geoinfoContinentCode, that.geoinfoContinentCode) &&
                Objects.equals(geoinfoContinentName, that.geoinfoContinentName) &&
                Objects.equals(geoinfoLocationLatitude, that.geoinfoLocationLatitude) &&
                Objects.equals(geoinfoLocationLongitude, that.geoinfoLocationLongitude) &&
                Objects.equals(port, that.port) &&
                Objects.equals(banner, that.banner) &&
                Objects.equals(portinfoApp, that.portinfoApp) &&
                Objects.equals(portinfoHostname, that.portinfoHostname) &&
                Objects.equals(portinfoOs, that.portinfoOs) &&
                Objects.equals(portinfoVersion, that.portinfoVersion) &&
                Objects.equals(portinfoInfo, that.portinfoInfo) &&
                Objects.equals(portinfoDevice, that.portinfoDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, geoinfoAsn, geoinfoCity, geoinfoCountryCode, geoinfoCountryName, geoinfoContinentCode, geoinfoContinentName, geoinfoLocationLatitude, geoinfoLocationLongitude, port, banner, portinfoApp, portinfoHostname, portinfoOs, portinfoVersion, portinfoInfo, portinfoDevice);
    }
}
