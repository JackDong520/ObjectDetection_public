package graphjavabean.BugSearch;

import java.util.ArrayList;

public class GraphBugInfo {
    private String SSVID;//SSV ID
    private String submitTime;//提交时间
    private String bugLevel;//漏洞等级
    private String bugName;//漏洞名称
    private String bugStatus;//漏洞状态

    public GraphBugInfo(String SSVID, String submitTime, String bugLevel, String bugName, String bugStatus) {
        this.SSVID = SSVID;
        this.submitTime = submitTime;
        this.bugLevel = bugLevel;
        this.bugName = bugName;
        this.bugStatus = bugStatus;
    }

    public GraphBugInfo() {
    }

    public String getSSVID() {
        return SSVID;
    }

    public void setSSVID(String SSVID) {
        this.SSVID = SSVID;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getBugLevel() {
        return bugLevel;
    }

    public void setBugLevel(String bugLevel) {
        this.bugLevel = bugLevel;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }
}
