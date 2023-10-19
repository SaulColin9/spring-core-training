package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.stereotype.Component;

public class VolkswagenBeetle implements Car {
    private Engine engine;
    public VolkswagenBeetle(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
