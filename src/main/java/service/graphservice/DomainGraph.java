package service.graphservice;

import Dao.DomainIndoDao;
import Dao.EmailInfoDao;
import Dao.IpInfoDao;
import com.google.gson.Gson;
import graphjavabean.TopologyOfDomain.GraphDomainInfo;
import graphjavabean.TopologyOfDomain.GraphDomainSearch;
import graphjavabean.TopologyOfDomain.GraphEmailInfo;
import graphjavabean.TopologyOfDomain.GraphIpInfo;
import javabean.DomaininfoEntity;
import javabean.EmailinfoEntity;
import javabean.IpinfoEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;

//
public class DomainGraph {
    private static String returnJsonString;
    private static IpInfoDao ipInfoDao;
    private static DomainIndoDao domainIndoDao;
    private static EmailInfoDao emailInfoDao;
    private static Gson gson;

    static {
        returnJsonString = new String();
        ipInfoDao = new IpInfoDao();
        domainIndoDao = new DomainIndoDao();
        emailInfoDao = new EmailInfoDao();
        gson = new Gson();
    }

    //通过Domain 信息 获取 拓扑图
    public String getGraphFromDomain(String domain) {

        GraphDomainSearch graphDomainSearch = new GraphDomainSearch();
        graphDomainSearch.setDomain(domain);
        //在domain表中查找ip信息，然后通过ip表查询信息返回关于这个ip的所有信息；以及与这个ip相关的信息；
        ArrayList<IpinfoEntity> ipinfoEntities = ipInfoDao.selectIpinfoFromDomain(domain);
        //给GraphIpInfo添加数据;GraphDomainSearch 中的ArrayList<GraphIpInfo>
        ArrayList<GraphIpInfo> graphIpInfos = ipInfoToGraphIpInfo(ipinfoEntities);
        /**
         *
         */
        graphDomainSearch.setGraphIpInfos(graphIpInfos);

        //DomainInfo 表中查找 domain 返回 arrylist<domain>
        ArrayList<DomaininfoEntity> domaininfoEntities = domainIndoDao.selectIpinfoFromDomain(domain);
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
            graphDomainInfo.setGraphIpInfos(ipInfoToGraphIpInfo(ipinfoEntitiesInSubDomain));
            ArrayList<EmailinfoEntity> emailinfoEntitiesInSubDomain = emailInfoDao.selectEmailInfoByDomain(domaininfoEntities.get(i).getDomain());
            graphDomainInfo.setGraphEmailInfos(emailinfoToGraphEmailInfo(emailinfoEntitiesInSubDomain));
            graphDomainInfos.add(graphDomainInfo);
        }
        graphDomainSearch.setGraphDomainInfos(graphDomainInfos);

        //查找与该域名相关的 子域名的信息 和父域名的信息 以及邮件的信息
        returnJsonString = gson.toJson(graphDomainSearch);
        return returnJsonString;
    }

    //通过Ip 信息 获取 拓扑图
    public String getGraphFromIp(String Ip) {
        String jsonString = new String();

        return jsonString;
    }

    public ArrayList<GraphIpInfo> ipInfoToGraphIpInfo(ArrayList<IpinfoEntity> ipinfoEntities) {
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

    public ArrayList<GraphEmailInfo> emailinfoToGraphEmailInfo(ArrayList<EmailinfoEntity> emailinfoEntities) {
        //如果查询到时信息为空这返回NULL
        if(emailinfoEntities==null)
            return null;
        ArrayList<GraphEmailInfo> graphEmailInfos = new ArrayList<>();
        GraphEmailInfo graphEmailInfo = new GraphEmailInfo();
        for (int i = 0; i < emailinfoEntities.size(); i++) {
            graphEmailInfo.setEmailName(emailinfoEntities.get(i).getEmail());
            graphEmailInfo.setOwner(emailinfoEntities.get(i).getOwner());
            graphEmailInfos.add(graphEmailInfo);
        }
        return graphEmailInfos;
    }
    @Test
    public void test(){
        System.out.println(new DomainGraph().getGraphFromDomain("tobao.com"));
    }

}
