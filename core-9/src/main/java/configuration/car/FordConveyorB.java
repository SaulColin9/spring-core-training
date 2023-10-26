package configuration.car;

public class FordConveyorB implements FordConveyor {
    Car car;

    public FordConveyorB(Car car) {
        this.car = car;
    }

    @Override
    public Car produceFordCar() {
        return this.car;
    }
}
