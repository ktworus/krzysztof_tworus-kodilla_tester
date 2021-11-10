package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

   static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if(books.contains(book)){
            System.out.println("Duplicate values: "+ book.getTitle()+ book.getAuthor());
        }
        books.add(book);
        return book;

    }
}



