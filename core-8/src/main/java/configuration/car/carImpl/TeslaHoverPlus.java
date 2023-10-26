package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;

public class TeslaHoverPlus implements Car {
    Engine engine;

    public TeslaHoverPlus(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();

    }
}
