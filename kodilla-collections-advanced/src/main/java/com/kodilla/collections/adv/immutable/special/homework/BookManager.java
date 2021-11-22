package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

   static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);

        books.add(book);
        return book;
        }



}



