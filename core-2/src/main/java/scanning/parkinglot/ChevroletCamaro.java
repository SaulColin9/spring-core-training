package scanning.parkinglot;

import org.springframework.stereotype.Component;
import scanning.parkinglot.Car;
import scanning.parkinglot.Engine;

public class ChevroletCamaro implements Car{
    private Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
