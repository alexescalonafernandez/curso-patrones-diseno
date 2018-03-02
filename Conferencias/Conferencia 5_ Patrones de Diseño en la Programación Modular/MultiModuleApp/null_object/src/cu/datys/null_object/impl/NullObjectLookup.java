package cu.datys.null_object.impl;

import cu.datys.null_object.api.NullObjectProxyFactory;
import cu.datys.null_object.spi.NullObject;
import cu.datys.null_object.spi.NullObjectFactory;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public class NullObjectLookup {
    public static NullObject lookup(Class nullable){
        if(NullObject.class.isAssignableFrom(nullable)){
            NullObjectFactory factory = NullObjectFactoryLookup.lookup(nullable);
            if(factory != null)
                return factory.create();

            try {
                if(nullable.isInterface())
                    return (NullObject) NullObjectProxyFactory.create(nullable);
            }catch (Exception ex){}
        }

        return null;
    }
}
