package scanning.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scanning.engine.Engine;

@Component("wheelsOfDevil")
public class ChevroletCamaro implements Car{
    private Engine engine;

    @Autowired
    @Qualifier("powerOverwhelmingStuff")
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }
}
