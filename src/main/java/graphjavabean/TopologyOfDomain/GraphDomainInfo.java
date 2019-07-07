package graphjavabean.TopologyOfDomain;

import java.util.*;

public class GraphDomainInfo {

    private String domainName;//生成类后的域名的名称，为该图的键值
    private ArrayList<GraphEmailInfo>graphEmailInfos;//该域名下的所有邮箱的信息


    public GraphDomainInfo() {
    }

    public GraphDomainInfo(String domainName, ArrayList<GraphEmailInfo> graphEmailInfos, ArrayList<GraphIpInfo> graphIpInfos) {
        this.domainName = domainName;
        this.graphEmailInfos = graphEmailInfos;

    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ArrayList<GraphEmailInfo> getGraphEmailInfos() {
        return graphEmailInfos;
    }

    public void setGraphEmailInfos(ArrayList<GraphEmailInfo> graphEmailInfos) {
        this.graphEmailInfos = graphEmailInfos;
    }




}
