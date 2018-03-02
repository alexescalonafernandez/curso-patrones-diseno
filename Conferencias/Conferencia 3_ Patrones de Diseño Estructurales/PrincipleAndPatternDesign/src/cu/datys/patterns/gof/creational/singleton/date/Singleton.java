package cu.datys.patterns.gof.creational.singleton.date;

import java.util.Date;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class Singleton {
    private Date creationDate;

    private Singleton(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    private final static class SingletonHolder{
        private final static Singleton INSTANCE = new Singleton(new Date());
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
