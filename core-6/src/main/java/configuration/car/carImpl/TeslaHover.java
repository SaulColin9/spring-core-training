package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TeslaHover implements Car {


    private final Engine engine;
    public TeslaHover(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        if(engine == null){
            System.out.println("No proper engine was provided");
            return;
        }
       engine.start();
    }
}
