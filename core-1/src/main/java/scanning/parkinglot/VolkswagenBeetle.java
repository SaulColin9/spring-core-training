package scanning.parkinglot;

import org.springframework.stereotype.Component;
import parkinglot.Car;

@Component("Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;
    VolkswagenBeetle(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
