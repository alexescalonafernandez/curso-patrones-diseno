package cu.datys.patterns.gof.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Alex on 06/02/2018.
 */
public class DynamicProxyFactory {
    public static <T> T createProxy(Class<T> clazz, final Object obj){
        if(clazz != null && obj != null && hasSameMethodSignatures(clazz, obj)){
            InvocationHandler handler = new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    return obj.getClass().getDeclaredMethod(
                            method.getName(), method.getParameterTypes()
                    ).invoke(obj, args);
                }
            };
            return (T)Proxy.newProxyInstance(clazz.getClassLoader(),
                    new Class[]{clazz}, handler
            );
        }
        return null;
    }

    private static boolean hasSameMethodSignatures(Class clazz, Object obj){
        Class objClass = obj.getClass();
        for(Method m : clazz.getDeclaredMethods())
            try {
                //check if contains method
                objClass.getDeclaredMethod(m.getName(), m.getParameterTypes());
            } catch (NoSuchMethodException e) {
                return false;
            }
        return true;
    }
}
