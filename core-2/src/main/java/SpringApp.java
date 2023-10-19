// TODO create spring application context with two beans
// 1. V12Engine engine with name "powerOverwhelmingStuff"
// 2. ChevroletCamaro car with name "wheelsOfDevil", that contains the type of engine above.
// Wire it, using wiring feature through a setter.
// 3. Take all beans and print their names.
// 3a. REQUIRED CONDITION - Use configuration class while loading the context

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scanning.parkinglot.BeanConfiguration;
import scanning.parkinglot.Car;
import scanning.parkinglot.Engine;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //print all created bean names
        context.getBeansOfType(Car.class).forEach((bean, car) -> System.out.println("Bean name: " + bean));
        context.getBeansOfType(Engine.class).forEach((bean, engine) -> System.out.println("Bean name: " + bean));
    }
}
