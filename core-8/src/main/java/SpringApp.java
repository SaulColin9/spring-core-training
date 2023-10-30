// TODO
// 1. Copy all files from previous project.
// 2a. After V6Engine created and its cylinders injected, find a way to print a message
// based on this number - if it equals 6 -> "Engine is ready", otherwise "Engine is damaged"
// Before application shutdown, it should print "V6 engine is disassembled"
// 3. Whatever you did at step 2 and after VolkswagenBeetle created and its oil name injected,
// find ANOTHER way to print a message based on this name - "Beetle is filled with '$NAME' oil".
// Before application shutdown, it should print "Oil tank is empty"
// 4. Whatever you did at step 3 and after ChevroletCamaro created and its max speed injected,
// find ANOTHER way to print a message based on this name - "$MAX_SPEED is my PB right now!".
// Before application shutdown, it should print "Chevrolet Camaro stopped moving"

import configuration.BeanConfiguration;
import configuration.car.carImpl.TeslaHover;

import configuration.car.carImpl.TeslaHoverPlus;
import configuration.engine.engineImpl.V6Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfiguration.class);
        context.getEnvironment().setActiveProfiles("old", "sport");
        context.refresh();
        context.registerShutdownHook();

    }
}
