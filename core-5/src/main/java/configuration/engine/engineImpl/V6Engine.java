package configuration.engine.engineImpl;

import configuration.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class V6Engine implements Engine {
    private int quantityOfCylinders;

    @Autowired
    public void setQuantityOfCylinders(@Value("${ford.engine.cylinders}") int quantityOfCylinders) {
        this.quantityOfCylinders = quantityOfCylinders;
    }

    @Override
    public void start() {
        System.out.println("defaultV6Engine starts...");
    }

    @Override
    public String toString(){
        return Integer.toString(quantityOfCylinders);
    }
}
