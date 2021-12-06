package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {

   static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
      if(books.contains(book)){
          System.out.println("Book "+ book.getTitle() +" is already there");
            return book;
        }
        books.add(book);
        return book;
        }



}



