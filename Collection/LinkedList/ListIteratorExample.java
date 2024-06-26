package com.proretention.scrm.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {



    public static void main(String[] args) {
       List<String> names=new ArrayList<>();
       names.add("mano");
       names.add("manonmani");
       names.add("manonmani 1");
        ListIterator<String> ls=names.listIterator();
        while(ls.hasNext())
        {
            System.out.println(ls.next());
        }
        while(ls.hasPrevious())
        {
            System.out.println(ls.hasPrevious());
        }
    }
}
