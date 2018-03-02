package cu.datys.app;

import cu.datys.data_layer.impl.DataLayerLookup;
import cu.datys.data_layer.spi.IDataLayer;
import cu.datys.entity.Person;

/**
 * Created by Alex on 09/02/2018.
 */
public class Main {
//    interface P{
//
//    }
//
//    interface M extends NullObject{
//        P test();
//    }

    public static void main(String[] args) {
        IDataLayer<Person> repository = DataLayerLookup.lookup("DAORepository", Person.class);

        Person p = repository.find(1000);
        System.out.println(String.format("is Null: %s", String.valueOf(p.isNull())));
        System.out.println(p.getName());

//        System.out.println(((M)NullObjectProxyFactory.create(M.class)).test().getClass());
    }
}
