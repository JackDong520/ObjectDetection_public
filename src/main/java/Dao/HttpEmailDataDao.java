package Dao;

import org.testng.annotations.Test;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmaildataEntity;

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
    @Test
    public void save(){
        new HttpEmailDataDao().saveHttpEmailDataInfo(new HttpEmaildataEntity(1,"1","1","1"));

    }
}
