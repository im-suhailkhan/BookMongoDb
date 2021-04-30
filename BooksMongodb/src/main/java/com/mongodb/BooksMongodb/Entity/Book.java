package com.mongodb.BooksMongodb.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Books")
//using lombok no need to generate getter setter etc just add the annotation
public class Book {
    @Id
    private int id;
    private String bookName;
    private String AuthorName;
}
