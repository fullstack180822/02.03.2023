package com.example;

public class Main {

    static Person p3 = new Person();

    static void foo(Person p1, int x) {
        p1.x = 100;
        p1 = null;
        Person p2 = new Person();
        x = 20;
        String s1 = "hello";
        String s2 = "hello";
        if (s1 == s2) {
         // wrong
        }
        if (s1 == s2 || s1.equals(s2)) {
            // correct
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.x = 200;
        int x = 12;
        foo(p1, x);
    }
}
