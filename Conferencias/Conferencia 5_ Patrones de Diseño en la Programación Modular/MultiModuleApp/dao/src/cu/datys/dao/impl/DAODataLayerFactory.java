package cu.datys.dao.impl;

import cu.datys.dao.api.DAOFactory;
import cu.datys.dao.api.EntityDAO;
import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.data_layer.spi.IDataLayerFactory;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class DAODataLayerFactory implements IDataLayerFactory {
    @Override
    public boolean accept(String mimeType) {
        return EntityDAO.class.getSimpleName().equals(mimeType);
    }

    @Override
    public <T> IDataLayer<T> create(Class<T> entityClass) {
        return DAOFactory.createEntityDAO(entityClass);
    }


}
