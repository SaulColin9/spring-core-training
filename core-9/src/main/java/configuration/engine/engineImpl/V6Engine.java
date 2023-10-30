package configuration.engine.engineImpl;

import configuration.engine.Engine;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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

    @PostConstruct
    void init(){
        if(quantityOfCylinders == 6){
            System.out.println("Engine is ready");
            return;
        }
        System.out.println("Engine is damaged");
    }

    @PreDestroy
    void destroy(){
        System.out.println("V6 engine is disassembled");
    }
}
