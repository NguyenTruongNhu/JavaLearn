package Uttil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactoty = buildSessionFactiory();

    private static SessionFactory buildSessionFactiory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Loi khong the tao sessionFactory");
            return null;
        }
    }
    public static SessionFactory getSessionFactoty(){
        return sessionFactoty;
    }
    public static void shutdown(){
        getSessionFactoty().close();
    }
}
