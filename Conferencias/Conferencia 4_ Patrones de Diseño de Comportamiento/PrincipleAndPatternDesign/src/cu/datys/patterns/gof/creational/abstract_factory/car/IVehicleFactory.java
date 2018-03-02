package cu.datys.patterns.gof.creational.abstract_factory.car;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public interface IVehicleFactory {
    IScooter createScooter();
    ICar createCar();
}
