package scanning.engine;

import org.springframework.stereotype.Component;

@Component("powerOverwhelmingStuff")
public class V12Engine implements Engine {
    @Override
    public void start() {
        System.out.println("powerOverwhelmingStuff starts...");
    }
}
