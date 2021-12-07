package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        for (Book book : books
        ) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }


}



