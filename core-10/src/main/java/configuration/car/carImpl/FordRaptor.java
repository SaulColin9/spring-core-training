package configuration.car.carImpl;

import configuration.CarSpecification;
import configuration.Specification;
import configuration.car.Car;
import configuration.engine.Engine;

public class FordRaptor implements Car {
    private Engine engine;

    @Specification
    private CarSpecification carSpecification;

    public CarSpecification getCarSpecification() {
        return carSpecification;
    }

    public FordRaptor(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {

    }
}
