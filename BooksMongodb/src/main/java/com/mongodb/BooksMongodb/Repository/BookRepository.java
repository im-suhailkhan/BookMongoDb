package com.mongodb.BooksMongodb.Repository;

import com.mongodb.BooksMongodb.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
