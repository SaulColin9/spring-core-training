package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ChevroletCamaro implements Car {
    private Engine engine;

    private int maxSpeed;

    @Autowired
    public void setMaxSpeed(@Value("${chevrolet.maxSpeed:300}")int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public ChevroletCamaro(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public String toString(){
        return Integer.toString(maxSpeed);
    }
}
