// TODO
// 1. Copy all files from previous project.
// 2. Split all cars into next groups: old, cross-country, sport, futuristic
// 3. Find a way to load context with profiles and print only bean names if their profile is active.

import configuration.BeanConfiguration;
import configuration.car.carImpl.TeslaHover;

import configuration.car.carImpl.TeslaHoverPlus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("sport", "old", "cross-country");
        context.register(BeanConfiguration.class);
        context.refresh();

        for (String bean : context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }
}
