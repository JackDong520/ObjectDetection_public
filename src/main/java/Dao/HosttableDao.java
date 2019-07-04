package Dao;

import DB.DBAccess;
import javabean.HosttableEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.testng.annotations.Test;

public class HosttableDao {
    private static Session session;
    private Transaction transaction;
    private static DBAccess dbAccess;
    private static HosttableEntity hosttableEntity;

    static {
        dbAccess = new DBAccess();
        hosttableEntity = new HosttableEntity();
    }

    public HosttableEntity selectSingleUser(int time) {
        session = dbAccess.getSession();
        transaction = session.beginTransaction();
        String hql = "from HosttableEntity s where s.time=?1";


        Query query = session.createQuery(hql);
        query.setParameter(1, time);
        HosttableEntity hosttableEntity = (HosttableEntity) query.uniqueResult();
        //if (query.getResultList().size() == 0)
        //    return null;

        transaction.commit();
        return hosttableEntity;
    }

    @Test
    public void test() {
        HosttableDao hosttableDao = new HosttableDao();
        HosttableEntity hosttableEntity = hosttableDao.selectSingleUser(1);
        System.out.println(hosttableEntity.getBroadbandRouter()+hosttableEntity.getRouter()+hosttableEntity.getUnknown());
    }
}
