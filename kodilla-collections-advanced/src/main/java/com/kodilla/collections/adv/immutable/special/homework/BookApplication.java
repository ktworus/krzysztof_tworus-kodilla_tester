package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.books.add(new Book("ggg","hhh"));
        BookManager.books.add(new Book("aaa","bbb"));
        BookManager.books.add(new Book("kkk","lll"));
        BookManager.books.add(new Book("ggg","hhh"));

        BookManager.createBook("aaa", "bbb");
        BookManager.createBook("ccc", "ddd");
        BookManager.createBook("eee", "fff");
        BookManager.createBook("aaa","bbb");


        System.out.println("------");
        for (Book book:BookManager.books
             ) {
            System.out.println(book.getAuthor() + " " + book.getTitle() + " " +book.hashCode());


        }
        System.out.println("------");
    }
}
