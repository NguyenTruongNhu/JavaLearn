package DAO;

import java.util.List;

public interface DaoInterface<T> {
    List<T> selectAll();
     T selectById(T t);
    boolean insert(T t);
    boolean update(T t);
    boolean delete(T t);

}
