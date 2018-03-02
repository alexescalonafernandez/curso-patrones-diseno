package cu.datys.patterns.gof.creational.factory_method.car;

/**
 * Created by Alex on 03/02/2018.
 */
public abstract class AbstractCar {
    private IEngine engine;

    public AbstractCar(){
        this.engine = createEngine();
    }

    public IEngine getEngine(){
        return engine;
    }

    protected  abstract IEngine createEngine();
}
