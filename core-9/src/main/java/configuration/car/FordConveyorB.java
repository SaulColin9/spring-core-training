package configuration.car;

import configuration.car.carImpl.FordBronco;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class FordConveyorB implements FordConveyor, ApplicationContextAware {
    ApplicationContext applicationContext;

    @Override
    public Car produceFordCar() {
        return applicationContext.getBean(FordBronco.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
