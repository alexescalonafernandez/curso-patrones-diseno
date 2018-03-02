package cu.datys.null_entity;

import cu.datys.entity.Person;
import cu.datys.null_object.spi.NullObject;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
public class NullPerson extends Person implements NullObject{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "NullPerson instance";
    }
}
