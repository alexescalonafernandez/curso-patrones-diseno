package cu.datys.respository.impl;

import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.data_layer.spi.IDataLayerFactory;
import cu.datys.respository.api.MemoryRepository;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class MemoryRepositoryFactory implements IDataLayerFactory {
    @Override
    public boolean accept(String mimeType) {
        return  MemoryRepository.class.getSimpleName().equals(mimeType);
    }

    @Override
    public <T> IDataLayer<T> create(Class<T> entityClass) {
        return new MemoryRepository<T>(entityClass);
    }
}
