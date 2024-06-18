package com.collection.Generics;

import java.util.ArrayList;
import java.util.TreeSet;

public class GenericDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(13);
        System.out.println(ts);
        ArrayList<String> al=new ArrayList<>();
        al.add("Mano");
        al.add("naveen");
        System.out.println(al);
    }
}
