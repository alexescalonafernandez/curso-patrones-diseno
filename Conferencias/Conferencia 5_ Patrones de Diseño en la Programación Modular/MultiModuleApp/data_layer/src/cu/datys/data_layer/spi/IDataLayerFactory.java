package cu.datys.data_layer.spi;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public interface IDataLayerFactory {
    boolean accept(String mimeType);
    <T> IDataLayer<T> create(Class<T> entityClass);
}
