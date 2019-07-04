package service;

import DB.DataBase;
import javabean.TestEntity;
import org.hibernate.Session;

import org.testng.annotations.Test;

public class IpInfoService {
    static Session session = new DataBase().getSession();

    public void savetest(String name , int num){
        session.beginTransaction();
        TestEntity test = new TestEntity();
        test.setName(name);
        test.setNum(num);
        session.save(test);
        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void test(){
        new IpInfoService().savetest("jack",20);
    }
}
