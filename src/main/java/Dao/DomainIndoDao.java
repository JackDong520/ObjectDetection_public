package Dao;

import DB.DBAccess;
import javabean.DomaininfoEntity;
import javabean.IpinfoEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DomainIndoDao {
    private static Session session;
    private Transaction transaction;
    private static DBAccess dbAccess;

    static {
        dbAccess = new DBAccess();
    }
    private ArrayList<DomaininfoEntity> selectDomainFromKey(String key , String hql) {
        session = dbAccess.getSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<DomaininfoEntity> domaininfoEntities = (ArrayList<DomaininfoEntity>) query.getResultList();
        transaction.commit();
        return domaininfoEntities;
    }
    public ArrayList<DomaininfoEntity> selectIpinfoFromDomain(String domain) {
        String hql = "from DomaininfoEntity s where s.domain=?1";
        return selectDomainFromKey(domain , hql);
    }
    @Test
    public void test() {
        IpInfoDao ipInfoDao = new IpInfoDao();
//
       // IpinfoEntity ipinfoEntity = new IpinfoEntity("127.0.0.2","127.0.0.2","127.0.0.1","127.0.0.1","127.0.0.1","127.0.0.1","127.0.0.1",0);
        //ipInfoDao.saveSingleUser(ipinfoEntity);
        DomainIndoDao domainIndoDao = new DomainIndoDao();
        ArrayList<DomaininfoEntity>domaininfoEntities = domainIndoDao.selectIpinfoFromDomain("taobao.com");
        System.out.println(domaininfoEntities.get(0).getEmail());
    }


}
