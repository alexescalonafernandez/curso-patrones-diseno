package cu.datys.null_object.api;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Alex on 10/02/2018.
 */
public class NullObjectProxyHandler implements InvocationHandler {
    private static Map<String, Map<Class<?>, Method>> mockedMethodMap = new ConcurrentHashMap<String, Map<Class<?>, Method>>();
    private static Map<Method, Object> mockedMethodValuesMap = new ConcurrentHashMap<Method, Object>();


    private NullObjectProxyHandler(){}

    private final static class SingletonHolder{
        private final static NullObjectProxyHandler INSTANCE = new NullObjectProxyHandler();
    }

    public static NullObjectProxyHandler getInstance(){
        return SingletonHolder.INSTANCE;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //try return mocked method value
        Method mockedMethod = getMockedMethod(method);
        if(mockedMethod != null)
            return mockedMethodValuesMap.get(mockedMethod);

        final Class<?> returnedType = method.getReturnType();
        Callable[] strategies = new Callable[]{
                //try get default null value
                () -> NullObjectProxyHandler.class.getDeclaredMethod(
                        String.format("null%sValue", returnedType.getSimpleName())).invoke(null),
                // try create null object for interface
                () -> NullObjectProxyFactory.create(returnedType),
                //try invoke default constructor
                () -> returnedType.newInstance(),
        };

        for(Callable<Object> strategy : strategies){
            try {
                return strategy.call();
            }
            catch (Exception ex){
            }
        }

        //otherwise returns null
        return null;
    }

    public static Boolean nullBooleanValue() { return false; }
    public static boolean nullbooleanValue() { return false; }
    public static String nullStringValue() { return ""; }
    public static Date nullDateValue() { return new Date(); }
    public static Integer nullIntegerValue() { return 0; }
    public static int nullintValue() { return 0; }
    public static Long nullLongValue() { return 0L; }
    public static long nulllongValue() { return 0L; }
    public static Double nullDoubleValue() { return 0D; }
    public static double nulldoubleValue() { return 0D; }
    public static Float nullFloatValue() { return 0F; }
    public static float nullfloatValue() { return 0F; }
    public static Character nullCharacterValue() { return ' '; }
    public static char nullcharValue() { return ' '; }

    public static void setMockedMethod(MockedMethod mock){
        Method method = null;
        try {
            method = mock.getDeclaringClass().getMethod(mock.getMethodName(), mock.getParameterTypes());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find the method " + mock.getMethodName() + " in " + mock.getDeclaringClass().getName());
        }
        mockedMethodValuesMap.put(method, mock.getExpectedReturn());
        Map<Class<?>, Method> methodMap = mockedMethodMap.get(mock.getMethodName());
        if( methodMap == null){
            methodMap = new ConcurrentHashMap<Class<?>, Method>();
            mockedMethodMap.put(mock.getMethodName(), methodMap);
        }
        methodMap.put(mock.getDeclaringClass(), method);
    }

    private static Method getMockedMethod(Method toMock){
        Map<Class<?>, Method> methodMap = mockedMethodMap.get(toMock.getName());
        if(methodMap != null){
            for(Map.Entry<Class<?>, Method> entry : methodMap.entrySet()){
                if(entry.getKey().isAssignableFrom(toMock.getDeclaringClass())
                        && entry.getValue().getParameterCount() == toMock.getParameterCount()){
                    Class<?>[] arr1 = entry.getValue().getParameterTypes();
                    Class<?>[] arr2 = entry.getValue().getParameterTypes();
                    boolean flag = true;
                    for(int i = entry.getValue().getParameterCount() - 1; i >= 0 && flag; i--)
                        flag = arr1[i].equals(arr2[i]);
                    if(flag)
                        return entry.getValue();
                }
            }
        }
        return null;
    }
}
