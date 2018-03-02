package cu.datys.dao.api;

import cu.datys.dao.spi.EntityManagerProvider;
import cu.datys.service_locator.ServiceProviderLookup;

import javax.persistence.EntityManager;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class DAOFactory {
    public static <T> EntityDAO<T> createEntityDAO(Class<T> entityClass){
        EntityManager em = ServiceProviderLookup.lookup(EntityManagerProvider.class,
                Thread.currentThread().getContextClassLoader()).getEntityManger();
        return createEntityDAO(entityClass, em);
    }

    public static <T> EntityDAO<T> createEntityDAO(Class<T> entityClass, final EntityManager entityManager){
        return new EntityDAO<T>(entityClass) {
            @Override
            protected EntityManager getEntityManager() {
                return entityManager;
            }
        };
    }
}
