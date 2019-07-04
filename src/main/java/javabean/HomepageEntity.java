package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "homepage", schema = "objectdetect", catalog = "")
public class HomepageEntity {
    private byte time;
    private Byte monitorTable;
    private Byte hostTable;
    private Byte webContaionTable;
    private Byte socialWebTable;
    private Byte emailTable;
    private Byte bugTable;

    @Id
    @Column(name = "Time")
    public byte getTime() {
        return time;
    }

    public void setTime(byte time) {
        this.time = time;
    }

    @Basic
    @Column(name = "MonitorTable")
    public Byte getMonitorTable() {
        return monitorTable;
    }

    public void setMonitorTable(Byte monitorTable) {
        this.monitorTable = monitorTable;
    }

    @Basic
    @Column(name = "HostTable")
    public Byte getHostTable() {
        return hostTable;
    }

    public void setHostTable(Byte hostTable) {
        this.hostTable = hostTable;
    }

    @Basic
    @Column(name = "WEBContaionTable")
    public Byte getWebContaionTable() {
        return webContaionTable;
    }

    public void setWebContaionTable(Byte webContaionTable) {
        this.webContaionTable = webContaionTable;
    }

    @Basic
    @Column(name = "SocialWebTable")
    public Byte getSocialWebTable() {
        return socialWebTable;
    }

    public void setSocialWebTable(Byte socialWebTable) {
        this.socialWebTable = socialWebTable;
    }

    @Basic
    @Column(name = "EmailTable")
    public Byte getEmailTable() {
        return emailTable;
    }

    public void setEmailTable(Byte emailTable) {
        this.emailTable = emailTable;
    }

    @Basic
    @Column(name = "BugTable")
    public Byte getBugTable() {
        return bugTable;
    }

    public void setBugTable(Byte bugTable) {
        this.bugTable = bugTable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomepageEntity that = (HomepageEntity) o;
        return time == that.time &&
                Objects.equals(monitorTable, that.monitorTable) &&
                Objects.equals(hostTable, that.hostTable) &&
                Objects.equals(webContaionTable, that.webContaionTable) &&
                Objects.equals(socialWebTable, that.socialWebTable) &&
                Objects.equals(emailTable, that.emailTable) &&
                Objects.equals(bugTable, that.bugTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, monitorTable, hostTable, webContaionTable, socialWebTable, emailTable, bugTable);
    }
}
