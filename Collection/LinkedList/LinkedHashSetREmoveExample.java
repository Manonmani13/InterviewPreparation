package com.collection.LinkedList;

import java.util.LinkedHashSet;

public class LinkedHashSetREmoveExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Manonmani");
        lhs.add("Pandukumar");
        lhs.add("Naveen");
        System.out.println(lhs);
        System.out.println(lhs.remove("Manonmani"));
    }
}
