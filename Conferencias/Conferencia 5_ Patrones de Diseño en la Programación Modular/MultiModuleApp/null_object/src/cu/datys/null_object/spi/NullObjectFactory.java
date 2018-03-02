package cu.datys.null_object.spi;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public interface NullObjectFactory {
    boolean accept(Class nullable);
    NullObject create();
}
