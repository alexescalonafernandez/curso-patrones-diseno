package cu.datys.data_layer.spi;

/**
 * Created by alexander.escalona on 09/02/2018.
 */
public interface IDataLayerFactoryProvider {
    IDataLayerFactory getFactory(String mimeType);
}
