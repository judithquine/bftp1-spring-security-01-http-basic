package org.factoriaf5.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        return List.of(
                new Book(1, "Título 1", "Autor 1"),
                new Book(2, "Título 2", "Autor 2")
        );
    }
}
