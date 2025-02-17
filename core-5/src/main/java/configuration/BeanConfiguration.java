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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value="context.properties")
public class BeanConfiguration {
    @Bean("wheelsOfDevil")
    ChevroletCamaro chevroletCamaro(@Qualifier("powerOverwhelmingStuff") Engine engine, @Value("${chevrolet.maxSpeed:300}")int maxSpeed){
        return new ChevroletCamaro(engine, maxSpeed);
    }

    @Bean("powerOverwhelmingStuff")
    V12Engine v12Engine(){
        return new V12Engine();
    }

    @Bean
    VolkswagenBeetle Bumblebee(@Qualifier("oldSchoolStuff")Engine engine, @Value("${volkswagen.oil}")String oilName){
        return new VolkswagenBeetle(engine, oilName);
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
    V6Engine v6Engine(@Value("${ford.engine.cylinders}") int quantityOfCylinders){
        return new V6Engine(quantityOfCylinders);
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
