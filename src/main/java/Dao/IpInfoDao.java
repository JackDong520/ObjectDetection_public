package Dao;

import DB.DBAccess;
import javabean.IpinfoEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class IpInfoDao {
    private static Session session;
    private static Transaction transaction;
    private static DBAccess dbAccess;

    static {
        dbAccess = new DBAccess();
    }

    //通过IP查找ipinfo中的信息
    private ArrayList<IpinfoEntity> selectIpinfoFromIp(String ip, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, ip);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<IpinfoEntity> ipinfoEntities = (ArrayList<IpinfoEntity>) query.getResultList();
        transaction.commit();

        return ipinfoEntities;
    }

    public ArrayList<IpinfoEntity> selectIpinfoFromDomain(String domain) {
        String hql = "from IpinfoEntity s where s.domain=?1";
        return selectIpinfoFromIp(domain, hql);
    }

    public ArrayList<IpinfoEntity> selectIpinfoFromIp(String ip) {
        String hql = "from IpinfoEntity s where s.ip=?1";
        return selectIpinfoFromIp(ip, hql);
    }

    public ArrayList<IpinfoEntity> selectIpinfoFromCountry(String country) {
        String hql = "from IpinfoEntity s where s.country=?1";
        return selectIpinfoFromIp(country, hql);
    }

    public ArrayList<IpinfoEntity> selectIpinfoFromOrg(String org) {
        String hql = "from IpinfoEntity s where s.org=?1";
        return selectIpinfoFromIp(org, hql);
    }

    public ArrayList<IpinfoEntity> selectIpinfoFromCity(String city) {
        String hql = "from IpinfoEntity s where s.city=?1";
        return selectIpinfoFromIp(city, hql);
    }

    public boolean saveSingleUser(IpinfoEntity ipInfo) {
        session = dbAccess.getSession();
        if (transaction == null || !transaction.isActive())
            transaction = session.beginTransaction();
        session.save(ipInfo);
        transaction.commit();
        return true;
    }


    @Test
    public void test() {
        IpInfoDao ipInfoDao = new IpInfoDao();
        ArrayList<IpinfoEntity> ipinfoEntities = ipInfoDao.selectIpinfoFromDomain("127.0.0.1");
        ArrayList<IpinfoEntity> ipinfoEntities1 = ipInfoDao.selectIpinfoFromIp("127.0..1");
        ArrayList<IpinfoEntity> ipinfoEntities2 = ipInfoDao.selectIpinfoFromCountry("127.00.1");
        ArrayList<IpinfoEntity> ipinfoEntities3 = ipInfoDao.selectIpinfoFromOrg("127.0.01");

        IpinfoEntity ipinfoEntity = new IpinfoEntity("127.0.0.2", "127.0.0.2", "127.0.0.1", "127.0.0.1", "127.0.0.1", "127.0.0.1", "127.0.0.1", 0);
        ipInfoDao.saveSingleUser(ipinfoEntity);
    }

}
