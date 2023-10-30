package configuration.car.carImpl;

import configuration.car.Car;
import configuration.engine.Engine;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class VolkswagenBeetle implements Car, InitializingBean, DisposableBean {
    private Engine engine;
    private String oilName;

    public VolkswagenBeetle(Engine engine, String oilName) {
        this.engine = engine;
        this.oilName = oilName;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public String toString() {
        return oilName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Beetle is filled with " + oilName + " oil");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Oil tank is empty");
    }
}
