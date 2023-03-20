package by.mysite._03_scope;

import by.mysite.entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("03_scope.xml");
        Car car1 = ctx.getBean("car", Car.class);
        Car car2 = ctx.getBean("car", Car.class);
        Car car3 = ctx.getBean("car", Car.class);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
