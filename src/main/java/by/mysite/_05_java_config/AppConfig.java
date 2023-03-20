package by.mysite._05_java_config;

import by.mysite.entities.Car;
import by.mysite.entities.Engine;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "message")
    public String message() {
        return "Hello World";
    }

    @Bean
    public Car car1() {
        return new Car();
    }

    @Bean
    public Car car2() {
        return new Car("Renault");
    }

    @Bean
    public Engine engine() {
        return new Engine("Diesel");
    }

    @Bean
    public Car car3() {
        return new Car(engine());
    }
}
