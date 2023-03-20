package by.mysite._05_java_config;

import by.mysite.entities.Book;
import by.mysite.entities.Library;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppConfigList {

    @Bean
    public List<Book> books() {
        return Arrays.asList(new Book("Title1"), new Book("Title2"));
    }

    @Bean
    public Library library() {
        return new Library(1);
    }
}
