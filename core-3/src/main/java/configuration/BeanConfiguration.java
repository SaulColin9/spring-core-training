package configuration;

import configuration.car.ChevroletCamaro;
import configuration.car.VolkswagenBeetle;
import configuration.parkinglot.FreeParkingLot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import configuration.engine.V12Engine;
import configuration.engine.FourCylinderEngine;

@Configuration
public class BeanConfiguration {
    @Bean("wheelsOfDevil")
    ChevroletCamaro chevroletCamaro(){
       return new ChevroletCamaro(v12Engine());
    }

    @Bean("powerOverwhelmingStuff")
    V12Engine v12Engine(){
        return new V12Engine();
    }

    @Bean("Bumblebee")
    VolkswagenBeetle volkswagenBeetle(){
        return new VolkswagenBeetle(fourCylinderEngine());
    }

    @Bean("oldSchoolStuff")
    FourCylinderEngine fourCylinderEngine(){
        return new FourCylinderEngine();
    }

    @Bean
    FreeParkingLot freeParkingLot(){
        return new FreeParkingLot();
    }
}
