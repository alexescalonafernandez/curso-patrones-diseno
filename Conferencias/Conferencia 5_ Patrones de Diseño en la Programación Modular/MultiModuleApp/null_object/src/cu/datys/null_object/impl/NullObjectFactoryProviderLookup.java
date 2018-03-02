package cu.datys.null_object.impl;

import cu.datys.null_object.spi.NullObjectFactory;
import cu.datys.null_object.spi.NullObjectFactoryProvider;
import cu.datys.service_locator.ServiceProviderLookup;

import java.util.List;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public class NullObjectFactoryProviderLookup {
    public static NullObjectFactoryProvider lookup(){
        NullObjectFactoryProvider provider = ServiceProviderLookup.lookup(NullObjectFactoryProvider.class, Thread.currentThread().getContextClassLoader());
        if(provider != null)
            return provider;
        return new NullObjectFactoryProvider(){

            @Override
            public NullObjectFactory getFactory(Class nullable) {
                List<NullObjectFactory> list = ServiceProviderLookup.lookupAll(NullObjectFactory.class, Thread.currentThread().getContextClassLoader());
                for(NullObjectFactory factory : list)
                    if(factory.accept(nullable))
                        return factory;
                return null;
            }
        };
    }
}
