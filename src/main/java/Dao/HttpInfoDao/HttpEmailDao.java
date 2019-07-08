package Dao.HttpInfoDao;

import Dao.BaseDao;
import org.hibernate.query.Query;
import org.testng.annotations.Test;
import temptable.javabean.BuginfoEntity;
import temptable.javabean.DomaininfoEntity;
import temptable.temp.HttpEmailEntity;

import java.util.ArrayList;

public class HttpEmailDao extends BaseDao {

    public void saveHttpEmailInfo(HttpEmailEntity httpEmailEntity){
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }
        session.save(httpEmailEntity);
        transaction.commit();
        session.close();
    }
    private ArrayList<HttpEmailEntity> selectHttpEmailInfoFromKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<HttpEmailEntity> domaininfoEntities = (ArrayList<HttpEmailEntity>) query.getResultList();
        transaction.commit();
        if (domaininfoEntities == null)
            System.out.println("未查询到数据"+key);

        return domaininfoEntities;
    }
//    public ArrayList<HttpEmailEntity> selectHttpEmailInfoFromDomain(String domain) {
//        String hql = "from HttpEmailEntity s where s.domain=?1";
//        return selectHttpEmailInfoFromKey(domain, hql);
//    }
    public ArrayList<HttpEmailEntity> selectHttpEmailInfoFromEmail(String email) {
        String hql = "from HttpEmailEntity s where s.email=?1";
        return selectHttpEmailInfoFromKey(email, hql);
    }
    public HttpEmailEntity selectSingleHttpEmailInfoFromEmail(String email){
        ArrayList<HttpEmailEntity> httpEmailEntities = selectHttpEmailInfoFromEmail(email);
        if (httpEmailEntities==null)
            return null;
        return httpEmailEntities.get(0);
    }



    @Test
    public void save(){
//        HttpEmailDao httpEmailDao = new HttpEmailDao();
//        HttpEmailEntity httpEmailEntity = new HttpEmailEntity(0,"1","1","1","1","1","1","1","1","1","1");
//        httpEmailDao.saveHttpEmailInfo(httpEmailEntity);
       // System.out.println(new HttpEmailDao().selectHttpEmailInfoFromDomain("stripe.com"));
    }
}
