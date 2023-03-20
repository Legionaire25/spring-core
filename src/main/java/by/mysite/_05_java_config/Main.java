package by.mysite._05_java_config;

import by.mysite.entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        String message = ctx.getBean("message", String.class);
        System.out.println(message);

        Car car1 = (Car) ctx.getBean("car1");
        Car car2 = (Car) ctx.getBean("car2");
        Car car3 = (Car) ctx.getBean("car3");
        List<Car> cars = Arrays.asList(car1, car2, car3);
        cars.forEach(System.out::println);
    }
}
