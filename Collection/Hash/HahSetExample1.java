package com.collection.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class HahSetExample1 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        Iterator<String> iter= set.iterator();;
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
