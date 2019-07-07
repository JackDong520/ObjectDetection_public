package temptable.javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "buginfo", schema = "objectdetect", catalog = "")
public class BuginfoEntity {
    private String ip;
    private String plugin;
    private String ssvid;
    private String submittime;
    private String buglevel;
    private String bugname;
    private String bugstatus;
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
    @Column(name = "plugin")
    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @Basic
    @Column(name = "SSVID")
    public String getSsvid() {
        return ssvid;
    }

    public void setSsvid(String ssvid) {
        this.ssvid = ssvid;
    }

    @Basic
    @Column(name = "submittime")
    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime;
    }

    @Basic
    @Column(name = "buglevel")
    public String getBuglevel() {
        return buglevel;
    }

    public void setBuglevel(String buglevel) {
        this.buglevel = buglevel;
    }

    @Basic
    @Column(name = "bugname")
    public String getBugname() {
        return bugname;
    }

    public void setBugname(String bugname) {
        this.bugname = bugname;
    }

    @Basic
    @Column(name = "bugstatus")
    public String getBugstatus() {
        return bugstatus;
    }

    public void setBugstatus(String bugstatus) {
        this.bugstatus = bugstatus;
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
        BuginfoEntity that = (BuginfoEntity) o;
        return id == that.id &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(plugin, that.plugin) &&
                Objects.equals(ssvid, that.ssvid) &&
                Objects.equals(submittime, that.submittime) &&
                Objects.equals(buglevel, that.buglevel) &&
                Objects.equals(bugname, that.bugname) &&
                Objects.equals(bugstatus, that.bugstatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, plugin, ssvid, submittime, buglevel, bugname, bugstatus, id);
    }
}
