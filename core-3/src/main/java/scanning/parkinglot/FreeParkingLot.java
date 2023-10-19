package scanning.parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scanning.car.Car;

import java.util.List;

@Component("freeParkingLot")
public class FreeParkingLot implements ParkingLot{
    @Autowired
    List<Car> cars;
    @Override
    public void printCarsCount() {
        System.out.println("Quantity of cars : " + cars.size());
    }
}
