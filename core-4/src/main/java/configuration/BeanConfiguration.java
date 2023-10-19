package configuration;

import configuration.car.carImpl.ChevroletCamaro;
import configuration.car.carImpl.FordBronco;
import configuration.car.carImpl.FordRaptor;
import configuration.car.carImpl.VolkswagenBeetle;
import configuration.engine.Engine;
import configuration.engine.engineImpl.FourCylinderEngine;
import configuration.engine.engineImpl.V12Engine;
import configuration.engine.engineImpl.V6Engine;
import configuration.parkinglot.parkinglotImpl.FreeParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {
    @Bean
    ChevroletCamaro wheelsOfDevil(@Qualifier("powerOverwhelmingStuff") Engine engine){
       return new ChevroletCamaro(engine);
    }


    @Bean("powerOverwhelmingStuff")
    V12Engine v12Engine(){
        return new V12Engine();
    }

    @Bean
    VolkswagenBeetle Bumblebee(@Qualifier("oldSchoolStuff") Engine engine){
        return new VolkswagenBeetle(engine);
    }

    @Bean("oldSchoolStuff")
    FourCylinderEngine fourCylinderEngine(){
        return new FourCylinderEngine();
    }

    @Bean
    FreeParkingLot freeParkingLot(){
        return new FreeParkingLot();
    }

    @Primary
    @Bean("defaultV6Engine")
    V6Engine v6Engine(){
       return new V6Engine();
    }

    @Bean("4x4")
    FordBronco fordBronco(Engine engine){
        return new FordBronco(engine);
    }

    @Bean
    FordRaptor jurassicCar(Engine engine){
        return new FordRaptor(engine);
    }


}
