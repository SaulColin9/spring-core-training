package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class VolkswagenBeetle implements Car {
    private Engine engine;
    private String oilName;

    public VolkswagenBeetle(Engine engine, String oilName){
        this.engine = engine;
        this.oilName= oilName;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public String toString(){
        return oilName;
    }
}
