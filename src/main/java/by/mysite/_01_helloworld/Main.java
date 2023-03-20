package by.mysite._01_helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("01_helloworld.xml");
        String defaultMessage = (String) ctx.getBean("default-message");
        System.out.println(defaultMessage);

        String message = (String) ctx.getBean("message");
        System.out.println(message);
    }
}
