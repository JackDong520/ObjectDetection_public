package Dao;

import org.hibernate.query.Query;
import org.testng.annotations.Test;
import temptable.javabean.BuginfoEntity;
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
    @Test
    public void save(){
        HttpEmailDao httpEmailDao = new HttpEmailDao();
        HttpEmailEntity httpEmailEntity = new HttpEmailEntity(1,"1","1","1","1","1","1","1","1","1","1");
        httpEmailDao.saveHttpEmailInfo(httpEmailEntity);
    }
}
