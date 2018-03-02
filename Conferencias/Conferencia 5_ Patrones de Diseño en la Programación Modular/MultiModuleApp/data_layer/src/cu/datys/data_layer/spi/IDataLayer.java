package cu.datys.data_layer.spi;

import java.util.List;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public interface IDataLayer<T> {
    Class<T> getEntityClass();
    void create(T entity);
    void edit(T entity);
    void remove(T entity);
    T find(Object id);
    List<T> findAll();
    List<T> findRange(int[] range);
    List<T> findBy(String field, Object value);
    List<T> like(String field, String value);
    int count();
}
