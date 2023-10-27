// TODO
// 1. Copy all files from previous project.
// 2. Create a new annotation @Specification to apply it only on fields and methods
// 3. Create enum CarSpecification with values of BASIC, EXTENDED, PLUS, PREMIUM, LUXURY, LIMITED
// 4. Add CarSpecification field to each car bean and mark it with @Specification annotation
// 5. Find a way to fill those fields with random values, bound by the lowest and the highest limit
// of values and without touching beans. F.e. I want FordBronco to be created only with EXTENDED,
// PLUS or PREMIUM spec. Or I want ChevroletCamaro to have only LUXURY or LIMITED spec. Without limits
// it should be random from all the range.

import configuration.BeanConfiguration;
import configuration.car.carImpl.ChevroletCamaro;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfiguration.class);
        context.getEnvironment().setActiveProfiles("old", "sport", "cross-country", "futuristic");
        context.refresh();
        context.registerShutdownHook();

        ChevroletCamaro camaro = context.getBean("wheelsOfDevil", ChevroletCamaro.class);
        System.out.println(camaro.getCarSpecification());


    }
}
