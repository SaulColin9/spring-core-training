// TODO create spring application context with two beans
// 1. FourCylinderEngine engine with name "oldSchoolStuff"
// 2. VolkswagenBeetle car with name "Bumblebee", that contains the type of engine above.
// Wire it, using wiring feature through a constructor.
// 3. Take all beans and print their names.
// 3a. REQUIRED CONDITION - Use component scanning while loading the context

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import parkinglot.Car;
import scanning.parkinglot.Engine;

public class SpringApp {
    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext context = new AnnotationConfigApplicationContext("scanning/parkinglot");

        //print all created bean names
        context.getBeansOfType(Car.class).forEach((bean, car) -> System.out.println("Bean name: " + bean));
        context.getBeansOfType(Engine.class).forEach((bean, engine) -> System.out.println("Bean name: " + bean));

        context.getBeansOfType(Car.class).forEach((s, car) -> car.startEngine());
    }
}
