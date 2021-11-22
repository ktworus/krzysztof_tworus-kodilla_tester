package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {


        Book book = BookManager.createBook("aaa", "bbb");
        Book book1 = BookManager.createBook("ccc", "ddd");
        Book book2 = BookManager.createBook("eee", "fff");
        Book book3 = BookManager.createBook("aaa","bbb");


        System.out.println("------");
        System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.hashCode());
        System.out.println(book1.getTitle()+" "+book1.getAuthor()+" "+book1.hashCode());
        System.out.println(book2.getTitle()+" "+book2.getAuthor()+" "+book2.hashCode());
        System.out.println(book3.getTitle()+" "+book3.getAuthor()+" "+book3.hashCode());
        System.out.println("------");
        for (Book newBook: BookManager.books
             ) {
            System.out.println(newBook.getTitle() + " " + newBook.getAuthor() + " " +book.hashCode());
        }
        System.out.println("------");
    }
}
