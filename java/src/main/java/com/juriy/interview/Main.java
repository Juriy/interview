package com.juriy.interview;


import com.juriy.interview.person.Person;

public class Main {

    public static void main(String... args) {
        Person p1 = new Person("Jane", 22);
        Person p2 = new Person("Bill", 22);
        Person p3 = new Person("Bill", 22);

        System.out.println(p2.equals(p3));
    }
}
