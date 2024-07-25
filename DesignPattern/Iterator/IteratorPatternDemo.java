package com.proretention.scrm.Integration.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository names=new NameRepository();
        for(Iterator iterator= names.getIterator();iterator.hasNext();)
        {
            String name=(String) iterator.next();
            System.out.println(name);
        }
    }
}
