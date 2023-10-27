package configuration.car.carImpl;

import configuration.CarSpecification;
import configuration.Specification;
import configuration.car.Car;
import configuration.engine.Engine;

public class FordBronco implements Car {
    private Engine engine;

    @Specification
    private CarSpecification carSpecification;

    public CarSpecification getCarSpecification() {
        return carSpecification;
    }

    public FordBronco(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
