package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pluginbug", schema = "objectdetect", catalog = "")
public class PluginbugEntity {
    private String plugin;
    private String keyname;
    private String submittime;
    private Integer buglevel;
    private int id;

    @Basic
    @Column(name = "plugin")
    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @Basic
    @Column(name = "Keyname")
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
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
    public Integer getBuglevel() {
        return buglevel;
    }

    public void setBuglevel(Integer buglevel) {
        this.buglevel = buglevel;
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
        PluginbugEntity that = (PluginbugEntity) o;
        return id == that.id &&
                Objects.equals(plugin, that.plugin) &&
                Objects.equals(keyname, that.keyname) &&
                Objects.equals(submittime, that.submittime) &&
                Objects.equals(buglevel, that.buglevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plugin, keyname, submittime, buglevel, id);
    }
}
