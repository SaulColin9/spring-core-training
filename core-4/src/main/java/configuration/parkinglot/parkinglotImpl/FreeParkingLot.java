package configuration.parkinglot.parkinglotImpl;

import configuration.car.Car;
import configuration.parkinglot.ParkingLot;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class FreeParkingLot implements ParkingLot, ApplicationContextAware {
    @Autowired
    List<Car> cars;

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void printCarNames() {
       applicationContext.getBeansOfType(Car.class).forEach((bean, car)->{
           System.out.println(bean);
       });
    }

    @Override
    public void printCarsCount() {
        System.out.println("Quantity of cars: " + cars.size());
    }
}
