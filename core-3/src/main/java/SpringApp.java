// TODO
// 1. Copy all created beans into this module and create two contexts
// 1a. The first context should be loaded with scanning feature and contain 4 beans (2 cars, 2 engines)
// 1b. The second context should be loaded with configuration class and contain 4 beans (2 cars, 2 engines).
// REQUIRED CONDITION. Configuration context should not use direct method calls for bean wiring.
// 2. Create FreeParkingLot bean for every context and collect all available car beans inside with list. Use field wiring feature this time, if possible.
// 3. parkinglot.ParkingLot should print QUANTITY of parkinglot.Car beans inside.
// 4. Create application context an print all bean names once again.

import configuration.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class SpringApp {
    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext contextA = new AnnotationConfigApplicationContext("scanning/");
        ApplicationContext contextB = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //print all created bean names
        System.out.println("Context A");
        contextA.getBeansOfType(scanning.car.Car.class).forEach((bean, car) -> System.out.println("Bean name: " + bean));
        contextA.getBeansOfType(scanning.engine.Engine.class).forEach((bean, engine) -> System.out.println("Bean name: " + bean));
        //Printing quantity of cars in parking lot of context A
        scanning.parkinglot.FreeParkingLot freeParkingLotA = (scanning.parkinglot.FreeParkingLot) contextA.getBean("freeParkingLot");
        freeParkingLotA.printCarsCount();

        System.out.println("===============");


        System.out.println("Context B");
        contextB.getBeansOfType(configuration.car.Car.class).forEach((bean, car) -> System.out.println("Bean name: " + bean));
        contextB.getBeansOfType(configuration.engine.Engine.class).forEach((bean, engine) -> System.out.println("Bean name: " + bean));
        //Printing quantity of cars in parking lot of context B
        configuration.parkinglot.FreeParkingLot freeParkingLot = (configuration.parkinglot.FreeParkingLot) contextB.getBean("freeParkingLot");
        freeParkingLot.printCarsCount();
    }
}
