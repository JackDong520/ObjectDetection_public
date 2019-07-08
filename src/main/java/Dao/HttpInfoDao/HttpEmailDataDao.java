package Dao.HttpInfoDao;

import Dao.BaseDao;
import org.hibernate.query.Query;
import org.testng.annotations.Test;
import temptable.temp.HttpEmaildataEntity;

import java.util.ArrayList;

public class HttpEmailDataDao extends BaseDao {

    public void saveHttpEmailDataInfo(HttpEmaildataEntity httpEmaildataEntity){
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }
        session.save(httpEmaildataEntity);
        transaction.commit();
        session.close();
    }
    private ArrayList<HttpEmaildataEntity> selecHttpEmailDataInfoFromKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<HttpEmaildataEntity> domaininfoEntities = (ArrayList<HttpEmaildataEntity>) query.getResultList();
        transaction.commit();
        if (domaininfoEntities == null)
            System.out.println("未查询到数据"+key);

        return domaininfoEntities;
    }
    public ArrayList<HttpEmaildataEntity> selectHttpEmailDataInfoFromDomain(String domain) {
        String hql = "from HttpEmaildataEntity s where s.domain=?1";
        return selecHttpEmailDataInfoFromKey(domain, hql);
    }

    @Test
    public void save(){
        System.out.println(new HttpEmailDataDao().selectHttpEmailDataInfoFromDomain("stripe.com"));
    }
}
