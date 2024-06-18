package com.collection.Hash;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(101,"naveen");
        tm.put(102,"mano");
        TreeMap tm2=new TreeMap();
        tm2.putAll(tm);
        System.out.println(tm2 );
        System.out.println(tm);
    }
}
