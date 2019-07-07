package graphjavabean.TopologyOfIp;

import graphjavabean.TopologyOfDomain.GraphDomainInfo;
import graphjavabean.TopologyOfDomain.GraphIpInfo;

import java.util.ArrayList;

public class GraphIpSearch {
    private String ip;//查询 ip 信息的关键词
    private ArrayList<GraphDomainInfo> graphDomainInfos;//与该IP相关的domain信息；
    private ArrayList<GraphIpInfo>graphIpInfosGroupByOrg;//以组织分类ip信息
    private ArrayList<GraphIpInfo>graphIpInfosGroupByHostname;//以Hostname分类ip信息

    public GraphIpSearch() {
    }

    public GraphIpSearch(String ip, ArrayList<GraphDomainInfo> graphDomainInfos, ArrayList<GraphIpInfo> graphIpInfosGroupByOrg, ArrayList<GraphIpInfo> graphIpInfosGroupByHostname) {
        this.ip = ip;
        this.graphDomainInfos = graphDomainInfos;
        this.graphIpInfosGroupByOrg = graphIpInfosGroupByOrg;
        this.graphIpInfosGroupByHostname = graphIpInfosGroupByHostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ArrayList<GraphDomainInfo> getGraphDomainInfos() {
        return graphDomainInfos;
    }

    public void setGraphDomainInfos(ArrayList<GraphDomainInfo> graphDomainInfos) {
        this.graphDomainInfos = graphDomainInfos;
    }

    public ArrayList<GraphIpInfo> getGraphIpInfosGroupByOrg() {
        return graphIpInfosGroupByOrg;
    }

    public void setGraphIpInfosGroupByOrg(ArrayList<GraphIpInfo> graphIpInfosGroupByOrg) {
        this.graphIpInfosGroupByOrg = graphIpInfosGroupByOrg;
    }

    public ArrayList<GraphIpInfo> getGraphIpInfosGroupByHostname() {
        return graphIpInfosGroupByHostname;
    }

    public void setGraphIpInfosGroupByHostname(ArrayList<GraphIpInfo> graphIpInfosGroupByHostname) {
        this.graphIpInfosGroupByHostname = graphIpInfosGroupByHostname;
    }
}
