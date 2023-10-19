package configuration.car;

import configuration.engine.Engine;
import org.springframework.stereotype.Component;

public class VolkswagenBeetle implements Car {
    Engine engine;
    public VolkswagenBeetle(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
