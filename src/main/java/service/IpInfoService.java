package service;

import DB.DBAccess;
import javabean.TestEntity;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.testng.annotations.Test;

public class IpInfoService {
    static Session session = new DBAccess().getSession();

    public void savetest(String name , int num){
        Transaction transaction = session.beginTransaction();
        TestEntity test = new TestEntity();
        test.setName(name);
        test.setNum(num);
        session.save(test);
        transaction.commit();
        session.close();
    }
    @Test
    public void test(){
        new IpInfoService().savetest("jack",10);
    }
}
