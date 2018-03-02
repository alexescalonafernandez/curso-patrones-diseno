package cu.datys.null_object.api;

import cu.datys.null_object.spi.NullObject;

import java.lang.reflect.Proxy;

/**
 * Created by Alex on 11/02/2018.
 */
public class NullObjectProxyFactory {
    static {
        NullObjectProxyHandler.setMockedMethod(new MockedMethod.Builder(
                NullObject.class, "isNull", true
        ).build());
    }

    public static Object create(Class<?> interfaceClass){
        return create(new Class<?>[]{interfaceClass});
    }

    public static Object create(Class<?>[] interfaceClasses){
        return Proxy.newProxyInstance(interfaceClasses[0].getClassLoader(),
                interfaceClasses, NullObjectProxyHandler.getInstance()
        );
    }
}
