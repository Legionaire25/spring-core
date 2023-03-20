package by.mysite._05_java_config;

import by.mysite.entities.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainList {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigList.class);
        Library library = ctx.getBean(Library.class);
        System.out.println(library);
    }
}
