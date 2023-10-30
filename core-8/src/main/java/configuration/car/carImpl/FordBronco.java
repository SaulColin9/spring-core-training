package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;

public class FordBronco implements Car {
    private Engine engine;

    public FordBronco(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
