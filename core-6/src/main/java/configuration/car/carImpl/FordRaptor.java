package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;

public class FordRaptor implements Car {
    private Engine engine;

    public FordRaptor(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {

    }
}
