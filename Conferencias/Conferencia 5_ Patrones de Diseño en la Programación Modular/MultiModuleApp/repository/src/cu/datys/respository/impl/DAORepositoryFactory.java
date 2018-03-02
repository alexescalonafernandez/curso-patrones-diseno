package cu.datys.respository.impl;

import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.data_layer.spi.IDataLayerFactory;
import cu.datys.respository.api.DAORepository;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class DAORepositoryFactory implements IDataLayerFactory {
    @Override
    public boolean accept(String mimeType) {
        return DAORepository.class.getSimpleName().equals(mimeType);
    }

    @Override
    public <T> IDataLayer<T> create(Class<T> entityClass) {
        return new DAORepository<T>(entityClass);
    }
}
