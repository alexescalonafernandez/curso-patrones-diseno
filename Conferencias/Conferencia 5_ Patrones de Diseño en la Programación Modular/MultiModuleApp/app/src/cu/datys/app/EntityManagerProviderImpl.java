package cu.datys.app;

import cu.datys.dao.spi.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class EntityManagerProviderImpl implements EntityManagerProvider {
    @Override
    public EntityManager getEntityManger() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sqlite-jpa");
        return emf.createEntityManager();
    }
}
