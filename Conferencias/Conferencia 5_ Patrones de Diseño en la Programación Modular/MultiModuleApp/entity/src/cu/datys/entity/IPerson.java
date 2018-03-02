package cu.datys.entity;

import cu.datys.null_object.spi.NullObject;

/**
 * Created by Alex on 10/02/2018.
 */
public interface IPerson extends NullObject{
    Integer getId();
    void setId(Integer id);
    String getName();
    void setName(String name);
    Integer getAge();
    void setAge(Integer age);
}
