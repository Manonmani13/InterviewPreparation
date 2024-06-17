package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraorExample2 {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("naveen");
        names.add("chandar");
        names.add("mano");
        names.add("manonmani");
        names.add("deepthi");
        Iterator i= names.iterator();
        //to overcome issue in for we can use iterator with help of iterator we can remove element
        while(i.hasNext())
        {
            if(i.next().equals("manonmani"))
                i.remove();
//            System.out.println(i.next());
        }
        System.out.println(names);
    }
}

