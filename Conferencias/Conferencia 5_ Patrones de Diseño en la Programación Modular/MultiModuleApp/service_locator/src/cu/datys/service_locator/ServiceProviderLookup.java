package cu.datys.service_locator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class ServiceProviderLookup {
    public static <T> T lookup(Class<T> serviceProviderClass, ClassLoader classLoader){
        List<T> list = lookupAll(serviceProviderClass, classLoader);
        if(list != null && !list.isEmpty())
            return list.get(0);
        return null;
    }

    public static <T> List<T> lookupAll(Class<T> serviceProviderClass, ClassLoader classLoader){
        List<T> list = new ArrayList<T>();
        ServiceLoader<T> loader = ServiceLoader.load(serviceProviderClass, classLoader);
        Iterator<T> iterator = loader.iterator();
        if(iterator.hasNext())
            iterator.forEachRemaining(list::add);
        return list;
    }
}
