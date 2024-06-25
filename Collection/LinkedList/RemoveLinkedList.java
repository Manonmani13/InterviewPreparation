package com.collection.LinkedList;

import java.util.LinkedList;

public class RemoveLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Mano");
        ll.add("Manonmani");
        ll.add("Naveen");
        ll.add("Chandar");
        System.out.println(ll);
        LinkedList<String> ll1=new LinkedList<>();
        ll1.addAll(ll);
        ll1.add("Pandukumar");
        ll1.add("Kumar");
        ll1.addFirst("Chandar");
        ll1.addLast("Maha");
        System.out.println(ll1);
        ll1.remove("Kumar");
        System.out.println(ll1);
        ll1.removeAll(ll);
        System.out.println(ll1);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.add("Latha");
        System.out.println(ll);

        ll.removeLastOccurrence("Latha");
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);





    }
}
