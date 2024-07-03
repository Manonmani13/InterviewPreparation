package com.practices.javapractices;

import java.util.LinkedHashSet;

public class PersonWithLinkedList {
    public static void main(String[] args) {
        LinkedHashSet<Person> per=new LinkedHashSet<>();
        per.add(new Person("A",12));
        per.add(new Person("B",17));
        per.add(new Person("C",15));
        per.add(new Person("A",12));
        System.out.println(per);

    }
}
