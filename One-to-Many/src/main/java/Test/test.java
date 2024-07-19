package Test;

import Model.Customer;
import Model.My_Order;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
        if(sessionFactory != null){
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

//            Customer c1 = new Customer("001", "NguyenTruong Nhu", "nhu81632@gmail.com");
//            My_Order o1 = new My_Order("O1", "Dak Lak", c1);
//            My_Order o2 = new My_Order("O2", "HCM", c1);
//            My_Order o3 = new My_Order("O3", "Pleiku", c1);
//            My_Order o4 = new My_Order("O4", "Phuoc An", c1);
//
//            List<My_Order> list = new ArrayList<>();
//            list.add(o1);
//            list.add(o2);
//            list.add(o3);
//            list.add(o4);
//
//            c1.setOrders(list);
//
//            session.saveOrUpdate(c1);
//            session.saveOrUpdate(o1);
//            session.saveOrUpdate(o2);
//            session.saveOrUpdate(o3);
//            session.saveOrUpdate(o4);


//            Customer c2 = new Customer("002", "Diem Hang", "hangheo@gmail.com");
//            session.saveOrUpdate(c2);

            String sql = "FROM Customer c WHERE size(c.orders) > 0";
            List<Customer> result = session.createQuery(sql).list();

            for (Customer rs: result){
                System.out.println(rs);
            }

            tr.commit();
            session.close();
        }
    }
}
