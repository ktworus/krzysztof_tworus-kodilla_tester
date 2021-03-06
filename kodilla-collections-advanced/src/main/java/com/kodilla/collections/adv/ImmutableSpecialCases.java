package com.kodilla.collections.adv;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 128;                 // [1]
        Integer b = 128;                 // [2]
        System.out.println(a == b);       // [3]
        System.out.println(a.equals(b));  // [4]
        System.out.println("-----");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        Integer c = 100;                      // [1]
        Integer d = 100;                      // [2]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;                           // [3]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;                            // [4]
        d = 10567;                            // [5]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }
}
