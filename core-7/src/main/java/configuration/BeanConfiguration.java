package configuration;

import configuration.car.Car;
import configuration.car.carImpl.*;
import configuration.engine.Engine;
import configuration.engine.engineImpl.FourCylinderEngine;
import configuration.engine.engineImpl.V12Engine;
import configuration.engine.engineImpl.V6Engine;
import configuration.parkinglot.ParkingLot;
import configuration.parkinglot.parkinglotImpl.FreeParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Map;

@Configuration
@PropertySource(value = "context.properties")
public class BeanConfiguration {
    @Bean
    @Profile("futuristic")
    TeslaHoverPlus teslaHoverPlus(@Qualifier("plasmaEngine") @Nullable Engine engine) {
        return new TeslaHoverPlus(engine);
    }

    @Bean
    @Profile("futuristic")
    TeslaHover teslaHover(@Qualifier("plasmaEngine") @Autowired(required = false) Engine engine) {
        return new TeslaHover(engine);
    }

    @Bean("wheelsOfDevil")
    @Profile("sport")
    ChevroletCamaro chevroletCamaro(@Qualifier("powerOverwhelmingStuff") Engine engine, @Value("${chevrolet.maxSpeed:300}") int maxSpeed) {
        return new ChevroletCamaro(engine, maxSpeed);
    }

    @Bean("powerOverwhelmingStuff")
    @Profile("sport")
    V12Engine v12Engine() {
        return new V12Engine();
    }

    @Bean
    @Profile("old")
    VolkswagenBeetle Bumblebee(@Qualifier("oldSchoolStuff") Engine engine, @Value("${volkswagen.oil}") String oilName) {
        return new VolkswagenBeetle(engine, oilName);
    }

    @Bean("oldSchoolStuff")
    @Profile("old")
    FourCylinderEngine fourCylinderEngine() {
        return new FourCylinderEngine();
    }

    @Bean
    FreeParkingLot freeParkingLot(@Autowired Map<String, Car> cars) {
        FreeParkingLot parkingLot = new FreeParkingLot();
        parkingLot.setCars(cars);
        return parkingLot;
    }

    @Primary
    @Bean("defaultV6Engine")
    @Profile("cross-country")
    V6Engine v6Engine(@Value("${ford.engine.cylinders}") int quantityOfCylinders) {
        return new V6Engine(quantityOfCylinders);
    }

    @Bean("4x4")
    @Profile("cross-country")
    FordBronco fordBronco(Engine engine) {
        return new FordBronco(engine);
    }

    @Bean
    @Profile("cross-country")
    FordRaptor jurassicCar(Engine engine) {
        return new FordRaptor(engine);
    }

}
