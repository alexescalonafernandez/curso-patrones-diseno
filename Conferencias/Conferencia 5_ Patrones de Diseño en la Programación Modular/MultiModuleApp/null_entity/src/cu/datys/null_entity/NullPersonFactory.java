package cu.datys.null_entity;

import cu.datys.null_object.spi.NullObject;
import cu.datys.null_object.spi.NullObjectFactory;

/**
 * Created by alexander.escalona on 08/02/2018.
 */
public class NullPersonFactory implements NullObjectFactory {
    @Override
    public boolean accept(Class nulleable) {
        return nulleable.isAssignableFrom(NullPerson.class);
    }

    @Override
    public NullObject create() {
        return new NullPerson();
    }
}
