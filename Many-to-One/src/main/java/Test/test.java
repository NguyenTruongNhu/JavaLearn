package Test;

import Model.Author;
import Model.Book;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.List;

public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoty();
        if(sessionFactory != null){
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

//            Author author = new Author("001","Nguyen Truong Nhu", new Date(2002,12,31));
//            Book b1 = new Book("B1","Dac nhan tam", 200000,author );
//            Book b2 = new Book("B2","Ngoc Trai", 300000,author );
//            Book b3 = new Book("B3","Lam Ban Doi", 400000,author );



//            Author author_1 = new Author("002","Truong Nhu", new Date(2002,12,31));
//            Book b1 = new Book("B1","Dac nhan tam", 200000,author_1 );
//            Book b2 = new Book("B2","Ngoc Trai", 300000,author_1 );
//            Book b3 = new Book("B3","Lam Ban Doi", 400000,author_1 );
//            session.saveOrUpdate(author_1);
//            session.saveOrUpdate(b1);
//            session.saveOrUpdate(b2);
//            session.saveOrUpdate(b3);

            Book b1 = session.find(Book.class, "B1");
            System.out.println("ten cuon sach la: " + b1.getTitle() + " cua ta gia: " + b1.getAuthor().getName());

            tr.commit();
            session.close();
        }
    }
}
