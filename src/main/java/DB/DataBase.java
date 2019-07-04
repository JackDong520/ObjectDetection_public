package DB;

import org.hibernate.SessionFactory;

public class DataBase {
    @Test
    public void Test1(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        try {
            sessionFactory = HibernateUtils.getFactory();
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            //1、使用get方法查询出食品类
            Sort food = session.get(Sort.class, 1);
            //2、使用sort对象的方法得到所有食品类中的食品
            Set<Good> set = food.getSetGoods();
            //3、遍历set集合
            for (Good good : set) {
                System.out.println(good);
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }finally{
            session.close();
            sessionFactory.close();
        }
    }
}
