package com.mongodb.BooksMongodb.Controller;

import com.mongodb.BooksMongodb.Entity.Book;
import com.mongodb.BooksMongodb.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class bookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Added book with Id"+book.getId();
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
            bookRepository.deleteById(id);
            return "book deleted with id"+id;
    }

}
