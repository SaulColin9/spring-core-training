package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;

public class ChevroletCamaro implements Car {
    private Engine engine;

    public ChevroletCamaro(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
