package Dao;

import temptable.javabean.BuginfoEntity;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BugInfoDao extends BaseDao {

    private ArrayList<BuginfoEntity> selectBuginfoFromKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<BuginfoEntity> buginfoEntities = (ArrayList<BuginfoEntity>) query.getResultList();
        transaction.commit();
        if (buginfoEntities == null)
            System.out.println("未查询到数据" + key);

        return buginfoEntities;
    }

    public ArrayList<BuginfoEntity> selectDomainInfoFromIp(String ip) {
        String hql = "from BuginfoEntity s where s.ip=?1";
        return selectBuginfoFromKey(ip, hql);
    }

    public ArrayList<BuginfoEntity> selectDomainInfoFromPlugin(String plugin) {
        String hql = "from BuginfoEntity s where s.plugin=?1";
        return selectBuginfoFromKey(plugin, hql);
    }



    @Test
    public void test() {
        System.out.println(new BugInfoDao().selectDomainInfoFromIp("127.0.0.1").get(0).getBugname());
        System.out.println(new BugInfoDao().selectDomainInfoFromPlugin("sb").get(0).getBugname());
    }
}
