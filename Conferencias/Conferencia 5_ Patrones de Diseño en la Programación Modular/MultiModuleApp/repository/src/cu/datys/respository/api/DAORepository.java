package cu.datys.respository.api;

import cu.datys.data_layer.impl.DataLayerLookup;
import cu.datys.data_layer.spi.IDataLayer;

import java.util.List;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class DAORepository<T> implements IDataLayer<T> {
    private Class<T> entityClass;
    private IDataLayer<T> dao;


    public DAORepository(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.dao = DataLayerLookup.lookup("EntityDAO", entityClass);
    }

    @Override
    public Class<T> getEntityClass() {
        return entityClass;
    }

    @Override
    public void create(T entity) {
        dao.create(entity);
    }

    @Override
    public void edit(T entity) {
        dao.edit(entity);
    }

    @Override
    public void remove(T entity) {
        dao.remove(entity);
    }

    @Override
    public T find(Object id) {
        return dao.find(id);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public List<T> findRange(int[] range) {
        return dao.findRange(range);
    }

    @Override
    public List<T> findBy(String field, Object value) {
        return dao.findBy(field, value);
    }

    @Override
    public List<T> like(String field, String value) {
        return dao.like(field, value);
    }

    @Override
    public int count() {
        return dao.count();
    }
}
