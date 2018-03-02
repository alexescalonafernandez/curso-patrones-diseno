package cu.datys.respository.api;

import cu.datys.data_layer.spi.IDataLayer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class MemoryRepository<T> implements IDataLayer<T> {
    private Class<T> entityClass;
    private List<T> elements;

    public MemoryRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.elements = new ArrayList<T>();
    }

    @Override
    public Class<T> getEntityClass() {
        return entityClass;
    }

    @Override
    public void create(T entity) {
        elements.add(entity);
    }

    //this is a simple implementation, not the best
    @Override
    public void edit(T entity) {
        int index = elements.indexOf(entity);
        elements.set(index, entity);
    }

    //this is a simple implementation, not the best
    @Override
    public void remove(T entity) {
        elements.remove(entity);
    }

    //this is a simple implementation, not the best
    @Override
    public T find(Object id) {
        for(T e : elements){
            try {
                Method m = e.getClass().getDeclaredMethod("getId");
                if(m.invoke(e).equals(id))
                    return e;
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<T> findAll() {
        return elements;
    }

    //Not supported right now
    @Override
    public List<T> findRange(int[] range) {
        throw new UnsupportedOperationException();
    }

    //Not supported right now
    @Override
    public List<T> findBy(String field, Object value) {
        return null;
    }

    //Not supported right now
    @Override
    public List<T> like(String field, String value) {
        return null;
    }


    @Override
    public int count() {
        return elements.size();
    }
}
