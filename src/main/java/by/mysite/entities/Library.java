package by.mysite.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;
import java.util.List;

public class Library {
    private int id;
    private List<Book> books;

    public Library(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", books=" + books +
                '}';
    }
}
