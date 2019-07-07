package Dao;

import DB.DBAccess;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BaseDao {
    protected static Session session;
    protected static Transaction transaction;
    protected static DBAccess dbAccess;

    static {
        dbAccess = new DBAccess();
    }

}
