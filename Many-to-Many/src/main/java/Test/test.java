package Test;

import Model.CuocHop;
import Model.NhanVien;
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

            NhanVien nv1 = new NhanVien("001","Nguyen Truong Nhu", new Date(2002,12,31));

            CuocHop ch1 = new CuocHop();
            ch1.setTenCuocHop("Hoi dong quan tri cong ty");
            ch1.setThoiGian(new Date(2025,31,12));
            ch1.setDiaDiem("Phong hop 1");
            ch1.addNV(nv1);

            session.save(ch1);

            tr.commit();
            session.close();
        }
    }
}
