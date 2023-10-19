package scanning.parkinglot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    ChevroletCamaro wheelsOfDevil(){
        ChevroletCamaro chevroletCamaro = new ChevroletCamaro();
        chevroletCamaro.setEngine(powerOverwhelmingStuff());
        return chevroletCamaro;
    }
    @Bean
    V12Engine powerOverwhelmingStuff(){
        return new V12Engine();
    }
}
