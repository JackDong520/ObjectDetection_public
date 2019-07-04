package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "webcontaiontable", schema = "objectdetect", catalog = "")
public class WebcontaiontableEntity {
    private byte time;
    private Long apacheHttpd;
    private Long microsoftIisHttpd;
    private Long nginx;
    private Long varnish;
    private Long tengine;
    private Long litespeed;
    private Long apacheTrafficServer;
    private Long apacheTomcat;

    @Id
    @Column(name = "Time")
    public byte getTime() {
        return time;
    }

    public void setTime(byte time) {
        this.time = time;
    }

    @Basic
    @Column(name = "ApacheHttpd")
    public Long getApacheHttpd() {
        return apacheHttpd;
    }

    public void setApacheHttpd(Long apacheHttpd) {
        this.apacheHttpd = apacheHttpd;
    }

    @Basic
    @Column(name = "MicrosoftIISHttpd")
    public Long getMicrosoftIisHttpd() {
        return microsoftIisHttpd;
    }

    public void setMicrosoftIisHttpd(Long microsoftIisHttpd) {
        this.microsoftIisHttpd = microsoftIisHttpd;
    }

    @Basic
    @Column(name = "Nginx")
    public Long getNginx() {
        return nginx;
    }

    public void setNginx(Long nginx) {
        this.nginx = nginx;
    }

    @Basic
    @Column(name = "Varnish")
    public Long getVarnish() {
        return varnish;
    }

    public void setVarnish(Long varnish) {
        this.varnish = varnish;
    }

    @Basic
    @Column(name = "Tengine")
    public Long getTengine() {
        return tengine;
    }

    public void setTengine(Long tengine) {
        this.tengine = tengine;
    }

    @Basic
    @Column(name = "Litespeed")
    public Long getLitespeed() {
        return litespeed;
    }

    public void setLitespeed(Long litespeed) {
        this.litespeed = litespeed;
    }

    @Basic
    @Column(name = "ApacheTrafficServer")
    public Long getApacheTrafficServer() {
        return apacheTrafficServer;
    }

    public void setApacheTrafficServer(Long apacheTrafficServer) {
        this.apacheTrafficServer = apacheTrafficServer;
    }

    @Basic
    @Column(name = "ApacheTomcat")
    public Long getApacheTomcat() {
        return apacheTomcat;
    }

    public void setApacheTomcat(Long apacheTomcat) {
        this.apacheTomcat = apacheTomcat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebcontaiontableEntity that = (WebcontaiontableEntity) o;
        return time == that.time &&
                Objects.equals(apacheHttpd, that.apacheHttpd) &&
                Objects.equals(microsoftIisHttpd, that.microsoftIisHttpd) &&
                Objects.equals(nginx, that.nginx) &&
                Objects.equals(varnish, that.varnish) &&
                Objects.equals(tengine, that.tengine) &&
                Objects.equals(litespeed, that.litespeed) &&
                Objects.equals(apacheTrafficServer, that.apacheTrafficServer) &&
                Objects.equals(apacheTomcat, that.apacheTomcat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, apacheHttpd, microsoftIisHttpd, nginx, varnish, tengine, litespeed, apacheTrafficServer, apacheTomcat);
    }
}
