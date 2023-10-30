package configuration;

import configuration.car.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Random;

public class CarSpecGenerator implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Object currInterface : bean.getClass().getInterfaces()) {
            if (currInterface.equals(Car.class)) {
                for (Field field : bean.getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(Specification.class)) {
                        Specification specification = field.getAnnotation(Specification.class);
                        int lowerLimit = specification.lowerLimit();
                        int upperLimit = specification.upperLimit();

                        List<CarSpecification> carSpecifications = List.of(CarSpecification.values());
                        CarSpecification randomSpecification = carSpecifications.get(new Random().nextInt((upperLimit - lowerLimit) + 1) + lowerLimit);

                        field.setAccessible(true);
                        ReflectionUtils.setField(field, bean, randomSpecification);
                    }
                }
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
