package graphjavabean.TopologyOfDomain;

import java.util.ArrayList;

public class GraphDomainSearch {
    private String domain;//查询 父 Domain信息的关键词
    private ArrayList<GraphDomainInfo> graphDomainInfos;//查询出子域名的信息
    private ArrayList<GraphIpInfo> graphIpInfos;//查询出与主域名相关的IP信息

    public GraphDomainSearch() {
    }

    public GraphDomainSearch(String domain, ArrayList<GraphDomainInfo> domaininfoEntities, ArrayList<GraphIpInfo> ipinfoEntities) {
        this.domain = domain;
        this.graphDomainInfos = domaininfoEntities;
        this.graphIpInfos = ipinfoEntities;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ArrayList<GraphDomainInfo> getGraphDomainInfos() {
        return graphDomainInfos;
    }

    public void setGraphDomainInfos(ArrayList<GraphDomainInfo> graphDomainInfos) {
        this.graphDomainInfos = graphDomainInfos;
    }

    public ArrayList<GraphIpInfo> getGraphIpInfos() {
        return graphIpInfos;
    }

    public void setGraphIpInfos(ArrayList<GraphIpInfo> graphIpInfos) {
        this.graphIpInfos = graphIpInfos;
    }
}
