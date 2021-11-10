package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook("aaa", "bbb");
        BookManager.createBook("ccc", "ddd");
        BookManager.createBook("eee", "fff");
        BookManager.createBook("aaa","bbb");


        System.out.println("------");
        for (Book book:BookManager.books
             ) {
            System.out.println(book.hashCode());
            
        }

    }
}
