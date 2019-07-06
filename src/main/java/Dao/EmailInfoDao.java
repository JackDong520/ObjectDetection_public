package Dao;

import DB.DBAccess;
import javabean.EmailinfoEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class EmailInfoDao {
    private static Session session;
    private static Transaction transaction;
    private static DBAccess dbAccess;

    static {
        dbAccess = new DBAccess();
    }

    private ArrayList<EmailinfoEntity> selectEmailInfoByKey(String key, String hql) {
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }

        Query query = session.createQuery(hql).setParameter(1, key);
        if (query.getResultList().size() == 0)
            return null;
        ArrayList<EmailinfoEntity> emailinfoEntities = (ArrayList<EmailinfoEntity>) query.getResultList();
        transaction.commit();

        return emailinfoEntities;
    }

    public ArrayList<EmailinfoEntity> selectEmailInfoByDomain(String domain) {
        String hql = "from EmailinfoEntity s where s.domain=?1";
        return selectEmailInfoByKey(domain, hql);
    }
    public ArrayList<EmailinfoEntity> selectEmailInfoByEmail(String email) {
        String hql = "from EmailinfoEntity s where s.email=?1";
        return selectEmailInfoByKey(email, hql);
    }
    @Test
    public void test(){
        EmailInfoDao emailInfoDao = new EmailInfoDao();
        emailInfoDao.selectEmailInfoByDomain("tabao.com");
        emailInfoDao.selectEmailInfoByEmail("jacdong@taobao.com");
    }

}
