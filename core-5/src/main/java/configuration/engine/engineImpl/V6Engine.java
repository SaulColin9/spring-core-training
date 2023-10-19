package configuration.engine.engineImpl;

import configuration.engine.Engine;

public class V6Engine implements Engine {
    private int quantityOfCylinders;

    public V6Engine(int quantityOfCylinders){
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
