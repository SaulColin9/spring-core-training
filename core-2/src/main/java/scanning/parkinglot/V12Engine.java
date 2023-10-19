package scanning.parkinglot;
import org.springframework.stereotype.Component;
import scanning.parkinglot.Engine;
public class V12Engine implements Engine {
    @Override
    public void start() {
        System.out.println("powerOverwhelmingStuff starts...");
    }
}
