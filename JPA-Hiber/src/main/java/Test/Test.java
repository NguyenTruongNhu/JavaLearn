package Test;

import DAO.CatDAO;
import Model.Cat;
import Uttil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CatDAO catDao =  new CatDAO();

//        List<Cat> list = catDao.selectAll();
//        for(Cat cat : list){
//            System.out.println(cat);
//        }
//        Cat c = new Cat();
//        c.setId(1);
//
//        Cat c1 = catDao.selectById(c);
//        System.out.println(c1);

//        Cat c2 = new Cat("Mew Mew 2", new Date(2002,12,31),false);
//
//        catDao.insert(c2);
//        System.out.println(c2);



    }
}
