package cu.datys.data_layer.impl;

import cu.datys.data_layer.spi.IDataLayerFactory;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class DataLayerFactoryLookup {
    public static IDataLayerFactory lookup(String mimeType){
        return DataLayerFactoryProviderLookup.lookup().getFactory(mimeType);
    }
}
