package by.mysite._02_car;

import by.mysite.entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("02_car.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) ctx.getBean("car3");
        System.out.println(car3);

        Car car4 = (Car) ctx.getBean("car4");
        System.out.println(car4);

        Car car5 = (Car) ctx.getBean("car5");
        System.out.println(car5);
    }

}
