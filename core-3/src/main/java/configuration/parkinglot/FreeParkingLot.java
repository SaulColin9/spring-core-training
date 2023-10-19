package configuration.parkinglot;

import configuration.car.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FreeParkingLot implements ParkingLot{
    @Autowired
    List<Car> cars;
    @Override
    public void printCarsCount() {
        System.out.println("Quantity of cars: " + cars.size());
    }
}
