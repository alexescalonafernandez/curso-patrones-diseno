package cu.datys.dao.api;

import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.null_object.impl.NullObjectLookup;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public abstract class EntityDAO<T> implements IDataLayer<T> {
    private final Class<T> entityClass;

    public EntityDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    @Override
    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        T result = getEntityManager().find(entityClass, id);
        if(result == null)
            result = getNullObject();
        return result;
    }

    protected T getNullObject(){
        return (T) NullObjectLookup.lookup(entityClass);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public List<T> findBy(String field, Object value){
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        Path p = null;
        for(String f : field.split("\\."))
            p = p == null ? root.get(f) : p.get(f);
        cq.where(getEntityManager().getCriteriaBuilder().equal(p, value));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> like(String field, String value){
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        Path p = null;
        for(String f : field.split("\\."))
            p = p == null ? root.get(f) : p.get(f);
        cq.where(getEntityManager().getCriteriaBuilder().like(p, value));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
