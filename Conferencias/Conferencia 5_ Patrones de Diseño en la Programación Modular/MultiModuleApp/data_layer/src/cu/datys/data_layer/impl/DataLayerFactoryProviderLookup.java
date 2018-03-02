package cu.datys.data_layer.impl;

import cu.datys.data_layer.spi.IDataLayerFactory;
import cu.datys.data_layer.spi.IDataLayerFactoryProvider;
import cu.datys.service_locator.ServiceProviderLookup;

import java.util.List;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public class DataLayerFactoryProviderLookup {

    public static IDataLayerFactoryProvider lookup(){
        IDataLayerFactoryProvider provider = ServiceProviderLookup.lookup(IDataLayerFactoryProvider.class, Thread.currentThread().getContextClassLoader());
        if(provider != null)
            return provider;
        return new IDataLayerFactoryProvider(){

            @Override
            public IDataLayerFactory getFactory(String mimeType) {
                List<IDataLayerFactory> list = ServiceProviderLookup.lookupAll(IDataLayerFactory.class, Thread.currentThread().getContextClassLoader());
                for(IDataLayerFactory factory : list)
                    if(factory.accept(mimeType))
                        return factory;
                return null;
            }
        };
    }
}
