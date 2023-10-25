package configuration.engine.engineImpl;

import configuration.engine.Engine;
import org.springframework.stereotype.Component;

@Component("oldSchoolStuff")
public class FourCylinderEngine implements Engine {

    @Override
    public void start() {
        System.out.println("oldSchoolStuff starts...");
    }
}
