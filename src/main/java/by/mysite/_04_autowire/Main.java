package by.mysite._04_autowire;

import by.mysite.entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("04_autowire.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

    }
}
