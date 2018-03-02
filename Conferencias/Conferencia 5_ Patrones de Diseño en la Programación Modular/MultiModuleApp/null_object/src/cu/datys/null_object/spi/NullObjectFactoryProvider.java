package cu.datys.null_object.spi;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public interface NullObjectFactoryProvider {
    NullObjectFactory getFactory(Class nullable);
}
