package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("naveen");
        names.add("chandar");
        names.add("mano");
        names.add("manonmani");
        names.add("deepthi");
        names.add("Selvam");

        //list iterator is bidirectional it means we can go forward and backward
        ListIterator ls=names.listIterator();
        while(ls.hasNext()){
            if(ls.next().equals("Selvam"))
            {
                ls.add("Uma");
            }
//            System.out.println(ls.next());

        }
        System.out.println(names);

    }
}
