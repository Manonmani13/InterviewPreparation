package com.collection.LinkedList;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Mano");
        ll.add("Manonmani");
        ll.add("Naveen");
        System.out.println(ll);
        LinkedList<String> ll1=new LinkedList<>();
        ll1.addAll(ll);
        ll1.add("Pandukumar");
        ll1.add("Kumar");
        ll1.addFirst("Chandar");
        ll1.addLast("Maha");
        System.out.println(ll1);
    }
}
