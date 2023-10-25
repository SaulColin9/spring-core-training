package configuration;

import configuration.car.carImpl.*;
import configuration.engine.Engine;
import configuration.engine.engineImpl.FourCylinderEngine;
import configuration.engine.engineImpl.V12Engine;
import configuration.engine.engineImpl.V6Engine;
import configuration.parkinglot.parkinglotImpl.FreeParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.lang.Nullable;

@Configuration
@PropertySource(value = "context.properties")
public class BeanConfiguration {
    @Bean("wheelsOfDevil")
    ChevroletCamaro chevroletCamaro() {
        return new ChevroletCamaro(v12Engine());
    }

    @Bean("powerOverwhelmingStuff")
    V12Engine v12Engine() {
        return new V12Engine();
    }

    @Bean("Bumblebee")
    VolkswagenBeetle volkswagenBeetle() {
        return new VolkswagenBeetle(fourCylinderEngine());
    }

    @Bean("oldSchoolStuff")
    FourCylinderEngine fourCylinderEngine() {
        return new FourCylinderEngine();
    }

    @Bean
    FreeParkingLot freeParkingLot() {
        return new FreeParkingLot();
    }

    @Bean("defaultV6Engine")
    V6Engine v6Engine() {
        return new V6Engine();
    }

    @Bean("4x4")
    FordBronco fordBronco() {
        return new FordBronco(v6Engine());
    }

    @Bean("jurassicCar")
    FordRaptor fordRaptor() {
        return new FordRaptor(v6Engine());
    }

    @Bean
    TeslaHover teslaHover(@Qualifier("plasmaEngine") @Autowired(required = false) Engine engine) {
        return new TeslaHover(engine);
    }

    @Bean
    TeslaHoverPlus teslaHoverPlus(@Qualifier("plasmaEnginePlus") @Nullable Engine engine) {
        return new TeslaHoverPlus(engine);
    }


}
