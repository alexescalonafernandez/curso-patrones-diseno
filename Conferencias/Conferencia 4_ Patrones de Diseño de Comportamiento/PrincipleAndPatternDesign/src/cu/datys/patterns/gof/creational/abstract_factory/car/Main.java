package cu.datys.patterns.gof.creational.abstract_factory.car;

/**
 * Created by alexander.escalona on 25/10/2017.
 */
public class Main {

    public static void main(String[] args) {
        IVehicleFactory factory = new HondaFactory();
        factory.createCar();
        factory.createScooter();
    }
}
