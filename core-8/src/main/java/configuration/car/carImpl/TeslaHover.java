package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;

public class TeslaHover implements Car {

    Engine engine;

    public TeslaHover(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
