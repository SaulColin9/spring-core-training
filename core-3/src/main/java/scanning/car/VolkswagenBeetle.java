package scanning.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scanning.engine.Engine;

@Component("Bumblebee")
public class VolkswagenBeetle implements Car {

    private Engine engine;
    @Autowired
    VolkswagenBeetle(@Qualifier("oldSchoolStuff") Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
