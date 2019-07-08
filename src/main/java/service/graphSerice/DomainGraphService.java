package service.graphSerice;

import graphjavabean.TopologyOfDomain.GraphDomainInfo;
import graphjavabean.TopologyOfDomain.GraphDomainSearch;
import graphjavabean.TopologyOfDomain.GraphEmailInfo;
import graphjavabean.TopologyOfDomain.GraphIpInfo;
import temptable.javabean.DomaininfoEntity;
import temptable.javabean.EmailinfoEntity;
import temptable.javabean.IpinfoEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;

//
public class DomainGraphService extends BaseService {

    //通过Domain 信息 获取 拓扑图
    public String getDoaminGraphFromDomain(String domain) {



        //在domain表中查找ip信息，然后通过ip表查询信息返回关于这个ip的所有信息；以及与这个ip相关的信息；
        ;
        /**
         *
         */
        ArrayList<IpinfoEntity> ipinfoEntities = ipInfoDao.selectIpinfoFromDomain(domain);
        //给GraphIpInfo添加数据;GraphDomainSearch 中的ArrayList<GraphIpInfo>
        ArrayList<GraphIpInfo> graphIpInfos = ipInfoToGraphIpInfo(ipinfoEntities);


        //DomainInfo 表中查找 domain 返回 arrylist<domain>
        ArrayList<DomaininfoEntity> domaininfoEntities = domainIndoDao.selectDomainInfoFromDomain(domain);
        //
        ArrayList<GraphIpInfo> graphIpInfosInSubDomain = new ArrayList<>();
        ArrayList<GraphEmailInfo> graphEmailInfosInSubDoamin = new ArrayList<>();
        //根据域名表查找每个域名的IP信息和Email信息
        //给GraphIpInfo添加数据;GraphDomainSearch 中的ArrayList<GraphDomainInfo>
        ArrayList<GraphDomainInfo> graphDomainInfos = new ArrayList<>();
        for (int i = 0; i < domaininfoEntities.size(); i++) {
            GraphDomainInfo graphDomainInfo = new GraphDomainInfo();
            graphDomainInfo.setDomainName(domaininfoEntities.get(i).getDomain());
            ArrayList<IpinfoEntity> ipinfoEntitiesInSubDomain = ipInfoDao.selectIpinfoFromDomain(domaininfoEntities.get(i).getDomain());
            //提取出来的GraphIp信息

            ArrayList<EmailinfoEntity> emailinfoEntitiesInSubDomain = emailInfoDao.selectEmailInfoByDomain(domaininfoEntities.get(i).getDomain());
            graphDomainInfo.setGraphEmailInfos(emailinfoToGraphEmailInfo(emailinfoEntitiesInSubDomain));
            graphDomainInfos.add(graphDomainInfo);
        }

        GraphDomainSearch graphDomainSearch = new GraphDomainSearch(domain,graphDomainInfos,graphIpInfos);
        //查找与该域名相关的 子域名的信息 和父域名的信息 以及邮件的信息
        returnJsonString = gson.toJson(graphDomainSearch);
        return returnJsonString;
    }

    //通过Ip 信息 获取 拓扑图
    private String getGraphFromIp(String Ip) {
        String jsonString = new String();

        return jsonString;
    }

    private ArrayList<GraphIpInfo> ipInfoToGraphIpInfo(ArrayList<IpinfoEntity> ipinfoEntities) {
        //如果查询到的数据为空则返回null
        if(ipinfoEntities == null)
            return null;
        ArrayList<GraphIpInfo> graphIpInfos = new ArrayList<>();
        GraphIpInfo graphIpInfo = new GraphIpInfo();
        for (int i = 0; i < ipinfoEntities.size(); i++) {
            graphIpInfo.setIp(ipinfoEntities.get(i).getIp());
            graphIpInfo.setCity(ipinfoEntities.get(i).getCity());
            graphIpInfo.setCountry(ipinfoEntities.get(i).getCountry());
            graphIpInfo.setHostname(ipinfoEntities.get(i).getHostname());
            graphIpInfo.setLocation(ipinfoEntities.get(i).getLocation());
            graphIpInfos.add(graphIpInfo);
        }
        return graphIpInfos;
    }


    private ArrayList<DomaininfoEntity> getGraphDomainlistByDomainFromIpinfo(String domain){

        return null;
    }
    private ArrayList<GraphDomainInfo> getDomainlistGroupByDomain(String domain){

        return null;
    }


    @Test
    public void test(){
        System.out.println(new DomainGraphService().getDoaminGraphFromDomain("taobao.com"));
    }

}
