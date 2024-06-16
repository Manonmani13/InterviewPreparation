package com.collection.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
        Iterator<Integer> i=ls.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
