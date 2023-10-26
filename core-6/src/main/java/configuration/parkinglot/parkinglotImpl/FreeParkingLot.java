package configuration.parkinglot.parkinglotImpl;

import configuration.car.Car;
import configuration.parkinglot.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

public class FreeParkingLot implements ParkingLot{
    @Autowired
    Map<String, Car> cars;
    @Override
    public void printCarNames() {
        for(String bean: cars.keySet()){
            System.out.println(bean);
        }
    }

    @Override
    public void printCarsCount() {
        System.out.println("Quantity of cars: " + cars.size());
    }
}

