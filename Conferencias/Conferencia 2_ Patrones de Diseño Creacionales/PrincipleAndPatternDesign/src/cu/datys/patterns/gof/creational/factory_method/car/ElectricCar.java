package cu.datys.patterns.gof.creational.factory_method.car;

/**
 * Created by Alex on 03/02/2018.
 */
public class ElectricCar extends AbstractCar {
    @Override
    protected IEngine createEngine() {
        return new ElectricEngine();
    }
}
