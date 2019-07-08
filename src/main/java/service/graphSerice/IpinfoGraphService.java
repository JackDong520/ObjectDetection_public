package service.graphSerice;

import com.google.gson.Gson;
import graphjavabean.TopologyOfDomain.GraphDomainInfo;
import graphjavabean.TopologyOfIp.GraphIpSearch;
import temptable.javabean.IpinfoEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class IpinfoGraphService extends BaseService {

    //通过Domain 信息 获取 拓扑图
    public String getIpGraphFromIp(String ip) {
        GraphIpSearch graphIpSearch = new GraphIpSearch();

        graphIpSearch.setIp(ip);

        ArrayList<IpinfoEntity> ipinfoEntities = getIpinfoListFromIp(ip);
        if (ipinfoEntities == null)
        {
            graphIpSearch.setGraphDomainInfos(null);
            graphIpSearch.setGraphIpInfosGroupByHostname(null);
            graphIpSearch.setGraphDomainInfos(null);
            graphIpSearch.setGraphIpInfosGroupByOrg(null);
        }else {
            graphIpSearch.setGraphIpInfosGroupByOrg(getGraphIpinfoFromIpinfo(getIpinfoListFromOrg(ipinfoEntities.get(0).getOrg())));
            graphIpSearch.setGraphIpInfosGroupByHostname(getGraphIpinfoFromIpinfo(getIpinfoListFromHostname(ipinfoEntities.get(0).getHostname())));
            graphIpSearch.setGraphDomainInfos(getDomainInfoListFromInfoList(ipinfoEntities));
        }
        return new Gson().toJson(graphIpSearch);
    }

    //吧数据从Ipinfo 转为Graph LIST
    private ArrayList<GraphDomainInfo> getDomainInfoListFromInfoList(ArrayList<IpinfoEntity> ipinfoEntities) {
        ArrayList<GraphDomainInfo> graphDomainInfos = new ArrayList<>();
        for (int i = 0; i < ipinfoEntities.size(); i++) {
            GraphDomainInfo graphDomainInfo = new GraphDomainInfo();
            graphDomainInfo.setGraphEmailInfos(emailinfoToGraphEmailInfo(getEmailListFromDomain(ipinfoEntities.get(i).getDomain())));
            graphDomainInfo.setDomainName(ipinfoEntities.get(i).getDomain());
            graphDomainInfos.add(graphDomainInfo);
        }
        return graphDomainInfos;
    }

    @Test
    public void test(){
        System.out.println(getIpGraphFromIp("127.0.0.1"));
    }


}
