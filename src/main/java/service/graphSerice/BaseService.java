package service.graphSerice;

import Dao.BugInfoDao;
import Dao.DomainIndoDao;
import Dao.EmailInfoDao;
import Dao.IpInfoDao;
import com.google.gson.Gson;
import graphjavabean.TopologyOfDomain.GraphEmailInfo;
import graphjavabean.TopologyOfDomain.GraphIpInfo;
import temptable.javabean.EmailinfoEntity;
import temptable.javabean.IpinfoEntity;

import java.util.ArrayList;

public class BaseService {
    static String returnJsonString;
    static IpInfoDao ipInfoDao;
    static DomainIndoDao domainIndoDao;
    static EmailInfoDao emailInfoDao;
    static BugInfoDao bugInfoDao;
    static Gson gson;

    static {
        returnJsonString = new String();
        ipInfoDao = new IpInfoDao();
        domainIndoDao = new DomainIndoDao();
        emailInfoDao = new EmailInfoDao();
        bugInfoDao = new BugInfoDao();
        gson = new Gson();
    }


    public ArrayList<IpinfoEntity> getIpInfoFromIpinfoByDomain(String domain) {
        return ipInfoDao.selectIpinfoFromDomain(domain);
    }
//
//    public ArrayList<ArrayList<DomaininfoEntity>> getDomainInfoFromDoainByIplist(ArrayList<IpinfoEntity> ipinfoEntities) {
//        ArrayList<ArrayList<DomaininfoEntity>> domaininfoEntities = new ArrayList<>();
//        //通过domain 集合查询出的domaininfo 结果集
//        for (int i = 0; i < ipinfoEntities.size(); i++) {
//            ;
//            domaininfoEntities.add(domainIndoDao.selectDomainInfoFromDomain(ipinfoEntities.get(i).getDomain()));
//        }
//        return domaininfoEntities;
//    }

    public ArrayList<EmailinfoEntity> getEmailListFromDomain(String domain) {
        return emailInfoDao.selectEmailInfoByDomain(domain);
    }

    public ArrayList<GraphEmailInfo> emailinfoToGraphEmailInfo(ArrayList<EmailinfoEntity> emailinfoEntities) {
        //如果查询到时信息为空这返回NULL
        if (emailinfoEntities == null)
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

    public ArrayList<IpinfoEntity> getIpinfoListFromOrg(String org) {
        return ipInfoDao.selectIpinfoFromOrg(org);
    }

    public ArrayList<IpinfoEntity> getIpinfoListFromHostname(String hostname) {
        return ipInfoDao.selectIpinfoFromHostname(hostname);
    }

    public ArrayList<IpinfoEntity> getIpinfoListFromIp(String ip) {
        return ipInfoDao.selectIpinfoFromIp(ip);
    }

    public ArrayList<GraphIpInfo> getGraphIpinfoFromIpinfo(ArrayList<IpinfoEntity> ipinfoEntities) {
        ArrayList<GraphIpInfo> graphIpInfos = new ArrayList<>();
        if (ipinfoEntities == null)
            return null;
        for (int i = 0; i < ipinfoEntities.size(); i++) {
            GraphIpInfo graphIpInfo = new GraphIpInfo();
            graphIpInfo.setLocation(ipinfoEntities.get(i).getLocation());
            graphIpInfo.setHostname(ipinfoEntities.get(i).getHostname());
            graphIpInfo.setCountry(ipinfoEntities.get(i).getCountry());
            graphIpInfo.setCity(ipinfoEntities.get(i).getCity());
            graphIpInfo.setOrg(ipinfoEntities.get(i).getOrg());
            graphIpInfo.setIp(ipinfoEntities.get(i).getIp());
            graphIpInfos.add(graphIpInfo);
        }
        return graphIpInfos;
    }

}
