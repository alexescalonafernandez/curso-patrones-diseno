package cu.datys.null_object.impl;

import cu.datys.null_object.spi.NullObject;
import cu.datys.null_object.spi.NullObjectFactory;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public class NullObjectFactoryLookup {
    public static NullObjectFactory lookup(Class nullable){
        return NullObjectFactoryProviderLookup.lookup().getFactory(nullable);
    }
}
