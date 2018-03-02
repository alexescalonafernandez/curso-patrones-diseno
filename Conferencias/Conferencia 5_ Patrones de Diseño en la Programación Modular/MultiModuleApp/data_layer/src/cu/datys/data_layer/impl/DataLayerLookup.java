package cu.datys.data_layer.impl;

import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.data_layer.spi.IDataLayerFactory;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class DataLayerLookup {
    public static <T> IDataLayer<T> lookup(String mimeType, Class<T> entityClass){
        IDataLayerFactory factory = DataLayerFactoryLookup.lookup(mimeType);
        if(factory != null)
            return factory.create(entityClass);
        return null;
    }
}
