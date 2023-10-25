package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;
    private String oilName;

    @Autowired
    void setOilName(@Value("${volkswagen.oil}") String oilName){
        this.oilName = oilName;
    }

    public VolkswagenBeetle(Engine engine){
        this.engine = engine;
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
