package com.collection.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("Naveen Chandar Selvam");
        ll.add("Chandar");
        ll.add("Deepthi");
        ll.add("Uma");
        ll.addFirst("Selvam");
        System.out.println(ll);
        //poll remove the element
        System.out.println(ll.poll());
        System.out.println(ll);
        //offer add the eleement in list
        ll.offer("Manonmani");
        System.out.println(ll);
        ll.offerFirst("Selvam");
        ll.offerLast("Pandukumar");
        System.out.println(ll);
        LinkedList l2=(LinkedList) ll.clone();
        System.out.println("cloning "+l2);
        ll.clear();
        System.out.println(ll);


    }
}
