package service.graphservice;

import com.google.gson.Gson;
import graphjavabean.TopologyOfDomain.GraphDomainInfo;
import graphjavabean.TopologyOfDomain.GraphDomainSearch;
import graphjavabean.TopologyOfDomain.GraphEmailInfo;
import graphjavabean.TopologyOfDomain.GraphIpInfo;

import java.util.ArrayList;
//
public class DomainGraph {

    //通过Domain 信息 获取 拓扑图
    public String getGraphFromDomain(String domain){
        String jsonString = new String();
        GraphIpInfo graphIpInfo = new GraphIpInfo("20.30.59.169");
        GraphIpInfo graphIpInfo1 = new GraphIpInfo("20.30.59.156");
        ArrayList<GraphIpInfo> graphIpInfoArrayList = new ArrayList<>();
        graphIpInfoArrayList.add(graphIpInfo);
        graphIpInfoArrayList.add(graphIpInfo1);
//        for (int i = 0;i<graphIpInfoArrayList.size();i++){
////            System.out.println(graphIpInfoArrayList.get(i).getIp());
////        }
        GraphEmailInfo graphEmailInfo = new GraphEmailInfo("724083996@qq.com",domain);
        GraphEmailInfo graphEmailInfo1 = new GraphEmailInfo("724083996@qq.com",domain);

        ArrayList<GraphEmailInfo>graphEmailInfos = new ArrayList<>();
        graphEmailInfos.add(graphEmailInfo);
        graphEmailInfos.add(graphEmailInfo1);

        GraphDomainInfo graphDomainInfo = new GraphDomainInfo();
        graphDomainInfo.setGraphIpInfos(graphIpInfoArrayList);
        graphDomainInfo.setGraphEmailInfos(graphEmailInfos);
        graphDomainInfo.setDomainName(domain);

        ArrayList<GraphDomainInfo>graphDomainInfos = new ArrayList<>();
        graphDomainInfos.add(graphDomainInfo);
        graphDomainInfos.add(graphDomainInfo);
        graphDomainInfos.add(graphDomainInfo);

        GraphDomainSearch graphDomainSearch = new GraphDomainSearch();
        graphDomainSearch.setDomain(domain);
        graphDomainSearch.setGraphDomainInfos(graphDomainInfos);
        graphDomainSearch.setGraphIpInfos(graphIpInfoArrayList);

        Gson gson = new Gson();

        jsonString = gson.toJson(graphDomainSearch);

        return jsonString;
    }

    //通过Ip 信息 获取 拓扑图
    public String getGraphFromIp(String Ip){
        String jsonString = new String();

        return jsonString;
    }



}
