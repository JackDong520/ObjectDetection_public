package Dao;

import temptable.javabean.DomaininfoEntity;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DomainIndoDao extends BaseDao {


    private ArrayList<DomaininfoEntity> selectDomainInfoFromKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<DomaininfoEntity> domaininfoEntities = (ArrayList<DomaininfoEntity>) query.getResultList();
        transaction.commit();
        if (domaininfoEntities == null)
            System.out.println("未查询到数据"+key);

        return domaininfoEntities;
    }

    public ArrayList<DomaininfoEntity> selectDomainInfoFromDomain(String domain) {
        String hql = "from DomaininfoEntity s where s.domain=?1";
        return selectDomainInfoFromKey(domain, hql);
    }

    public ArrayList<DomaininfoEntity> selectDomainInfoFromIp(String ip) {
        String hql = "from DomaininfoEntity s where s.ip=?1";
        return selectDomainInfoFromKey(ip, hql);
    }

    public ArrayList<DomaininfoEntity> selectDomainInfoFromEmail(String email) {
        String hql = "from DomaininfoEntity s where s.email=?1";
        return selectDomainInfoFromKey(email, hql);
    }


    @Test
    public void test() {
        IpInfoDao ipInfoDao = new IpInfoDao();
//
        // IpinfoEntity ipinfoEntity = new IpinfoEntity("127.0.0.2","127.0.0.2","127.0.0.1","127.0.0.1","127.0.0.1","127.0.0.1","127.0.0.1",0);
        //ipInfoDao.saveSingleUser(ipinfoEntity);
        DomainIndoDao domainIndoDao = new DomainIndoDao();


        ArrayList<DomaininfoEntity> domaininfoEntities1 = domainIndoDao.selectDomainInfoFromIp("12.0.0.1");
        if (domaininfoEntities1 == null) {
            System.out.println("没有查询到对应值");
        } else {
            System.out.println(domaininfoEntities1.get(0).getEmail());
        }
        ArrayList<DomaininfoEntity> domaininfoEntities2 = domainIndoDao.selectDomainInfoFromEmail("jacong@taobao.com");
        if (domaininfoEntities2 == null) {
            System.out.println("没有查询到对应值");
        } else {
            System.out.println(domaininfoEntities2.get(0).getEmail());
        }
        ArrayList<DomaininfoEntity> domaininfoEntities = domainIndoDao.selectDomainInfoFromDomain("taobao.com");
        System.out.println(domaininfoEntities.get(0).getEmail());


    }


}
