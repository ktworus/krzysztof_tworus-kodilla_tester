package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

   static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        for (Book book: books
             ) {
            if (newBook == BookManager.books) {
                System.out.println("Duplicate values: " + book.getTitle() + book.getAuthor());

            }
        }
        books.add(newBook);
        return newBook;
        }



}



