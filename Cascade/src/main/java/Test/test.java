package Test;

import Model.ChiTietDonHang;
import Model.DonHang;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
        if(sessionFactory != null){
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();
            //DonHang donHang = new DonHang();


            //fetch = FetchType.EAGER: là nó truy cập và load hết tất cả các dữ liệu con và cả thằng cha
            // fetch = FetchType.LAZY: Là nó truy cập vào người dùng yêu cầu cần gì thì truy cập vào dữ liệu đó và mới load nó

            //Lazy(Lười biếng) thì nó sẽ NHANH HƠN eager(Hăng hái)

            long batDau = System.currentTimeMillis();
            DonHang dn = session.load(DonHang.class, 1);
            long ketThuc = System.currentTimeMillis();

            System.out.println("Thoi gian hien thuc cau lenh la: " +(ketThuc - batDau));




            tr.commit();
            session.close();
        }
    }
}
