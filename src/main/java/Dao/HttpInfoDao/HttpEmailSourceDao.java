package Dao.HttpInfoDao;

import Dao.BaseDao;
import org.hibernate.query.Query;
import org.testng.annotations.Test;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmailsourceEntity;

import java.util.ArrayList;

public class HttpEmailSourceDao extends BaseDao {
    public void saveHttpEmailSourceInfo(HttpEmailsourceEntity httpEmailsourceEntity) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }
        session.save(httpEmailsourceEntity);
        transaction.commit();
        session.close();
    }

    private ArrayList<HttpEmailsourceEntity> selectHttpEmailSourceInfoFromKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<HttpEmailsourceEntity> domaininfoEntities = (ArrayList<HttpEmailsourceEntity>) query.getResultList();
        transaction.commit();
        if (domaininfoEntities == null)
            System.out.println("未查询到数据" + key);

        return domaininfoEntities;
    }

    public ArrayList<HttpEmailsourceEntity> selectHttpEmailInfoFromEmail(String email) {
        String hql = "from HttpEmailsourceEntity s where s.email=?1";
        return selectHttpEmailSourceInfoFromKey(email, hql);
    }

    public HttpEmailsourceEntity selectSingleHttpEmailInfoFromEmail(String email) {
        ArrayList<HttpEmailsourceEntity> httpEmailsourceEntities = selectHttpEmailInfoFromEmail(email);
        if (httpEmailsourceEntities ==null)
            return null;
        return httpEmailsourceEntities.get(0);
    }

    @Test
    public void save() {


        System.out.println(new HttpEmailSourceDao().selectSingleHttpEmailInfoFromEmail("max.lahey@stripe.com").getUri());
    }
}
