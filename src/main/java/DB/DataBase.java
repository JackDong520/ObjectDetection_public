package DB;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBase {
    static Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
    static SessionFactory sessionFactory = config.buildSessionFactory();

    public Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
