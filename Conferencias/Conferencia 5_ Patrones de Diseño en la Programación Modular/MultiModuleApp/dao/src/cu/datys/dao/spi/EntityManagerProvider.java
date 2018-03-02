package cu.datys.dao.spi;

import javax.persistence.EntityManager;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public interface EntityManagerProvider {
    EntityManager getEntityManger();
}
