// TODO
// 1. Copy all files from previous project.
// 2. There is context.properties file in the resources folder
// 3. Find a way to import all properties to the context.
// 4. Using @Value annotation, inject quantity of cylinders into V6Engine bean.
// 5. Using @Value annotation, inject oil name in the VolkswagenBeetle bean.
// 6. Using @Value annotation, inject max speed number into ChevroletCamaro bean with 300 as a default value.
// 7. Override toString method of those beans and print these injected properties after loading the context.

import configuration.BeanConfiguration;
import configuration.car.carImpl.ChevroletCamaro;
import configuration.car.carImpl.VolkswagenBeetle;
import configuration.engine.engineImpl.V6Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);


        // print injected properties there
        V6Engine v6Engine = (V6Engine) context.getBean("defaultV6Engine");
        System.out.println(v6Engine);

        VolkswagenBeetle volkswagenBeetle = (VolkswagenBeetle) context.getBean("Bumblebee");
        System.out.println(volkswagenBeetle);

        ChevroletCamaro chevroletCamaro = (ChevroletCamaro) context.getBean("wheelsOfDevil");
        System.out.println(chevroletCamaro);
    }
}
