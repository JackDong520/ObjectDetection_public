package Dao;

import org.testng.annotations.Test;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmailsourceEntity;

public class HttpEmailSourceDao extends BaseDao{
    public void saveHttpEmailSourceInfo(HttpEmailsourceEntity httpEmailsourceEntity){
        if (session == null || !session.isOpen()) {
            session = dbAccess.getSession();
            if (transaction == null || !transaction.isActive())
                transaction = session.beginTransaction();
        }
        session.save(httpEmailsourceEntity);
        transaction.commit();
        session.close();
    }
    @Test
    public void save(){
        new HttpEmailSourceDao().saveHttpEmailSourceInfo(new HttpEmailsourceEntity(1,"1","1","1",1));
    }
}
