package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ChevroletCamaro implements Car {
    private Engine engine;

    private int maxSpeed;

    public ChevroletCamaro(Engine engine, int maxSpeed){
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public String toString(){
        return Integer.toString(maxSpeed);
    }

    void init(){
        System.out.println(maxSpeed + " is my PB right now!");
    }

    void destroy(){
        System.out.println("Chevrolet Camaro stopped moving");
    }
}
