package Test;

import Model.GiaoVien;
import Model.SinhVien;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;

public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
        if(sessionFactory != null){
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

            GiaoVien gv1 = new GiaoVien("GV1", "Nguyen Van A", new Date(100,31,12), "Hibernate");
            SinhVien sv1 = new SinhVien("205", "Sinh vien 1", new Date(103,9,19), 9.3);

            session.save(gv1);
            session.save(sv1);



            tr.commit();
            session.close();
        }
    }
}
