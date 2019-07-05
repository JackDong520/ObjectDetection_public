package graphjavabean;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.util.*;

public class GraphDomainInfo {

    private String domainName;//生成类后的域名的名称，为该图的键值
    private ArrayList<GraphEmailInfo>graphEmailInfos;//该域名下的所有邮箱的信息
    private ArrayList<GraphIpInfo>graphIpInfos;//该域名对应的Ip的信息

    public GraphDomainInfo() {
    }

    public GraphDomainInfo(String domainName, ArrayList<GraphEmailInfo> graphEmailInfos, ArrayList<GraphIpInfo> graphIpInfos) {
        this.domainName = domainName;
        this.graphEmailInfos = graphEmailInfos;
        this.graphIpInfos = graphIpInfos;
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

    public ArrayList<GraphIpInfo> getGraphIpInfos() {
        return graphIpInfos;
    }

    public void setGraphIpInfos(ArrayList<GraphIpInfo> graphIpInfos) {
        this.graphIpInfos = graphIpInfos;
    }


    @Test
    public void testDomainGraph(){
        GraphIpInfo graphIpInfo = new GraphIpInfo("20.30.59.169");
        GraphIpInfo graphIpInfo1 = new GraphIpInfo("20.30.59.156");
        ArrayList<GraphIpInfo>graphIpInfoArrayList = new ArrayList<>();
        graphIpInfoArrayList.add(graphIpInfo);
        graphIpInfoArrayList.add(graphIpInfo1);
//        for (int i = 0;i<graphIpInfoArrayList.size();i++){
////            System.out.println(graphIpInfoArrayList.get(i).getIp());
////        }
        GraphEmailInfo graphEmailInfo = new GraphEmailInfo("724083996@qq.com","jack");
        GraphEmailInfo graphEmailInfo1 = new GraphEmailInfo("724083996@qq.com","jack");

        ArrayList<GraphEmailInfo>graphEmailInfos = new ArrayList<>();
        graphEmailInfos.add(graphEmailInfo);
        graphEmailInfos.add(graphEmailInfo1);

        GraphDomainInfo graphDomainInfo = new GraphDomainInfo();
        graphDomainInfo.setGraphIpInfos(graphIpInfoArrayList);
        graphDomainInfo.setGraphEmailInfos(graphEmailInfos);
        graphDomainInfo.setDomainName("fuking");

        ArrayList<GraphDomainInfo>graphDomainInfos = new ArrayList<>();
        graphDomainInfos.add(graphDomainInfo);
        graphDomainInfos.add(graphDomainInfo);
        graphDomainInfos.add(graphDomainInfo);

        GraphDomainSearch graphDomainSearch = new GraphDomainSearch();
        graphDomainSearch.setDomain("fuking.com");
        graphDomainSearch.setGraphDomainInfos(graphDomainInfos);
        graphDomainSearch.setGraphIpInfos(graphIpInfoArrayList);

        Gson gson = new Gson();

        String jsonString = gson.toJson(graphDomainSearch);
        System.out.println(jsonString);


    }
}
