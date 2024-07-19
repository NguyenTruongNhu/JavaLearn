package Test;

import Model.Person;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
        if(sessionFactory != null){
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

            String sql = "SELECT p.id, p.name, p.spouse.id, p.spouse.name FROM Person p";


            List<Object[]> results = session.createQuery(sql).list();

            for (Object[] rs : results){
                String id = rs[0] +"";
                String name = rs[1] +"";
                String spouseId = rs[2] +"";
                String spouseName = rs[3] +"";

                System.out.println(name + "("+id+")"+ " da ket hon voi " + spouseName + "("+spouseId+")");
            }

            tr.commit();
            session.close();
        }
    }
}
