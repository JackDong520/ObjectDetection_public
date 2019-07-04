package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hosttable", schema = "objectdetect", catalog = "")
public class HosttableEntity {
    private int time;
    private Long unknown;
    private Long broadbandRouter;
    private Long wap;
    private Long webcam;
    private Long router;

    @Id
    @Column(name = "Time")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Basic
    @Column(name = "Unknown")
    public Long getUnknown() {
        return unknown;
    }

    public void setUnknown(Long unknown) {
        this.unknown = unknown;
    }

    @Basic
    @Column(name = "BroadbandRouter")
    public Long getBroadbandRouter() {
        return broadbandRouter;
    }

    public void setBroadbandRouter(Long broadbandRouter) {
        this.broadbandRouter = broadbandRouter;
    }

    @Basic
    @Column(name = "WAP")
    public Long getWap() {
        return wap;
    }

    public void setWap(Long wap) {
        this.wap = wap;
    }

    @Basic
    @Column(name = "Webcam")
    public Long getWebcam() {
        return webcam;
    }

    public void setWebcam(Long webcam) {
        this.webcam = webcam;
    }

    @Basic
    @Column(name = "Router")
    public Long getRouter() {
        return router;
    }

    public void setRouter(Long router) {
        this.router = router;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HosttableEntity that = (HosttableEntity) o;
        return time == that.time &&
                Objects.equals(unknown, that.unknown) &&
                Objects.equals(broadbandRouter, that.broadbandRouter) &&
                Objects.equals(wap, that.wap) &&
                Objects.equals(webcam, that.webcam) &&
                Objects.equals(router, that.router);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, unknown, broadbandRouter, wap, webcam, router);
    }
}
