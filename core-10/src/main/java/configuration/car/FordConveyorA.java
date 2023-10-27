package configuration.car;

public class FordConveyorA implements FordConveyor {
    Car car;

    public FordConveyorA(Car car) {
        this.car = car;
    }

    @Override
    public Car produceFordCar() {
        return this.car;
    }
}
