package cu.datys.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by alexander.escalona on 05/02/2018.
 */
@Entity
public class Person implements IPerson, Serializable {
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @Column(name = "id_person")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
