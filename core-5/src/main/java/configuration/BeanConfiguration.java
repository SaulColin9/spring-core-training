package configuration;

import configuration.car.carImpl.ChevroletCamaro;
import configuration.car.carImpl.FordBronco;
import configuration.car.carImpl.FordRaptor;
import configuration.car.carImpl.VolkswagenBeetle;
import configuration.engine.engineImpl.FourCylinderEngine;
import configuration.engine.engineImpl.V12Engine;
import configuration.engine.engineImpl.V6Engine;
import configuration.parkinglot.parkinglotImpl.FreeParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value="context.properties")
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

    @Bean("defaultV6Engine")
    V6Engine v6Engine(){
        return new V6Engine();
    }

    @Bean("4x4")
    FordBronco fordBronco(){
        return new FordBronco(v6Engine());
    }

    @Bean("jurassicCar")
    FordRaptor fordRaptor(){
        return new FordRaptor(v6Engine());
    }


}
