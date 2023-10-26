// TODO
// 1. Copy all files from previous project.
// 2. Replace all @Value injection syntax with SpEL:
// 2a. Twice quantity of V6Engine cylinders
// 2b. Add postfix 'Premium' to oil name of VolkswagenBeetle
// 2c. Generate a random value from 200 to 300 of ChevroletCamaro max speed
// 3. Change scope of FordBronco bean to 'prototype'.
// 4. Create FordConveyor interface with a method Car produceFordCar();
// 5. Implement two different conveyors with creating FordBronco prototype beans.

import configuration.BeanConfiguration;
import configuration.car.FordConveyorA;
import configuration.car.FordConveyorB;
import configuration.car.carImpl.FordBronco;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfiguration.class);
        context.getEnvironment().setActiveProfiles("old", "sport", "cross-country");
        context.refresh();
        context.registerShutdownHook();

        FordConveyorA fordConveyorA = context.getBean("fordConveyorA", FordConveyorA.class);
        FordConveyorB fordConveyorB = context.getBean("fordConveyorB", FordConveyorB.class);

        FordBronco fordBroncoA = (FordBronco) fordConveyorA.produceFordCar();
        FordBronco fordBroncoB = (FordBronco) fordConveyorB.produceFordCar();

        System.out.println(fordBroncoA == fordBroncoB);


    }
}
