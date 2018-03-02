package cu.datys.patterns.gof.creational.abstract_factory.car;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class HondaFactory implements IVehicleFactory {
    public IScooter createScooter() {
        return new HondaScooter();
    }

    public ICar createCar() {
        return new HondaCar();
    }
}
