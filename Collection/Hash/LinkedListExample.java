package com.collection.Hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(4);
        hs.add(30);
        hs.add(20);
        hs.add(20);
        hs.add(30);

        System.out.println(hs);
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add(4);
        lhs.add(30);
        lhs.add(20);
        System.out.println(lhs);
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(4);
        ll.add(30);
        ll.add(30);
        Object[] oh=ll.toArray();
        for(Object o:oh)
        {
            System.out.println(o);
        }
        System.out.println(ll);
    }
}

