package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsCollection {
    public static void main(String[] args) {
            Set<Stamp> stamps = new HashSet<>();

            stamps.add(new Stamp("Kopernik", true));
            stamps.add(new Stamp("Mickiewicz", false));
            stamps.add(new Stamp("Sienkiewicz", true));
            stamps.add(new Stamp("Skłodowska", false));
            stamps.add(new Stamp("Kościuszko", true));
            stamps.add(new Stamp("Mickiewicz", false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
        }

    }

