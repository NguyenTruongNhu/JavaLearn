package DAO;

import Model.Cat;
import Uttil.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CatDAO implements DaoInterface<Cat>{
    @Override
    public List<Cat> selectAll() {
        List<Cat> list = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
            if(sessionFactory!= null){
                Session session = sessionFactory.openSession();
                Transaction tr = session.beginTransaction();
                //Thu thi cau lenh
                String sql = "from Cat";
                Query query = session.createQuery(sql);
                list = query.getResultList();

                tr.commit();
                session.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Cat selectById(Cat cat) {
        Cat result = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
            if(sessionFactory!= null){
                Session session = sessionFactory.openSession();
                Transaction tr = session.beginTransaction();
                //Thu thi cau lenh
                //Cach 1
//                String sql = "from Cat c where c.id=:id";
//                Query query = session.createQuery(sql);
//                query.setParameter("id",cat.getId());
//                list = query.getResultList();
                //Cach 2
                result =session.get(Cat.class, 1);

                tr.commit();
                session.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

       return result;
    }

    @Override
    public boolean insert(Cat cat) {

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
            if(sessionFactory!= null){
                Session session = sessionFactory.openSession();
                Transaction tr = session.beginTransaction();
                //Thu thi cau lenh
                session.save(cat);
                tr.commit();

                session.refresh(cat);
                session.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(Cat cat) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
            if(sessionFactory!= null){
                Session session = sessionFactory.openSession();
                Transaction tr = session.beginTransaction();
                //Thu thi cau lenh
                session.saveOrUpdate(cat);

                tr.commit();
                session.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(Cat cat) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
            if(sessionFactory!= null){
                Session session = sessionFactory.openSession();
                Transaction tr = session.beginTransaction();
                //Thu thi cau lenh
                session.delete(cat);

                tr.commit();
                session.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
