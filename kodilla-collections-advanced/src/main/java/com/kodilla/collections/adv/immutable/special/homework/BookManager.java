package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

   static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        if (books.contains(newBook)) {
            System.out.println("We already have this book: "+ newBook.title+" "+newBook.author+" "+newBook.hashCode());

        }
            books.add(newBook);
        return newBook;


    }
}



